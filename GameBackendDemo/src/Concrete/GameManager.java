package Concrete;

import Abstract.GameService;
import Entities.Customer;
import Entities.Game;

public class GameManager implements GameService {


	@Override
	public void sell(Game game,Customer customer) {
		
			System.out.println("Oyunu satýn aldýnýz:"+game.getName()+"-"+customer.getFirstName());
					
	}




}
