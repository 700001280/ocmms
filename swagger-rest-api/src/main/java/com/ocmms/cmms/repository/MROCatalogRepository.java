package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.mm.master.MROCatalog;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MROCatalogRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "mrocatalog", path = "mrocatalog")
public interface MROCatalogRepository extends  MROCatalogRepositoryCustom,
		PagingAndSortingRepository<MROCatalog, Long>  {
}
