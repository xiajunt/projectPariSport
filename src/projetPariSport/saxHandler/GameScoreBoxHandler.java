package projetPariSport.saxHandler;

import java.lang.reflect.InvocationTargetException;
import java.util.LinkedList;
import java.util.List;

import org.apache.commons.beanutils.BeanUtils;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.GameScoreBox;

public class GameScoreBoxHandler extends DefaultHandler {
	private List<GameScoreBox> gameScoreBoxes;
	private GameScoreBox gameScoreBox;
	private StringBuffer buffer;
	private String currentTeam;
	
	public GameScoreBoxHandler() {
		super();
		gameScoreBoxes = new LinkedList<GameScoreBox>();
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		
		if(qName.equals("game")){
			gameScoreBox = new GameScoreBox();
			gameScoreBox.setScheduled(attributes.getValue("scheduled"));
			gameScoreBox.setAttributesValues(attributes, "");
		}else if(qName.equals("team")){
			
			currentTeam = attributes.getValue("id");
			String baseSetterMethodName = currentTeam.equals(gameScoreBox.getHomeTeam())?"homeTeamPoints":"awayTeamPoints";
			
			try {
				BeanUtils.setProperty(gameScoreBox,baseSetterMethodName,Integer.parseInt(attributes.getValue("points")));
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
		}
		else if(qName.equals("quarter")){
			try {
				String attributName = currentTeam.equals(gameScoreBox.getHomeTeam())?"homeTeamQuarter":"awayTeamQuarter";
				BeanUtils.setProperty(gameScoreBox,attributName+attributes.getValue("number"),Integer.parseInt(attributes.getValue("points")));
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
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("game")){
			gameScoreBoxes.add(gameScoreBox);
			gameScoreBox = null;
		}
		buffer = null;
	}
	
	public void characters(char[] ch, int start, int length) throws SAXException{
		String lecture = new String(ch, start, length);
		if(buffer != null) buffer.append(lecture);
	}
	
	public void startDocument() throws SAXException{
		System.out.println("Beginning of parsing:");
	}
	
	public void endDocument() throws SAXException{

		for(GameScoreBox b : gameScoreBoxes){
			System.out.println(b.toString());
		}
	}
	
	public List<GameScoreBox> getGameScoreBoxes(){
		return this.gameScoreBoxes;
	}
}
