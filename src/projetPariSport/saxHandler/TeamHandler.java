package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.Team;

public class TeamHandler extends DefaultHandler {
	private List<Team> teams;
	private Team team;
	
	public TeamHandler() {
		teams = new LinkedList<Team>();
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		
		if(qName.equals("team")){
			team = new Team();
			team.setAttributesValues(attributes, qName);
		}else if(qName.equals("venue")){
			team.setAttributesValues(attributes, qName);
		}else if(qName.equals("league")){
			team.setLeagueId(attributes.getValue("id"));
		}else if(qName.equals("conference")){
			team.setConferenceId(attributes.getValue("id"));
		}else if(qName.equals("division")){
			team.setDivisionId(attributes.getValue("id"));
		}else{
			/**/
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("team")){
			teams.add(team);
			team = null;
		}
		else{
			/*DO NOTHIN*/
		}
	}
		
	public void startDocument() throws SAXException{
//		System.out.println("Beginning of parsing:");
	}
	
	public void endDocument() throws SAXException{
//		for(Team b : teams){
//			System.out.println(b.toString());
//		}
	}
	
	public List<Team> getTeams()
	{
		return teams;
	}
}
