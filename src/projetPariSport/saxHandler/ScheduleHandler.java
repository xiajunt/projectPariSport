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
	private boolean inSeasonSchedule, inLeague, inGame, inVenue, inBroadcast;
	private StringBuffer buffer;
	private String leagueId, leagueName, leagueAlias, id, type;
	private Integer year;
	
	public ScheduleHandler() {
		super();
	}
	
	public void startElement(String uri, String localName,
			String qName, Attributes attributes) throws SAXException{
		if(qName.equals("league")){
			inLeague = true;
			leagueId = attributes.getValue("id");
			leagueName = attributes.getValue("name");
			leagueAlias = attributes.getValue("alias");
		}else if(qName.equals("season-schedule")){
			seasonSchedule = new LinkedList<Schedule>();
			inSeasonSchedule = true;
			id = attributes.getValue("id");
			year = Integer.parseInt(attributes.getValue("year"));
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
				schedule.setGameStatus(attributes.getValue("status"));
				schedule.setGameCoverage(attributes.getValue("coverage"));
				schedule.setGameHomeTeamId(attributes.getValue("home_team"));
				schedule.setGameAwayTeamId(attributes.getValue("away_team"));
				schedule.setGameScheduled(attributes.getValue("scheduled"));
				inGame = true;
			}else if(qName.equals("venue")){
				inVenue = true;
				schedule.setVenueId(attributes.getValue("id"));
			}
			else if(qName.equals("broadcast")){
				inBroadcast = true;
				schedule.setBroadcastNetwork(attributes.getValue("network"));
				schedule.setBroadcastSatellite(attributes.getValue("satellite"));
			}
			else{
				/*DO NOTHIN*/
			}
		}
	}	
	
	public void endElement(String uri, String localName, String qName){
		if(qName.equals("league")){
			inLeague = false;
		}else if(qName.equals("season-schedule")){
			inSeasonSchedule = false;
		}else if(qName.equals("game")){
			seasonSchedule.add(schedule);
			inGame = false;
			buffer = null;
			schedule = null;
		}else if(qName.equals("venue")){
			inVenue = false;
			buffer = null;
		}else if(qName.equals("broadcast")){
			inBroadcast = false;
			buffer = null;
		}else{
			/*DO NOTHIN*/
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
		System.out.println("End of parsing:");
		System.out.println("results:");
		for(Schedule s : seasonSchedule){
			System.out.println("/*");
			System.out.println(s);
			System.out.println("*/ \n");
		}
	}
	
	public List<Schedule> getSeasonSchedule()
	{
		return seasonSchedule;
	}
}
