package projetPariSport.structObject;

/**
 * TeamCoach - Definition of the object TeamCoach
 * This class maps all datas from the SportsDataLLC 's API
 * Get team rosters for the NBA.(coaches)
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 26/12/2013
 *
 */
public class TeamCoach extends StructObject implements IDataCenterObject {
	private String teamId;
	private String coachId;
	private String coachFullName;
	private String coachLastName;
	private String coachPosition;
	private String coachExperience;
	
	public TeamCoach() {
		super();
	}

	public String getTeamId() {
		return teamId;
	}

	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}

	public String getCoachId() {
		return coachId;
	}

	public void setCoachId(String coachId) {
		this.coachId = coachId;
	}

	public String getCoachFullName() {
		return coachFullName;
	}

	public void setCoachFullName(String coachFullName) {
		this.coachFullName = coachFullName;
	}

	public String getCoachLastName() {
		return coachLastName;
	}

	public void setCoachLastName(String coachLastName) {
		this.coachLastName = coachLastName;
	}

	public String getCoachPosition() {
		return coachPosition;
	}

	public void setCoachPosition(String coachPosition) {
		this.coachPosition = coachPosition;
	}

	public String getCoachExperience() {
		return coachExperience;
	}

	public void setCoachExperience(String coachExperience) {
		this.coachExperience = coachExperience;
	}

	@Override
	public String toString() {
		return "TeamCoach [teamId=" + teamId + ", coachId=" + coachId
				+ ", coachFullName=" + coachFullName + ", coachLastName="
				+ coachLastName + ", coachPosition=" + coachPosition
				+ ", coachExperience=" + coachExperience + "]";
	}
}
