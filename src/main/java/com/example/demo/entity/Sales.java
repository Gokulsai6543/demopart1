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
@Table(name = "sales")
public class Sales {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long sale_id;
	
	@Column(name = "sale")
	private String sale;
	
	@Column(name = "expense")
	private String expense;
	
	@Column(name = "operating_profit")
	private String operatingProfit;
	
	@Column(name = "otherIncome")
	private String otherincome;
	
	@Column(name = "deprecation")
	private String deprecation;
	
	@Column(name = "intrest")
	private String intrest;
	
	@Column(name = "profit_before_tax")
	private String profitBeforeTax;
	
	@Column(name = "tax")
	private String tax;
	
	@Column(name = "net_profit")
	private String netProfit;
	
	@Column(name = "eps")
	private String eps;
	
	@Column(name = "price_to_earning")
	private String priceToEarning;
	
	@Column(name = "price")
	private String price;
	
	@OneToOne
	@JoinColumn(name="id")
	private ProfitAndLoss profitandloss;
	
}
