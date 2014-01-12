package projetPariSport.parameter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Parameter - Object with static informations needed for the good being of the web site
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 09/12/2013
 *
 */

public class Parameter {
	
	/*Token given when first time connect to application*/
	public final static int begToken = 1000;
	
	/*Define for all type of struct*/
	public final static int ACCOUNT = 0;
	public final static int GAMESCOREBOX = 1;
	public final static int GAMESCOREBOXPLAYER = 2;
	public final static int GAMESUMMARY = 3;
	public final static int GAMESUMMARYPLAYER = 4;
	public final static int INJURY = 5;
	public final static int LEAGUEHIERARCHY = 6;
	public final static int SCHEDULE = 7;
	public final static int STANDINGS = 8;
	public final static int TEAM = 9;
	public final static int TEAMCOACH = 10;
	public final static int TEAMPLAYER = 11;
	public final static int BETTING = 12;
	
	/*api information*/
	/*zbujgdbc3q6gebpruem8sjyn*/
	/*42dtxj4tmnz2mbhnteszwmcg*/
	private final static String apiKey = "42dtxj4tmnz2mbhnteszwmcg";
	private final static String apiSeason = "2013";
	private final static String apiNBASeason = "reg";
	private final static String apiVersion = "t3";
	
	/*Utils*/
	public final static int GETALL = 42;
	
	/*methode for getting url of xml about information needed*/
	public static String getScheduleUrl()
	{
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/games/" + apiSeason +
				"/" + apiNBASeason + "/schedule.xml?api_key=" + apiKey;
	}
	
	public static String getGameScoreBoxUrl(String gameId)
	{
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/games/" + gameId +
				"/boxscore.xml?api_key=" + apiKey;
	}
	
	public static String getStandingUrl()
	{
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/seasontd/" + apiSeason +
				"/" + apiNBASeason + "/standings.xml?api_key=" + apiKey;
	}
	
	public static String getLeagueHierarchyUrl()
	{
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/league/hierarchy.xml?api_key=" +
				apiKey;
	}
	
	public static String getTeamProfileUrl(String teamId)
	{
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/teams/" + teamId +
				"/profile.xml?api_key=" + apiKey;
	}
	
	public static String getPlayerProfileUrl(String playerId)
	{
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/players/" + playerId +
				"/profile.xml?api_key=" + apiKey;
	}
	
	public static String getInjuriesUrl()
	{
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/league/injuries.xml?api_key=" +
				apiKey;
	}
	
	public static String getGameSummaryUrl(String gameId)
	{
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/games/" + gameId +
				"/summary.xml?api_key=" + apiKey;
	}
	
	public static String getPlayByPlayUrl(String gameId)
	{
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/games/" + gameId +
				"/pbp.xml?api_key=" + apiKey;
	}
	
	public static String getSeasonalStatisticsUrl(String teamId)
	{
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/seasontd/" + apiSeason + "/" +
				apiNBASeason + "/teams/" + teamId + "/statistics.xml?api_key=" + apiKey;
	}
	
	public static String getDailyChangeLogUrl()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date d = new Date();
		String date = dateFormat.format(d);
		
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/league/" + date +
				"/changes.xml?api_key=" + apiKey;
	}
	
	public static String getDailyTransfertUrl()
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date d = new Date();
		String date = dateFormat.format(d);
		
		return "http://api.sportsdatallc.org/nba-" + apiVersion + "/league/" + date +
				"/transfers.xml?api_key=" + apiKey;
	}
	
	public static String getWinnerMsg(double id, int token)
	{
		String msg = "Felicitation, vous avez gagne " + token + "token a votre pari (" + id + ").";
		return msg;
	}
	
	public static String getLoserMsg(double id)
	{
		String msg = "Vous avez malheureusement perdu votre pari (" + id + ").";
		return msg;
	}
}
