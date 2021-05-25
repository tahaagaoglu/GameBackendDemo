package Concrete;

import Abstract.OrderService;
import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public class OrderManager implements OrderService {

	@Override
	public void order(Customer customer, Game game, Campaign campaign) {

		double price =game.getPrice()-(campaign.getDiscountRate()*game.getPrice()/100);
		
		System.out.println(customer.getFirstName()+" "+ game.getName()+" Oyununu satin aldi "+" Kampanyali fiyati :"+price);
		
	}

}
