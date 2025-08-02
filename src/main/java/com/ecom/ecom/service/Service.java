package com.ecom.ecom.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecom.ecom.entity.Customer;
import com.ecom.ecom.repo.repo;




@org.springframework.stereotype.Service
public class Service {

	@Autowired
	private repo repo;

	public Customer updateCustomer(long id, Customer updatedCustomer) {

		Customer customer = repo.findById(id).orElseThrow(() -> new RuntimeException("customer not found"));

		customer.setName(updatedCustomer.getName());

		customer.setEmail(updatedCustomer.getEmail());

		customer.setPhone(updatedCustomer.getPhone());
		customer.setDate(updatedCustomer.getDate());

		return repo.save(customer);
	}

	public Customer saveCustomer(Customer customer) {

		return repo.save(customer);
	}

	public Customer fetchCustomer(long id) {
		Customer customer = repo.findById(id).orElseThrow( ()-> new RuntimeException("Customer not found"));
		return customer;
	}
	
	public void  deleteCustomer(long id) {
		repo.deleteById(id);
	}

	
	
	
}
