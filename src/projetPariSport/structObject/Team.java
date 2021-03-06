package projetPariSport.structObject;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Team - Definition of the object Team
 * This class maps all datas from the SportsDataLLC 's API
 * Get team rosters for the NBA.
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 26/12/2013
 *
 */

@Entity
@Cache
public class Team extends StructObject implements IDataCenterObject {
	private @Id String teamId;
	private @Index String teamName;
	private String teamAlias;
	private String teamFounded;
	private String venueId;
	private String leagueId;
	private String conferenceId;
	private @Index String divisionId;
	
	public Team() {
		super();
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamAlias() {
		return teamAlias;
	}

	public void setTeamAlias(String teamAlias) {
		this.teamAlias = teamAlias;
	}

	public String getTeamFounded() {
		return teamFounded;
	}

	public void setTeamFounded(String teamFounded) {
		this.teamFounded = teamFounded;
	}

	public String getVenueId() {
		return venueId;
	}

	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}

	public String getLeagueId() {
		return leagueId;
	}

	public void setLeagueId(String leagueId) {
		this.leagueId = leagueId;
	}

	public String getConferenceId() {
		return conferenceId;
	}

	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
	}

	public String getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	@Override
	public String toString() {
		return "Team [teamId=" + teamId + ", teamName=" + teamName
				+ ", teamAlias=" + teamAlias + ", teamFounded=" + teamFounded
				+ ", venueId=" + venueId + ", leagueId=" + leagueId
				+ ", conferenceId=" + conferenceId + ", divisionId="
				+ divisionId + "]";
	}
}
