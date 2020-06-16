package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;

import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ProcurementOrderFinanceTrackingRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface ProcurementOrderFinanceTrackingRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrder
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementOrderFinanceTracking> findByProcurementOrder(ProcurementOrder procurementOrder,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementOrderFinanceTracking> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementOrderFinanceTracking> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
