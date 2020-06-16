package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.PurchaseExpedite;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PurchaseExpediteRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "purchaseexpedite", path = "purchaseexpedite")
public interface PurchaseExpediteRepository extends  PurchaseExpediteRepositoryCustom,
		PagingAndSortingRepository<PurchaseExpedite, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrder
	 * @return Long
	 */
	public abstract long countByProcurementOrder(ProcurementOrder procurementOrder);
}
