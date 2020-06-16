package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.configuration.ProductType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProductTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "producttype", path = "producttype")
public interface ProductTypeRepository extends  ProductTypeRepositoryCustom,
		PagingAndSortingRepository<ProductType, Long> {
}
