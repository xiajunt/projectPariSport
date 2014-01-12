package projetPariSport.structObject;

import java.io.Serializable;

import projetPariSport.parameter.Parameter;
import projetPariSport.tools.DataCenterTool;

import com.googlecode.objectify.annotation.Cache;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;

/**
 * Account - Definition of the object Account
 * This object content information about a player
 * 
 * @version 1.0
 *
 * @author XIA Juntie
 * @date 09/12/2013
 *
 */

@SuppressWarnings("serial")
@Entity
@Cache
public class Account implements IDataCenterObject, Serializable {

	private @Index String name;
	private @Id String mail;
	private @Index int token;
	
	public Account()
	{
	}
	
	public Account(String name, String mail)
	{
		this.name = name;
		this.mail = mail;
		this.token = Parameter.begToken;
	}
	
	/*negative parameter for sub*/
	public boolean addToken(int token)
	{
		if ((this.token + token) < 0)
			return false;
		this.token += token;
		DataCenterTool.addDataCenter(this);
		return true;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getMail()
	{
		return mail;
	}
	
	public int getToken()
	{
		return token;
	}
}
