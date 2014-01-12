package projetPariSport.cron;

import java.io.IOException;
import java.util.Set;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.structObject.Standings;
import projetPariSport.tools.DataCenterTool;

@SuppressWarnings("serial")
public class Test extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
    	try
    	{
    		Set<String> list = DataCenterTool.getStandingDivisionList();
    		for (String s : list)
    		{
    			System.out.println(s);
    		}
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
	}
}
