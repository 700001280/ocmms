package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialAttribute;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialAttributeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "materialattribute", path = "materialattribute")
public interface MaterialAttributeRepository extends  MaterialAttributeRepositoryCustom,
		PagingAndSortingRepository<MaterialAttribute, Long>{

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @return Long
	 */
	public abstract long countByMaterialCatalog(MaterialCatalog materialCatalog);
}
