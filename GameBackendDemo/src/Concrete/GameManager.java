package Concrete;

import Abstract.GameService;
import Entities.Customer;
import Entities.Game;

public class GameManager implements GameService {


	@Override
	public void sell(Game game,Customer customer) {
		
			System.out.println("Oyunu sat�n ald�n�z:"+game.getName()+"-"+customer.getFirstName());
					
	}




}
