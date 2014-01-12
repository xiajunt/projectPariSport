package projetPariSport.tools;

import projetPariSport.parameter.Parameter;
import projetPariSport.structObject.Standings;

public class NbaStatTool {

	public static double getCotation(String teamId)
	{
		int all, win, loss;
		double cot;
		Standings team = (Standings)DataCenterTool.getDataCenter(Parameter.STANDINGS, teamId);
		
		if (team == null)
			return 0;
		win = Integer.decode(team.getTeamWins());
		loss = Integer.decode(team.getTeamLosses());
		all = win + loss;
		cot = (double)loss / (double)all;
		if (cot < 0.1)
			cot = 0.1;
		return cot;
					
	}
	
}
