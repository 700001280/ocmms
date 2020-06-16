package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import com.ocmms.cmms.model.hrm.Employee;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProcurementRequestRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "procurementrequest", path = "procurementrequest")
public interface ProcurementRequestRepository extends  ProcurementRequestRepositoryCustom,
		PagingAndSortingRepository<ProcurementRequest, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param requester
	 * @return Long
	 */
	public abstract long countByRequester(Employee requester);
}
