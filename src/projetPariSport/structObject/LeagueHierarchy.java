package projetPariSport.structObject;

/**
 * LeagueHierarchy - Definition of the object LeagueHierarchy
 * This class maps all datas from the SportsDataLLC 's API
 * Get the league hierarchy information for the NBA.
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */
public class LeagueHierarchy extends StructObject implements IDataCenterObject {
	private String leagueId;
	private String leagueName;
	private String leagueAlias;
	private String conferenceId;
	private String conferenceName;
	private String conferenceAlias;
	private String divisionId;
	private String divisionName;
	private String divisionAlias;
	private String teamId;
	private String teamName;
	private String teamMarket;
	private String teamAlias;
	private String venueId;
	private String venueCapacity;
	private String venueAddress;
	private String venueCity;
	private String venueState;
	private String venueZip;
	private String venueCountry;
	
	public LeagueHierarchy() {
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

	public String getConferenceId() {
		return conferenceId;
	}

	public void setConferenceId(String conferenceId) {
		this.conferenceId = conferenceId;
	}

	public String getConferenceName() {
		return conferenceName;
	}

	public void setConferenceName(String conferenceName) {
		this.conferenceName = conferenceName;
	}

	public String getConferenceAlias() {
		return conferenceAlias;
	}

	public void setConferenceAlias(String conferenceAlias) {
		this.conferenceAlias = conferenceAlias;
	}

	public String getDivisionId() {
		return divisionId;
	}

	public void setDivisionId(String divisionId) {
		this.divisionId = divisionId;
	}

	public String getDivisionName() {
		return divisionName;
	}

	public void setDivisionName(String divisionName) {
		this.divisionName = divisionName;
	}

	public String getDivisionAlias() {
		return divisionAlias;
	}

	public void setDivisionAlias(String divisionAlias) {
		this.divisionAlias = divisionAlias;
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

	public String getTeamMarket() {
		return teamMarket;
	}

	public void setTeamMarket(String teamMarket) {
		this.teamMarket = teamMarket;
	}

	public String getTeamAlias() {
		return teamAlias;
	}

	public void setTeamAlias(String teamAlias) {
		this.teamAlias = teamAlias;
	}

	public String getVenueId() {
		return venueId;
	}

	public void setVenueId(String venueId) {
		this.venueId = venueId;
	}

	public String getVenueCapacity() {
		return venueCapacity;
	}

	public void setVenueCapacity(String venueCapacity) {
		this.venueCapacity = venueCapacity;
	}

	public String getVenueAddress() {
		return venueAddress;
	}

	public void setVenueAddress(String venueAddress) {
		this.venueAddress = venueAddress;
	}

	public String getVenueCity() {
		return venueCity;
	}

	public void setVenueCity(String venueCity) {
		this.venueCity = venueCity;
	}

	public String getVenueState() {
		return venueState;
	}

	public void setVenueState(String venueState) {
		this.venueState = venueState;
	}

	public String getVenueZip() {
		return venueZip;
	}

	public void setVenueZip(String venueZip) {
		this.venueZip = venueZip;
	}

	public String getVenueCountry() {
		return venueCountry;
	}

	public void setVenueCountry(String venueCountry) {
		this.venueCountry = venueCountry;
	}

	@Override
	public String toString() {
		return "LeagueHierarchy [leagueId=" + leagueId + ", leagueName="
				+ leagueName + ", leagueAlias=" + leagueAlias
				+ ", conferenceId=" + conferenceId + ", conferenceName="
				+ conferenceName + ", conferenceAlias=" + conferenceAlias
				+ ", divisionId=" + divisionId + ", divisionName="
				+ divisionName + ", divisionAlias=" + divisionAlias
				+ ", teamId=" + teamId + ", teamName=" + teamName
				+ ", teamMarket=" + teamMarket + ", teamAlias=" + teamAlias
				+ ", venueId=" + venueId + ", venueCapacity=" + venueCapacity
				+ ", venueAddress=" + venueAddress + ", venueCity=" + venueCity
				+ ", venueState=" + venueState + ", venueZip=" + venueZip
				+ ", venueCountry=" + venueCountry + "]";
	}
}
