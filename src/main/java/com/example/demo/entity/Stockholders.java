package com.example.demo.entity;


import jakarta.persistence.*;
import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

@Entity
@Data
@Table(name = "stockholders")
public class Stockholders {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long stockholdersid;
	
	@Column(name = "prefered_stock")
	private String prefferedStock;
	
	@Column(name = "common_stock")
	private String commonStack;
	
	@Column(name = "treasury_stock")
	private String treasuryStock;
	
	@Column(name = "add_paid_in_cap")
	private String addPaidInCapital;
	
	@Column(name = "accum_comp_income")
	private String accumultaiveComprehensiveIncome;
	
	@Column(name = "retain_earnings")
	private String retainedEarnings;
	
	@Column(name = "total_stock_equity")
	private String totalStockEquity;
	
	@Column(name = "total_liab_stock_equity")
	private String totalLiablityStockEquity;
	
	@OneToOne
	@JoinColumn(name = "id",unique = true)
	private ConsolidatedBalancedSheets consolidatedBalancedSheet;
	
}
