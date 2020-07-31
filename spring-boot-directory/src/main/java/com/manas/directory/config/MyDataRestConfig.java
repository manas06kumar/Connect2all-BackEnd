package com.manas.directory.config;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import com.manas.directory.entity.PlaceCategory;
import com.manas.directory.entity.PlaceShopList;
import com.manas.directory.entity.Shop;

@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer{
	
	private EntityManager entityManager;
	
	@Autowired
	public MyDataRestConfig(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		
		HttpMethod[] theUnsupportedActions = {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
		
		config.getExposureConfiguration().forDomainType(PlaceCategory.class)
		.withItemExposure((metdata,httpMethods) ->httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata,httpMethods)->httpMethods.disable(theUnsupportedActions));
		
		config.getExposureConfiguration().forDomainType(Shop.class)
		.withItemExposure((metdata,httpMethods) ->httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata,httpMethods)->httpMethods.disable(theUnsupportedActions));
	
		config.getExposureConfiguration().forDomainType(PlaceShopList.class)
		.withItemExposure((metdata,httpMethods) ->httpMethods.disable(theUnsupportedActions))
		.withCollectionExposure((metdata,httpMethods)->httpMethods.disable(theUnsupportedActions));
	
		// call internal helper method to expose the ids
		exposeIds(config);
	}


	private void exposeIds(RepositoryRestConfiguration config) {
		
		//get a list of entity classes from entity manager
		Set<EntityType<?>> entities = entityManager.getMetamodel().getEntities();
		
		//creating array list of those entity type
		List<Class> entityClasses = new ArrayList<>();
		
		//get entity types for the entities
		for(EntityType tempEntityType: entities) {
			entityClasses.add(tempEntityType.getJavaType());
			
			//expose 
			Class[] domainTypes = entityClasses.toArray(new Class[0]);
			config.exposeIdsFor(domainTypes);
		}
		
	}

}

