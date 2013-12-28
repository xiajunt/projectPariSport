package projetPariSport.structObject;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * GameScoreBox - Definition of the object GameScoreBox
 * This class maps all datas from the SportsDataLLC 's API
 * Get boxscore data for NBA games.
 * 
 * @version 1.0
 *
 * @author Rodier Madiande
 * @date 25/12/2013
 *
 */
public class GameScoreBox extends StructObject implements IDataCenterObject  {
	private String gameId;
	private String gameStatus;
	private Date gameScheduled;
	private String gameDuration;
	private String gameAttendance;
	private String gameClock;
	private String gameQuarter;
	private String gameHomeTeam;
	private String homeTeamPoints;
	private String homeTeamQuarter1Points;
	private String homeTeamQuarter2Points;
	private String homeTeamQuarter3Points;
	private String homeTeamQuarter4Points;
	private String gameAwayTeam;
	private String awayTeamPoints;
	private String awayTeamQuarter1Points;
	private String awayTeamQuarter2Points;
	private String awayTeamQuarter3Points;
	private String awayTeamQuarter4Points;
		
	public GameScoreBox() {
		super();
	}

	public String getGameId() {
		return gameId;
	}

	public void setGameId(String gameId) {
		this.gameId = gameId;
	}

	public String getGameStatus() {
		return gameStatus;
	}

	public void setGameStatus(String gameStatus) {
		this.gameStatus = gameStatus;
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

	public String getGameDuration() {
		return gameDuration;
	}

	public void setGameDuration(String gameDuration) {
		this.gameDuration = gameDuration;
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

	public String getGameHomeTeam() {
		return gameHomeTeam;
	}

	public void setGameHomeTeam(String gameHomeTeam) {
		this.gameHomeTeam = gameHomeTeam;
	}

	public String getHomeTeamPoints() {
		return homeTeamPoints;
	}

	public void setHomeTeamPoints(String homeTeamPoints) {
		this.homeTeamPoints = homeTeamPoints;
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

	public String getGameAwayTeam() {
		return gameAwayTeam;
	}

	public void setGameAwayTeam(String gameAwayTeam) {
		this.gameAwayTeam = gameAwayTeam;
	}

	public String getAwayTeamPoints() {
		return awayTeamPoints;
	}

	public void setAwayTeamPoints(String awayTeamPoints) {
		this.awayTeamPoints = awayTeamPoints;
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

	@Override
	public String toString() {
		return "GameScoreBox [gameId=" + gameId + ", gameStatus=" + gameStatus
				+ ", gameScheduled=" + gameScheduled + ", gameDuration="
				+ gameDuration + ", gameAttendance=" + gameAttendance
				+ ", gameClock=" + gameClock + ", gameQuarter=" + gameQuarter
				+ ", gameHomeTeam=" + gameHomeTeam + ", homeTeamPoints="
				+ homeTeamPoints + ", homeTeamQuarter1Points="
				+ homeTeamQuarter1Points + ", homeTeamQuarter2Points="
				+ homeTeamQuarter2Points + ", homeTeamQuarter3Points="
				+ homeTeamQuarter3Points + ", homeTeamQuarter4Points="
				+ homeTeamQuarter4Points + ", gameAwayTeam=" + gameAwayTeam
				+ ", awayTeamPoints=" + awayTeamPoints
				+ ", awayTeamQuarter1Points=" + awayTeamQuarter1Points
				+ ", awayTeamQuarter2Points=" + awayTeamQuarter2Points
				+ ", awayTeamQuarter3Points=" + awayTeamQuarter3Points
				+ ", awayTeamQuarter4Points=" + awayTeamQuarter4Points + "]";
	}
}
