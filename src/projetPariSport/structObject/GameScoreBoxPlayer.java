package projetPariSport.structObject;

/**
 * GameScoreBoxPlayer - Definition of the object GameScoreBoxPlayer
 * This class maps all datas from the SportsDataLLC 's API
 * Get boxscore data's player for NBA games.
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */
public class GameScoreBoxPlayer extends StructObject implements
		IDataCenterObject {
	public String gameId;
	public String teamId;
	public String playerId;
	public String statisticsMinutes;
	public String statisticsFieldGoalsMade;
	public String statisticsFieldGoalsAtt;
	public String statisticsFieldGoalsPct;
	public String statisticsThreePointsMade;
	public String statisticsThreePointsAtt;
	public String statisticsThreePointsPct;
	public String statisticsTwoPointsMade;
	public String statisticsTwoPointsAtt;
	public String statisticsTwoPointsPct;
	public String statisticsBlockedAtt;
	public String statisticsFreeThrowsMade;
	public String statisticsFreeThrowsAtt;
	public String statisticsFreeThrowsPct;
	public String statisticsOffensiveRebounds;
	public String statisticsDefensiveRebounds;
	public String statisticsRebounds;
	public String statisticsAssists;
	public String statisticsTurnovers;
	public String statisticsTteals;
	public String statisticsBlocks;
	public String statisticsAssistsTurnoverRatio;
	public String statisticsPersonalFouls;
	public String statisticsTechFouls;
	public String statisticsFlagrantFouls;
	public String statisticsPlsMin;
	public String statisticsPoints;
	
	public GameScoreBoxPlayer(){
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

	public String getStatisticsTteals() {
		return statisticsTteals;
	}

	public void setStatisticsTteals(String statisticsTteals) {
		this.statisticsTteals = statisticsTteals;
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

	public String getStatisticsTechFouls() {
		return statisticsTechFouls;
	}

	public void setStatisticsTechFouls(String statisticsTechFouls) {
		this.statisticsTechFouls = statisticsTechFouls;
	}

	public String getStatisticsFlagrantFouls() {
		return statisticsFlagrantFouls;
	}

	public void setStatisticsFlagrantFouls(String statisticsFlagrantFouls) {
		this.statisticsFlagrantFouls = statisticsFlagrantFouls;
	}

	public String getStatisticsPlsMin() {
		return statisticsPlsMin;
	}

	public void setStatisticsPlsMin(String statisticsPlsMin) {
		this.statisticsPlsMin = statisticsPlsMin;
	}

	public String getStatisticsPoints() {
		return statisticsPoints;
	}

	public void setStatisticsPoints(String statisticsPoints) {
		this.statisticsPoints = statisticsPoints;
	}

	@Override
	public String toString() {
		return "GameScoreBoxPlayer [gameId=" + gameId + ", teamId=" + teamId
				+ ", playerId=" + playerId + ", statisticsMinutes="
				+ statisticsMinutes + ", statisticsFieldGoalsMade="
				+ statisticsFieldGoalsMade + ", statisticsFieldGoalsAtt="
				+ statisticsFieldGoalsAtt + ", statisticsFieldGoalsPct="
				+ statisticsFieldGoalsPct + ", statisticsThreePointsMade="
				+ statisticsThreePointsMade + ", statisticsThreePointsAtt="
				+ statisticsThreePointsAtt + ", statisticsThreePointsPct="
				+ statisticsThreePointsPct + ", statisticsTwoPointsMade="
				+ statisticsTwoPointsMade + ", statisticsTwoPointsAtt="
				+ statisticsTwoPointsAtt + ", statisticsTwoPointsPct="
				+ statisticsTwoPointsPct + ", statisticsBlockedAtt="
				+ statisticsBlockedAtt + ", statisticsFreeThrowsMade="
				+ statisticsFreeThrowsMade + ", statisticsFreeThrowsAtt="
				+ statisticsFreeThrowsAtt + ", statisticsFreeThrowsPct="
				+ statisticsFreeThrowsPct + ", statisticsOffensiveRebounds="
				+ statisticsOffensiveRebounds
				+ ", statisticsDefensiveRebounds="
				+ statisticsDefensiveRebounds + ", statisticsRebounds="
				+ statisticsRebounds + ", statisticsAssists="
				+ statisticsAssists + ", statisticsTurnovers="
				+ statisticsTurnovers + ", statisticsTteals="
				+ statisticsTteals + ", statisticsBlocks=" + statisticsBlocks
				+ ", statisticsAssistsTurnoverRatio="
				+ statisticsAssistsTurnoverRatio + ", statisticsPersonalFouls="
				+ statisticsPersonalFouls + ", statisticsTechFouls="
				+ statisticsTechFouls + ", statisticsFlagrantFouls="
				+ statisticsFlagrantFouls + ", statisticsPlsMin="
				+ statisticsPlsMin + ", statisticsPoints=" + statisticsPoints
				+ "]";
	}
}
