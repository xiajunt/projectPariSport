package projetPariSport.structObject;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * GameSummaryPlayer - Definition of the object GameSummaryPlayer
 * This class maps all datas from the SportsDataLLC 's API
 * Obtain game summaries's player for the NBA.
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */

@Entity
@Cache
public class GameSummaryPlayer extends StructObject implements
		IDataCenterObject {
	private @Id Long id;
	private @Index String gameId;
	private @Index String teamId;
	private @Index String playerId;
	private String playerPlayed;
	private String playerActive;
	private String playerStarter;
	private String statisticsMinutes;
	private String statisticsFieldGoalsMade;
	private String statisticsFieldGoalsAtt;
	private String statisticsFieldGoalsPct;
	private String statisticsThreePointsMade;
	private String statisticsThreePointsAtt;
	private String statisticsThreePointsPct;
	private String statisticsTwoPointsMade;
	private String statisticsTwoPointsAtt;
	private String statisticsTwoPointsPct;
	private String statisticsBlockedAtt;
	private String statisticsFreeThrowsMade;
	private String statisticsFreeThrowsAtt;
	private String statisticsFreeThrowsPct;
	private String statisticsOffensiveRebounds;
	private String statisticsDefensiveRebounds;
	private String statisticsRebounds;
	private String statisticsAssists;
	private String statisticsTurnovers;
	private String statisticsSteals;
	private String statisticsBlocks;
	private String statisticsAssistsTurnoverRatio;
	private String statisticsPersonalFouls;
	private String statisticsPoints;
	private String statisticsFlagrantFouls;
		
	public GameSummaryPlayer() {
		super();
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

	public String getPlayerPlayed() {
		return playerPlayed;
	}

	public void setPlayerPlayed(String playerPlayed) {
		this.playerPlayed = playerPlayed;
	}

	public String getPlayerActive() {
		return playerActive;
	}

	public void setPlayerActive(String playerActive) {
		this.playerActive = playerActive;
	}

	public String getPlayerStarter() {
		return playerStarter;
	}

	public void setPlayerStarter(String playerStarter) {
		this.playerStarter = playerStarter;
	}

	public String getStatisticsMinutes() {
		return statisticsMinutes;
	}

	public void setStatisticsMinutes(String statisticsMinutes) {
		this.statisticsMinutes = statisticsMinutes;
	}

	public String getStatisticsFieldGoalsMade() {
		return statisticsFieldGoalsMade;
	}

	public void setStatisticsFieldGoalsMade(String statisticsFieldGoalsMade) {
		this.statisticsFieldGoalsMade = statisticsFieldGoalsMade;
	}

	public String getStatisticsFieldGoalsAtt() {
		return statisticsFieldGoalsAtt;
	}

	public void setStatisticsFieldGoalsAtt(String statisticsFieldGoalsAtt) {
		this.statisticsFieldGoalsAtt = statisticsFieldGoalsAtt;
	}

	public String getStatisticsFieldGoalsPct() {
		return statisticsFieldGoalsPct;
	}

	public void setStatisticsFieldGoalsPct(String statisticsFieldGoalsPct) {
		this.statisticsFieldGoalsPct = statisticsFieldGoalsPct;
	}

	public String getStatisticsThreePointsMade() {
		return statisticsThreePointsMade;
	}

	public void setStatisticsThreePointsMade(String statisticsThreePointsMade) {
		this.statisticsThreePointsMade = statisticsThreePointsMade;
	}

	public String getStatisticsThreePointsAtt() {
		return statisticsThreePointsAtt;
	}

	public void setStatisticsThreePointsAtt(String statisticsThreePointsAtt) {
		this.statisticsThreePointsAtt = statisticsThreePointsAtt;
	}

	public String getStatisticsThreePointsPct() {
		return statisticsThreePointsPct;
	}

	public void setStatisticsThreePointsPct(String statisticsThreePointsPct) {
		this.statisticsThreePointsPct = statisticsThreePointsPct;
	}

	public String getStatisticsTwoPointsMade() {
		return statisticsTwoPointsMade;
	}

	public void setStatisticsTwoPointsMade(String statisticsTwoPointsMade) {
		this.statisticsTwoPointsMade = statisticsTwoPointsMade;
	}

	public String getStatisticsTwoPointsAtt() {
		return statisticsTwoPointsAtt;
	}

	public void setStatisticsTwoPointsAtt(String statisticsTwoPointsAtt) {
		this.statisticsTwoPointsAtt = statisticsTwoPointsAtt;
	}

	public String getStatisticsTwoPointsPct() {
		return statisticsTwoPointsPct;
	}

	public void setStatisticsTwoPointsPct(String statisticsTwoPointsPct) {
		this.statisticsTwoPointsPct = statisticsTwoPointsPct;
	}

	public String getStatisticsBlockedAtt() {
		return statisticsBlockedAtt;
	}

	public void setStatisticsBlockedAtt(String statisticsBlockedAtt) {
		this.statisticsBlockedAtt = statisticsBlockedAtt;
	}

	public String getStatisticsFreeThrowsMade() {
		return statisticsFreeThrowsMade;
	}

	public void setStatisticsFreeThrowsMade(String statisticsFreeThrowsMade) {
		this.statisticsFreeThrowsMade = statisticsFreeThrowsMade;
	}

	public String getStatisticsFreeThrowsAtt() {
		return statisticsFreeThrowsAtt;
	}

	public void setStatisticsFreeThrowsAtt(String statisticsFreeThrowsAtt) {
		this.statisticsFreeThrowsAtt = statisticsFreeThrowsAtt;
	}

	public String getStatisticsFreeThrowsPct() {
		return statisticsFreeThrowsPct;
	}

	public void setStatisticsFreeThrowsPct(String statisticsFreeThrowsPct) {
		this.statisticsFreeThrowsPct = statisticsFreeThrowsPct;
	}

	public String getStatisticsOffensiveRebounds() {
		return statisticsOffensiveRebounds;
	}

	public void setStatisticsOffensiveRebounds(String statisticsOffensiveRebounds) {
		this.statisticsOffensiveRebounds = statisticsOffensiveRebounds;
	}

	public String getStatisticsDefensiveRebounds() {
		return statisticsDefensiveRebounds;
	}

	public void setStatisticsDefensiveRebounds(String statisticsDefensiveRebounds) {
		this.statisticsDefensiveRebounds = statisticsDefensiveRebounds;
	}

	public String getStatisticsRebounds() {
		return statisticsRebounds;
	}

	public void setStatisticsRebounds(String statisticsRebounds) {
		this.statisticsRebounds = statisticsRebounds;
	}

	public String getStatisticsAssists() {
		return statisticsAssists;
	}

	public void setStatisticsAssists(String statisticsAssists) {
		this.statisticsAssists = statisticsAssists;
	}

	public String getStatisticsTurnovers() {
		return statisticsTurnovers;
	}

	public void setStatisticsTurnovers(String statisticsTurnovers) {
		this.statisticsTurnovers = statisticsTurnovers;
	}

	public String getStatisticsSteals() {
		return statisticsSteals;
	}

	public void setStatisticsSteals(String statisticsSteals) {
		this.statisticsSteals = statisticsSteals;
	}

	public String getStatisticsBlocks() {
		return statisticsBlocks;
	}

	public void setStatisticsBlocks(String statisticsBlocks) {
		this.statisticsBlocks = statisticsBlocks;
	}

	public String getStatisticsAssistsTurnoverRatio() {
		return statisticsAssistsTurnoverRatio;
	}

	public void setStatisticsAssistsTurnoverRatio(
			String statisticsAssistsTurnoverRatio) {
		this.statisticsAssistsTurnoverRatio = statisticsAssistsTurnoverRatio;
	}

	public String getStatisticsPersonalFouls() {
		return statisticsPersonalFouls;
	}

	public void setStatisticsPersonalFouls(String statisticsPersonalFouls) {
		this.statisticsPersonalFouls = statisticsPersonalFouls;
	}

	public String getStatisticsPoints() {
		return statisticsPoints;
	}

	public void setStatisticsPoints(String statisticsPoints) {
		this.statisticsPoints = statisticsPoints;
	}

	public String getStatisticsFlagrantFouls() {
		return statisticsFlagrantFouls;
	}

	public void setStatisticsFlagrantFouls(String statisticsFlagrantFouls) {
		this.statisticsFlagrantFouls = statisticsFlagrantFouls;
	}

	@Override
	public String toString() {
		return "GameSummaryPlayer [gameId=" + gameId + ", teamId=" + teamId
				+ ", playerId=" + playerId + ", playerPlayed=" + playerPlayed
				+ ", playerActive=" + playerActive + ", playerStarter="
				+ playerStarter + ", statisticsMinutes=" + statisticsMinutes
				+ ", statisticsFieldGoalsMade=" + statisticsFieldGoalsMade
				+ ", statisticsFieldGoalsAtt=" + statisticsFieldGoalsAtt
				+ ", statisticsFieldGoalsPct=" + statisticsFieldGoalsPct
				+ ", statisticsThreePointsMade=" + statisticsThreePointsMade
				+ ", statisticsThreePointsAtt=" + statisticsThreePointsAtt
				+ ", statisticsThreePointsPct=" + statisticsThreePointsPct
				+ ", statisticsTwoPointsMade=" + statisticsTwoPointsMade
				+ ", statisticsTwoPointsAtt=" + statisticsTwoPointsAtt
				+ ", statisticsTwoPointsPct=" + statisticsTwoPointsPct
				+ ", statisticsBlockedAtt=" + statisticsBlockedAtt
				+ ", statisticsFreeThrowsMade=" + statisticsFreeThrowsMade
				+ ", statisticsFreeThrowsAtt=" + statisticsFreeThrowsAtt
				+ ", statisticsFreeThrowsPct=" + statisticsFreeThrowsPct
				+ ", statisticsOffensiveRebounds="
				+ statisticsOffensiveRebounds
				+ ", statisticsDefensiveRebounds="
				+ statisticsDefensiveRebounds + ", statisticsRebounds="
				+ statisticsRebounds + ", statisticsAssists="
				+ statisticsAssists + ", statisticsTurnovers="
				+ statisticsTurnovers + ", statisticsSteals="
				+ statisticsSteals + ", statisticsBlocks=" + statisticsBlocks
				+ ", statisticsAssistsTurnoverRatio="
				+ statisticsAssistsTurnoverRatio + ", statisticsPersonalFouls="
				+ statisticsPersonalFouls + ", statisticsPoints="
				+ statisticsPoints + ", statisticsFlagrantFouls="
				+ statisticsFlagrantFouls + "]";
	}
}
