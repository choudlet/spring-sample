package com.pluralsight.repository;

import java.util.List;
import java.util.ArrayList;

import com.pluralsight.model.Customer;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.pluralsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();
		
		Customer customer = new Customer();
		
		customer.setFirstName("Chris");
		customer.setLastName("Houdlette");
		
		customers.add(customer);
		
		return customers;
	}
}
