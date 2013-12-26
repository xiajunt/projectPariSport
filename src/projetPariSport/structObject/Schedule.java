package projetPariSport.structObject;

import java.beans.Introspector;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.beanutils.BeanUtils;
import org.xml.sax.Attributes;

import projetPariSport.utils.Utils;

import com.googlecode.objectify.annotation.*;



/* JavaBean Schedule
 * 
 */
@Entity
@Cache
public class Schedule implements IDataCenterObject {
	private String leagueId;
	private String leagueName;
	private String leagueAlias;
	private String id;
	private String year;
	private String type;
	private @Id String gameId;
	private String status;
	private String coverage;
	private String homeTeam;
	private String awayTeam;
	private @Index Date scheduled;
	private String venueId;
	private String network;
	private String satellite;
	
	public Schedule(){
		super();
	}

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getLeagueName() {
		return leagueName;
	}

	public void setLeagueName(String leagueName) {
		this.leagueName = leagueName;
	}

	public String getLeagueAlias() {
		return leagueAlias;
	}

	public void setLeagueAlias(String leagueAlias) {
		this.leagueAlias = leagueAlias;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCoverage() {
		return coverage;
	}

	public void setCoverage(String coverage) {
		this.coverage = coverage;
	}

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public Date getScheduled() {
		return scheduled;
	}

	public void setScheduled(String scheduled) {
		String t = scheduled.replace('T', ':');
		try {
			this.scheduled = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss", Locale.FRANCE).parse(t.substring(0, t.length() - 6));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public String getVenueId() {
		return venueId;
	}

	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}

	public String getNetwork() {
		return network;
	}

	public void setNetwork(String network) {
		this.network = network;
	}

	public String getSatellite() {
		return satellite;
	}

	public void setSatellite(String satellite) {
		this.satellite = satellite;
	}
	
	/**
	 * Set values matching all Sax attributes to the Intances variables
	 * @param attributes
	 */
	public void setAttributesValues(Attributes attributes){
		
		int len = attributes.getLength();
		for(int i = 0; i < len; i++)
		{
			String sAttrName = Introspector.decapitalize(Utils.toCamelCase(attributes.getLocalName(i)));
			String sVal = attributes.getValue(i);
			
			try {
				BeanUtils.setProperty(this,sAttrName,sVal);
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

	@Override
	public String toString() {
		return "Schedule [leagueId=" + leagueId + ", leagueName=" + leagueName
				+ ", leagueAlias=" + leagueAlias + ", id=" + id + ", year="
				+ year + ", type=" + type + ", gameId=" + gameId + ", status="
				+ status + ", coverage=" + coverage + ", homeTeam=" + homeTeam
				+ ", awayTeam=" + awayTeam + ", scheduled=" + scheduled
				+ ", venueId=" + venueId + ", network=" + network
				+ ", satellite=" + satellite + "]";
	}
}

