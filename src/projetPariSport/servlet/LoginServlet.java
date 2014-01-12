package projetPariSport.servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		UserService userService = UserServiceFactory.getUserService();
		if (userService.getCurrentUser() == null)
			req.getRequestDispatcher(userService.createLoginURL("/"));
		else
			req.getRequestDispatcher("/").forward(req, resp);
		/*JSONObject obj = new JSONObject(userService);
		StringWriter out = new StringWriter();
		
		try {
			obj.write(out);
		} catch (JSONException e) {
			e.printStackTrace();
		}
		String jsonText = out.toString();
		req.getSession().setAttribute("userService",jsonText);
		System.err.println("Data serialized : "+jsonText);
		req.getRequestDispatcher("/").forward(req, resp);*/
	}
}
