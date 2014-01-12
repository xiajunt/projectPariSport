package projetPariSport.cron;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.tools.NbaDataCenterTool;

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
    	try
    	{
    		NbaDataCenterTool.fillSchedule();
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
	}
}
