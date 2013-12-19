package projetPariSport.dataCenterTool;

import static com.googlecode.objectify.ObjectifyService.ofy;
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
	
	public static <V> IDataCenterObject getDataCenter(Class<V> a, String id) {
		ObjectifyService.ofy();
		return ofy().load().type(a).id(id).now();
	}

}
