package projetPariSport.tools;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import projetPariSport.structObject.Account;

public class SendMail {
	
	public static void sendMail(String message, Account ac) throws Exception
	{
		 Properties props = new Properties();
         Session session = Session.getDefaultInstance(props, null);
         
         Message msg = new MimeMessage(session);
         msg.setFrom(new InternetAddress("autobot@projetparisport.com", "AutoBot"));
         msg.addRecipient(Message.RecipientType.TO,
                          new InternetAddress(ac.getMail(), ac.getName()));
         msg.setSubject("Resultat de votre pari");
         msg.setText(message);
         Transport.send(msg);
	}

}
