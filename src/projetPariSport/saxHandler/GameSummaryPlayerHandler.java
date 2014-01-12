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
	private String gameId, teamId;
	private boolean inPlayer;
	
	public GameSummaryPlayerHandler() {
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
			gameSummaryPlayer.setAttributesValues(attributes, qName);
			inPlayer = true;
		}else if(qName.equals("statistics") && inPlayer){
			gameSummaryPlayer.setAttributesValues(attributes, qName);
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("player")){
			gameSummaryPlayers.add(gameSummaryPlayer);
			inPlayer = false;
		}else{
			/*DO NOTHIN*/
		}
	}
		
	public void startDocument() throws SAXException{
//		System.out.println("Beginning of parsing:");
	}
	
	public void endDocument() throws SAXException{

//		for(GameSummaryPlayer b : gameSummaryPlayers){
//			System.out.println(b.toString());
//		}
	}
	
	public List<GameSummaryPlayer> getGameSummary()
	{
		return gameSummaryPlayers;
	}
}