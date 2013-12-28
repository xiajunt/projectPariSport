package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.Standings;

public class StandingsHandler extends DefaultHandler {
	private List<Standings> standingsList;
	private Standings standings;
	private String leagueId, leagueName, leagueAlias, seasonId, seasonYear, seasonType,
	conferenceId, conferenceName, conferenceAlias, divisionId, divisionName, divisionAlias;
	private boolean inRecords;
	
	public StandingsHandler() {
		standingsList = new  LinkedList<Standings>();
		inRecords = false;
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		
		if(qName.equals("league")){
			leagueId = attributes.getValue("id");
			leagueName = attributes.getValue("name");
			leagueAlias = attributes.getValue("alias");
		}else if(qName.equals("season")){
			seasonId = attributes.getValue("id");
			seasonType = attributes.getValue("type");
			seasonYear = attributes.getValue("year");
		}else if(qName.equals("conference") && !inRecords){
			conferenceId = attributes.getValue("id");
			conferenceName = attributes.getValue("name");
			conferenceAlias = attributes.getValue("alias");
		}
		else if(qName.equals("division") && !inRecords){
			divisionId = attributes.getValue("id");
			divisionName = attributes.getValue("name");
			divisionAlias = attributes.getValue("alias");
		}else if(qName.equals("team")){
			standings = new Standings();
			standings.setLeagueId(leagueId);
			standings.setLeagueName(leagueName);
			standings.setLeagueAlias(leagueAlias);
			standings.setSeasonId(seasonId);
			standings.setSeasonType(seasonType);
			standings.setSeasonYear(seasonYear);
			standings.setConferenceId(conferenceId);
			standings.setConferenceName(conferenceName);
			standings.setConferenceAlias(conferenceAlias);
			standings.setDivisionId(divisionId);
			standings.setDivisionName(divisionName);
			standings.setDivisionAlias(divisionAlias);
			standings.setAttributesValues(attributes, "team");
		}else if(qName.equals("games-behind")){
			standings.setGamesBehindLeague(attributes.getValue("league"));	
			standings.setGamesBehindConference(attributes.getValue("league"));
			standings.setGamesBehindDivision(attributes.getValue("division"));
		}else if(qName.equals("records")){
			inRecords = true;
		}
		else if(inRecords){
			standings.setAttributesValues(attributes, qName);
		}
		else{
			/**/
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("team")){
			standingsList.add(standings);
			standings = null;
		}else if(qName.equals("records")){
			inRecords = false;
		}
		else{
			/*DO NOTHIN*/
		}
	}
	
	public void startDocument() throws SAXException{
		System.out.println("Beginning of parsing:");
	}
	
	public void endDocument() throws SAXException{
		for(Standings b : standingsList){
			System.out.println(b.toString());
		}
	}
	
	public List<Standings> getStandingsList()
	{
		return standingsList;
	}
}
