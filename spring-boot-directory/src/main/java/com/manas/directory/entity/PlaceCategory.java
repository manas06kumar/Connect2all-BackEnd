package com.manas.directory.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "place")
@Data
public class PlaceCategory {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name = "place_name")
	private String name;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "shop_group")
	private Set<Shop> shop;
	
	

}
