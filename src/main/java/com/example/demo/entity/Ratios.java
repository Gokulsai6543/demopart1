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
@Table(name = "ratios")
public class Ratios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int ratio_id;
	
	@Column(name ="divided_payout")
	private String dividedPayout;
	
	@Column(name = "opm")
	private String opm;
	
	@OneToOne
	@JoinColumn(name = "id",unique = true)
	private ProfitAndLoss profitAndLoss;
}
