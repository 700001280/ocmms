package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementOrderFinanceTracking;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProcurementOrderFinanceTrackingRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "procurementorderfinancetracking", path = "procurementorderfinancetracking")
public interface ProcurementOrderFinanceTrackingRepository extends  ProcurementOrderFinanceTrackingRepositoryCustom,
		PagingAndSortingRepository<ProcurementOrderFinanceTracking, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrder
	 * @return Long
	 */
	public abstract long countByProcurementOrder(ProcurementOrder procurementOrder);
}
