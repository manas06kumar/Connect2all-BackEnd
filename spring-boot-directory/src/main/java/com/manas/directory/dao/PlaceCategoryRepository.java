package com.manas.directory.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.manas.directory.entity.PlaceCategory;

@CrossOrigin("http://localhost:4200")
@RepositoryRestResource(collectionResourceRel = "placeCategory", path = "places")
public interface PlaceCategoryRepository extends JpaRepository<PlaceCategory, Long> {
	
	Page<PlaceCategory> findById(@RequestParam("id") Long id,Pageable pageable);

}
