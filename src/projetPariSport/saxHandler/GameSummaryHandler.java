package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.GameSummary;

public class GameSummaryHandler extends DefaultHandler {
	private List<GameSummary> gameSummarys;
	private GameSummary gameSummary;
	private String currentTeam;
	private boolean inTeam, inPlayer;
	
	public GameSummaryHandler() {
		super();
		gameSummarys = new LinkedList<GameSummary>(); 
		inTeam = false;
		inPlayer = false;
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		if(qName.equals("game")){
			gameSummary = new GameSummary();
			gameSummary.setGameScheduled(attributes.getValue("scheduled"));
			gameSummary.setAttributesValues(attributes, qName);
		}
		else if(qName.equals("team")){
			inTeam = true;
			currentTeam = attributes.getValue("id");
			String base = currentTeam.equals(gameSummary.getGameHomeTeam())?"home_team":"away_team";
			gameSummary.setAttributesValues(attributes,base);
		}else if(qName.equals("quarter")){
			String base = currentTeam.equals(gameSummary.getGameHomeTeam())?"home_team_quarter":"away_team_quarter";
			gameSummary.setAttributesValues(attributes,base+attributes.getValue("number"));
		}else if(qName.equals("statistics") && inTeam && !inPlayer){
			String base = currentTeam.equals(gameSummary.getGameHomeTeam())?"home":"away";
			gameSummary.setAttributesValues(attributes, base+"_"+qName);
		}else if(qName.equals("player")){
			inPlayer = true;
		}
		else{
			/*DO NOTHIN*/
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("game")){
			gameSummarys.add(gameSummary);
			gameSummary = null;
		}else if(qName.equals("team")){
			inTeam = false;
		}else if(qName.equals("player")){
			inPlayer = false;
		}else{
			/*DO NOTHIN*/
		}
	}
	
	public void startDocument() throws SAXException{
//		System.out.println("Beginning of parsing:");
	}
	
	public void endDocument() throws SAXException{

//		for(GameSummary b : gameSummarys){
//			System.out.println(b.toString());
//		}
	}
	
	public List<GameSummary> getGameSummary()
	{
		return gameSummarys;
	}
	
}
