package com.hr.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "locations")
@NoArgsConstructor
@AllArgsConstructor
@Getter @Setter
@ToString
public class Locations {
	
	@Id
	@Column(name = "location_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "street_address")
	private String streetAddress;
	
	@Column(name = "postal_code")
	private int postalCode;
	
	@Column(name = "city")
	private String city;
	
	@Column(name = "state_province")
	private String stateProvince;
	
	@ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH,CascadeType.PERSIST})
	@JoinColumn(name = "country_id")
	private Countries country;
}
