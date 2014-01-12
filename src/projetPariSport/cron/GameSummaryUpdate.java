package projetPariSport.cron;

import java.io.IOException;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.structObject.Schedule;
import projetPariSport.tools.DataCenterTool;
import projetPariSport.tools.NbaDataCenterTool;

/**
 * GameSummaryUpdate - get the GameSummary of yesterday
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 09/01/2014
 *
 */

@SuppressWarnings("serial")
public class GameSummaryUpdate extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
        try {
        	int yesterday;
        	List<Schedule> listSchedule;
			
			Calendar cal = Calendar.getInstance();
			cal.add(Calendar.DATE,-1);
			
			yesterday = cal.get(Calendar.YEAR) * 10000 +
			cal.get(Calendar.MONTH) * 100 +
			cal.get(Calendar.DAY_OF_MONTH);
			
			listSchedule = DataCenterTool.getDateMatch(yesterday);
			
			for (Schedule s : listSchedule)
			{
				NbaDataCenterTool.fillGameSummary(s.getGameId());
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
