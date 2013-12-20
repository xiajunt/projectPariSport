package projetPariSport.dataCenterTool;

import static com.googlecode.objectify.ObjectifyService.ofy;

import java.util.List;

import projetPariSport.parameter.Parameter;
import projetPariSport.structObject.Account;
import projetPariSport.structObject.IDataCenterObject;
import projetPariSport.structObject.Schedule;

import com.googlecode.objectify.ObjectifyService;

public class DataCenterTool {
	
	static {
		ObjectifyService.register(Account.class);
		ObjectifyService.register(Schedule.class);
	}
	
	public static void addDataCenter(IDataCenterObject obj) {
		ObjectifyService.ofy();
		ofy().save().entity(obj).now();
	}
	
	public static <T extends IDataCenterObject> void addDataCenter(List<T> list) {
		
		ObjectifyService.ofy();
		ofy().save().entities(list).now();
	}
	
	public static IDataCenterObject getDataCenter(int type, String id) {
		ObjectifyService.ofy();
		switch (type)
		{
			case Parameter.SCHEDULE:
				return ofy().load().type(Schedule.class).id(id).now();
			default:
				return null;
				
		}
	}

}
