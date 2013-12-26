package projetPariSport.structObject;

/* JavaBean GameSummaryPlayer
 * 
 */
public class GameSummaryPlayer extends StructObject implements
		IDataCenterObject {
	private String gameId;
	private String teamId;
	private String playerId;
	private String played;
	private String active;
	private String starter;
	private String minutes;
	private String fieldGoalsMade;
	private String fieldGoalsAtt;
	private String fieldGoalsPct;
	private String threePointsMade;
	private String threePointsAtt;
	private String threePointsPct;
	private String twoPointsMade;
	private String twoPointsAtt;
	private String twoPointsPct;
	private String blockedAtt;
	private String freeThrowsMade;
	private String freeThrowsAtt;
	private String freeThrowsPct;
	private String offensiveRebounds;
	private String defensiveRebounds;
	private String rebounds;
	private String assists;
	private String turnovers;
	private String steals;
	private String blocks;
	private String assistsTurnoverRatio;
	private String personalFouls;
	private String points;
	private String flagrantFouls;
	
	public GameSummaryPlayer() {
		// TODO Auto-generated constructor stub
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

	public String getPlayed() {
		return played;
	}

	public void setPlayed(String played) {
		this.played = played;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getStarter() {
		return starter;
	}

	public void setStarter(String starter) {
		this.starter = starter;
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

	public String getTurnovers() {
		return turnovers;
	}

	public void setTurnovers(String turnovers) {
		this.turnovers = turnovers;
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

	public String getPoints() {
		return points;
	}

	public void setPoints(String points) {
		this.points = points;
	}

	public String getFlagrantFouls() {
		return flagrantFouls;
	}

	public void setFlagrantFouls(String flagrantFouls) {
		this.flagrantFouls = flagrantFouls;
	}

	@Override
	public String toString() {
		return "GameSummaryPlayer [gameId=" + gameId + ", teamId=" + teamId
				+ ", playerId=" + playerId + ", played=" + played + ", active="
				+ active + ", starter=" + starter + ", minutes=" + minutes
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
				+ ", points=" + points + ", flagrantFouls=" + flagrantFouls
				+ "]";
	}
}
