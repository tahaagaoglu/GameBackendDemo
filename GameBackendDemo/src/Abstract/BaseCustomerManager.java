package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{
	
	
	
	@Override
	public void add(Customer customer) {
		System.out.println("Oyuncu kay�d� eklendi "+customer.getFirstName());		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Oyuncu bilgileri g�ncellendi "+customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Oyuncu kay�d� silindi "+customer.getFirstName());
		
	}

}
