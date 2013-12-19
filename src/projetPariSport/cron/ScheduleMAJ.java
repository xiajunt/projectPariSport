package projetPariSport.cron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.xml.sax.helpers.DefaultHandler;

import projetPariSport.parameter.Parameter;
import projetPariSport.saxHandler.ScheduleHandler;

@SuppressWarnings({ "serial", "deprecation"})
public class ScheduleMAJ extends HttpServlet {

	private HttpClient client;

	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		client = new DefaultHttpClient();
        StringBuffer textView = new StringBuffer();
        HttpGet request1 = new HttpGet(Parameter.apiUrl);
        HttpResponse response1 = client.execute(request1);

        // Get the response
        BufferedReader rd = new BufferedReader (new InputStreamReader(response1.getEntity().getContent()));
        String line = "";
        while ((line = rd.readLine()) != null) {
		  textView.append(line);
        }
        rd.close();
        
        SAXParserFactory f = SAXParserFactory.newInstance();
		SAXParser p;
		try {
			p = f.newSAXParser();
			DefaultHandler g = new ScheduleHandler();
			p.parse(textView.toString(), g);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
