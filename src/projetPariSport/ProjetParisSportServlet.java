package projetPariSport;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.structObject.Account;

import com.googlecode.objectify.ObjectifyService;

@SuppressWarnings("serial")
public class ProjetParisSportServlet extends HttpServlet {
	
	static {
		ObjectifyService.register(Account.class);
	}
	
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		/*initialisation Objectify*/
		ObjectifyService.ofy();
		
		/*Creer notre instance Account et le sauvegarder dans le data store*/
		Account myAccount = new Account("Junt", "xiajunt@gmail.com");
		ofy().save().entity(myAccount).now();
		
		/*Charger l'objet a partir du data store*/
		Account account = ofy().load().type(Account.class).id("xiajunt@gmail.com").now(); 
		
		resp.setContentType("text/plain");
		resp.getWriter().println(account.getName() + " " + account.getMail() + " " + account.getToken());
	}
}
