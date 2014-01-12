package projetPariSport.structObject;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

/**
 * Betting - Object about a bet by a player.
 * This object have a Account for parent and Game for children (Data Store).
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 08/01/2014
 *
 */

@Entity
@Cache
public class Betting implements IDataCenterObject {
	private @Id Long id;
	private int nbrBetToken;
	private String playerMail;
	private @Index boolean end;
	private @Parent Key<Account> parent;
	private boolean win;
	private double cotation;
	
	public Betting()
	{
	}
	
	public Betting(Account ac, int nbrBetToken)
	{
		this.nbrBetToken = nbrBetToken;
		this.playerMail = ac.getMail();
		this.end = false;
		this.parent = Key.create(Account.class, ac.getMail());
	}
	
	public long getId()
	{
		return id;
	}
	
	public int getNbrBetToken()
	{
		return nbrBetToken;
	}
	
	public String getPlayerMail()
	{
		return playerMail;
	}
	
	public void setEnd()
	{
		end = false;
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
	
	public void setCotation(double cotation)
	{
		this.cotation = cotation;
	}
	
	public double getCotation()
	{
		return cotation;
	}
}
