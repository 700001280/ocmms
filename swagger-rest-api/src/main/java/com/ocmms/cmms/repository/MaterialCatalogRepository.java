package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialCatalogRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "materialcatalog", path = "materialcatalog")
public interface MaterialCatalogRepository extends  MaterialCatalogRepositoryCustom,
		PagingAndSortingRepository<MaterialCatalog, Long>  {
	@Query("select u from MaterialCatalog u where u.longDescription like %?1% or u.materialName like %?1% or u.shortDescription like %?1% or u.code like %?1% ")
	List<MaterialCatalog> findByDescription(@Param("desc") String desc);
	
	Optional<MaterialCatalog> findByCode(String code);
	
	
}
