package projetPariSport.tools;

import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.parameter.Parameter;
import projetPariSport.saxHandler.GameScoreBoxHandler;
import projetPariSport.saxHandler.GameScoreBoxPlayerHandler;
import projetPariSport.saxHandler.GameSummaryHandler;
import projetPariSport.saxHandler.GameSummaryPlayerHandler;
import projetPariSport.saxHandler.InjuryHandler;
import projetPariSport.saxHandler.LeagueHierarchyHandler;
import projetPariSport.saxHandler.ScheduleHandler;
import projetPariSport.saxHandler.StandingsHandler;
import projetPariSport.saxHandler.TeamCoachHandler;
import projetPariSport.saxHandler.TeamHandler;
import projetPariSport.saxHandler.TeamPlayerHandler;

/**
 * NbaDataCenterTool - A class with static method for storing or updating NBA information from
 * SportsDataLLC's api into datacenter
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 09/12/2013
 *
 */

public class NbaDataCenterTool {

	public static void fillGameScoreBox(String gameId)
	{
		try
		{
			DefaultHandler g;
			StringBuffer textView;
			
			textView = SaxTool.getXML(Parameter.getGameScoreBoxUrl(gameId));
			g = SaxTool.getHandler(Parameter.GAMESCOREBOX, textView);
			DataCenterTool.addDataCenter(((GameScoreBoxHandler)g).getGameScoreBoxes());
			g = SaxTool.getHandler(Parameter.GAMESCOREBOXPLAYER, textView);
			DataCenterTool.addDataCenter(((GameScoreBoxPlayerHandler)g).getGameScoreBoxPlayer());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void fillGameSummary(String gameId)
	{
		try
		
		{
			DefaultHandler g;
			StringBuffer textView;
			
			textView = SaxTool.getXML(Parameter.getGameSummaryUrl(gameId));
			g = SaxTool.getHandler(Parameter.GAMESUMMARY, textView);
			DataCenterTool.addDataCenter(((GameSummaryHandler)g).getGameSummary());
			g = SaxTool.getHandler(Parameter.GAMESUMMARYPLAYER, textView);
			DataCenterTool.addDataCenter(((GameSummaryPlayerHandler)g).getGameSummary());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void updateInjury()
	{
		try
		{
			DefaultHandler g;
			StringBuffer textView;
			
			
			textView = SaxTool.getXML(Parameter.getInjuriesUrl());
			g = SaxTool.getHandler(Parameter.INJURY, textView);
			DataCenterTool.delAllInjury();
			DataCenterTool.addDataCenter(((InjuryHandler)g).getInjuries());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void fillLeagueHierarchy()
	{
		try
		
		{
			DefaultHandler g;
			StringBuffer textView;
			
			textView = SaxTool.getXML(Parameter.getLeagueHierarchyUrl());
			g = SaxTool.getHandler(Parameter.LEAGUEHIERARCHY, textView);
			DataCenterTool.addDataCenter(((LeagueHierarchyHandler)g).getLeagueHierarchies());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void fillSchedule()
	{
		try
		
		{
			DefaultHandler g;
			StringBuffer textView;
			
			textView = SaxTool.getXML(Parameter.getScheduleUrl());
			g = SaxTool.getHandler(Parameter.SCHEDULE, textView);
			DataCenterTool.addDataCenter(((ScheduleHandler)g).getSeasonSchedule());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void fillStanding()
	{
		try
		
		{
			DefaultHandler g;
			StringBuffer textView;
			
			textView = SaxTool.getXML(Parameter.getStandingUrl());
			g = SaxTool.getHandler(Parameter.STANDINGS, textView);
			DataCenterTool.addDataCenter(((StandingsHandler)g).getStandingsList());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void fillTeam(String teamId)
	{
		try
		
		{
			DefaultHandler g;
			StringBuffer textView;
			
			textView = SaxTool.getXML(Parameter.getTeamProfileUrl(teamId));
			g = SaxTool.getHandler(Parameter.TEAM, textView);
			DataCenterTool.addDataCenter(((TeamHandler)g).getTeams());
			g = SaxTool.getHandler(Parameter.TEAMCOACH, textView);
			DataCenterTool.addDataCenter(((TeamCoachHandler)g).getTeamsCoaches());
			g = SaxTool.getHandler(Parameter.TEAMPLAYER, textView);
			DataCenterTool.addDataCenter(((TeamPlayerHandler)g).getTeamsPlayers());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
