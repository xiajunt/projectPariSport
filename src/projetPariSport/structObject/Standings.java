package projetPariSport.structObject;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Standings - Definition of the object Standings
 * This class maps all datas from the SportsDataLLC 's API
 * Get standings information for the NBA.
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */

@Entity
@Cache
public class Standings extends StructObject implements IDataCenterObject {
	private @Index String leagueId;
	private @Index String leagueName;
	private String leagueAlias;
	private String seasonId;
	private String seasonYear;
	private String seasonType;
	private String conferenceId;
	private String conferenceName;
	private String conferenceAlias;
	private @Index String divisionId;
	private @Index String divisionName;
	private String divisionAlias;
	private @Id String teamId;
	private String teamWins;
	private String teamLosses;
	private String teamWinPct;
	private String teamPointsFor;
	private String teamPointsAgainst;
	private String teamPointDiff;
	private String gamesBehindLeague;
	private String gamesBehindConference;
	private String gamesBehindDivision;
	private String atlanticWins;
	private String atlanticLosses;
	private String atlanticWinPct;
	private String below500Wins;
	private String below500Losses;
	private String below500WinPct;
	private String centralWins;
	private String centralLosses;
	private String centralWinPct;
	private String conferenceWins;
	private String conferenceLosses;
	private String conferenceWinPct;
	private String divisionWins;
	private String divisionLosses;
	private String divisionWinPct;
	private String homeWins;
	private String homeLosses;
	private String homeWinPct;
	private String last10Wins;
	private String last10Losses;
	private String last10WinPct;
	private String last10HomeWins;
	private String last10HomeLosses;
	private String last10HomeWinPct;
	private String last10RoadWins;
	private String last10RoadLosses;
	private String last10RoadWinPct;
	private String northwestWins;
	private String northwestLosses;
	private String northwestWinPct;
	private String over500Wins;
	private String over500Losses;
	private String over500WinPct;
	private String overtimeWins;
	private String overtimeLosses;
	private String overtimeWinPct;
	private String pacificWins;
	private String pacificLosses;
	private String pacificWinPct;
	private String roadWins;
	private String roadLosses;
	private String roadWinPct;
	private String southeastWins;
	private String southeastLosses;
	private String southeastWinPct;
	private String southwestWins;
	private String southwestLosses;
	private String southwestWinPct;
	private String tenPointsWins;
	private String tenPointsLosses;
	private String tenPointsWinPct;
	private String threePointsWins;
	private String threePointsLosses;
	private String threePointsWinPct;
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
	public String getSeasonId() {
		return seasonId;
	}
	public void setSeasonId(String seasonId) {
		this.seasonId = seasonId;
	}
	public String getSeasonYear() {
		return seasonYear;
	}
	public void setSeasonYear(String seasonYear) {
		this.seasonYear = seasonYear;
	}
	public String getSeasonType() {
		return seasonType;
	}
	public void setSeasonType(String seasonType) {
		this.seasonType = seasonType;
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
	public String getTeamWins() {
		return teamWins;
	}
	public void setTeamWins(String teamWins) {
		this.teamWins = teamWins;
	}
	public String getTeamLosses() {
		return teamLosses;
	}
	public void setTeamLosses(String teamLosses) {
		this.teamLosses = teamLosses;
	}
	public String getTeamWinPct() {
		return teamWinPct;
	}
	public void setTeamWinPct(String teamWinPct) {
		this.teamWinPct = teamWinPct;
	}
	public String getTeamPointsFor() {
		return teamPointsFor;
	}
	public void setTeamPointsFor(String teamPointsFor) {
		this.teamPointsFor = teamPointsFor;
	}
	public String getTeamPointsAgainst() {
		return teamPointsAgainst;
	}
	public void setTeamPointsAgainst(String teamPointsAgainst) {
		this.teamPointsAgainst = teamPointsAgainst;
	}
	public String getTeamPointDiff() {
		return teamPointDiff;
	}
	public void setTeamPointDiff(String teamPointDiff) {
		this.teamPointDiff = teamPointDiff;
	}
	public String getGamesBehindLeague() {
		return gamesBehindLeague;
	}
	public void setGamesBehindLeague(String gamesBehindLeague) {
		this.gamesBehindLeague = gamesBehindLeague;
	}
	public String getGamesBehindConference() {
		return gamesBehindConference;
	}
	public void setGamesBehindConference(String gamesBehindConference) {
		this.gamesBehindConference = gamesBehindConference;
	}
	public String getGamesBehindDivision() {
		return gamesBehindDivision;
	}
	public void setGamesBehindDivision(String gamesBehindDivision) {
		this.gamesBehindDivision = gamesBehindDivision;
	}
	public String getAtlanticWins() {
		return atlanticWins;
	}
	public void setAtlanticWins(String atlanticWins) {
		this.atlanticWins = atlanticWins;
	}
	public String getAtlanticLosses() {
		return atlanticLosses;
	}
	public void setAtlanticLosses(String atlanticLosses) {
		this.atlanticLosses = atlanticLosses;
	}
	public String getAtlanticWinPct() {
		return atlanticWinPct;
	}
	public void setAtlanticWinPct(String atlanticWinPct) {
		this.atlanticWinPct = atlanticWinPct;
	}
	public String getBelow500Wins() {
		return below500Wins;
	}
	public void setBelow500Wins(String below500Wins) {
		this.below500Wins = below500Wins;
	}
	public String getBelow500Losses() {
		return below500Losses;
	}
	public void setBelow500Losses(String below500Losses) {
		this.below500Losses = below500Losses;
	}
	public String getBelow500WinPct() {
		return below500WinPct;
	}
	public void setBelow500WinPct(String below500WinPct) {
		this.below500WinPct = below500WinPct;
	}
	public String getCentralWins() {
		return centralWins;
	}
	public void setCentralWins(String centralWins) {
		this.centralWins = centralWins;
	}
	public String getCentralLosses() {
		return centralLosses;
	}
	public void setCentralLosses(String centralLosses) {
		this.centralLosses = centralLosses;
	}
	public String getCentralWinPct() {
		return centralWinPct;
	}
	public void setCentralWinPct(String centralWinPct) {
		this.centralWinPct = centralWinPct;
	}
	public String getConferenceWins() {
		return conferenceWins;
	}
	public void setConferenceWins(String conferenceWins) {
		this.conferenceWins = conferenceWins;
	}
	public String getConferenceLosses() {
		return conferenceLosses;
	}
	public void setConferenceLosses(String conferenceLosses) {
		this.conferenceLosses = conferenceLosses;
	}
	public String getConferenceWinPct() {
		return conferenceWinPct;
	}
	public void setConferenceWinPct(String conferenceWinPct) {
		this.conferenceWinPct = conferenceWinPct;
	}
	public String getDivisionWins() {
		return divisionWins;
	}
	public void setDivisionWins(String divisionWins) {
		this.divisionWins = divisionWins;
	}
	public String getDivisionLosses() {
		return divisionLosses;
	}
	public void setDivisionLosses(String divisionLosses) {
		this.divisionLosses = divisionLosses;
	}
	public String getDivisionWinPct() {
		return divisionWinPct;
	}
	public void setDivisionWinPct(String divisionWinPct) {
		this.divisionWinPct = divisionWinPct;
	}
	public String getHomeWins() {
		return homeWins;
	}
	public void setHomeWins(String homeWins) {
		this.homeWins = homeWins;
	}
	public String getHomeLosses() {
		return homeLosses;
	}
	public void setHomeLosses(String homeLosses) {
		this.homeLosses = homeLosses;
	}
	public String getHomeWinPct() {
		return homeWinPct;
	}
	public void setHomeWinPct(String homeWinPct) {
		this.homeWinPct = homeWinPct;
	}
	public String getLast10Wins() {
		return last10Wins;
	}
	public void setLast10Wins(String last10Wins) {
		this.last10Wins = last10Wins;
	}
	public String getLast10Losses() {
		return last10Losses;
	}
	public void setLast10Losses(String last10Losses) {
		this.last10Losses = last10Losses;
	}
	public String getLast10WinPct() {
		return last10WinPct;
	}
	public void setLast10WinPct(String last10WinPct) {
		this.last10WinPct = last10WinPct;
	}
	public String getLast10HomeWins() {
		return last10HomeWins;
	}
	public void setLast10HomeWins(String last10HomeWins) {
		this.last10HomeWins = last10HomeWins;
	}
	public String getLast10HomeLosses() {
		return last10HomeLosses;
	}
	public void setLast10HomeLosses(String last10HomeLosses) {
		this.last10HomeLosses = last10HomeLosses;
	}
	public String getLast10HomeWinPct() {
		return last10HomeWinPct;
	}
	public void setLast10HomeWinPct(String last10HomeWinPct) {
		this.last10HomeWinPct = last10HomeWinPct;
	}
	public String getLast10RoadWins() {
		return last10RoadWins;
	}
	public void setLast10RoadWins(String last10RoadWins) {
		this.last10RoadWins = last10RoadWins;
	}
	public String getLast10RoadLosses() {
		return last10RoadLosses;
	}
	public void setLast10RoadLosses(String last10RoadLosses) {
		this.last10RoadLosses = last10RoadLosses;
	}
	public String getLast10RoadWinPct() {
		return last10RoadWinPct;
	}
	public void setLast10RoadWinPct(String last10RoadWinPct) {
		this.last10RoadWinPct = last10RoadWinPct;
	}
	public String getNorthwestWins() {
		return northwestWins;
	}
	public void setNorthwestWins(String northwestWins) {
		this.northwestWins = northwestWins;
	}
	public String getNorthwestLosses() {
		return northwestLosses;
	}
	public void setNorthwestLosses(String northwestLosses) {
		this.northwestLosses = northwestLosses;
	}
	public String getNorthwestWinPct() {
		return northwestWinPct;
	}
	public void setNorthwestWinPct(String northwestWinPct) {
		this.northwestWinPct = northwestWinPct;
	}
	public String getOver500Wins() {
		return over500Wins;
	}
	public void setOver500Wins(String over500Wins) {
		this.over500Wins = over500Wins;
	}
	public String getOver500Losses() {
		return over500Losses;
	}
	public void setOver500Losses(String over500Losses) {
		this.over500Losses = over500Losses;
	}
	public String getOver500WinPct() {
		return over500WinPct;
	}
	public void setOver500WinPct(String over500WinPct) {
		this.over500WinPct = over500WinPct;
	}
	public String getOvertimeWins() {
		return overtimeWins;
	}
	public void setOvertimeWins(String overtimeWins) {
		this.overtimeWins = overtimeWins;
	}
	public String getOvertimeLosses() {
		return overtimeLosses;
	}
	public void setOvertimeLosses(String overtimeLosses) {
		this.overtimeLosses = overtimeLosses;
	}
	public String getOvertimeWinPct() {
		return overtimeWinPct;
	}
	public void setOvertimeWinPct(String overtimeWinPct) {
		this.overtimeWinPct = overtimeWinPct;
	}
	public String getPacificWins() {
		return pacificWins;
	}
	public void setPacificWins(String pacificWins) {
		this.pacificWins = pacificWins;
	}
	public String getPacificLosses() {
		return pacificLosses;
	}
	public void setPacificLosses(String pacificLosses) {
		this.pacificLosses = pacificLosses;
	}
	public String getPacificWinPct() {
		return pacificWinPct;
	}
	public void setPacificWinPct(String pacificWinPct) {
		this.pacificWinPct = pacificWinPct;
	}
	public String getRoadWins() {
		return roadWins;
	}
	public void setRoadWins(String roadWins) {
		this.roadWins = roadWins;
	}
	public String getRoadLosses() {
		return roadLosses;
	}
	public void setRoadLosses(String roadLosses) {
		this.roadLosses = roadLosses;
	}
	public String getRoadWinPct() {
		return roadWinPct;
	}
	public void setRoadWinPct(String roadWinPct) {
		this.roadWinPct = roadWinPct;
	}
	public String getSoutheastWins() {
		return southeastWins;
	}
	public void setSoutheastWins(String southeastWins) {
		this.southeastWins = southeastWins;
	}
	public String getSoutheastLosses() {
		return southeastLosses;
	}
	public void setSoutheastLosses(String southeastLosses) {
		this.southeastLosses = southeastLosses;
	}
	public String getSoutheastWinPct() {
		return southeastWinPct;
	}
	public void setSoutheastWinPct(String southeastWinPct) {
		this.southeastWinPct = southeastWinPct;
	}
	public String getSouthwestWins() {
		return southwestWins;
	}
	public void setSouthwestWins(String southwestWins) {
		this.southwestWins = southwestWins;
	}
	public String getSouthwestLosses() {
		return southwestLosses;
	}
	public void setSouthwestLosses(String southwestLosses) {
		this.southwestLosses = southwestLosses;
	}
	public String getSouthwestWinPct() {
		return southwestWinPct;
	}
	public void setSouthwestWinPct(String southwestWinPct) {
		this.southwestWinPct = southwestWinPct;
	}
	public String getTenPointsWins() {
		return tenPointsWins;
	}
	public void setTenPointsWins(String tenPointsWins) {
		this.tenPointsWins = tenPointsWins;
	}
	public String getTenPointsLosses() {
		return tenPointsLosses;
	}
	public void setTenPointsLosses(String tenPointsLosses) {
		this.tenPointsLosses = tenPointsLosses;
	}
	public String getTenPointsWinPct() {
		return tenPointsWinPct;
	}
	public void setTenPointsWinPct(String tenPointsWinPct) {
		this.tenPointsWinPct = tenPointsWinPct;
	}
	public String getThreePointsWins() {
		return threePointsWins;
	}
	public void setThreePointsWins(String threePointsWins) {
		this.threePointsWins = threePointsWins;
	}
	public String getThreePointsLosses() {
		return threePointsLosses;
	}
	public void setThreePointsLosses(String threePointsLosses) {
		this.threePointsLosses = threePointsLosses;
	}
	public String getThreePointsWinPct() {
		return threePointsWinPct;
	}
	public void setThreePointsWinPct(String threePointsWinPct) {
		this.threePointsWinPct = threePointsWinPct;
	}
	@Override
	public String toString() {
		return "Standings [leagueId=" + leagueId + ", leagueName=" + leagueName
				+ ", leagueAlias=" + leagueAlias + ", seasonId=" + seasonId
				+ ", seasonYear=" + seasonYear + ", seasonType=" + seasonType
				+ ", conferenceId=" + conferenceId + ", conferenceName="
				+ conferenceName + ", conferenceAlias=" + conferenceAlias
				+ ", divisionId=" + divisionId + ", divisionName="
				+ divisionName + ", divisionAlias=" + divisionAlias
				+ ", teamId=" + teamId + ", teamWins=" + teamWins
				+ ", teamLosses=" + teamLosses + ", teamWinPct=" + teamWinPct
				+ ", teamPointsFor=" + teamPointsFor + ", teamPointsAgainst="
				+ teamPointsAgainst + ", teamPointDiff=" + teamPointDiff
				+ ", gamesBehindLeague=" + gamesBehindLeague
				+ ", gamesBehindConference=" + gamesBehindConference
				+ ", gamesBehindDivision=" + gamesBehindDivision
				+ ", atlanticWins=" + atlanticWins + ", atlanticLosses="
				+ atlanticLosses + ", atlanticWinPct=" + atlanticWinPct
				+ ", below500Wins=" + below500Wins + ", below500Losses="
				+ below500Losses + ", below500WinPct=" + below500WinPct
				+ ", centralWins=" + centralWins + ", centralLosses="
				+ centralLosses + ", centralWinPct=" + centralWinPct
				+ ", conferenceWins=" + conferenceWins + ", conferenceLosses="
				+ conferenceLosses + ", conferenceWinPct=" + conferenceWinPct
				+ ", divisionWins=" + divisionWins + ", divisionLosses="
				+ divisionLosses + ", divisionWinPct=" + divisionWinPct
				+ ", homeWins=" + homeWins + ", homeLosses=" + homeLosses
				+ ", homeWinPct=" + homeWinPct + ", last10Wins=" + last10Wins
				+ ", last10Losses=" + last10Losses + ", last10WinPct="
				+ last10WinPct + ", last10HomeWins=" + last10HomeWins
				+ ", last10HomeLosses=" + last10HomeLosses
				+ ", last10HomeWinPct=" + last10HomeWinPct
				+ ", last10RoadWins=" + last10RoadWins + ", last10RoadLosses="
				+ last10RoadLosses + ", last10RoadWinPct=" + last10RoadWinPct
				+ ", northwestWins=" + northwestWins + ", northwestLosses="
				+ northwestLosses + ", northwestWinPct=" + northwestWinPct
				+ ", over500Wins=" + over500Wins + ", over500Losses="
				+ over500Losses + ", over500WinPct=" + over500WinPct
				+ ", overtimeWins=" + overtimeWins + ", overtimeLosses="
				+ overtimeLosses + ", overtimeWinPct=" + overtimeWinPct
				+ ", pacificWins=" + pacificWins + ", pacificLosses="
				+ pacificLosses + ", pacificWinPct=" + pacificWinPct
				+ ", roadWins=" + roadWins + ", roadLosses=" + roadLosses
				+ ", roadWinPct=" + roadWinPct + ", southeastWins="
				+ southeastWins + ", southeastLosses=" + southeastLosses
				+ ", southeastWinPct=" + southeastWinPct + ", southwestWins="
				+ southwestWins + ", southwestLosses=" + southwestLosses
				+ ", southwestWinPct=" + southwestWinPct + ", tenPointsWins="
				+ tenPointsWins + ", tenPointsLosses=" + tenPointsLosses
				+ ", tenPointsWinPct=" + tenPointsWinPct + ", threePointsWins="
				+ threePointsWins + ", threePointsLosses=" + threePointsLosses
				+ ", threePointsWinPct=" + threePointsWinPct + "]";
	}
}
