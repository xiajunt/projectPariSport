package projetPariSport.structObject;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;


/**
 * Game - Object about a game the player have bet.
 * This object have a Betting for parent(Data Store).
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 08/01/2014
 *
 */

@Entity
@Cache
public class Game implements IDataCenterObject {
	private @Id Long id;
	private @Index String gameId;
	private String betTeamId;
	private double cotation;
	private @Index long bettingId;
	private @Index boolean end;
	private boolean win;
	
	public Game()
	{
	}
	
	public Game(String gameId, String betTeamId, double cotation, Betting bet)
	{
		this.gameId = gameId;
		this.betTeamId = betTeamId;
		this.cotation = cotation;
		this.bettingId = bet.getId();
		this.end = false;
	}
	
	public Long getId()
	{
		return id;
	}
	
	public String getGameId()
	{
		return gameId;
	}
	
	public String getBetTeamId()
	{
		return betTeamId;
	}
	
	public double getCotation()
	{
		return cotation;
	}
	
	public void setEnd()
	{
		end = true;
	}
	
	public boolean getEnd()
	{
		return end;
	}
	
	public void setWin(boolean win)
	{
		this.win = win;
	}
	
	public boolean getWin()
	{
		return win;
	}
	
	public long getBettingId()
	{
		return bettingId;
	}
}
