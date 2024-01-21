package com.example.demo.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "profitandloss")
public class ProfitAndLoss {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long Id;
	
	@Column(name = "sample") 
	private String sample;
	 
	@Column(name = "line_item")
	private String lineItem;
	
	@Column(name = "value_or_per")
	private String valueOrPer;
	
	@OneToOne(mappedBy = "profitandloss",cascade = CascadeType.ALL, orphanRemoval = true)
	private Sales sales;
	
	@OneToOne(mappedBy = "profitandloss",cascade = CascadeType.ALL, orphanRemoval = true )
	private Ratios ratios;
	
	
	
	
	
	
	
}
