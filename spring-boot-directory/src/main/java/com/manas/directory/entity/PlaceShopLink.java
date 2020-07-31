package com.manas.directory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="place_shop_link")
@Data
public class PlaceShopLink {
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			@Column(name = "id")
			private Long id;
			
			@ManyToOne
			@JoinColumn(name = "place_id", nullable = false)
			private PlaceCategory place;
			
			@Column(name="shop_group")
			private String shop_group;
			
			@Column(name="shop_id")
			private String shop_id;
	
	
}
