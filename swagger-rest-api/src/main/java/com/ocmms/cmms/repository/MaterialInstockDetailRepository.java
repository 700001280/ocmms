package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;
import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialInstockDetailRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "materialinstockdetail", path = "materialinstockdetail")
public interface MaterialInstockDetailRepository extends  MaterialInstockDetailRepositoryCustom,
		PagingAndSortingRepository<MaterialInstockDetail, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialProcurementItemDetail
	 * @return Long
	 */
	public abstract long countByMaterialProcurementItemDetail(
			MaterialProcurementItemDetail materialProcurementItemDetail);
}
