package projetPariSport.structObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JavaBean GameSummary
 * 
 */
public class GameSummary extends StructObject implements IDataCenterObject {
	private String gameId;
	private String coverage;
	private String homeTeam;
	private String awayTeam;
	private Date scheduled;
	private String attendance;
	private String clock;
	private String quarter;
	private String homeTeamQuarting1;
	private String homeTeamQuarting2;
	private String homeTeamQuarting3;
	private String homeTeamQuarting4;
	private String homeMinutes;
	private String homeFieldGoalsMade;
	private String homeFieldGoalsAtt;
	private String homeFieldGoalsPct;
	private String homeThreePointsMade;
	private String homeThreePointsAtt;
	private String homeThreePointsPct;
	private String homeTwoPointsMade;
	private String homeTwoPointsAtt;
	private String homeTwoPointsPct;
	private String homeBlockedAtt;
	private String homeFreeThrowsMade;
	private String homeFreeThrowsAtt;
	private String homeFreeThrowsPct;
	private String homeOffensiveRebounds;
	private String homeDefensiveRebounds;
	private String homeRebounds;
	private String homeAssists;
	private String homeTurnovers;
	private String homeSteals;
	private String homeBlocks;
	private String homeAssistsTurnoverRatio;
	private String homePersonalFouls;
	private String homePoints;
	private String homeFastBreakPts;
	private String homePaintPts;
	private String homeTeamTurnovers;
	private String homeTeamRebounds;
	private String homeFlagrantFouls;
	private String homePlayerTechFouls;
	private String homeTeamTechFouls;
	private String homeCoachTechFouls;
	private String awayTeamQuarting1;
	private String awayTeamQuarting2;
	private String awayTeamQuarting3;
	private String awayTeamQuarting4;
	private String awayMinutes;
	private String awayFieldGoalsMade;
	private String awayFieldGoalsAtt;
	private String awayFieldGoalsPct;
	private String awayThreePointsMade;
	private String awayThreePointsAtt;
	private String awayThreePointsPct;
	private String awayTwoPointsMade;
	private String awayTwoPointsAtt;
	private String awayTwoPointsPct;
	private String awayBlockedAtt;
	private String awayFreeThrowsMade;
	private String awayFreeThrowsAtt;
	private String awayFreeThrowsPct;
	private String awayOffensiveRebounds;
	private String awayDefensiveRebounds;
	private String awayRebounds;
	private String awayAssists;
	private String awayTurnovers;
	private String awaySteals;
	private String awayBlocks;
	private String awayAssistsTurnoverRatio;
	private String awayPersonalFouls;
	private String awayPoints;
	private String awayFastBreakPts;
	private String awayPaintPts;
	private String awayTeamTurnovers;
	private String awayTeamRebounds;
	private String awayFlagrantFouls;
	private String awayPlayerTechFouls;
	private String awayTeamTechFouls;
	private String awayCoachTechFouls;
	
	public GameSummary() {
		// TODO Auto-generated constructor stub
		super();
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
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

	public String getAttendance() {
		return attendance;
	}

	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}

	public String getClock() {
		return clock;
	}

	public void setClock(String clock) {
		this.clock = clock;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public String getHomeTeamQuarting1() {
		return homeTeamQuarting1;
	}

	public void setHomeTeamQuarting1(String homeTeamQuarting1) {
		this.homeTeamQuarting1 = homeTeamQuarting1;
	}

	public String getHomeTeamQuarting2() {
		return homeTeamQuarting2;
	}

	public void setHomeTeamQuarting2(String homeTeamQuarting2) {
		this.homeTeamQuarting2 = homeTeamQuarting2;
	}

	public String getHomeTeamQuarting3() {
		return homeTeamQuarting3;
	}

	public void setHomeTeamQuarting3(String homeTeamQuarting3) {
		this.homeTeamQuarting3 = homeTeamQuarting3;
	}

	public String getHomeTeamQuarting4() {
		return homeTeamQuarting4;
	}

	public void setHomeTeamQuarting4(String homeTeamQuarting4) {
		this.homeTeamQuarting4 = homeTeamQuarting4;
	}

	public String getHomeMinutes() {
		return homeMinutes;
	}

	public void setHomeMinutes(String homeMinutes) {
		this.homeMinutes = homeMinutes;
	}

	public String getHomeFieldGoalsMade() {
		return homeFieldGoalsMade;
	}

	public void setHomeFieldGoalsMade(String homeFieldGoalsMade) {
		this.homeFieldGoalsMade = homeFieldGoalsMade;
	}

	public String getHomeFieldGoalsAtt() {
		return homeFieldGoalsAtt;
	}

	public void setHomeFieldGoalsAtt(String homeFieldGoalsAtt) {
		this.homeFieldGoalsAtt = homeFieldGoalsAtt;
	}

	public String getHomeFieldGoalsPct() {
		return homeFieldGoalsPct;
	}

	public void setHomeFieldGoalsPct(String homeFieldGoalsPct) {
		this.homeFieldGoalsPct = homeFieldGoalsPct;
	}

	public String getHomeThreePointsMade() {
		return homeThreePointsMade;
	}

	public void setHomeThreePointsMade(String homeThreePointsMade) {
		this.homeThreePointsMade = homeThreePointsMade;
	}

	public String getHomeThreePointsAtt() {
		return homeThreePointsAtt;
	}

	public void setHomeThreePointsAtt(String homeThreePointsAtt) {
		this.homeThreePointsAtt = homeThreePointsAtt;
	}

	public String getHomeThreePointsPct() {
		return homeThreePointsPct;
	}

	public void setHomeThreePointsPct(String homeThreePointsPct) {
		this.homeThreePointsPct = homeThreePointsPct;
	}

	public String getHomeTwoPointsMade() {
		return homeTwoPointsMade;
	}

	public void setHomeTwoPointsMade(String homeTwoPointsMade) {
		this.homeTwoPointsMade = homeTwoPointsMade;
	}

	public String getHomeTwoPointsAtt() {
		return homeTwoPointsAtt;
	}

	public void setHomeTwoPointsAtt(String homeTwoPointsAtt) {
		this.homeTwoPointsAtt = homeTwoPointsAtt;
	}

	public String getHomeTwoPointsPct() {
		return homeTwoPointsPct;
	}

	public void setHomeTwoPointsPct(String homeTwoPointsPct) {
		this.homeTwoPointsPct = homeTwoPointsPct;
	}

	public String getHomeBlockedAtt() {
		return homeBlockedAtt;
	}

	public void setHomeBlockedAtt(String homeBlockedAtt) {
		this.homeBlockedAtt = homeBlockedAtt;
	}

	public String getHomeFreeThrowsMade() {
		return homeFreeThrowsMade;
	}

	public void setHomeFreeThrowsMade(String homeFreeThrowsMade) {
		this.homeFreeThrowsMade = homeFreeThrowsMade;
	}

	public String getHomeFreeThrowsAtt() {
		return homeFreeThrowsAtt;
	}

	public void setHomeFreeThrowsAtt(String homeFreeThrowsAtt) {
		this.homeFreeThrowsAtt = homeFreeThrowsAtt;
	}

	public String getHomeFreeThrowsPct() {
		return homeFreeThrowsPct;
	}

	public void setHomeFreeThrowsPct(String homeFreeThrowsPct) {
		this.homeFreeThrowsPct = homeFreeThrowsPct;
	}

	public String getHomeOffensiveRebounds() {
		return homeOffensiveRebounds;
	}

	public void setHomeOffensiveRebounds(String homeOffensiveRebounds) {
		this.homeOffensiveRebounds = homeOffensiveRebounds;
	}

	public String getHomeDefensiveRebounds() {
		return homeDefensiveRebounds;
	}

	public void setHomeDefensiveRebounds(String homeDefensiveRebounds) {
		this.homeDefensiveRebounds = homeDefensiveRebounds;
	}

	public String getHomeRebounds() {
		return homeRebounds;
	}

	public void setHomeRebounds(String homeRebounds) {
		this.homeRebounds = homeRebounds;
	}

	public String getHomeAssists() {
		return homeAssists;
	}

	public void setHomeAssists(String homeAssists) {
		this.homeAssists = homeAssists;
	}

	public String getHomeTurnovers() {
		return homeTurnovers;
	}

	public void setHomeTurnovers(String homeTurnovers) {
		this.homeTurnovers = homeTurnovers;
	}

	public String getHomeSteals() {
		return homeSteals;
	}

	public void setHomeSteals(String homeSteals) {
		this.homeSteals = homeSteals;
	}

	public String getHomeBlocks() {
		return homeBlocks;
	}

	public void setHomeBlocks(String homeBlocks) {
		this.homeBlocks = homeBlocks;
	}

	public String getHomeAssistsTurnoverRatio() {
		return homeAssistsTurnoverRatio;
	}

	public void setHomeAssistsTurnoverRatio(String homeAssistsTurnoverRatio) {
		this.homeAssistsTurnoverRatio = homeAssistsTurnoverRatio;
	}

	public String getHomePersonalFouls() {
		return homePersonalFouls;
	}

	public void setHomePersonalFouls(String homePersonalFouls) {
		this.homePersonalFouls = homePersonalFouls;
	}

	public String getHomePoints() {
		return homePoints;
	}

	public void setHomePoints(String homePoints) {
		this.homePoints = homePoints;
	}

	public String getHomeFastBreakPts() {
		return homeFastBreakPts;
	}

	public void setHomeFastBreakPts(String homeFastBreakPts) {
		this.homeFastBreakPts = homeFastBreakPts;
	}

	public String getHomePaintPts() {
		return homePaintPts;
	}

	public void setHomePaintPts(String homePaintPts) {
		this.homePaintPts = homePaintPts;
	}

	public String getHomeTeamTurnovers() {
		return homeTeamTurnovers;
	}

	public void setHomeTeamTurnovers(String homeTeamTurnovers) {
		this.homeTeamTurnovers = homeTeamTurnovers;
	}

	public String getHomeTeamRebounds() {
		return homeTeamRebounds;
	}

	public void setHomeTeamRebounds(String homeTeamRebounds) {
		this.homeTeamRebounds = homeTeamRebounds;
	}

	public String getHomeFlagrantFouls() {
		return homeFlagrantFouls;
	}

	public void setHomeFlagrantFouls(String homeFlagrantFouls) {
		this.homeFlagrantFouls = homeFlagrantFouls;
	}

	public String getHomePlayerTechFouls() {
		return homePlayerTechFouls;
	}

	public void setHomePlayerTechFouls(String homePlayerTechFouls) {
		this.homePlayerTechFouls = homePlayerTechFouls;
	}

	public String getHomeTeamTechFouls() {
		return homeTeamTechFouls;
	}

	public void setHomeTeamTechFouls(String homeTeamTechFouls) {
		this.homeTeamTechFouls = homeTeamTechFouls;
	}

	public String getHomeCoachTechFouls() {
		return homeCoachTechFouls;
	}

	public void setHomeCoachTechFouls(String homeCoachTechFouls) {
		this.homeCoachTechFouls = homeCoachTechFouls;
	}

	public String getAwayTeamQuarting1() {
		return awayTeamQuarting1;
	}

	public void setAwayTeamQuarting1(String awayTeamQuarting1) {
		this.awayTeamQuarting1 = awayTeamQuarting1;
	}

	public String getAwayTeamQuarting2() {
		return awayTeamQuarting2;
	}

	public void setAwayTeamQuarting2(String awayTeamQuarting2) {
		this.awayTeamQuarting2 = awayTeamQuarting2;
	}

	public String getAwayTeamQuarting3() {
		return awayTeamQuarting3;
	}

	public void setAwayTeamQuarting3(String awayTeamQuarting3) {
		this.awayTeamQuarting3 = awayTeamQuarting3;
	}

	public String getAwayTeamQuarting4() {
		return awayTeamQuarting4;
	}

	public void setAwayTeamQuarting4(String awayTeamQuarting4) {
		this.awayTeamQuarting4 = awayTeamQuarting4;
	}

	public String getAwayMinutes() {
		return awayMinutes;
	}

	public void setAwayMinutes(String awayMinutes) {
		this.awayMinutes = awayMinutes;
	}

	public String getAwayFieldGoalsMade() {
		return awayFieldGoalsMade;
	}

	public void setAwayFieldGoalsMade(String awayFieldGoalsMade) {
		this.awayFieldGoalsMade = awayFieldGoalsMade;
	}

	public String getAwayFieldGoalsAtt() {
		return awayFieldGoalsAtt;
	}

	public void setAwayFieldGoalsAtt(String awayFieldGoalsAtt) {
		this.awayFieldGoalsAtt = awayFieldGoalsAtt;
	}

	public String getAwayFieldGoalsPct() {
		return awayFieldGoalsPct;
	}

	public void setAwayFieldGoalsPct(String awayFieldGoalsPct) {
		this.awayFieldGoalsPct = awayFieldGoalsPct;
	}

	public String getAwayThreePointsMade() {
		return awayThreePointsMade;
	}

	public void setAwayThreePointsMade(String awayThreePointsMade) {
		this.awayThreePointsMade = awayThreePointsMade;
	}

	public String getAwayThreePointsAtt() {
		return awayThreePointsAtt;
	}

	public void setAwayThreePointsAtt(String awayThreePointsAtt) {
		this.awayThreePointsAtt = awayThreePointsAtt;
	}

	public String getAwayThreePointsPct() {
		return awayThreePointsPct;
	}

	public void setAwayThreePointsPct(String awayThreePointsPct) {
		this.awayThreePointsPct = awayThreePointsPct;
	}

	public String getAwayTwoPointsMade() {
		return awayTwoPointsMade;
	}

	public void setAwayTwoPointsMade(String awayTwoPointsMade) {
		this.awayTwoPointsMade = awayTwoPointsMade;
	}

	public String getAwayTwoPointsAtt() {
		return awayTwoPointsAtt;
	}

	public void setAwayTwoPointsAtt(String awayTwoPointsAtt) {
		this.awayTwoPointsAtt = awayTwoPointsAtt;
	}

	public String getAwayTwoPointsPct() {
		return awayTwoPointsPct;
	}

	public void setAwayTwoPointsPct(String awayTwoPointsPct) {
		this.awayTwoPointsPct = awayTwoPointsPct;
	}

	public String getAwayBlockedAtt() {
		return awayBlockedAtt;
	}

	public void setAwayBlockedAtt(String awayBlockedAtt) {
		this.awayBlockedAtt = awayBlockedAtt;
	}
	
	public String getAwayFreeThrowsMade() {
		return awayFreeThrowsMade;
	}

	public void setAwayFreeThrowsMade(String awayFreeThrowsMade) {
		this.awayFreeThrowsMade = awayFreeThrowsMade;
	}

	public String getAwayFreeThrowsAtt() {
		return awayFreeThrowsAtt;
	}

	public void setAwayFreeThrowsAtt(String awayFreeThrowsAtt) {
		this.awayFreeThrowsAtt = awayFreeThrowsAtt;
	}

	public String getAwayFreeThrowsPct() {
		return awayFreeThrowsPct;
	}

	public void setAwayFreeThrowsPct(String awayFreeThrowsPct) {
		this.awayFreeThrowsPct = awayFreeThrowsPct;
	}

	public String getAwayOffensiveRebounds() {
		return awayOffensiveRebounds;
	}

	public void setAwayOffensiveRebounds(String awayOffensiveRebounds) {
		this.awayOffensiveRebounds = awayOffensiveRebounds;
	}

	public String getAwayDefensiveRebounds() {
		return awayDefensiveRebounds;
	}

	public void setAwayDefensiveRebounds(String awayDefensiveRebounds) {
		this.awayDefensiveRebounds = awayDefensiveRebounds;
	}

	public String getAwayRebounds() {
		return awayRebounds;
	}

	public void setAwayRebounds(String awayRebounds) {
		this.awayRebounds = awayRebounds;
	}

	public String getAwayAssists() {
		return awayAssists;
	}

	public void setAwayAssists(String awayAssists) {
		this.awayAssists = awayAssists;
	}

	public String getAwayTurnovers() {
		return awayTurnovers;
	}

	public void setAwayTurnovers(String awayTurnovers) {
		this.awayTurnovers = awayTurnovers;
	}

	public String getAwaySteals() {
		return awaySteals;
	}

	public void setAwaySteals(String awaySteals) {
		this.awaySteals = awaySteals;
	}

	public String getAwayBlocks() {
		return awayBlocks;
	}

	public void setAwayBlocks(String awayBlocks) {
		this.awayBlocks = awayBlocks;
	}

	public String getAwayAssistsTurnoverRatio() {
		return awayAssistsTurnoverRatio;
	}

	public void setAwayAssistsTurnoverRatio(String awayAssistsTurnoverRatio) {
		this.awayAssistsTurnoverRatio = awayAssistsTurnoverRatio;
	}

	public String getAwayPersonalFouls() {
		return awayPersonalFouls;
	}

	public void setAwayPersonalFouls(String awayPersonalFouls) {
		this.awayPersonalFouls = awayPersonalFouls;
	}

	public String getAwayPoints() {
		return awayPoints;
	}

	public void setAwayPoints(String awayPoints) {
		this.awayPoints = awayPoints;
	}

	public String getAwayFastBreakPts() {
		return awayFastBreakPts;
	}

	public void setAwayFastBreakPts(String awayFastBreakPts) {
		this.awayFastBreakPts = awayFastBreakPts;
	}

	public String getAwayPaintPts() {
		return awayPaintPts;
	}

	public void setAwayPaintPts(String awayPaintPts) {
		this.awayPaintPts = awayPaintPts;
	}

	public String getAwayTeamTurnovers() {
		return awayTeamTurnovers;
	}

	public void setAwayTeamTurnovers(String awayTeamTurnovers) {
		this.awayTeamTurnovers = awayTeamTurnovers;
	}

	public String getAwayTeamRebounds() {
		return awayTeamRebounds;
	}

	public void setAwayTeamRebounds(String awayTeamRebounds) {
		this.awayTeamRebounds = awayTeamRebounds;
	}

	public String getAwayFlagrantFouls() {
		return awayFlagrantFouls;
	}

	public void setAwayFlagrantFouls(String awayFlagrantFouls) {
		this.awayFlagrantFouls = awayFlagrantFouls;
	}

	public String getAwayPlayerTechFouls() {
		return awayPlayerTechFouls;
	}

	public void setAwayPlayerTechFouls(String awayPlayerTechFouls) {
		this.awayPlayerTechFouls = awayPlayerTechFouls;
	}

	public String getAwayTeamTechFouls() {
		return awayTeamTechFouls;
	}

	public void setAwayTeamTechFouls(String awayTeamTechFouls) {
		this.awayTeamTechFouls = awayTeamTechFouls;
	}

	public String getAwayCoachTechFouls() {
		return awayCoachTechFouls;
	}

	public void setAwayCoachTechFouls(String awayCoachTechFouls) {
		this.awayCoachTechFouls = awayCoachTechFouls;
	}

	@Override
	public String toString() {
		return "GameSummary [gameId=" + gameId + ", coverage=" + coverage
				+ ", homeTeam=" + homeTeam + ", awayTeam=" + awayTeam
				+ ", scheduled=" + scheduled + ", attendance=" + attendance
				+ ", clock=" + clock + ", quarter=" + quarter
				+ ", homeTeamQuarting1=" + homeTeamQuarting1
				+ ", homeTeamQuarting2=" + homeTeamQuarting2
				+ ", homeTeamQuarting3=" + homeTeamQuarting3
				+ ", homeTeamQuarting4=" + homeTeamQuarting4 + ", homeMinutes="
				+ homeMinutes + ", homeFieldGoalsMade=" + homeFieldGoalsMade
				+ ", homeFieldGoalsAtt=" + homeFieldGoalsAtt
				+ ", homeFieldGoalsPct=" + homeFieldGoalsPct
				+ ", homeThreePointsMade=" + homeThreePointsMade
				+ ", homeThreePointsAtt=" + homeThreePointsAtt
				+ ", homeThreePointsPct=" + homeThreePointsPct
				+ ", homeTwoPointsMade=" + homeTwoPointsMade
				+ ", homeTwoPointsAtt=" + homeTwoPointsAtt
				+ ", homeTwoPointsPct=" + homeTwoPointsPct
				+ ", homeBlockedAtt=" + homeBlockedAtt
				+ ", homeFreeThrowsMade=" + homeFreeThrowsMade
				+ ", homeFreeThrowsAtt=" + homeFreeThrowsAtt
				+ ", homeFreeThrowsPct=" + homeFreeThrowsPct
				+ ", homeOffensiveRebounds=" + homeOffensiveRebounds
				+ ", homeDefensiveRebounds=" + homeDefensiveRebounds
				+ ", homeRebounds=" + homeRebounds + ", homeAssists="
				+ homeAssists + ", homeTurnovers=" + homeTurnovers
				+ ", homeSteals=" + homeSteals + ", homeBlocks=" + homeBlocks
				+ ", homeAssistsTurnoverRatio=" + homeAssistsTurnoverRatio
				+ ", homePersonalFouls=" + homePersonalFouls + ", homePoints="
				+ homePoints + ", homeFastBreakPts=" + homeFastBreakPts
				+ ", homePaintPts=" + homePaintPts + ", homeTeamTurnovers="
				+ homeTeamTurnovers + ", homeTeamRebounds=" + homeTeamRebounds
				+ ", homeFlagrantFouls=" + homeFlagrantFouls
				+ ", homePlayerTechFouls=" + homePlayerTechFouls
				+ ", homeTeamTechFouls=" + homeTeamTechFouls
				+ ", homeCoachTechFouls=" + homeCoachTechFouls
				+ ", awayTeamQuarting1=" + awayTeamQuarting1
				+ ", awayTeamQuarting2=" + awayTeamQuarting2
				+ ", awayTeamQuarting3=" + awayTeamQuarting3
				+ ", awayTeamQuarting4=" + awayTeamQuarting4 + ", awayMinutes="
				+ awayMinutes + ", awayFieldGoalsMade=" + awayFieldGoalsMade
				+ ", awayFieldGoalsAtt=" + awayFieldGoalsAtt
				+ ", awayFieldGoalsPct=" + awayFieldGoalsPct
				+ ", awayThreePointsMade=" + awayThreePointsMade
				+ ", awayThreePointsAtt=" + awayThreePointsAtt
				+ ", awayThreePointsPct=" + awayThreePointsPct
				+ ", awayTwoPointsMade=" + awayTwoPointsMade
				+ ", awayTwoPointsAtt=" + awayTwoPointsAtt
				+ ", awayTwoPointsPct=" + awayTwoPointsPct
				+ ", awayBlockedAtt=" + awayBlockedAtt
				+ ", awayFreeThrowsMade=" + awayFreeThrowsMade
				+ ", awayFreeThrowsAtt=" + awayFreeThrowsAtt
				+ ", awayFreeThrowsPct=" + awayFreeThrowsPct
				+ ", awayOffensiveRebounds=" + awayOffensiveRebounds
				+ ", awayDefensiveRebounds=" + awayDefensiveRebounds
				+ ", awayRebounds=" + awayRebounds + ", awayAssists="
				+ awayAssists + ", awayTurnovers=" + awayTurnovers
				+ ", awaySteals=" + awaySteals + ", awayBlocks=" + awayBlocks
				+ ", awayAssistsTurnoverRatio=" + awayAssistsTurnoverRatio
				+ ", awayPersonalFouls=" + awayPersonalFouls + ", awayPoints="
				+ awayPoints + ", awayFastBreakPts=" + awayFastBreakPts
				+ ", awayPaintPts=" + awayPaintPts + ", awayTeamTurnovers="
				+ awayTeamTurnovers + ", awayTeamRebounds=" + awayTeamRebounds
				+ ", awayFlagrantFouls=" + awayFlagrantFouls
				+ ", awayPlayerTechFouls=" + awayPlayerTechFouls
				+ ", awayTeamTechFouls=" + awayTeamTechFouls
				+ ", awayCoachTechFouls=" + awayCoachTechFouls + "]";
	}
}
