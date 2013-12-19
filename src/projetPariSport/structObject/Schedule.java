package projetPariSport.structObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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
	private @Id String id;
	private Integer year;
	private String type;
	private String gameId;
	private String gameStatus;
	private String gameCoverage;
	private String gameHomeTeamId;
	private String gameAwayTeamId;
	private @Index Date gameScheduled;
	private String venueId;
	private String broadcastNetwork;
	private String broadcastSatellite;
	
	public Schedule(){
		
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

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
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
	
	public String getGameStatus() {
		return this.gameStatus;
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

	public String getGameHomeTeamId() {
		return gameHomeTeamId;
	}

	public void setGameHomeTeamId(String gameHomeTeamId) {
		this.gameHomeTeamId = gameHomeTeamId;
	}

	public String getGameAwayTeamId() {
		return this.gameAwayTeamId;
	}

	public void setGameAwayTeamId(String gameAwayTeamId) {
		this.gameAwayTeamId = gameAwayTeamId;
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
	
	public String toString(){
		return new StringBuffer("LeagueId : ").append(leagueId).append(",\n").append("LeagueName : ").append(leagueName)
				.append(",\n").append("LeagueAlias : ").append(leagueAlias).append(",\n").append("Id : ").append(id)
				.append(",\n").append("Year : ").append(year).append(",\n").append("Type : ").append(type)
				.append(",\n").append("GameId : ").append(gameId).append(",\n").append("Status : ").append(gameStatus)
				.append(",\n").append("Coverage : ").append(gameCoverage).append(",\n").append("GameHomeTeamId : ")
				.append(gameHomeTeamId).append(",\n").append("GameAwayTeamId : ").append(gameAwayTeamId)
				.append(",\n").append("GameScheduled : ").append(gameScheduled).append(",\n")
				.append("VenueId : ").append(venueId).append(",\n").append("BroadCastNetwork : ").append(broadcastNetwork)
				.append(",\n").append("BroadCastSatellite : ").append(broadcastSatellite).toString();
	}
}

