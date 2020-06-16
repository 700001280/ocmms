package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialProcurementItemDetailRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "materialprocurementitemdetail", path = "materialprocurementitemdetail")
public interface MaterialProcurementItemDetailRepository extends  MaterialProcurementItemDetailRepositoryCustom,
		PagingAndSortingRepository<MaterialProcurementItemDetail, Long> {

	public List<MaterialProcurementItemDetail> findByProcurementOrderAndMaterialCatalog(ProcurementOrder procurementOrder,MaterialCatalog materialCatalog);
	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @return Long
	 */
	public abstract long countByMaterialCatalog(MaterialCatalog materialCatalog);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderMaterial
	 * @return Long
	 */
	public abstract long countByWorkOrderMaterial(WorkOrderMaterial workOrderMaterial);
}
