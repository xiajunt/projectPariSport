package projetPariSport.structObject;

/* JavaBean Team
 * 
 */
public class Team extends StructObject implements IDataCenterObject {
	private String teamId;
	private String teamName;
	private String teamAlias;
	private String teamFounded;
	private String venueId;
	private String leagueId;
	private String conferenceId;
	private String divisionId;
	
	public Team() {
		super();
		// TODO Auto-generated constructor stub
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
