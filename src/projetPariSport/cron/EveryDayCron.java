package projetPariSport.cron;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.tools.NbaDataCenterTool;

/**
 * EveryDayCron - Servlet for update Injury and Standing on the datastore
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 09/01/2014
 *
 */

@SuppressWarnings("serial")
public class EveryDayCron extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
        try {
			NbaDataCenterTool.fillStanding();
			Thread.currentThread();
			Thread.sleep(1000);
			
			NbaDataCenterTool.updateInjury();
			Thread.currentThread();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
