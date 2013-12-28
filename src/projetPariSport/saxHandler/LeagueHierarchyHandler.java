package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.LeagueHierarchy;

public class LeagueHierarchyHandler extends DefaultHandler {
	private List<LeagueHierarchy> leagueHierarchies;
	private LeagueHierarchy leagueHierarchy;
	private String leagueId, leagueName, leagueAlias,
	conferenceId, conferenceName, conferenceAlias, divisionId, divisionName, divisionAlias;
	
	public LeagueHierarchyHandler() {
		leagueHierarchies = new  LinkedList<LeagueHierarchy>();
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		
		if(qName.equals("league")){
			leagueId = attributes.getValue("id");
			leagueName = attributes.getValue("name");
			leagueAlias = attributes.getValue("alias");
		}else if(qName.equals("conference")){
			conferenceId = attributes.getValue("id");
			conferenceName = attributes.getValue("name");
			conferenceAlias = attributes.getValue("alias");
		}
		else if(qName.equals("division")){
			divisionId = attributes.getValue("id");
			divisionName = attributes.getValue("name");
			divisionAlias = attributes.getValue("alias");
		}else if(qName.equals("team")){
			leagueHierarchy = new LeagueHierarchy();
			leagueHierarchy.setLeagueId(leagueId);
			leagueHierarchy.setLeagueName(leagueName);
			leagueHierarchy.setLeagueAlias(leagueAlias);
			leagueHierarchy.setConferenceId(conferenceId);
			leagueHierarchy.setConferenceName(conferenceName);
			leagueHierarchy.setConferenceAlias(conferenceAlias);
			leagueHierarchy.setDivisionId(divisionId);
			leagueHierarchy.setDivisionName(divisionName);
			leagueHierarchy.setDivisionAlias(divisionAlias);
			leagueHierarchy.setAttributesValues(attributes, qName);
		}
		else if(qName.equals("venue")){
			leagueHierarchy.setAttributesValues(attributes, qName);
		}
		else{
			/**/
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("team")){
			leagueHierarchies.add(leagueHierarchy);
			leagueHierarchy = null;
		}
		else{
			/*DO NOTHIN*/
		}
	}
		
	public void startDocument() throws SAXException{
		System.out.println("Beginning of parsing:");
	}
	
	public void endDocument() throws SAXException{
		for(LeagueHierarchy b : leagueHierarchies){
			System.out.println(b.toString());
		}
	}
	
	public List<LeagueHierarchy> getLeagueHierarchies()
	{
		return leagueHierarchies;
	}
}
