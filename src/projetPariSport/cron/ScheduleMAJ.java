package projetPariSport.cron;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.parameter.Parameter;
import projetPariSport.saxHandler.GameSummaryPlayerHandler;
import projetPariSport.tools.DataCenterTool;
import projetPariSport.tools.SaxTool;

/**
 * ScheduleMAJ - Servlet for update the schedule about NBA match on datastore
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 09/12/2013
 *
 */

@SuppressWarnings("serial")
public class ScheduleMAJ extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
        try {
        	DefaultHandler g;
        	/*String url = Parameter.getLeagueHierarchyUrl();*/
        	/*DefaultHandler g = SaxTool.getHandler(Parameter.GAMESCOREBOX, Parameter.getGameScoreBoxUrl("0093cdf6-6529-4074-a72d-03d9f2af7cab"));
			DataCenterTool.addDataCenter(((GameScoreBoxHandler)g).getGameScoreBoxes());
			g = SaxTool.getHandler(Parameter.GAMESCOREBOXPLAYER, Parameter.getGameScoreBoxUrl("0093cdf6-6529-4074-a72d-03d9f2af7cab"));
			DataCenterTool.addDataCenter(((GameScoreBoxPlayerHandler)g).getGameScoreBoxPlayer());
			g = SaxTool.getHandler(Parameter.GAMESUMMARY, Parameter.getGameSummaryUrl("0093cdf6-6529-4074-a72d-03d9f2af7cab"));
			DataCenterTool.addDataCenter(((GameSummaryHandler)g).getGameSummary());*/
			g = SaxTool.getHandler(Parameter.GAMESUMMARYPLAYER, Parameter.getGameSummaryUrl("0093cdf6-6529-4074-a72d-03d9f2af7cab"));
			DataCenterTool.addDataCenter(((GameSummaryPlayerHandler)g).getGameSummary());
			/*g = SaxTool.getHandler(Parameter.INJURY, Parameter.getInjuriesUrl());
			DataCenterTool.addDataCenter(((InjuryHandler)g).getInjuries());
			g = SaxTool.getHandler(Parameter.LEAGUEHIERARCHY, Parameter.getLeagueHierarchyUrl());
			DataCenterTool.addDataCenter(((LeagueHierarchyHandler)g).getLeagueHierarchies());
			g = SaxTool.getHandler(Parameter.SCHEDULE, Parameter.getScheduleUrl());
			DataCenterTool.addDataCenter(((ScheduleHandler)g).getSeasonSchedule());
			g = SaxTool.getHandler(Parameter.STANDINGS, Parameter.getStandingUrl());
			DataCenterTool.addDataCenter(((StandingsHandler)g).getStandingsList());
			g = SaxTool.getHandler(Parameter.TEAM, Parameter.getTeamProfileUrl("583ecb8f-fb46-11e1-82cb-f4ce4684ea4c"));
			DataCenterTool.addDataCenter(((TeamHandler)g).getTeams());*
			g = SaxTool.getHandler(Parameter.TEAMPLAYER, Parameter.getTeamProfileUrl("583ecb8f-fb46-11e1-82cb-f4ce4684ea4c"));
			DataCenterTool.addDataCenter(((TeamPlayerHandler)g).getTeamsCoaches());
			g = SaxTool.getHandler(Parameter.TEAMCOACH, Parameter.getTeamProfileUrl("583ecb8f-fb46-11e1-82cb-f4ce4684ea4c"));
			DataCenterTool.addDataCenter(((TeamCoachHandler)g).getTeamsCoaches());*/
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
