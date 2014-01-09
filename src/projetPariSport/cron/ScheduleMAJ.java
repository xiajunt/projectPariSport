package projetPariSport.cron;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.structObject.Schedule;
import projetPariSport.tools.DataCenterTool;

/**
 * ScheduleMAJ - Servlet for update the schedule about NBA match on datastore
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 09/12/2013
 *
 */

@SuppressWarnings("serial")
public class ScheduleMAJ extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		List<Schedule> l = DataCenterTool.getPastMatch();
		System.out.println(l.size());
	}
}
