package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = BillOfMaterialRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "billofmaterial", path = "billofmaterial")
public interface BillOfMaterialRepository extends  BillOfMaterialRepositoryCustom,
		PagingAndSortingRepository<BillOfMaterial, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObjects
	 * @return Long
	 */
	public abstract long countByTechnicalObjectsContains(TechnicalObject technicalObjects);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param bomComponent
	 * @return Long
	 */
	public abstract long countByBomComponent(MaterialCatalog bomComponent);
}
