package projetPariSport.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.repackaged.org.codehaus.jackson.map.ObjectMapper;

import projetPariSport.structObject.Account;
import projetPariSport.tools.DataCenterTool;

@SuppressWarnings("serial")
public class BettingServlet extends HttpServlet {
	
	@Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException{
		
		String betting = req.getParameter("betting");
		String userServiceNickName = req.getParameter("userServiceNickName");
		String stake = req.getParameter("stake");
		String userServiceEmail = req.getParameter("userServiceEmail");
		String token = req.getParameter("token");
		
		Map<String,String> map = new HashMap<String,String>();
		ObjectMapper mapper = new ObjectMapper();
		map = mapper.readValue(betting, HashMap.class);
		
		Account ac = DataCenterTool.getAccount(userServiceEmail, userServiceNickName);
		
		boolean state = DataCenterTool.putBet(map, ac, Integer.parseInt(stake));
		resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
		if(state){
			out.println("true");
		}else{
			out.println("false");
		}
		out.close();
	}
}
