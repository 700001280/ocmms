package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.MaterialInstockDetail;

import com.ocmms.cmms.model.mm.procurement.MaterialProcurementItemDetail;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = MaterialInstockDetailRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface MaterialInstockDetailRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialProcurementItemDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialInstockDetail> findByMaterialProcurementItemDetail(
			MaterialProcurementItemDetail materialProcurementItemDetail, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialInstockDetail> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialInstockDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
