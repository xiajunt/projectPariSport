package projetPariSport.cron;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.structObject.Schedule;
import projetPariSport.structObject.Standings;
import projetPariSport.tools.DataCenterTool;
import projetPariSport.tools.NbaDataCenterTool;

/**
 * FillDataCenter - Servlet for filling the datacenter of the website. Use it only one time
 * before the website is online
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 09/01/2014
 *
 */

@SuppressWarnings("serial")
public class FillDataCenter extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
        try {
        	List<Schedule> listSchedule;
        	List<Standings> listStanding;
        	
        	NbaDataCenterTool.fillLeagueHierarchy();
        	Thread.currentThread();
			Thread.sleep(1000);
			
			NbaDataCenterTool.fillSchedule();
			Thread.currentThread();
			Thread.sleep(1000);
			
			NbaDataCenterTool.fillStanding();
			Thread.currentThread();
			Thread.sleep(1000);
			
			NbaDataCenterTool.updateInjury();
			Thread.currentThread();
			Thread.sleep(1000);
			
			listSchedule = DataCenterTool.getPastMatch();
			
			for (Schedule s : listSchedule)
			{
				NbaDataCenterTool.fillGameScoreBox(s.getGameId());
				Thread.currentThread();
				Thread.sleep(1000);
				NbaDataCenterTool.fillGameSummary(s.getGameId());
				Thread.currentThread();
				Thread.sleep(1000);
			}
			
			listStanding = DataCenterTool.getStanding();
			
			for (Standings s : listStanding)
			{
				NbaDataCenterTool.fillTeam(s.getTeamId());
				Thread.currentThread();
				Thread.sleep(1000);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
