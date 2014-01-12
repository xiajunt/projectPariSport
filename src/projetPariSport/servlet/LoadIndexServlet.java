package projetPariSport.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.structObject.Standings;
import projetPariSport.tools.DataCenterTool;

@SuppressWarnings("serial")
public class LoadIndexServlet extends HttpServlet {
	
	@Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException, ServletException {
		
		List<Standings> listStandings =  DataCenterTool.getStanding();
		req.setAttribute("listStandings", listStandings);		
		req.getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
