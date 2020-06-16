package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = BillOfMaterialRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface BillOfMaterialRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObjects
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<BillOfMaterial> findByTechnicalObjectsContains(TechnicalObject technicalObjects,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param bomComponent
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<BillOfMaterial> findByBomComponent(MaterialCatalog bomComponent, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<BillOfMaterial> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<BillOfMaterial> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
