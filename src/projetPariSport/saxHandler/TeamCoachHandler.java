package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.TeamCoach;

/**
 * TeamCoachHandler - Determines the logic to parse the data TeamCoach 
 *  
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */
public class TeamCoachHandler extends DefaultHandler {
	private List<TeamCoach> teamsCoaches;
	private TeamCoach teamCoach;
	
	public TeamCoachHandler() {
		teamsCoaches = new LinkedList<TeamCoach>();
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		
		if(qName.equals("team")){
			teamCoach = new TeamCoach();
			teamCoach.setTeamId(attributes.getValue("id"));
		}else if(qName.equals("coach")){
			teamCoach.setAttributesValues(attributes, qName);
		}else{
			/**/
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("team")){
			teamsCoaches.add(teamCoach);
			teamCoach = null;
		}
		else{
			/*DO NOTHIN*/
		}
	}
			
	public List<TeamCoach> getTeamsCoaches()
	{
		return teamsCoaches;
	}
}
