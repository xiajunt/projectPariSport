package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.TeamPlayer;

public class TeamPlayerHandler extends DefaultHandler {
	private List<TeamPlayer> teamsPlayers;
	private TeamPlayer teamPlayer;
	private StringBuffer buffer;
	private String teamId;
	private boolean inPlayer;
	
	public TeamPlayerHandler() {
		// TODO Auto-generated constructor stub
		teamsPlayers = new LinkedList<TeamPlayer>();
		inPlayer = false;
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		
		if(qName.equals("team")){
			teamId = attributes.getValue("id");
		}else if(qName.equals("player")){
			inPlayer = true;
			teamPlayer = new TeamPlayer();
			teamPlayer.setTeamId(teamId);
			teamPlayer.setPlayerUpdated(attributes.getValue("updated"));
			teamPlayer.setAttributesValues(attributes, qName);
		}else if(qName.equals("draft") && inPlayer){
			teamPlayer.setAttributesValues(attributes, qName);
		}	else{
			/**/
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("player")){
			teamsPlayers.add(teamPlayer);
			buffer = null;
			teamPlayer = null;
			inPlayer = false;
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
		for(TeamPlayer b : teamsPlayers){
			System.out.println(b.toString());
		}
	}
	
	public List<TeamPlayer> getTeamsCoaches()
	{
		return teamsPlayers;
	}
}
