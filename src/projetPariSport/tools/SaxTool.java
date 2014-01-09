package projetPariSport.tools;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStreamReader;
import java.net.URL;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

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
 * SaxTool - A class with static method for handling the xml from SportsDataLLC's api
 * with url fetch
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 05/01/2014
 *
 */

public class SaxTool
{
	public static StringBuffer getXML(String apiUrl) throws Exception
	{
		StringBuffer textView = new StringBuffer();
        
        URL url = new URL(apiUrl);
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String line;
        	
        while ((line = reader.readLine()) != null) {
        	textView.append(line);
        }
        reader.close();
        return textView;
	}
	
	public static DefaultHandler getHandler(int type, StringBuffer textView) throws Exception
	{
		
        
        SAXParserFactory f = SAXParserFactory.newInstance();
        SAXParser p;
		
		p = f.newSAXParser();
		DefaultHandler g;
		switch (type)
		{
			case Parameter.GAMESCOREBOX:
				g = new GameScoreBoxHandler();
				break;
			case Parameter.GAMESCOREBOXPLAYER:
				g = new GameScoreBoxPlayerHandler();
				break;
			case Parameter.GAMESUMMARY:
				g = new GameSummaryHandler();
				break;
			case Parameter.GAMESUMMARYPLAYER:
				g = new GameSummaryPlayerHandler();
				break;
			case Parameter.INJURY:
				g = new InjuryHandler();
				break;
			case Parameter.LEAGUEHIERARCHY:
				g = new LeagueHierarchyHandler();
				break;
			case Parameter.SCHEDULE:
				g = new ScheduleHandler();
				break;
			case Parameter.STANDINGS:
				g = new StandingsHandler();
				break;
			case Parameter.TEAM:
				g = new TeamHandler();
				break;
			case Parameter.TEAMCOACH:
				g = new TeamCoachHandler();
				break;
			case Parameter.TEAMPLAYER:
				g = new TeamPlayerHandler();
				break;
			default:
				g = null;
				break;
		}
		
		p.parse(new ByteArrayInputStream(textView.toString().getBytes()), g);
			
		return g;
	}
}
