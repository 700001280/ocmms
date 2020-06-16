package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.ServiceCatalog;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ServiceCatalogRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "servicecatalog", path = "servicecatalog")
public interface ServiceCatalogRepository extends  ServiceCatalogRepositoryCustom,
		PagingAndSortingRepository<ServiceCatalog, Long>  {
}
