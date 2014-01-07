package projetPariSport.tools;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.Date;
import java.util.List;

import projetPariSport.parameter.Parameter;
import projetPariSport.structObject.Account;
import projetPariSport.structObject.GameScoreBox;
import projetPariSport.structObject.GameScoreBoxPlayer;
import projetPariSport.structObject.GameSummary;
import projetPariSport.structObject.GameSummaryPlayer;
import projetPariSport.structObject.IDataCenterObject;
import projetPariSport.structObject.Injury;
import projetPariSport.structObject.LeagueHierarchy;
import projetPariSport.structObject.Schedule;
import projetPariSport.structObject.Standings;
import projetPariSport.structObject.Team;
import projetPariSport.structObject.TeamCoach;
import projetPariSport.structObject.TeamPlayer;

import com.googlecode.objectify.ObjectifyService;

/**
 * DataCenterTool - A class with static method for manipulating
 * the Data Center of google app engine with objectify
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 09/12/2013
 *
 */

public class DataCenterTool {
	
	static {
		ObjectifyService.register(Account.class);
		ObjectifyService.register(GameScoreBox.class);
		ObjectifyService.register(GameScoreBoxPlayer.class);
		ObjectifyService.register(GameSummary.class);
		ObjectifyService.register(GameSummaryPlayer.class);
		ObjectifyService.register(Injury.class);
		ObjectifyService.register(LeagueHierarchy.class);
		ObjectifyService.register(Schedule.class);
		ObjectifyService.register(Standings.class);
		ObjectifyService.register(Team.class);
		ObjectifyService.register(TeamCoach.class);
		ObjectifyService.register(TeamPlayer.class);
	}
	
	public static void addDataCenter(IDataCenterObject obj) {
		ObjectifyService.ofy();
		ofy().save().entity(obj).now();
	}
	
	public static <T extends IDataCenterObject> void addDataCenter(List<T> list) {
		ObjectifyService.ofy();
		ofy().save().entities(list).now();
	}
	
	public static IDataCenterObject getDataCenter(int type, String id) {
		ObjectifyService.ofy();
		switch (type)
		{
			case Parameter.ACCOUNT:
				return ofy().load().type(Account.class).id(id).now();
			case Parameter.GAMESCOREBOX:
				return ofy().load().type(GameScoreBox.class).id(id).now();
			case Parameter.GAMESCOREBOXPLAYER:
				return ofy().load().type(GameScoreBoxPlayer.class).id(id).now();
			case Parameter.GAMESUMMARY:
				return ofy().load().type(GameSummary.class).id(id).now();
			case Parameter.GAMESUMMARYPLAYER:
				return ofy().load().type(GameSummaryPlayer.class).id(id).now();
			case Parameter.INJURY:
				return ofy().load().type(Injury.class).id(id).now();
			case Parameter.LEAGUEHIERARCHY:
				return ofy().load().type(LeagueHierarchy.class).id(id).now();
			case Parameter.SCHEDULE:
				return ofy().load().type(Schedule.class).id(id).now();
			case Parameter.STANDINGS:
				return ofy().load().type(Standings.class).id(id).now();
			case Parameter.TEAM:
				return ofy().load().type(Team.class).id(id).now();
			case Parameter.TEAMCOACH:
				return ofy().load().type(TeamCoach.class).id(id).now();
			case Parameter.TEAMPLAYER:
				return ofy().load().type(TeamPlayer.class).id(id).now();
			default:
				return null;
		}
	}
	
	public static List<Schedule> getPastMatch()
	{
		List<Schedule> past =
				ofy().load().type(Schedule.class).filter("gameScheduled <=", new Date()).list();
		return past;
	}
	
	public static List<Schedule> getFuturMatch()
	{
		List<Schedule> past =
				ofy().load().type(Schedule.class).filter("gameScheduled >", new Date()).list();
		return past;
	}
}
