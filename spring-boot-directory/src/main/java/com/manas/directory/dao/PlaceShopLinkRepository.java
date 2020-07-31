package com.manas.directory.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.manas.directory.entity.PlaceShopLink;

@CrossOrigin("http://localhost:4200")
public interface PlaceShopLinkRepository  extends JpaRepository<PlaceShopLink, Long> { 
	
	Page<PlaceShopLink> findByPlaceId(@RequestParam("id") Long id,Pageable pageable);
}
