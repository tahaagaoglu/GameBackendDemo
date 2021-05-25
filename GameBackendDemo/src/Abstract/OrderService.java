package Abstract;

import Entities.Campaign;
import Entities.Customer;
import Entities.Game;

public interface OrderService {

	void order(Customer customer,Game game,Campaign campaign);
}
