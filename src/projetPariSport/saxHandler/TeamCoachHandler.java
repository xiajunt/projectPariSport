package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.TeamCoach;

public class TeamCoachHandler extends DefaultHandler {
	private List<TeamCoach> teamsCoaches;
	private TeamCoach teamCoach;
	private StringBuffer buffer;
	
	public TeamCoachHandler() {
		// TODO Auto-generated constructor stub
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
			buffer = null;
			teamCoach = null;
		}
		else{
			/*DO NOTHIN*/
			buffer = null;
		}
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException{
		String lecture = new String(ch, start, length);
		if(buffer != null) buffer.append(lecture);
	}
	
	public void startDocument() throws SAXException{
		System.out.println("Beginning of parsing:");
	}
	
	public void endDocument() throws SAXException{
		for(TeamCoach b : teamsCoaches){
			System.out.println(b.toString());
		}
	}
	
	public List<TeamCoach> getTeamsCoaches()
	{
		return teamsCoaches;
	}
}
