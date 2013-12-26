package projetPariSport.saxHandler;

import java.util.LinkedList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.structObject.Schedule;

public class ScheduleHandler extends DefaultHandler {
	private List<Schedule> seasonSchedule;
	private Schedule schedule;
	private StringBuffer buffer;
	private String leagueId, leagueName, leagueAlias, id, type, year;
	
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
			id = attributes.getValue("id");
			year = attributes.getValue("year");
			type = attributes.getValue("type");
		}
		else{
			if(qName.equals("game")){
				schedule = new Schedule();
				schedule.setLeagueId(leagueId);
				schedule.setLeagueName(leagueName);
				schedule.setLeagueAlias(leagueAlias);
				schedule.setId(id);
				schedule.setYear(year);
				schedule.setType(type);
				schedule.setGameId(attributes.getValue("id"));
				schedule.setScheduled(attributes.getValue("scheduled"));
				schedule.setAttributesValues(attributes);
			}else if(qName.equals("venue")){
				schedule.setVenueId(attributes.getValue("id"));
			}
			else if(qName.equals("broadcast")){
				schedule.setAttributesValues(attributes);
			}
			else{
				/*DO NOTHIN*/
			}
		}
	}	
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("game")){
			seasonSchedule.add(schedule);
			buffer = null;
			schedule = null;
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

		for(Schedule b : seasonSchedule){
			System.out.println(b.toString());
		}
	}
	
	public List<Schedule> getSeasonSchedule()
	{
		return seasonSchedule;
	}
}
