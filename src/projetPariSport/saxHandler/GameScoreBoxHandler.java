package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.GameScoreBox;

/**
 * GameScoreBoxHandler - Determines the logic to parse the data GameScoreBox 
 *  
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */
public class GameScoreBoxHandler extends DefaultHandler {
	private List<GameScoreBox> gameScoreBoxes;
	private GameScoreBox gameScoreBox;
	private String currentTeam;
	
	public GameScoreBoxHandler() {
		super();
		gameScoreBoxes = new LinkedList<GameScoreBox>();
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		
		if(qName.equals("game")){
			gameScoreBox = new GameScoreBox();
			gameScoreBox.setGameScheduled(attributes.getValue("scheduled"));
			gameScoreBox.setAttributesValues(attributes,qName);
		}else if(qName.equals("team")){
			currentTeam = attributes.getValue("id");
			String base = currentTeam.equals(gameScoreBox.getGameHomeTeam())?"home_team":"away_team";
			gameScoreBox.setAttributesValues(attributes,base);
		}
		else if(qName.equals("quarter")){
			String base = currentTeam.equals(gameScoreBox.getGameHomeTeam())?"home_team_quarter":"away_team_quarter";
			gameScoreBox.setAttributesValues(attributes,base+attributes.getValue("number"));			
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("game")){
			gameScoreBoxes.add(gameScoreBox);
			gameScoreBox = null;
		}
	}
		
	public List<GameScoreBox> getGameScoreBoxes(){
		return this.gameScoreBoxes;
	}
}
