package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.GameScoreBoxPlayer;

public class GameScoreBoxPlayerHandler extends DefaultHandler {
	private  List<GameScoreBoxPlayer> gameScoreBoxPlayers;
	private String gameId, teamId;
	private GameScoreBoxPlayer gameScoreBoxPlayer;
	
	public GameScoreBoxPlayerHandler() {
		super();
		gameScoreBoxPlayers = new LinkedList<GameScoreBoxPlayer>();
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		if(qName.equals("game")){
			gameId = attributes.getValue("id");
		}else if(qName.equals("team")){
			teamId = attributes.getValue("id");
		}else if(qName.equals("player")){
			gameScoreBoxPlayer = new GameScoreBoxPlayer();
			gameScoreBoxPlayer.setGameId(gameId);
			gameScoreBoxPlayer.setTeamId(teamId);
			gameScoreBoxPlayer.setPlayerId(attributes.getValue("id"));
		}else if(qName.equals("statistics")){
			gameScoreBoxPlayer.setAttributesValues(attributes, qName);
		}else{
			/*DO NOTHIN*/
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("player")){
			gameScoreBoxPlayers.add(gameScoreBoxPlayer);
			gameScoreBoxPlayer = null;
		}
	}
	
	public void startDocument() throws SAXException{
		System.out.println("Beginning of parsing:");
	}
	
	public void endDocument() throws SAXException{

		for(GameScoreBoxPlayer b : gameScoreBoxPlayers){
			System.out.println(b.toString());
		}
	}
}
