package service;

import java.util.HashMap;
import java.util.Map;

import model.Customer;

public class CustomerService {
	
	private Map<String, Customer> customers;

	public CustomerService() {
		customers = new HashMap<String, Customer>();
		
		addCustomer( new Customer("id001", "Alice", "alice.cbnu.ac.kr"));
		addCustomer( new Customer("id002", "Bob", "bob.cbnu.ac.kr"));
		addCustomer( new Customer("id003", "Charlie", "charlie.cbnu.ac.kr"));
		addCustomer( new Customer("id004", "David", "david.cbnu.ac.kr"));
		addCustomer( new Customer("id005", "Trudy", "Trudy.cbnu.ac.kr"));
	}
	
	public void addCustomer(Customer customer) {
		customers.put(customer.getId(), customer);
	}
	
	public Customer findCustomer(String id) {
		if(id != null)
			return(customers.get(id.toLowerCase()));
		else
			return null;
	}
	

}
