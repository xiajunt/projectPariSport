package projetPariSport.cron;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.parameter.Parameter;
import projetPariSport.structObject.Account;
import projetPariSport.structObject.Betting;
import projetPariSport.structObject.Game;
import projetPariSport.structObject.GameScoreBox;
import projetPariSport.structObject.Schedule;
import projetPariSport.tools.DataCenterTool;
import projetPariSport.tools.SendMail;

/**
 * BettingCheck - Servlet for checking the bet and send a mail if the bet have end
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 11/01/2014
 *
 */

@SuppressWarnings("serial")
public class BettingCheck extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
        try {
        	int yesterday;
        	String homeTeam;
        	List<Schedule> listSchedule;
			List<Game> listGame, l;
        	GameScoreBox score;
			Betting b;
			boolean end, win;
			Account ac;
			int jackpot;
        	
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE,-1);
			
			yesterday = cal.get(Calendar.YEAR) * 10000 +
			cal.get(Calendar.MONTH) * 100 +
			cal.get(Calendar.DAY_OF_MONTH);
			
			listSchedule = DataCenterTool.getDateMatch(yesterday);
			for (Schedule sche : listSchedule)
			{
				homeTeam = sche.getGameHomeTeam();
				listGame = DataCenterTool.getGameByGameId(sche.getGameId());
				for (Game g : listGame)
				{
					score = (GameScoreBox)DataCenterTool.getDataCenter(Parameter.GAMESCOREBOX, sche.getGameId());
					if (score != null)
					{
						g.setEnd();
						if (homeTeam.compareTo(g.getBetTeamId()) == 0 &&
							Integer.decode(score.getHomeTeamPoints()) > Integer.decode(score.getAwayTeamPoints()) ||
							homeTeam.compareTo(g.getBetTeamId()) != 0 &&
							Integer.decode(score.getHomeTeamPoints()) < Integer.decode(score.getAwayTeamPoints()))
							g.setWin(true);
						else
							g.setWin(false);
						DataCenterTool.addDataCenter(g);
						b = (Betting)DataCenterTool.getBettingByBettingId(g.getBettingId());
						l = DataCenterTool.getDataCenterBettingGame(b);
						end = false;
						win = true;
						for (Game game : l)
						{
							if (!game.getEnd())
							{
								win = false;
								break;
							}
							if (!game.getWin())
							{
								end = true;
								win = false;
								break;
							}
							win = true;
						}
						ac = (Account)DataCenterTool.getDataCenter(Parameter.ACCOUNT, b.getPlayerMail());
						if (win)
						{
							b.setEnd();
							b.setWin(true);
							jackpot = (int)(b.getNbrBetToken() * (1 + b.getCotation()));
							ac.addToken(jackpot);
							DataCenterTool.addDataCenter(ac);
							SendMail.sendMail(Parameter.getWinnerMsg(b.getId(), jackpot), ac);
						}
						else if (end)
						{
							b.setEnd();
							SendMail.sendMail(Parameter.getLoserMsg(b.getId()), ac);
							b.setWin(false);
						}
					}
				}
			}
 		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
