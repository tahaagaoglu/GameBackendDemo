package GameBackendDemo;

import java.time.LocalDate;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class Main {

	public static void main(String[] args) {

		
		CustomerManager customerManager=new CustomerManager(new MernisServiceAdapter());
		
		Customer customer1=new Customer(1, "Taha", "Ýbrahimaðaoðlu", LocalDate.of(2000, 2, 25), "10000000000");
		Customer customer2=new Customer(2, "Halim", "Karakelle", LocalDate.of(1998, 8, 24), "20000000000");
		
		customerManager.add(customer1);

		customerManager.add(customer2);
		
		GameManager gameManager =new GameManager();
		Game game1=new Game(1, "FÝFA21", 200);
		Game game2= new Game(2, "PES21", 150);
	
		gameManager.sell(game2, customer2);
		gameManager.sell(game1,customer1);
		
		CampaignManager campaignManager=new CampaignManager();
		
		Campaign campaign1 =new Campaign(1, "Yaz Kampanyasi",30);
		Campaign campaign2 =new Campaign(2, "Kýs Kampanyasi", 25);
       
		campaignManager.campaignAdd(campaign1);
		campaignManager.campaignDelete(campaign1);
		campaignManager.campaignDelete(campaign1);
		campaignManager.campaignAdd(campaign2);
		
		OrderManager orderManager=new OrderManager();
		orderManager.order(customer2, game2, campaign1); 
		orderManager.order(customer1, game1, campaign2);
		
		
		
		
		
      
        
        
	}

}
