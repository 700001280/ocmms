package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProcurementItemDetailRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "procurementitemdetail", path = "procurementitemdetail")
public interface ProcurementItemDetailRepository extends  ProcurementItemDetailRepositoryCustom,
		PagingAndSortingRepository<ProcurementItemDetail, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param requester
	 * @return Long
	 */
	public abstract long countByRequester(Employee requester);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementRequest
	 * @return Long
	 */
	public abstract long countByProcurementRequest(ProcurementRequest procurementRequest);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrder
	 * @return Long
	 */
	public abstract long countByProcurementOrder(ProcurementOrder procurementOrder);
}
