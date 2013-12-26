package projetPariSport.structObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JavaBean GameScoreBox
 * 
 */
public class GameScoreBox extends StructObject implements IDataCenterObject  {
	private String id;
	private String status;
	private Date scheduled;
	private String duration;
	private String attendance;
	private String clock;
	private String quarter;
	private String homeTeam;
	private String homeTeamPoints;
	private String homeTeamQuarter1;
	private String homeTeamQuarter2;
	private String homeTeamQuarter3;
	private String homeTeamQuarter4;
	private String awayTeam;
	private String awayTeamPoints;
	private String awayTeamQuarter1;
	private String awayTeamQuarter2;
	private String awayTeamQuarter3;
	private String awayTeamQuarter4;
		
	public GameScoreBox() {
		super();
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
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

	public String getHomeTeam() {
		return homeTeam;
	}

	public void setHomeTeam(String homeTeam) {
		this.homeTeam = homeTeam;
	}

	public String getHomeTeamPoints() {
		return homeTeamPoints;
	}

	public void setHomeTeamPoints(String homeTeamPoints) {
		this.homeTeamPoints = homeTeamPoints;
	}

	public String getHomeTeamQuarter1() {
		return homeTeamQuarter1;
	}

	public void setHomeTeamQuarter1(String homeTeamQuarter1) {
		this.homeTeamQuarter1 = homeTeamQuarter1;
	}

	public String getHomeTeamQuarter2() {
		return homeTeamQuarter2;
	}

	public void setHomeTeamQuarter2(String homeTeamQuarter2) {
		this.homeTeamQuarter2 = homeTeamQuarter2;
	}

	public String getHomeTeamQuarter3() {
		return homeTeamQuarter3;
	}

	public void setHomeTeamQuarter3(String homeTeamQuarter3) {
		this.homeTeamQuarter3 = homeTeamQuarter3;
	}

	public String getHomeTeamQuarter4() {
		return homeTeamQuarter4;
	}

	public void setHomeTeamQuarter4(String homeTeamQuarter4) {
		this.homeTeamQuarter4 = homeTeamQuarter4;
	}

	public String getAwayTeam() {
		return awayTeam;
	}

	public void setAwayTeam(String awayTeam) {
		this.awayTeam = awayTeam;
	}

	public String getAwayTeamPoints() {
		return awayTeamPoints;
	}

	public void setAwayTeamPoints(String awayTeamPoints) {
		this.awayTeamPoints = awayTeamPoints;
	}

	public String getAwayTeamQuarter1() {
		return awayTeamQuarter1;
	}

	public void setAwayTeamQuarter1(String awayTeamQuarter1) {
		this.awayTeamQuarter1 = awayTeamQuarter1;
	}

	public String getAwayTeamQuarter2() {
		return awayTeamQuarter2;
	}

	public void setAwayTeamQuarter2(String awayTeamQuarter2) {
		this.awayTeamQuarter2 = awayTeamQuarter2;
	}

	public String getAwayTeamQuarter3() {
		return awayTeamQuarter3;
	}

	public void setAwayTeamQuarter3(String awayTeamQuarter3) {
		this.awayTeamQuarter3 = awayTeamQuarter3;
	}

	public String getAwayTeamQuarter4() {
		return awayTeamQuarter4;
	}

	public void setAwayTeamQuarter4(String awayTeamQuarter4) {
		this.awayTeamQuarter4 = awayTeamQuarter4;
	}
	
	@Override
	public String toString() {
		return "GameScoreBox [id=" + id + ", status=" + status + ", scheduled="
				+ scheduled + ", duration=" + duration + ", attendance="
				+ attendance + ", clock=" + clock + ", quarter=" + quarter
				+ ", homeTeam=" + homeTeam + ", homeTeamPoints="
				+ homeTeamPoints + ", homeTeamQuarter1=" + homeTeamQuarter1
				+ ", homeTeamQuarter2=" + homeTeamQuarter2
				+ ", homeTeamQuarter3=" + homeTeamQuarter3
				+ ", homeTeamQuarter4=" + homeTeamQuarter4 + ", awayTeam="
				+ awayTeam + ", awayTeamPoints=" + awayTeamPoints
				+ ", awayTeamQuarter1=" + awayTeamQuarter1
				+ ", awayTeamQuarter2=" + awayTeamQuarter2
				+ ", awayTeamQuarter3=" + awayTeamQuarter3
				+ ", awayTeamQuarter4=" + awayTeamQuarter4 + "]";
	}
}
