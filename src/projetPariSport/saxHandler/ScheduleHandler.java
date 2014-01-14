package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.Schedule;

/**
 * ScheduleHandler - Determines the logic to parse the data Schedule 
 *  
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */
public class ScheduleHandler extends DefaultHandler {
	private List<Schedule> seasonSchedule;
	private Schedule schedule;
	private String leagueId, leagueName, leagueAlias, seasonScheduleId, seasonScheduleYear, seasonScheduleType;
	
	public ScheduleHandler() {
		super();
		seasonSchedule = new LinkedList<Schedule>();
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		if(qName.equals("league")){
			leagueId = attributes.getValue("id");
			leagueName = attributes.getValue("name");
			leagueAlias = attributes.getValue("alias");
		}else if(qName.equals("season-schedule")){
			seasonScheduleId = attributes.getValue("id");
			seasonScheduleYear = attributes.getValue("year");
			seasonScheduleType = attributes.getValue("type");
		}
		else{
			if(qName.equals("game")){
				schedule = new Schedule();
				schedule.setLeagueId(leagueId);
				schedule.setLeagueName(leagueName);
				schedule.setLeagueAlias(leagueAlias);
				schedule.setSeasonScheduleId(seasonScheduleId);
				schedule.setSeasonScheduleYear(seasonScheduleYear);
				schedule.setSeasonScheduleType(seasonScheduleType);
				schedule.setGameId(attributes.getValue("id"));
				schedule.setGameScheduled(attributes.getValue("scheduled"));
				schedule.setAttributesValues(attributes,qName);
			}else if(qName.equals("venue")){
				schedule.setVenueId(attributes.getValue("id"));
			}
			else if(qName.equals("broadcast")){
				schedule.setAttributesValues(attributes,qName);
			}
			else{
				/*DO NOTHIN*/
			}
		}
	}	
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("game")){
			seasonSchedule.add(schedule);
			schedule = null;
		}else{
			/*DO NOTHIN*/
		}
	}
		
	public List<Schedule> getSeasonSchedule()
	{
		return seasonSchedule;
	}
}
