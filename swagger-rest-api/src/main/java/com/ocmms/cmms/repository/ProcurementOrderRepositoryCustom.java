package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ProcurementOrderRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface ProcurementOrderRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementOrder> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementOrder> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
