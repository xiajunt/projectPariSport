package projetPariSport.cron;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import projetPariSport.parameter.Parameter;
import projetPariSport.structObject.Account;
import projetPariSport.structObject.Betting;
import projetPariSport.structObject.Game;
import projetPariSport.tools.DataCenterTool;

@SuppressWarnings("serial")
public class Test extends HttpServlet {
        @Override
        public void doGet(HttpServletRequest req, HttpServletResponse resp)
                        throws IOException {
            try
            {
                    /*Map<String, String> map = new HashMap<String, String>();
                    map.put("001eaa7b-4a2d-4077-b590-1f288a42a8a2", "583ec5fd-fb46-11e1-82cb-f4ce4684ea4c");
                    map.put("0032b928-e851-45ad-bbe4-68d391e27229", "583eccfa-fb46-11e1-82cb-f4ce4684ea4c");
                    map.put("00542258-5ca7-4ca4-bff3-70ccd7fd7789", "583ec87d-fb46-11e1-82cb-f4ce4684ea4c");
                    map.put("0092085f-1083-4d75-821e-fbde5d5fabe6", "583ecd4f-fb46-11e1-82cb-f4ce4684ea4c");*/
                    Account ac = (Account)DataCenterTool.getDataCenter(Parameter.ACCOUNT, "xiajunt@gmail.com");
                    
//                    DataCenterTool.putBet(map, ac, 500);
                    List<Betting> l = DataCenterTool.getNewBetting(ac);
                    for (Betting b : l)
                    {
                            System.out.println("Betting id : " + b.getId());
                            List<Game> lg = DataCenterTool.getDataCenterBettingGame(b);
                            System.out.println(lg.size());
                            for (Game g : lg)
                                    System.out.println("Game id : " + g.getId());
                    }
            }
            catch (Exception e)
            {
                    e.printStackTrace();
            }
        }
}