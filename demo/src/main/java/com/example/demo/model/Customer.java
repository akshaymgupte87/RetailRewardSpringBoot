package com.example.demo.model;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonInclude;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	//@Column(name = "ID")
	private Integer id;
	
	@Column(name = "cust_id")
	//@JsonInclude
	//@Transient
	private Integer cust_id;
	
	
	@OneToMany(mappedBy="cust_id", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Transaction> transactions;
	
	@JsonInclude
	@Transient
	private Long rewardPointsMonth1;
	
	@JsonInclude
	@Transient
	private Long rewardPointsMonth2;
	
	@JsonInclude
	@Transient
	private Long rewardPointsMonth3;
	
	@JsonInclude
	@Transient
	private Long totalRewardPoints;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getCust_id() {
		return cust_id;
	}

	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

	public Long getRewardPointsMonth1() {
		return rewardPointsMonth1;
	}

	public void setRewardPointsMonth1(Long rewardPointsMonth1) {
		this.rewardPointsMonth1 = rewardPointsMonth1;
	}

	public Long getRewardPointsMonth2() {
		return rewardPointsMonth2;
	}

	public void setRewardPointsMonth2(Long rewardPointsMonth2) {
		this.rewardPointsMonth2 = rewardPointsMonth2;
	}

	public Long getRewardPointsMonth3() {
		return rewardPointsMonth3;
	}

	public void setRewardPointsMonth3(Long rewardPointsMonth3) {
		this.rewardPointsMonth3 = rewardPointsMonth3;
	}

	public Long getTotalRewardPoints() {
		return totalRewardPoints;
	}

	public void setTotalRewardPoints(Long totalRewardPoints) {
		this.totalRewardPoints = totalRewardPoints;
	}
	
	
	
}
