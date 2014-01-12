package projetPariSport.servlet;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.parameter.Parameter;
import projetPariSport.structObject.Schedule;
import projetPariSport.structObject.Team;
import projetPariSport.tools.DataCenterTool;

@SuppressWarnings("serial")
public class LoadIndexServlet extends HttpServlet {
	
	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
		
		int today, tomorrow;
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE,0);
		
		today = cal.get(Calendar.YEAR) * 10000 +
		cal.get(Calendar.MONTH) * 100 +
		cal.get(Calendar.DAY_OF_MONTH);
		
		Calendar cal2 = Calendar.getInstance();
		cal2.add(Calendar.DATE,1);
		
		tomorrow = cal2.get(Calendar.YEAR) * 10000 +
				cal2.get(Calendar.MONTH) * 100 +
				cal2.get(Calendar.DAY_OF_MONTH);
		
		List<Schedule> listScheduleToday = DataCenterTool.getDateMatch(today);
		List<Schedule> listScheduleTomorrow = DataCenterTool.getDateMatch(tomorrow);
		Map<String, String> hashMap = new HashMap<String, String>();

		Team homeTeam, awayTeam = null;
		for(Schedule o : listScheduleToday){
			homeTeam = (Team) DataCenterTool.getDataCenter(Parameter.TEAM, o.getGameAwayTeam());
			hashMap.put(o.getGameAwayTeam(), homeTeam.getTeamName());
			
			awayTeam = (Team) DataCenterTool.getDataCenter(Parameter.TEAM, o.getGameHomeTeam());
			hashMap.put(o.getGameHomeTeam(), awayTeam.getTeamName());
		}
		
		for(Schedule o : listScheduleTomorrow){
			homeTeam = (Team) DataCenterTool.getDataCenter(Parameter.TEAM, o.getGameAwayTeam());
			hashMap.put(o.getGameAwayTeam(), homeTeam.getTeamName());
			
			awayTeam = (Team) DataCenterTool.getDataCenter(Parameter.TEAM, o.getGameHomeTeam());
			hashMap.put(o.getGameHomeTeam(), awayTeam.getTeamName());
		}
						
		DateFormat dateFormat = new SimpleDateFormat("dd/MM");						
		req.setAttribute("today", dateFormat.format(cal.getTime()));
		req.setAttribute("tomorrow", dateFormat.format(cal2.getTime()));
		req.setAttribute("listScheduleToday",listScheduleToday);
		req.setAttribute("listScheduleTomorrow",listScheduleTomorrow);
		req.setAttribute("listMapping",hashMap);
		
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
