package com.manas.directory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


import lombok.Data;

@Entity
@Table(name = "place_shop_list")
@Data
public class PlaceShopList {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	@Column(name="detail_id")
	private Long id;
	
	@Column(name = "place_id")
	private Long place; 
	
	@Column(name = "shop_id")
	private Long shop;
	
	@Column(name="shop_name")
	private String shop_name;
	
	@Column(name="shop_website")
	private String shop_website;
	
	@Column(name="shop_contact")
	private String shop_contact;
	

}
