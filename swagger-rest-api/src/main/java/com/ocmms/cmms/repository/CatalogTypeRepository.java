package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.CatalogType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = CatalogTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "catalogtype", path = "catalogtype")
public interface CatalogTypeRepository extends  CatalogTypeRepositoryCustom,
		PagingAndSortingRepository<CatalogType, Long>  {
}
