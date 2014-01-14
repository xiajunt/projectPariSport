package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.Injury;

/**
 * InjuryHandler - Determines the logic to parse the data Injury 
 *  
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */
public class InjuryHandler extends DefaultHandler {
	private List<Injury> injuries;
	private Injury injury;
	private String teamId, playerId;
	private boolean inPlayer;
	
	public InjuryHandler() {
		super();
		injuries = new LinkedList<Injury>();
		inPlayer = false;
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		if(qName.equals("team")){
			teamId = attributes.getValue("id");
		}
		else if(qName.equals("player")){
			inPlayer = true;
			playerId = attributes.getValue("id");
		}else if(qName.equals("injury") && inPlayer){
			injury = new Injury();
			injury.setTeamId(teamId);
			injury.setPlayerId(playerId);
			injury.setAttributesValues(attributes, qName);
		}else{
			/*DO NOTHIN*/
		}
	}
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("player")){
			injuries.add(injury);
			injury = null;
		}else if(qName.equals("player")){
			inPlayer = false;
		}else{
			/*DO NOTHIN*/
		}
	}
		
	public List<Injury> getInjuries()
	{
		return injuries;
	}

}