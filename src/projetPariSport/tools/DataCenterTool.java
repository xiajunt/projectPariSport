package projetPariSport.tools;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
	
	/*Operation on datacenter*/
	
	/** 
	 * addDataCenter
	 * Add the object IDataCenterObject on the datacenter
	 * 
	 * @param       the IDataCenterObject to store on the datacenter 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static void addDataCenter(IDataCenterObject obj) {
		ObjectifyService.ofy();
		ofy().save().entity(obj).now();
	}
	
	/** 
	 * addDataCenter
	 * Add the list of object IDataCenterObject on the datacenter
	 * 
	 * @param       the list of IDataCenterObject to store on the datacenter 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static <T extends IDataCenterObject> void addDataCenter(List<T> list) {
		ObjectifyService.ofy();
		ofy().save().entities(list).now();
	}
	
	/** 
	 * getDataCenter
	 * Get the IDataCenter instance matching the type and id, return null if
	 * the element is not present on the datacenter
	 * 
	 * @param       type of the element
	 * @param		key of the element
	 * @return		IDataCenterObject matching the type and id
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
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
	
	/*Operation on account*/
	
	/** 
	 * getAccount
	 * Get the Account if is present on the datastore, else create a new one, store it
	 * ont the datastore and return it;
	 * 
	 * @param       the mail of the account 
	 * @param		the name of the account
	 * @return		the Account matching mail and name
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
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
	
	/*Operation on Batting and Game*/
	
	/** 
	 * putBet
	 * create a bet on the datastore, if all information are available
	 * 
	 * @param       Map with gameId as key and teamId as value
	 * @param		Account of the player who create the bet
	 * @param		number of token on this bet
	 * 
	 * @return		return true if the bet is available, otherwise false
	 * 
	 * @author   XIA Juntie 
	 * @date     10/01/2104 
	 */
	
	public static boolean putBet(Map<String, String> map, Account ac, int nbrBetToken)
	{
		Set<String> set = map.keySet();
		List<Game> gameList = new ArrayList<Game>();
		Betting bet = new Betting(ac, nbrBetToken);
		String teamId;
		double totalCot = 0;
		double cot;
		
		addDataCenter(bet);
		if (ac.getToken() < nbrBetToken)
			return false;
		for (String gameId : set)
		{
			Schedule sched = (Schedule)getDataCenter(Parameter.SCHEDULE, gameId);
			if (sched == null || sched.getGameScheduled().compareTo(new Date()) < 0)
			{
				ofy().delete().entity(bet).now();
				return false;
			}
			teamId = map.get(gameId);
			
			if (teamId.compareTo(sched.getGameAwayTeam()) == 0 ||
				teamId.compareTo(sched.getGameHomeTeam()) == 0)
			{
				cot = NbaStatTool.getCotation(teamId);
				totalCot += cot;
				Game g = new Game(gameId, teamId, cot, bet);
				gameList.add(g);
			}
			else
			{
				ofy().delete().entity(bet).now();
				return false;
			}
		}

		bet.setCotation(totalCot);
		ac.addToken(-nbrBetToken);
		addDataCenter(bet);
		addDataCenter(gameList);
		addDataCenter(ac);
		return true;
	}
	
	/** 
	 * getDataCenterBetting
	 * Get the list of all Betting about a player
	 * 
	 * @param       Account of the player
	 * @return		List of player Betting 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static List<Betting> getDataCenterBetting(Account ancest)
	{
		ObjectifyService.ofy();
		return ofy().load().type(Betting.class).ancestor(ancest).list();
	}
	
	/** 
	 * getOldBetting
	 * Get the list of Betting already end
	 * 
	 * @param       Account of the player
	 * @return		List of player Betting 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static List<Betting> getOldBetting(Account ancest)
	{
		ObjectifyService.ofy();
		return ofy().load().type(Betting.class).ancestor(ancest).filter("end", true) .list();
	}
	
	/** 
	 * getNewBetting
	 * Get the list of Betting haven't done yet
	 * 
	 * @param       Account of the player
	 * @return		List of player Betting 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static List<Betting> getNewBetting(Account ancest)
	{
		ObjectifyService.ofy();
		return ofy().load().type(Betting.class).ancestor(ancest).filter("end", false).list();
	}
	
	/** 
	 * getNbrBetting
	 * Get the number of available bet a player have
	 * 
	 * @param       Account of the player
	 * @return		number of the bet
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static int getNbrBetting(Account ancest)
	{
		ObjectifyService.ofy();
		return getNewBetting(ancest).size();
	}
	
	/** 
	 * getDataCenterBettingGame
	 * Get the list of Game of a bet
	 * 
	 * @param       Betting of the games
	 * @return		List of the Game 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static List<Game> getDataCenterBettingGame(Betting ancest)
	{
		ObjectifyService.ofy();
		return ofy().load().type(Game.class).filter("bettingId =", ancest.getId()).list();
	}
	
	/** 
	 * getGameByGameId
	 * Get the list of Game by gameId
	 * 
	 * @param       Id of the game
	 * @return		List of Game matching gameId
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static List<Game> getGameByGameId(String gameId)
	{
		ObjectifyService.ofy();
		return ofy().load().type(Game.class).filter("gameId =", gameId).list();
	}
	
	/** 
	 * getBettingByBettingId
	 * Get the Betting with his id
	 * 
	 * @param       Id of Betting
	 * @return		Betting matching id 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static Betting getBettingByBettingId(long id)
	{
		return ofy().load().type(Betting.class).id(id).now();
	}
	
	/*Operation on Schedule*/
	
	/** 
	 * getPastMatch
	 * Get the list of past game
	 * 
	 * 
	 * @return		List of Schedule of past game 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static List<Schedule> getPastMatch()
	{
		ObjectifyService.ofy();
		List<Schedule> past =
				ofy().load().type(Schedule.class).filter("gameScheduled <=", new Date()).order("-gameScheduled").list();
		return past;
	}
	
	/** 
	 * getFuturMatch
	 * Get the list of coming game
	 * 
	 * 
	 * @return		List of Schedule of coming game 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static List<Schedule> getFuturMatch()
	{
		ObjectifyService.ofy();
		List<Schedule> futur =
				ofy().load().type(Schedule.class).filter("gameScheduled >", new Date()).order("gameScheduled").list();
		return futur;
	}
	
	/** 
	 * getDateMatch
	 * Get the list of Match on the date day
	 *
	 * @param       date in int format (ex: 20140029 for 2014/01/29
	 * @return		List of Schedule 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static List<Schedule> getDateMatch(int date)
	{
		ObjectifyService.ofy();
		List<Schedule> dateMatch =
				ofy().load().type(Schedule.class).filter("time", date).order("gameScheduled").list();
		return dateMatch;
	}
	
	/*Operation on Standing*/
	
	/** 
	 * getStanding
	 * Get the list of all Standing
	 * 
	 * @return		List of all Standing 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static List<Standings> getStanding()
	{
		ObjectifyService.ofy();
		return ofy().load().type(Standings.class).filter("getAll", Parameter.GETALL).list();
	}
	
	/** 
	 * getStandingDivisionList
	 * Get a Set of all NBA division
	 * 
	 * @return		Set of division name of NBA 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static Set<String> getStandingDivisionList()
	{
		List<Standings> list = getStanding();
		Set<String> set = new HashSet<String>();
		
		for (Standings s : list)
			set.add(s.getDivisionName());
		return set;
	}
	
	/*Operation on Injury*/
	
	/** 
	 * delAllInjury
	 * Delete all Injury on the datastore 
	 * 
	 * @author   XIA Juntie 
	 * @date     20/12/2013 
	 */
	
	public static void delAllInjury()
	{
		ObjectifyService.ofy();
		Iterable<Key<Injury>> allKeys =
				ofy().load().type(Injury.class).filter("getAll", Parameter.GETALL).keys();
		ofy().delete().keys(allKeys).now();
	}
}
