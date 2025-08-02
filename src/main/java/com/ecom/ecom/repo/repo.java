package com.ecom.ecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecom.ecom.entity.Customer;

@Repository
public interface repo extends JpaRepository<Customer, Long>{

}
