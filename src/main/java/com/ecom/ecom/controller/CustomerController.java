package com.ecom.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.ecom.entity.Customer;
import com.ecom.ecom.service.Service;

@RestController
@RequestMapping("/api")
public class CustomerController {

	@Autowired
	private Service service;

	@PostMapping
	public Customer registerCustomer(@RequestBody Customer customer) {

		return service.saveCustomer(customer);
	}

	@PostMapping("/{id}")
	public Customer getCustomer(@PathVariable long id) {

		return service.fetchCustomer(id);
	}

	@PutMapping("/{id}")
	public Customer updateCustomer(@PathVariable long id, @RequestBody Customer customer)

	{
		return service.updateCustomer(id, customer);

	}

}
