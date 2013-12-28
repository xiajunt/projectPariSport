package projetPariSport.structObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import com.googlecode.objectify.annotation.*;

/**
 * Schedule - Definition of the object schedule
 * This class maps all datas from the SportsDataLLC 's API
 * Get full season schedules for the NBA.
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 20/12/2013
 *
 * @revision 
 * 				date 21/12/2013
 * 				author Juntie Xia
 * 				Integration of the object in the GAE's datastore
 */
@Entity
@Cache
public class Schedule extends StructObject implements IDataCenterObject {
	private String leagueId;
	private String leagueName;
	private String leagueAlias;
	private String seasonScheduleId;
	private String seasonScheduleYear;
	private String seasonScheduleType;
	private String gameId;
	private String gameStatus;
	private String gameCoverage;
	private String gameHomeTeam;
	private String gameAwayTeam;
	private Date gameScheduled;
	private String venueId;
	private String broadcastNetwork;
	private String broadcastSatellite;
	
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

	public String getSeasonScheduleId() {
		return seasonScheduleId;
	}

	public void setSeasonScheduleId(String seasonScheduleId) {
		this.seasonScheduleId = seasonScheduleId;
	}

	public String getSeasonScheduleYear() {
		return seasonScheduleYear;
	}

	public void setSeasonScheduleYear(String seasonScheduleYear) {
		this.seasonScheduleYear = seasonScheduleYear;
	}

	public String getSeasonScheduleType() {
		return seasonScheduleType;
	}

	public void setSeasonScheduleType(String seasonScheduleType) {
		this.seasonScheduleType = seasonScheduleType;
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}

	public String getGameCoverage() {
		return gameCoverage;
	}

	public void setGameCoverage(String gameCoverage) {
		this.gameCoverage = gameCoverage;
	}

	public String getGameHomeTeam() {
		return gameHomeTeam;
	}

	public void setGameHomeTeam(String gameHomeTeam) {
		this.gameHomeTeam = gameHomeTeam;
	}

	public String getGameAwayTeam() {
		return gameAwayTeam;
	}

	public void setGameAwayTeam(String gameAwayTeam) {
		this.gameAwayTeam = gameAwayTeam;
	}

	public Date getGameScheduled() {
		return gameScheduled;
	}
	
	public void setGameScheduled(String gameScheduled) {
		String t = gameScheduled.replace('T', ':');
		try {
			this.gameScheduled = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss", Locale.FRANCE).parse(t.substring(0, t.length() - 6));
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

	public String getBroadcastNetwork() {
		return broadcastNetwork;
	}

	public void setBroadcastNetwork(String broadcastNetwork) {
		this.broadcastNetwork = broadcastNetwork;
	}

	public String getBroadcastSatellite() {
		return broadcastSatellite;
	}


	public void setBroadcastSatellite(String broadcastSatellite) {
		this.broadcastSatellite = broadcastSatellite;
	}

	@Override
	public String toString() {
		return "Schedule [leagueId=" + leagueId + ", leagueName=" + leagueName
				+ ", leagueAlias=" + leagueAlias + ", seasonScheduleId="
				+ seasonScheduleId + ", seasonScheduleYear="
				+ seasonScheduleYear + ", seasonScheduleType="
				+ seasonScheduleType + ", gameId=" + gameId + ", gameStatus="
				+ gameStatus + ", gameCoverage=" + gameCoverage
				+ ", gameHomeTeam=" + gameHomeTeam + ", gameAwayTeam="
				+ gameAwayTeam + ", gameScheduled=" + gameScheduled
				+ ", venueId=" + venueId + ", broadcastNetwork="
				+ broadcastNetwork + ", broadcastSatellite="
				+ broadcastSatellite + "]";
	}	
}

