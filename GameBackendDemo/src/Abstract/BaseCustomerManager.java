package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	
	
	
	@Override
	public void add(Customer customer) {
		System.out.println("Oyuncu kayýdý eklendi "+customer.getFirstName());		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Oyuncu bilgileri güncellendi "+customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Oyuncu kayýdý silindi "+customer.getFirstName());
		
	}

}
