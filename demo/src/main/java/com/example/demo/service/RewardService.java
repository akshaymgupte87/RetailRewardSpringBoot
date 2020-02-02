package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.controller.CustomerRepository;
import com.example.demo.model.Customer;
import com.example.demo.model.Transaction;

@Service
public class RewardService {
	@Autowired
	private CustomerRepository customerRepository;
		
	public List<Customer> getCustomers() {
		List<Customer> customers = processCustomers();
		return customers;
	}
	
	public List<Customer> processCustomers() {
		
		List<Customer> customers = new ArrayList<Customer>();
		
			List <Customer> cust = customerRepository.findAll();
			for(int j=0; j<cust.size();j++) {
				Long rewardPoints1 = 0l;
				Long rewardPoints2 = 0l;
				Long rewardPoints3 = 0l;
				List<Transaction> t = cust.get(j).getTransactions();
				for (int k =0;k<t.size();k++) {
					if ((t.get(k).getMonth().equalsIgnoreCase("Month1"))){
						int transactionAmount;
						transactionAmount = t.get(k).getAmount();
						if(transactionAmount > 100) {
							rewardPoints1 = rewardPoints1 + ((2 * (transactionAmount-100))+ (1 * 50));
						} else if (transactionAmount > 50 && transactionAmount <=100) {
							rewardPoints1 = rewardPoints1 + (1*(transactionAmount - 50));
						} 
						
						
					}
					if ((t.get(k).getMonth().equalsIgnoreCase("Month2"))){
						int transactionAmount;
						transactionAmount = t.get(k).getAmount();
						if(transactionAmount > 100) {
							rewardPoints2 = rewardPoints2 + ((2 * (transactionAmount-100))+ (1 * 50));
						} else if (transactionAmount > 50 && transactionAmount <=100) {
							rewardPoints2 = rewardPoints2 + (1*(transactionAmount - 50));
						} 
						
					}
					if ((t.get(k).getMonth().equalsIgnoreCase("Month3"))){
						int transactionAmount;
						transactionAmount = t.get(k).getAmount();
						if(transactionAmount > 100) {
							rewardPoints3 = rewardPoints3 + ((2 * (transactionAmount-100))+ (1 * 50));
						} else if (transactionAmount > 50 && transactionAmount <=100) {
							rewardPoints3 = rewardPoints3 + (1*(transactionAmount - 50));
						} 
						
					}
				}

				cust.get(j).setRewardPointsMonth1(rewardPoints1);
				cust.get(j).setRewardPointsMonth2(rewardPoints2);
				cust.get(j).setRewardPointsMonth3(rewardPoints3);
				cust.get(j).setTotalRewardPoints(rewardPoints1 + rewardPoints2 + rewardPoints3);
				customers.add(cust.get(j));
			}
			
		
		return customers;
	}
	
	public Optional<Customer> getCustomerById(Integer customerId) {
		return customerRepository.findById(customerId);
	}

}
