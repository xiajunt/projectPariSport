package projetPariSport.structObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * GameSummary - Definition of the object GameSummary
 * This class maps all datas from the SportsDataLLC 's API
 * Obtain game summaries for the NBA.
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */
public class GameSummary extends StructObject{
	private String gameId;
	private String gameCoverage;
	private String gameHomeTeam;
	private String gameAwayTeam;
	private Date gameScheduled;
	private String gameStatus;
	private String gameAttendance;
	private String gameClock;
	private String gameQuarter;
	private String homeTeamQuarter1Points;
	private String homeTeamQuarter2Points;
	private String homeTeamQuarter3Points;
	private String homeTeamQuarter4Points;
	private String homeStatisticsMinutes;
	private String homeStatisticsFieldGoalsMade;
	private String homeStatisticsFieldGoalsAtt;
	private String homeStatisticsFieldGoalsPct;
	private String homeStatisticsThreePointsMade;
	private String homeStatisticsThreePointsAtt;
	private String homeStatisticsThreePointsPct;
	private String homeStatisticsTwoPointsMade;
	private String homeStatisticsTwoPointsAtt;
	private String homeStatisticsTwoPointsPct;
	private String homeStatisticsBlockedAtt;
	private String homeStatisticsFreeThrowsMade;
	private String homeStatisticsFreeThrowsAtt;
	private String homeStatisticsFreeThrowsPct;
	private String homeStatisticsOffensiveRebounds;
	private String homeStatisticsDefensiveRebounds;
	private String homeStatisticsRebounds;
	private String homeStatisticsAssists;
	private String homeStatisticsTurnovers;
	private String homeStatisticsSteals;
	private String homeStatisticsBlocks;
	private String homeStatisticsAssistsTurnoverRatio;
	private String homeStatisticsPersonalFouls;
	private String homeStatisticsPoints;
	private String homeStatisticsFastBreakPts;
	private String homeStatisticsPaintPts;
	private String homeStatisticsTeamTurnovers;
	private String homeStatisticsTeamRebounds;
	private String homeStatisticsFlagrantFouls;
	private String homeStatisticsPlayerTechFouls;
	private String homeStatisticsTeamTechFouls;
	private String homeStatisticsCoachTechFouls;
	private String awayTeamQuarter1Points;
	private String awayTeamQuarter2Points;
	private String awayTeamQuarter3Points;
	private String awayTeamQuarter4Points;
	private String awayStatisticsMinutes;
	private String awayStatisticsFieldGoalsMade;
	private String awayStatisticsFieldGoalsAtt;
	private String awayStatisticsFieldGoalsPct;
	private String awayStatisticsThreePointsMade;
	private String awayStatisticsThreePointsAtt;
	private String awayStatisticsThreePointsPct;
	private String awayStatisticsTwoPointsMade;
	private String awayStatisticsTwoPointsAtt;
	private String awayStatisticsTwoPointsPct;
	private String awayStatisticsBlockedAtt;
	private String awayStatisticsFreeThrowsMade;
	private String awayStatisticsFreeThrowsAtt;
	private String awayStatisticsFreeThrowsPct;
	private String awayStatisticsOffensiveRebounds;
	private String awayStatisticsDefensiveRebounds;
	private String awayStatisticsRebounds;
	private String awayStatisticsAssists;
	private String awayStatisticsTurnovers;
	private String awayStatisticsSteals;
	private String awayStatisticsBlocks;
	private String awayStatisticsAssistsTurnoverRatio;
	private String awayStatisticsPersonalFouls;
	private String awayStatisticsPoints;
	private String awayStatisticsFastBreakPts;
	private String awayStatisticsPaintPts;
	private String awayStatisticsTeamTurnovers;
	private String awayStatisticsTeamRebounds;
	private String awayStatisticsFlagrantFouls;
	private String awayStatisticsPlayerTechFouls;
	private String awayStatisticsTeamTechFouls;
	private String awayStatisticsCoachTechFouls;
	
	public GameSummary() {
		super();
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
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
			e.printStackTrace();
		}
	}

	public String getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
	}

	public String getGameAttendance() {
		return gameAttendance;
	}

	public void setGameAttendance(String gameAttendance) {
		this.gameAttendance = gameAttendance;
	}

	public String getGameClock() {
		return gameClock;
	}

	public void setGameClock(String gameClock) {
		this.gameClock = gameClock;
	}

	public String getGameQuarter() {
		return gameQuarter;
	}

	public void setGameQuarter(String gameQuarter) {
		this.gameQuarter = gameQuarter;
	}

	public String getHomeTeamQuarter1Points() {
		return homeTeamQuarter1Points;
	}

	public void setHomeTeamQuarter1Points(String homeTeamQuarter1Points) {
		this.homeTeamQuarter1Points = homeTeamQuarter1Points;
	}

	public String getHomeTeamQuarter2Points() {
		return homeTeamQuarter2Points;
	}

	public void setHomeTeamQuarter2Points(String homeTeamQuarter2Points) {
		this.homeTeamQuarter2Points = homeTeamQuarter2Points;
	}

	public String getHomeTeamQuarter3Points() {
		return homeTeamQuarter3Points;
	}

	public void setHomeTeamQuarter3Points(String homeTeamQuarter3Points) {
		this.homeTeamQuarter3Points = homeTeamQuarter3Points;
	}

	public String getHomeTeamQuarter4Points() {
		return homeTeamQuarter4Points;
	}

	public void setHomeTeamQuarter4Points(String homeTeamQuarter4Points) {
		this.homeTeamQuarter4Points = homeTeamQuarter4Points;
	}

	public String getHomeStatisticsMinutes() {
		return homeStatisticsMinutes;
	}

	public void setHomeStatisticsMinutes(String homeStatisticsMinutes) {
		this.homeStatisticsMinutes = homeStatisticsMinutes;
	}

	public String getHomeStatisticsFieldGoalsMade() {
		return homeStatisticsFieldGoalsMade;
	}

	public void setHomeStatisticsFieldGoalsMade(
			String homeStatisticsFieldGoalsMade) {
		this.homeStatisticsFieldGoalsMade = homeStatisticsFieldGoalsMade;
	}

	public String getHomeStatisticsFieldGoalsAtt() {
		return homeStatisticsFieldGoalsAtt;
	}

	public void setHomeStatisticsFieldGoalsAtt(String homeStatisticsFieldGoalsAtt) {
		this.homeStatisticsFieldGoalsAtt = homeStatisticsFieldGoalsAtt;
	}

	public String getHomeStatisticsFieldGoalsPct() {
		return homeStatisticsFieldGoalsPct;
	}

	public void setHomeStatisticsFieldGoalsPct(String homeStatisticsFieldGoalsPct) {
		this.homeStatisticsFieldGoalsPct = homeStatisticsFieldGoalsPct;
	}

	public String getHomeStatisticsThreePointsMade() {
		return homeStatisticsThreePointsMade;
	}

	public void setHomeStatisticsThreePointsMade(
			String homeStatisticsThreePointsMade) {
		this.homeStatisticsThreePointsMade = homeStatisticsThreePointsMade;
	}

	public String getHomeStatisticsThreePointsAtt() {
		return homeStatisticsThreePointsAtt;
	}

	public void setHomeStatisticsThreePointsAtt(
			String homeStatisticsThreePointsAtt) {
		this.homeStatisticsThreePointsAtt = homeStatisticsThreePointsAtt;
	}

	public String getHomeStatisticsThreePointsPct() {
		return homeStatisticsThreePointsPct;
	}

	public void setHomeStatisticsThreePointsPct(
			String homeStatisticsThreePointsPct) {
		this.homeStatisticsThreePointsPct = homeStatisticsThreePointsPct;
	}

	public String getHomeStatisticsTwoPointsMade() {
		return homeStatisticsTwoPointsMade;
	}

	public void setHomeStatisticsTwoPointsMade(String homeStatisticsTwoPointsMade) {
		this.homeStatisticsTwoPointsMade = homeStatisticsTwoPointsMade;
	}

	public String getHomeStatisticsTwoPointsAtt() {
		return homeStatisticsTwoPointsAtt;
	}

	public void setHomeStatisticsTwoPointsAtt(String homeStatisticsTwoPointsAtt) {
		this.homeStatisticsTwoPointsAtt = homeStatisticsTwoPointsAtt;
	}

	public String getHomeStatisticsTwoPointsPct() {
		return homeStatisticsTwoPointsPct;
	}

	public void setHomeStatisticsTwoPointsPct(String homeStatisticsTwoPointsPct) {
		this.homeStatisticsTwoPointsPct = homeStatisticsTwoPointsPct;
	}

	public String getHomeStatisticsBlockedAtt() {
		return homeStatisticsBlockedAtt;
	}

	public void setHomeStatisticsBlockedAtt(String homeStatisticsBlockedAtt) {
		this.homeStatisticsBlockedAtt = homeStatisticsBlockedAtt;
	}

	public String getHomeStatisticsFreeThrowsMade() {
		return homeStatisticsFreeThrowsMade;
	}

	public void setHomeStatisticsFreeThrowsMade(
			String homeStatisticsFreeThrowsMade) {
		this.homeStatisticsFreeThrowsMade = homeStatisticsFreeThrowsMade;
	}

	public String getHomeStatisticsFreeThrowsAtt() {
		return homeStatisticsFreeThrowsAtt;
	}

	public void setHomeStatisticsFreeThrowsAtt(String homeStatisticsFreeThrowsAtt) {
		this.homeStatisticsFreeThrowsAtt = homeStatisticsFreeThrowsAtt;
	}

	public String getHomeStatisticsFreeThrowsPct() {
		return homeStatisticsFreeThrowsPct;
	}

	public void setHomeStatisticsFreeThrowsPct(String homeStatisticsFreeThrowsPct) {
		this.homeStatisticsFreeThrowsPct = homeStatisticsFreeThrowsPct;
	}

	public String getHomeStatisticsOffensiveRebounds() {
		return homeStatisticsOffensiveRebounds;
	}

	public void setHomeStatisticsOffensiveRebounds(
			String homeStatisticsOffensiveRebounds) {
		this.homeStatisticsOffensiveRebounds = homeStatisticsOffensiveRebounds;
	}

	public String getHomeStatisticsDefensiveRebounds() {
		return homeStatisticsDefensiveRebounds;
	}

	public void setHomeStatisticsDefensiveRebounds(
			String homeStatisticsDefensiveRebounds) {
		this.homeStatisticsDefensiveRebounds = homeStatisticsDefensiveRebounds;
	}

	public String getHomeStatisticsRebounds() {
		return homeStatisticsRebounds;
	}

	public void setHomeStatisticsRebounds(String homeStatisticsRebounds) {
		this.homeStatisticsRebounds = homeStatisticsRebounds;
	}

	public String getHomeStatisticsAssists() {
		return homeStatisticsAssists;
	}

	public void setHomeStatisticsAssists(String homeStatisticsAssists) {
		this.homeStatisticsAssists = homeStatisticsAssists;
	}

	public String getHomeStatisticsTurnovers() {
		return homeStatisticsTurnovers;
	}

	public void setHomeStatisticsTurnovers(String homeStatisticsTurnovers) {
		this.homeStatisticsTurnovers = homeStatisticsTurnovers;
	}

	public String getHomeStatisticsSteals() {
		return homeStatisticsSteals;
	}

	public void setHomeStatisticsSteals(String homeStatisticsSteals) {
		this.homeStatisticsSteals = homeStatisticsSteals;
	}

	public String getHomeStatisticsBlocks() {
		return homeStatisticsBlocks;
	}

	public void setHomeStatisticsBlocks(String homeStatisticsBlocks) {
		this.homeStatisticsBlocks = homeStatisticsBlocks;
	}

	public String getHomeStatisticsAssistsTurnoverRatio() {
		return homeStatisticsAssistsTurnoverRatio;
	}

	public void setHomeStatisticsAssistsTurnoverRatio(
			String homeStatisticsAssistsTurnoverRatio) {
		this.homeStatisticsAssistsTurnoverRatio = homeStatisticsAssistsTurnoverRatio;
	}

	public String getHomeStatisticsPersonalFouls() {
		return homeStatisticsPersonalFouls;
	}

	public void setHomeStatisticsPersonalFouls(String homeStatisticsPersonalFouls) {
		this.homeStatisticsPersonalFouls = homeStatisticsPersonalFouls;
	}

	public String getHomeStatisticsPoints() {
		return homeStatisticsPoints;
	}

	public void setHomeStatisticsPoints(String homeStatisticsPoints) {
		this.homeStatisticsPoints = homeStatisticsPoints;
	}

	public String getHomeStatisticsFastBreakPts() {
		return homeStatisticsFastBreakPts;
	}

	public void setHomeStatisticsFastBreakPts(String homeStatisticsFastBreakPts) {
		this.homeStatisticsFastBreakPts = homeStatisticsFastBreakPts;
	}

	public String getHomeStatisticsPaintPts() {
		return homeStatisticsPaintPts;
	}

	public void setHomeStatisticsPaintPts(String homeStatisticsPaintPts) {
		this.homeStatisticsPaintPts = homeStatisticsPaintPts;
	}

	public String getHomeStatisticsTeamTurnovers() {
		return homeStatisticsTeamTurnovers;
	}

	public void setHomeStatisticsTeamTurnovers(String homeStatisticsTeamTurnovers) {
		this.homeStatisticsTeamTurnovers = homeStatisticsTeamTurnovers;
	}

	public String getHomeStatisticsTeamRebounds() {
		return homeStatisticsTeamRebounds;
	}

	public void setHomeStatisticsTeamRebounds(String homeStatisticsTeamRebounds) {
		this.homeStatisticsTeamRebounds = homeStatisticsTeamRebounds;
	}

	public String getHomeStatisticsFlagrantFouls() {
		return homeStatisticsFlagrantFouls;
	}

	public void setHomeStatisticsFlagrantFouls(String homeStatisticsFlagrantFouls) {
		this.homeStatisticsFlagrantFouls = homeStatisticsFlagrantFouls;
	}

	public String getHomeStatisticsPlayerTechFouls() {
		return homeStatisticsPlayerTechFouls;
	}

	public void setHomeStatisticsPlayerTechFouls(
			String homeStatisticsPlayerTechFouls) {
		this.homeStatisticsPlayerTechFouls = homeStatisticsPlayerTechFouls;
	}

	public String getHomeStatisticsTeamTechFouls() {
		return homeStatisticsTeamTechFouls;
	}

	public void setHomeStatisticsTeamTechFouls(String homeStatisticsTeamTechFouls) {
		this.homeStatisticsTeamTechFouls = homeStatisticsTeamTechFouls;
	}

	public String getHomeStatisticsCoachTechFouls() {
		return homeStatisticsCoachTechFouls;
	}

	public void setHomeStatisticsCoachTechFouls(
			String homeStatisticsCoachTechFouls) {
		this.homeStatisticsCoachTechFouls = homeStatisticsCoachTechFouls;
	}

	public String getAwayTeamQuarter1Points() {
		return awayTeamQuarter1Points;
	}

	public void setAwayTeamQuarter1Points(String awayTeamQuarter1Points) {
		this.awayTeamQuarter1Points = awayTeamQuarter1Points;
	}

	public String getAwayTeamQuarter2Points() {
		return awayTeamQuarter2Points;
	}

	public void setAwayTeamQuarter2Points(String awayTeamQuarter2Points) {
		this.awayTeamQuarter2Points = awayTeamQuarter2Points;
	}

	public String getAwayTeamQuarter3Points() {
		return awayTeamQuarter3Points;
	}

	public void setAwayTeamQuarter3Points(String awayTeamQuarter3Points) {
		this.awayTeamQuarter3Points = awayTeamQuarter3Points;
	}

	public String getAwayTeamQuarter4Points() {
		return awayTeamQuarter4Points;
	}

	public void setAwayTeamQuarter4Points(String awayTeamQuarter4Points) {
		this.awayTeamQuarter4Points = awayTeamQuarter4Points;
	}

	public String getAwayStatisticsMinutes() {
		return awayStatisticsMinutes;
	}

	public void setAwayStatisticsMinutes(String awayStatisticsMinutes) {
		this.awayStatisticsMinutes = awayStatisticsMinutes;
	}

	public String getAwayStatisticsFieldGoalsMade() {
		return awayStatisticsFieldGoalsMade;
	}

	public void setAwayStatisticsFieldGoalsMade(
			String awayStatisticsFieldGoalsMade) {
		this.awayStatisticsFieldGoalsMade = awayStatisticsFieldGoalsMade;
	}

	public String getAwayStatisticsFieldGoalsAtt() {
		return awayStatisticsFieldGoalsAtt;
	}

	public void setAwayStatisticsFieldGoalsAtt(String awayStatisticsFieldGoalsAtt) {
		this.awayStatisticsFieldGoalsAtt = awayStatisticsFieldGoalsAtt;
	}

	public String getAwayStatisticsFieldGoalsPct() {
		return awayStatisticsFieldGoalsPct;
	}

	public void setAwayStatisticsFieldGoalsPct(String awayStatisticsFieldGoalsPct) {
		this.awayStatisticsFieldGoalsPct = awayStatisticsFieldGoalsPct;
	}

	public String getAwayStatisticsThreePointsMade() {
		return awayStatisticsThreePointsMade;
	}

	public void setAwayStatisticsThreePointsMade(
			String awayStatisticsThreePointsMade) {
		this.awayStatisticsThreePointsMade = awayStatisticsThreePointsMade;
	}

	public String getAwayStatisticsThreePointsAtt() {
		return awayStatisticsThreePointsAtt;
	}

	public void setAwayStatisticsThreePointsAtt(
			String awayStatisticsThreePointsAtt) {
		this.awayStatisticsThreePointsAtt = awayStatisticsThreePointsAtt;
	}

	public String getAwayStatisticsThreePointsPct() {
		return awayStatisticsThreePointsPct;
	}

	public void setAwayStatisticsThreePointsPct(
			String awayStatisticsThreePointsPct) {
		this.awayStatisticsThreePointsPct = awayStatisticsThreePointsPct;
	}

	public String getAwayStatisticsTwoPointsMade() {
		return awayStatisticsTwoPointsMade;
	}

	public void setAwayStatisticsTwoPointsMade(String awayStatisticsTwoPointsMade) {
		this.awayStatisticsTwoPointsMade = awayStatisticsTwoPointsMade;
	}

	public String getAwayStatisticsTwoPointsAtt() {
		return awayStatisticsTwoPointsAtt;
	}

	public void setAwayStatisticsTwoPointsAtt(String awayStatisticsTwoPointsAtt) {
		this.awayStatisticsTwoPointsAtt = awayStatisticsTwoPointsAtt;
	}

	public String getAwayStatisticsTwoPointsPct() {
		return awayStatisticsTwoPointsPct;
	}

	public void setAwayStatisticsTwoPointsPct(String awayStatisticsTwoPointsPct) {
		this.awayStatisticsTwoPointsPct = awayStatisticsTwoPointsPct;
	}

	public String getAwayStatisticsBlockedAtt() {
		return awayStatisticsBlockedAtt;
	}

	public void setAwayStatisticsBlockedAtt(String awayStatisticsBlockedAtt) {
		this.awayStatisticsBlockedAtt = awayStatisticsBlockedAtt;
	}

	public String getAwayStatisticsFreeThrowsMade() {
		return awayStatisticsFreeThrowsMade;
	}

	public void setAwayStatisticsFreeThrowsMade(
			String awayStatisticsFreeThrowsMade) {
		this.awayStatisticsFreeThrowsMade = awayStatisticsFreeThrowsMade;
	}

	public String getAwayStatisticsFreeThrowsAtt() {
		return awayStatisticsFreeThrowsAtt;
	}

	public void setAwayStatisticsFreeThrowsAtt(String awayStatisticsFreeThrowsAtt) {
		this.awayStatisticsFreeThrowsAtt = awayStatisticsFreeThrowsAtt;
	}

	public String getAwayStatisticsFreeThrowsPct() {
		return awayStatisticsFreeThrowsPct;
	}

	public void setAwayStatisticsFreeThrowsPct(String awayStatisticsFreeThrowsPct) {
		this.awayStatisticsFreeThrowsPct = awayStatisticsFreeThrowsPct;
	}

	public String getAwayStatisticsOffensiveRebounds() {
		return awayStatisticsOffensiveRebounds;
	}

	public void setAwayStatisticsOffensiveRebounds(
			String awayStatisticsOffensiveRebounds) {
		this.awayStatisticsOffensiveRebounds = awayStatisticsOffensiveRebounds;
	}

	public String getAwayStatisticsDefensiveRebounds() {
		return awayStatisticsDefensiveRebounds;
	}

	public void setAwayStatisticsDefensiveRebounds(
			String awayStatisticsDefensiveRebounds) {
		this.awayStatisticsDefensiveRebounds = awayStatisticsDefensiveRebounds;
	}

	public String getAwayStatisticsRebounds() {
		return awayStatisticsRebounds;
	}

	public void setAwayStatisticsRebounds(String awayStatisticsRebounds) {
		this.awayStatisticsRebounds = awayStatisticsRebounds;
	}

	public String getAwayStatisticsAssists() {
		return awayStatisticsAssists;
	}

	public void setAwayStatisticsAssists(String awayStatisticsAssists) {
		this.awayStatisticsAssists = awayStatisticsAssists;
	}

	public String getAwayStatisticsTurnovers() {
		return awayStatisticsTurnovers;
	}

	public void setAwayStatisticsTurnovers(String awayStatisticsTurnovers) {
		this.awayStatisticsTurnovers = awayStatisticsTurnovers;
	}

	public String getAwayStatisticsSteals() {
		return awayStatisticsSteals;
	}

	public void setAwayStatisticsSteals(String awayStatisticsSteals) {
		this.awayStatisticsSteals = awayStatisticsSteals;
	}

	public String getAwayStatisticsBlocks() {
		return awayStatisticsBlocks;
	}

	public void setAwayStatisticsBlocks(String awayStatisticsBlocks) {
		this.awayStatisticsBlocks = awayStatisticsBlocks;
	}

	public String getAwayStatisticsAssistsTurnoverRatio() {
		return awayStatisticsAssistsTurnoverRatio;
	}

	public void setAwayStatisticsAssistsTurnoverRatio(
			String awayStatisticsAssistsTurnoverRatio) {
		this.awayStatisticsAssistsTurnoverRatio = awayStatisticsAssistsTurnoverRatio;
	}

	public String getAwayStatisticsPersonalFouls() {
		return awayStatisticsPersonalFouls;
	}

	public void setAwayStatisticsPersonalFouls(String awayStatisticsPersonalFouls) {
		this.awayStatisticsPersonalFouls = awayStatisticsPersonalFouls;
	}

	public String getAwayStatisticsPoints() {
		return awayStatisticsPoints;
	}

	public void setAwayStatisticsPoints(String awayStatisticsPoints) {
		this.awayStatisticsPoints = awayStatisticsPoints;
	}

	public String getAwayStatisticsFastBreakPts() {
		return awayStatisticsFastBreakPts;
	}

	public void setAwayStatisticsFastBreakPts(String awayStatisticsFastBreakPts) {
		this.awayStatisticsFastBreakPts = awayStatisticsFastBreakPts;
	}

	public String getAwayStatisticsPaintPts() {
		return awayStatisticsPaintPts;
	}

	public void setAwayStatisticsPaintPts(String awayStatisticsPaintPts) {
		this.awayStatisticsPaintPts = awayStatisticsPaintPts;
	}

	public String getAwayStatisticsTeamTurnovers() {
		return awayStatisticsTeamTurnovers;
	}

	public void setAwayStatisticsTeamTurnovers(String awayStatisticsTeamTurnovers) {
		this.awayStatisticsTeamTurnovers = awayStatisticsTeamTurnovers;
	}

	public String getAwayStatisticsTeamRebounds() {
		return awayStatisticsTeamRebounds;
	}

	public void setAwayStatisticsTeamRebounds(String awayStatisticsTeamRebounds) {
		this.awayStatisticsTeamRebounds = awayStatisticsTeamRebounds;
	}

	public String getAwayStatisticsFlagrantFouls() {
		return awayStatisticsFlagrantFouls;
	}

	public void setAwayStatisticsFlagrantFouls(String awayStatisticsFlagrantFouls) {
		this.awayStatisticsFlagrantFouls = awayStatisticsFlagrantFouls;
	}

	public String getAwayStatisticsPlayerTechFouls() {
		return awayStatisticsPlayerTechFouls;
	}

	public void setAwayStatisticsPlayerTechFouls(
			String awayStatisticsPlayerTechFouls) {
		this.awayStatisticsPlayerTechFouls = awayStatisticsPlayerTechFouls;
	}

	public String getAwayStatisticsTeamTechFouls() {
		return awayStatisticsTeamTechFouls;
	}

	public void setAwayStatisticsTeamTechFouls(String awayStatisticsTeamTechFouls) {
		this.awayStatisticsTeamTechFouls = awayStatisticsTeamTechFouls;
	}

	public String getAwayStatisticsCoachTechFouls() {
		return awayStatisticsCoachTechFouls;
	}

	public void setAwayStatisticsCoachTechFouls(
			String awayStatisticsCoachTechFouls) {
		this.awayStatisticsCoachTechFouls = awayStatisticsCoachTechFouls;
	}

	@Override
	public String toString() {
		return "GameSummary [gameId=" + gameId + ", gameCoverage="
				+ gameCoverage + ", gameHomeTeam=" + gameHomeTeam
				+ ", gameAwayTeam=" + gameAwayTeam + ", gameScheduled="
				+ gameScheduled + ", gameStatus=" + gameStatus
				+ ", gameAttendance=" + gameAttendance + ", gameClock="
				+ gameClock + ", gameQuarter=" + gameQuarter
				+ ", homeTeamQuarter1Points=" + homeTeamQuarter1Points
				+ ", homeTeamQuarter2Points=" + homeTeamQuarter2Points
				+ ", homeTeamQuarter3Points=" + homeTeamQuarter3Points
				+ ", homeTeamQuarter4Points=" + homeTeamQuarter4Points
				+ ", homeStatisticsMinutes=" + homeStatisticsMinutes
				+ ", homeStatisticsFieldGoalsMade="
				+ homeStatisticsFieldGoalsMade
				+ ", homeStatisticsFieldGoalsAtt="
				+ homeStatisticsFieldGoalsAtt
				+ ", homeStatisticsFieldGoalsPct="
				+ homeStatisticsFieldGoalsPct
				+ ", homeStatisticsThreePointsMade="
				+ homeStatisticsThreePointsMade
				+ ", homeStatisticsThreePointsAtt="
				+ homeStatisticsThreePointsAtt
				+ ", homeStatisticsThreePointsPct="
				+ homeStatisticsThreePointsPct
				+ ", homeStatisticsTwoPointsMade="
				+ homeStatisticsTwoPointsMade
				+ ", homeStatisticsTwoPointsAtt="
				+ homeStatisticsTwoPointsAtt
				+ ", homeStatisticsTwoPointsPct="
				+ homeStatisticsTwoPointsPct + ", homeStatisticsBlockedAtt="
				+ homeStatisticsBlockedAtt
				+ ", homeStatisticsFreeThrowsMade="
				+ homeStatisticsFreeThrowsMade
				+ ", homeStatisticsFreeThrowsAtt="
				+ homeStatisticsFreeThrowsAtt
				+ ", homeStatisticsFreeThrowsPct="
				+ homeStatisticsFreeThrowsPct
				+ ", homeStatisticsOffensiveRebounds="
				+ homeStatisticsOffensiveRebounds
				+ ", homeStatisticsDefensiveRebounds="
				+ homeStatisticsDefensiveRebounds
				+ ", homeStatisticsRebounds=" + homeStatisticsRebounds
				+ ", homeStatisticsAssists=" + homeStatisticsAssists
				+ ", homeStatisticsTurnovers=" + homeStatisticsTurnovers
				+ ", homeStatisticsSteals=" + homeStatisticsSteals
				+ ", homeStatisticsBlocks=" + homeStatisticsBlocks
				+ ", homeStatisticsAssistsTurnoverRatio="
				+ homeStatisticsAssistsTurnoverRatio
				+ ", homeStatisticsPersonalFouls="
				+ homeStatisticsPersonalFouls + ", homeStatisticsPoints="
				+ homeStatisticsPoints + ", homeStatisticsFastBreakPts="
				+ homeStatisticsFastBreakPts + ", homeStatisticsPaintPts="
				+ homeStatisticsPaintPts + ", homeStatisticsTeamTurnovers="
				+ homeStatisticsTeamTurnovers
				+ ", homeStatisticsTeamRebounds="
				+ homeStatisticsTeamRebounds
				+ ", homeStatisticsFlagrantFouls="
				+ homeStatisticsFlagrantFouls
				+ ", homeStatisticsPlayerTechFouls="
				+ homeStatisticsPlayerTechFouls
				+ ", homeStatisticsTeamTechFouls="
				+ homeStatisticsTeamTechFouls
				+ ", homeStatisticsCoachTechFouls="
				+ homeStatisticsCoachTechFouls + ", awayTeamQuarter1Points="
				+ awayTeamQuarter1Points + ", awayTeamQuarter2Points="
				+ awayTeamQuarter2Points + ", awayTeamQuarter3Points="
				+ awayTeamQuarter3Points + ", awayTeamQuarter4Points="
				+ awayTeamQuarter4Points + ", awayStatisticsMinutes="
				+ awayStatisticsMinutes + ", awayStatisticsFieldGoalsMade="
				+ awayStatisticsFieldGoalsMade
				+ ", awayStatisticsFieldGoalsAtt="
				+ awayStatisticsFieldGoalsAtt
				+ ", awayStatisticsFieldGoalsPct="
				+ awayStatisticsFieldGoalsPct
				+ ", awayStatisticsThreePointsMade="
				+ awayStatisticsThreePointsMade
				+ ", awayStatisticsThreePointsAtt="
				+ awayStatisticsThreePointsAtt
				+ ", awayStatisticsThreePointsPct="
				+ awayStatisticsThreePointsPct
				+ ", awayStatisticsTwoPointsMade="
				+ awayStatisticsTwoPointsMade
				+ ", awayStatisticsTwoPointsAtt="
				+ awayStatisticsTwoPointsAtt
				+ ", awayStatisticsTwoPointsPct="
				+ awayStatisticsTwoPointsPct + ", awayStatisticsBlockedAtt="
				+ awayStatisticsBlockedAtt
				+ ", awayStatisticsFreeThrowsMade="
				+ awayStatisticsFreeThrowsMade
				+ ", awayStatisticsFreeThrowsAtt="
				+ awayStatisticsFreeThrowsAtt
				+ ", awayStatisticsFreeThrowsPct="
				+ awayStatisticsFreeThrowsPct
				+ ", awayStatisticsOffensiveRebounds="
				+ awayStatisticsOffensiveRebounds
				+ ", awayStatisticsDefensiveRebounds="
				+ awayStatisticsDefensiveRebounds
				+ ", awayStatisticsRebounds=" + awayStatisticsRebounds
				+ ", awayStatisticsAssists=" + awayStatisticsAssists
				+ ", awayStatisticsTurnovers=" + awayStatisticsTurnovers
				+ ", awayStatisticsSteals=" + awayStatisticsSteals
				+ ", awayStatisticsBlocks=" + awayStatisticsBlocks
				+ ", awayStatisticsAssistsTurnoverRatio="
				+ awayStatisticsAssistsTurnoverRatio
				+ ", awayStatisticsPersonalFouls="
				+ awayStatisticsPersonalFouls + ", awayStatisticsPoints="
				+ awayStatisticsPoints + ", awayStatisticsFastBreakPts="
				+ awayStatisticsFastBreakPts + ", awayStatisticsPaintPts="
				+ awayStatisticsPaintPts + ", awayStatisticsTeamTurnovers="
				+ awayStatisticsTeamTurnovers
				+ ", awayStatisticsTeamRebounds="
				+ awayStatisticsTeamRebounds
				+ ", awayStatisticsFlagrantFouls="
				+ awayStatisticsFlagrantFouls
				+ ", awayStatisticsPlayerTechFouls="
				+ awayStatisticsPlayerTechFouls
				+ ", awayStatisticsTeamTechFouls="
				+ awayStatisticsTeamTechFouls
				+ ", awayStatisticsCoachTechFouls="
				+ awayStatisticsCoachTechFouls + "]";
	}
}