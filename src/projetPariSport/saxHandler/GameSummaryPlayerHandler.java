package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.GameSummaryPlayer;

public class GameSummaryPlayerHandler extends DefaultHandler {
	private List<GameSummaryPlayer> gameSummaryPlayers;
	private GameSummaryPlayer gameSummaryPlayer;
	private StringBuffer buffer;
	private String gameId, teamId;
	private boolean inPlayer;
	
	public GameSummaryPlayerHandler() {
		// TODO Auto-generated constructor stub
		super();
		gameSummaryPlayers = new LinkedList<GameSummaryPlayer>();
		inPlayer = false;
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		if(qName.equals("game")){
			gameId = attributes.getValue("id");
		}else if(qName.equals("team")){
			teamId = attributes.getValue("id");
		}else if(qName.equals("player")){
			gameSummaryPlayer = new GameSummaryPlayer();
			gameSummaryPlayer.setGameId(gameId);
			gameSummaryPlayer.setTeamId(teamId);
			gameSummaryPlayer.setPlayerId(attributes.getValue("id"));
			gameSummaryPlayer.setAttributesValues(attributes, "");
			inPlayer = true;
		}else if(qName.equals("statistics") && inPlayer){
			gameSummaryPlayer.setAttributesValues(attributes, "");
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("player")){
			gameSummaryPlayers.add(gameSummaryPlayer);
			buffer = null;
			inPlayer = false;
		}else{
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

		for(GameSummaryPlayer b : gameSummaryPlayers){
			System.out.println(b.toString());
		}
	}
	
	public List<GameSummaryPlayer> getGameSummary()
	{
		return gameSummaryPlayers;
	}
}
