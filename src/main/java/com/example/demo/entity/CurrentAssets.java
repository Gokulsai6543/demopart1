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
@Table(name = "current_assets")
public class CurrentAssets {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long current_assets_id;
	
	@Column(name = "cash_and_casheq")
	private String cashAndCasheq;
	
	@Column(name = "inventories")
	private String inventories;
	
	@Column(name = "acc_rec_net_other")
	private String accountRecivableNetAndOther;
	
	@Column(name = "tot_curr_assets")
	private String totalCurrentAsserts;
	
	@Column(name = "prop_and_equip")
	private String propertyAndEquipment;
	
	@Column(name = "operat_leases")
	private String operatingLeases;
	
	@Column(name = "good_will")
	private String goodWill;
	
	@Column(name = "other_asset")
	private String otherAssets;
	
	@Column(name = "total_assets")
	private String totalAssets;
	

	@OneToOne
	@JoinColumn(name = "id",unique = true)
	private ConsolidatedBalancedSheets consolidatedBalancedSheet;
	

}
