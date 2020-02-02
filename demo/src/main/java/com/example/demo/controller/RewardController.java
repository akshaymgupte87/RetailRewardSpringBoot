package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.RewardService;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class RewardController {
	
	@Autowired
	private RewardService rewardService;
	
	@GetMapping("/customers")
	public List<Customer> findCustomerAll() {
		return rewardService.getCustomers();
	}

}
