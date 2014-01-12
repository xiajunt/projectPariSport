package projetPariSport.cron;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.parameter.Parameter;
import projetPariSport.structObject.Account;
import projetPariSport.tools.DataCenterTool;

@SuppressWarnings("serial")
public class Test extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
    	try
    	{
    		Map<String, String> map = new HashMap<String, String>();
    		map.put("001eaa7b-4a2d-4077-b590-1f288a42a8a2", "583ec5fd-fb46-11e1-82cb-f4ce4684ea4c");
    		map.put("0032b928-e851-45ad-bbe4-68d391e27229", "583eccfa-fb46-11e1-82cb-f4ce4684ea4c");
    		map.put("00542258-5ca7-4ca4-bff3-70ccd7fd7789", "583ec87d-fb46-11e1-82cb-f4ce4684ea4c");
    		
    		Account ac = (Account)DataCenterTool.getDataCenter(Parameter.ACCOUNT, "xiajunt@gmail.com");
    		
    		if (DataCenterTool.putBet(map, ac, 10) == true)
    			System.out.println("true");
    		else
    			System.out.println("false");
    	}
    	catch (Exception e)
    	{
    		e.printStackTrace();
    	}
	}
}
