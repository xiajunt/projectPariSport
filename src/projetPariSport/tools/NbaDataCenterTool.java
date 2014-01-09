package projetPariSport.tools;

import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.parameter.Parameter;
import projetPariSport.saxHandler.GameScoreBoxHandler;
import projetPariSport.saxHandler.GameScoreBoxPlayerHandler;
import projetPariSport.saxHandler.GameSummaryHandler;
import projetPariSport.saxHandler.GameSummaryPlayerHandler;
import projetPariSport.saxHandler.InjuryHandler;

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
			DataCenterTool.addDataCenter(((InjuryHandler)g).getInjuries());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
}
