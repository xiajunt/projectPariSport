package projetPariSport.cron;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.parameter.Parameter;
import projetPariSport.saxHandler.ScheduleHandler;
import projetPariSport.tools.DataCenterTool;
import projetPariSport.tools.SaxTool;

@SuppressWarnings("serial")
public class ScheduleMAJ extends HttpServlet {

	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
        
        try {
        	
        	/*StringBuffer textView = new StringBuffer();
            
            URL url = new URL(Parameter.getScheduleUrl());
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
            String line;
            	
            while ((line = reader.readLine()) != null) {
            	textView.append(line);
            }
            reader.close();
            
            SAXParserFactory f = SAXParserFactory.newInstance();
            SAXParser p;
    		
    		p = f.newSAXParser();
    		DefaultHandler g = new ScheduleHandler();
    		
    		p.parse(new ByteArrayInputStream(textView.toString().getBytes()), g);*/
        	
        	DefaultHandler g = SaxTool.getHandler(Parameter.SCHEDULE, Parameter.getScheduleUrl());
			DataCenterTool.addDataCenter(((ScheduleHandler)g).getSeasonSchedule());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
