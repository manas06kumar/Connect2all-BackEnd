package com.manas.directory.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.manas.directory.entity.PlaceShopList;

@CrossOrigin("http://localhost:4200")
public interface PlaceShopListRepository extends JpaRepository<PlaceShopList, Long> {
	
	//@Query("")
	Page<PlaceShopList> findByPlaceAndShop(@RequestParam("place_id") Long place_id,@RequestParam("shop_id") Long shop_id,Pageable pageable);
	
	Page<PlaceShopList> findByPlace(@RequestParam("place_id") Long place_id,Pageable pageable);

	
	Page<PlaceShopList> findByShop(@RequestParam("shop_id") Long shop_id,Pageable pageable);


}
