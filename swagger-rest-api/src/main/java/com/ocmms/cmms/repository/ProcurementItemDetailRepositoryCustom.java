package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementItemDetail;

import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.mm.procurement.ProcurementOrder;
import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ProcurementItemDetailRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface ProcurementItemDetailRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param requester
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementItemDetail> findByRequester(Employee requester, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementRequest
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementItemDetail> findByProcurementRequest(ProcurementRequest procurementRequest,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementItemDetail> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param procurementOrder
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementItemDetail> findByProcurementOrder(ProcurementOrder procurementOrder,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementItemDetail> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementItemDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
