package com.manas.directory.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.manas.directory.entity.Shop;

@CrossOrigin("http://localhost:4200")
public interface ShopRepository extends JpaRepository<Shop, Long>{
	
	Page<Shop> findById(@RequestParam("id") Long id,Pageable pageable);

}
