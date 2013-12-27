package projetPariSport.structObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JavaBean TeamPlayer
 * 
 */
public class TeamPlayer extends StructObject implements IDataCenterObject {
	private String teamId;
	private String playerId;
	private String playerFullName;
	private String playerFirstName;
	private String playerAbbrName;
	private String playerHeight;
	private String playerWeight;
	private String playerPosition;
	private String playerPrimaryPosition;
	private String playerJerseyNumber;
	private String playerExperience;
	private String playerCollege;
	private String playerBirthPlace;
	private Date playerUpdated;
	private String draftTeamId;
	private String draftYear;
	private String draftRound;
	private String draftPick;
	
	public TeamPlayer() {
		// TODO Auto-generated constructor stub
		super();
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

	public String getPlayerFullName() {
		return playerFullName;
	}

	public void setPlayerFullName(String playerFullName) {
		this.playerFullName = playerFullName;
	}

	public String getPlayerFirstName() {
		return playerFirstName;
	}

	public void setPlayerFirstName(String playerFirstName) {
		this.playerFirstName = playerFirstName;
	}

	public String getPlayerAbbrName() {
		return playerAbbrName;
	}

	public void setPlayerAbbrName(String playerAbbrName) {
		this.playerAbbrName = playerAbbrName;
	}

	public String getPlayerHeight() {
		return playerHeight;
	}

	public void setPlayerHeight(String playerHeight) {
		this.playerHeight = playerHeight;
	}

	public String getPlayerWeight() {
		return playerWeight;
	}

	public void setPlayerWeight(String playerWeight) {
		this.playerWeight = playerWeight;
	}

	public String getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}

	public String getPlayerPrimaryPosition() {
		return playerPrimaryPosition;
	}

	public void setPlayerPrimaryPosition(String playerPrimaryPosition) {
		this.playerPrimaryPosition = playerPrimaryPosition;
	}

	public String getPlayerJerseyNumber() {
		return playerJerseyNumber;
	}

	public void setPlayerJerseyNumber(String playerJerseyNumber) {
		this.playerJerseyNumber = playerJerseyNumber;
	}

	public String getPlayerExperience() {
		return playerExperience;
	}

	public void setPlayerExperience(String playerExperience) {
		this.playerExperience = playerExperience;
	}

	public String getPlayerCollege() {
		return playerCollege;
	}

	public void setPlayerCollege(String playerCollege) {
		this.playerCollege = playerCollege;
	}

	public String getPlayerBirthPlace() {
		return playerBirthPlace;
	}

	public void setPlayerBirthPlace(String playerBirthPlace) {
		this.playerBirthPlace = playerBirthPlace;
	}

	public Date getPlayerUpdated() {
		return playerUpdated;
	}

	public void setPlayerUpdated(String playerUpdated) {
		String t = playerUpdated.replace('T', ':');
		try {
			this.playerUpdated = new SimpleDateFormat("yyyy-MM-dd:HH:mm:ss", Locale.FRANCE).parse(t.substring(0, t.length() - 6));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getDraftTeamId() {
		return draftTeamId;
	}

	public void setDraftTeamId(String draftTeamId) {
		this.draftTeamId = draftTeamId;
	}

	public String getDraftYear() {
		return draftYear;
	}

	public void setDraftYear(String draftYear) {
		this.draftYear = draftYear;
	}

	public String getDraftRound() {
		return draftRound;
	}

	public void setDraftRound(String draftRound) {
		this.draftRound = draftRound;
	}

	public String getDraftPick() {
		return draftPick;
	}

	public void setDraftPick(String draftPick) {
		this.draftPick = draftPick;
	}

	@Override
	public String toString() {
		return "TeamPlayer [teamId=" + teamId + ", playerId=" + playerId
				+ ", playerFullName=" + playerFullName + ", playerFirstName="
				+ playerFirstName + ", playerAbbrName=" + playerAbbrName
				+ ", playerHeight=" + playerHeight + ", playerWeight="
				+ playerWeight + ", playerPosition=" + playerPosition
				+ ", playerPrimaryPosition=" + playerPrimaryPosition
				+ ", playerJerseyNumber=" + playerJerseyNumber
				+ ", playerExperience=" + playerExperience + ", playerCollege="
				+ playerCollege + ", playerBirthPlace=" + playerBirthPlace
				+ ", playerUpdated=" + playerUpdated + ", draftTeamId="
				+ draftTeamId + ", draftYear=" + draftYear + ", draftRound="
				+ draftRound + ", draftPick=" + draftPick + "]";
	}
}
