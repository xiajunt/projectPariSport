package projetPariSport.tools;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.Date;
import java.util.List;

import projetPariSport.parameter.Parameter;
import projetPariSport.structObject.Account;
import projetPariSport.structObject.Betting;
import projetPariSport.structObject.Game;
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

import com.googlecode.objectify.Key;
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
		ObjectifyService.register(Betting.class);
		ObjectifyService.register(Game.class);
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
	
	public static Account getAccount(String mail, String name)
	{
		Account ac = (Account)getDataCenter(Parameter.ACCOUNT, mail);
		if (ac == null)
		{
			ac = new Account(name, mail);
			addDataCenter(ac);
		}
		return ac;
	}
	
	public static List<Betting> getDataCenterBetting(Account ancest)
	{
		ObjectifyService.ofy();
		return ofy().load().type(Betting.class).ancestor(ancest).list();
	}
	
	public static List<Betting> getOldBetting(Account ancest)
	{
		ObjectifyService.ofy();
		return ofy().load().type(Betting.class).ancestor(ancest).filter("end", true).order("id").list();
	}
	
	public static List<Betting> getNewBetting(Account ancest)
	{
		ObjectifyService.ofy();
		return ofy().load().type(Betting.class).ancestor(ancest).filter("end", false).order("id").list();
	}
	
	public static List<Game> getDataCenterBetting(Betting ancest)
	{
		ObjectifyService.ofy();
		return ofy().load().type(Game.class).ancestor(ancest).list();
	}
	
	public static List<Schedule> getPastMatch()
	{
		ObjectifyService.ofy();
		List<Schedule> past =
				ofy().load().type(Schedule.class).filter("gameScheduled <=", new Date()).order("gameScheduled").list();
		return past;
	}
	
	public static List<Schedule> getFuturMatch()
	{
		ObjectifyService.ofy();
		List<Schedule> futur =
				ofy().load().type(Schedule.class).filter("gameScheduled >", new Date()).order("gameScheduled").list();
		return futur;
	}
	
	public static List<Schedule> getDateMatch(int date)
	{
		ObjectifyService.ofy();
		List<Schedule> dateMatch =
				ofy().load().type(Schedule.class).filter("time", date).order("gameScheduled").list();
		return dateMatch;
	}
	
	public static List<Standings> getStanding()
	{
		ObjectifyService.ofy();
		return ofy().load().type(Standings.class).filter("getAll", Parameter.GETALL).list();
	}
	
	public static void delAllInjury()
	{
		ObjectifyService.ofy();
		Iterable<Key<Injury>> allKeys =
				ofy().load().type(Injury.class).filter("getAll", Parameter.GETALL).keys();
		ofy().delete().keys(allKeys).now();
	}
}
