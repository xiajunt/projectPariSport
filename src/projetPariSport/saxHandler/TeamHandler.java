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
	private StringBuffer buffer;
	
	public TeamHandler() {
		// TODO Auto-generated constructor stub
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
			buffer = null;
			team = null;
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
		for(Team b : teams){
			System.out.println(b.toString());
		}
	}
	
	public List<Team> getTeams()
	{
		return teams;
	}
}
