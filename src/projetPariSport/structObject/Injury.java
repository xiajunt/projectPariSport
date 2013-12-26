package projetPariSport.structObject;

/* JavaBean Injury
 * 
 */
public class Injury extends StructObject implements IDataCenterObject {
	private String teamId;
	private String playerId;
	private String id;
	private String desc;
	private String status;
	private String startDate;
	
	public Injury() {
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

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	@Override
	public String toString() {
		return "Injury [teamId=" + teamId + ", playerId=" + playerId + ", id="
				+ id + ", desc=" + desc + ", status=" + status + ", startDate="
				+ startDate + "]";
	}
}
