package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = MaterialProcurementItemDetailRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface MaterialProcurementItemDetailRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialProcurementItemDetail> findByMaterialCatalog(MaterialCatalog materialCatalog,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderMaterial
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialProcurementItemDetail> findByWorkOrderMaterial(WorkOrderMaterial workOrderMaterial,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialProcurementItemDetail> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialProcurementItemDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
