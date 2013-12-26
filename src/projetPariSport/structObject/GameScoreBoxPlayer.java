package projetPariSport.structObject;

/* JavaBean GameScoreBoxPlayer
 * 
 */
public class GameScoreBoxPlayer extends StructObject implements
		IDataCenterObject {
	public String gameId;
	public String teamId;
	public String playerId;
	public String minutes;
	public String fieldGoalsMade;
	public String fieldGoalsAtt;
	public String fieldGoalsPct;
	public String threePointsMade;
	public String threePointsAtt;
	public String threePointsPct;
	public String twoPointsMade;
	public String twoPointsAtt;
	public String twoPointsPct;
	public String blockedAtt;
	public String freeThrowsMade;
	public String freeThrowsAtt;
	public String freeThrowsPct;
	public String offensiveRebounds;
	public String defensiveRebounds;
	public String rebounds;
	public String assists;
	public String turnovers;
	public String steals;
	public String blocks;
	public String assistsTurnoverRatio;
	public String personalFouls;
	public String techFouls;
	public String flagrantFouls;
	public String plsMin;
	public String points;
	
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

	public String getMinutes() {
		return minutes;
	}

	public void setMinutes(String minutes) {
		this.minutes = minutes;
	}

	public String getFieldGoalsMade() {
		return fieldGoalsMade;
	}
	
	public void setFieldGoalsMade(String fieldGoalsMade) {
		this.fieldGoalsMade = fieldGoalsMade;
	}

	public String getFieldGoalsAtt() {
		return fieldGoalsAtt;
	}

	public void setFieldGoalsAtt(String fieldGoalsAtt) {
		this.fieldGoalsAtt = fieldGoalsAtt;
	}

	public String getFieldGoalsPct() {
		return fieldGoalsPct;
	}

	public void setFieldGoalsPct(String fieldGoalsPct) {
		this.fieldGoalsPct = fieldGoalsPct;
	}

	public String getThreePointsMade() {
		return threePointsMade;
	}
	
	public void setThreePointsMade(String threePointsMade) {
		this.threePointsMade = threePointsMade;
	}

	public String getThreePointsAtt() {
		return threePointsAtt;
	}

	public void setThreePointsAtt(String threePointsAtt) {
		this.threePointsAtt = threePointsAtt;
	}

	public String getThreePointsPct() {
		return threePointsPct;
	}

	public void setThreePointsPct(String threePointsPct) {
		this.threePointsPct = threePointsPct;
	}

	public String getTwoPointsMade() {
		return twoPointsMade;
	}

	public void setTwoPointsMade(String twoPointsMade) {
		this.twoPointsMade = twoPointsMade;
	}

	public String getTwoPointsAtt() {
		return twoPointsAtt;
	}

	public void setTwoPointsAtt(String twoPointsAtt) {
		this.twoPointsAtt = twoPointsAtt;
	}

	public String getTwoPointsPct() {
		return twoPointsPct;
	}

	public void setTwoPointsPct(String twoPointsPct) {
		this.twoPointsPct = twoPointsPct;
	}

	public String getBlockedAtt() {
		return blockedAtt;
	}
	
	public void setBlockedAtt(String blockedAtt) {
		this.blockedAtt = blockedAtt;
	}

	public String getOffensiveRebounds() {
		return offensiveRebounds;
	}

	public void setOffensiveRebounds(String offensiveRebounds) {
		this.offensiveRebounds = offensiveRebounds;
	}

	public String getDefensiveRebounds() {
		return defensiveRebounds;
	}

	public void setDefensiveRebounds(String defensiveRebounds) {
		this.defensiveRebounds = defensiveRebounds;
	}

	public String getRebounds() {
		return rebounds;
	}

	public void setRebounds(String rebounds) {
		this.rebounds = rebounds;
	}

	public String getAssists() {
		return assists;
	}

	public void setAssists(String assists) {
		this.assists = assists;
	}

	public String getSteals() {
		return steals;
	}

	public void setSteals(String steals) {
		this.steals = steals;
	}

	public String getBlocks() {
		return blocks;
	}

	public void setBlocks(String blocks) {
		this.blocks = blocks;
	}

	public String getTechFouls() {
		return techFouls;
	}

	public void setTechFouls(String techFouls) {
		this.techFouls = techFouls;
	}
	
	public String getFlagrantFouls() {
		return flagrantFouls;
	}

	public void setFlagrantFouls(String flagrantFouls) {
		this.flagrantFouls = flagrantFouls;
	}
	
	public String getPlsMin() {
		return plsMin;
	}

	public void setPlsMin(String plsMin) {
		this.plsMin = plsMin;
	}

	public String getPoints() {
		return points;
	}
	
	public void setPoints(String points) {
		this.points = points;
	}
	
	public String getFreeThrowsMade() {
		return freeThrowsMade;
	}

	public void setFreeThrowsMade(String freeThrowsMade) {
		this.freeThrowsMade = freeThrowsMade;
	}

	public String getFreeThrowsAtt() {
		return freeThrowsAtt;
	}

	public void setFreeThrowsAtt(String freeThrowsAtt) {
		this.freeThrowsAtt = freeThrowsAtt;
	}

	public String getFreeThrowsPct() {
		return freeThrowsPct;
	}

	public void setFreeThrowsPct(String freeThrowsPct) {
		this.freeThrowsPct = freeThrowsPct;
	}

	public String getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(String turnovers) {
		this.turnovers = turnovers;
	}

	public String getAssistsTurnoverRatio() {
		return assistsTurnoverRatio;
	}

	public void setAssistsTurnoverRatio(String assistsTurnoverRatio) {
		this.assistsTurnoverRatio = assistsTurnoverRatio;
	}

	public String getPersonalFouls() {
		return personalFouls;
	}

	public void setPersonalFouls(String personalFouls) {
		this.personalFouls = personalFouls;
	}

	@Override
	public String toString() {
		return "GameScoreBoxPlayer [gameId=" + gameId + ", teamId=" + teamId
				+ ", playerId=" + playerId + ", minutes=" + minutes
				+ ", fieldGoalsMade=" + fieldGoalsMade + ", fieldGoalsAtt="
				+ fieldGoalsAtt + ", fieldGoalsPct=" + fieldGoalsPct
				+ ", threePointsMade=" + threePointsMade + ", threePointsAtt="
				+ threePointsAtt + ", threePointsPct=" + threePointsPct
				+ ", twoPointsMade=" + twoPointsMade + ", twoPointsAtt="
				+ twoPointsAtt + ", twoPointsPct=" + twoPointsPct
				+ ", blockedAtt=" + blockedAtt + ", freeThrowsMade="
				+ freeThrowsMade + ", freeThrowsAtt=" + freeThrowsAtt
				+ ", freeThrowsPct=" + freeThrowsPct + ", offensiveRebounds="
				+ offensiveRebounds + ", defensiveRebounds="
				+ defensiveRebounds + ", rebounds=" + rebounds + ", assists="
				+ assists + ", turnovers=" + turnovers + ", steals=" + steals
				+ ", blocks=" + blocks + ", assistsTurnoverRatio="
				+ assistsTurnoverRatio + ", personalFouls=" + personalFouls
				+ ", techFouls=" + techFouls + ", flagrantFouls="
				+ flagrantFouls + ", plsMin=" + plsMin + ", points=" + points
				+ "]";
	}
}
