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
@Table(name = "consolidatedbalancedsheets")
public class ConsolidatedBalancedSheets {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "console_id")
	private long id;
	
	@Column(name = "sample")
	private String sample;
	
	@Column(name = "line_item")
	private String lineItem;
	
	@Column(name = "value_or_per")
	private String valueOrPer;

	@OneToOne(mappedBy = "consolidatedBalancedSheets",cascade = CascadeType.ALL, orphanRemoval = true )
	private CurrentAssets currrentAssetsId;

	@OneToOne(mappedBy = "consolidatedBalancedSheets",cascade = CascadeType.ALL, orphanRemoval = true )
	private Stockholders stockHoldersId;

	@OneToOne(mappedBy = "consolidatedBalancedSheets",cascade = CascadeType.ALL, orphanRemoval = true )
	private CurrentLiabilities currentLiabilityId;


}
