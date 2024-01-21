package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "current_liability")
public class CurrentLiabilities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long currentliabilitiesid;
	
	@Column(name = "account_payable")
	private String accountPayable;
	
	@Column(name = "unearn_revenue")
	private String unearnedRevenue;
	
	@Column(name = "tot_curr_liab")
	private String totalCurrentLiability;
	
	@Column(name = "long_term_lease_liab")
	private String longTermLeaseLiability;
	
	@Column(name = "long_term_dept")
	private String LongTermDept;
	
	@Column(name = "other_long_term_liab")
	private String OtherLongTermliability;
	
    @OneToOne
    @JoinColumn(name = "id", unique = true)
    private ConsolidatedBalancedSheets consolidatedBalancedSheets;
	 
	
	
	
}
