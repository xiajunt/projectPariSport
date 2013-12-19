package projetPariSport.structObject;

import projetPariSport.parameter.Parameter;
import com.googlecode.objectify.annotation.*;


@Entity
@Cache
public class Account implements IDataCenterObject {

	private String name;
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
