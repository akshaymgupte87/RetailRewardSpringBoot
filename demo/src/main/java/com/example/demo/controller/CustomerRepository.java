package com.example.demo.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{
	
	@Query("select distinct c.cust_id from Customer c")
    List<Integer> getAllCustomerIds();
	
	@Query("select c from Customer c where c.cust_id = ?1")
	List<Customer> getAllByCustomerId(Integer custId);

}
