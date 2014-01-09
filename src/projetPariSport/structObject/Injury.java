package projetPariSport.structObject;

import projetPariSport.parameter.Parameter;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Injury - Definition of the object Injury
 * This class maps all datas from the SportsDataLLC 's API
 * Get injury feeds for the NBA.
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */

@Entity
@Cache
public class Injury extends StructObject implements IDataCenterObject {
	private @Index int getAll; /*for getting all Injury list*/
	private @Index String teamId;
	private @Index String playerId;
	private @Id String injuryId;
	private String injuryDesc;
	private String injuryStatus;
	private String injuryStartDate;
	
	public Injury() {
		super();
		this.getAll = Parameter.GETALL;
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

	public String getInjuryId() {
		return injuryId;
	}

	public void setInjuryId(String injuryId) {
		this.injuryId = injuryId;
	}

	public String getInjuryDesc() {
		return injuryDesc;
	}

	public void setInjuryDesc(String injuryDesc) {
		this.injuryDesc = injuryDesc;
	}

	public String getInjuryStatus() {
		return injuryStatus;
	}

	public void setInjuryStatus(String injuryStatus) {
		this.injuryStatus = injuryStatus;
	}

	public String getInjuryStartDate() {
		return injuryStartDate;
	}

	public void setInjuryStartDate(String injuryStartDate) {
		this.injuryStartDate = injuryStartDate;
	}

	@Override
	public String toString() {
		return "Injury [teamId=" + teamId + ", playerId=" + playerId
				+ ", injuryId=" + injuryId + ", injuryDesc=" + injuryDesc
				+ ", injuryStatus=" + injuryStatus + ", injuryStartDate="
				+ injuryStartDate + "]";
	}
}
