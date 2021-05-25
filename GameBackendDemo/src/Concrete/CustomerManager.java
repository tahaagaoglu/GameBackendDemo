package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager extends BaseCustomerManager {

	private CustomerCheckService _customerCheckService;
	
	
	public CustomerManager(CustomerCheckService customerCheckService) {

		_customerCheckService=customerCheckService;
	}
	
	 @Override
		public void add(Customer customer) {
			 
			 if(_customerCheckService.CheckIfRealPerson(customer))
				 
			 {
				 super.add(customer);
			 }
			 
			 
			 else {
				 System.out.println("Not a valid person");
				 }
			
		}

	

}
