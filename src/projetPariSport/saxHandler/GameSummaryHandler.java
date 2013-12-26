package projetPariSport.saxHandler;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.GameSummary;

public class GameSummaryHandler extends DefaultHandler {
	private List<GameSummary> gameSummarys;
	private GameSummary gameSummary;
	private StringBuffer buffer;
	private String currentTeam;
	private boolean inTeam, inPlayer;
	
	public GameSummaryHandler() {
		// TODO Auto-generated constructor stub
		super();
		gameSummarys = new LinkedList<GameSummary>(); 
		inTeam = false;
		inPlayer = false;
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		if(qName.equals("game")){
			gameSummary = new GameSummary();
			gameSummary.setGameId(attributes.getValue("id"));
			gameSummary.setScheduled(attributes.getValue("scheduled"));
			gameSummary.setAttributesValues(attributes, "");
		}
		else if(qName.equals("team")){
			currentTeam = attributes.getValue("id");
			inTeam = true;
		}else if(qName.equals("quarter")){
			try {
				String baseAttributName = currentTeam.equals(gameSummary.getHomeTeam())?"homeTeam":"awayTeam";
				BeanUtils.setProperty(gameSummary,baseAttributName+"Quarting"+attributes.getValue("number"),attributes.getValue("points"));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(qName.equals("statistics") && inTeam && !inPlayer){
			String baseAttributName = currentTeam.equals(gameSummary.getHomeTeam())?"home":"away";
			gameSummary.setAttributesValues(attributes, baseAttributName);
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
			buffer = null;
			gameSummary = null;
		}else if(qName.equals("team")){
			inTeam = false;
		}else if(qName.equals("player")){
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

		for(GameSummary b : gameSummarys){
			System.out.println(b.toString());
		}
	}
	
	public List<GameSummary> getGameSummary()
	{
		return gameSummarys;
	}
	
}
