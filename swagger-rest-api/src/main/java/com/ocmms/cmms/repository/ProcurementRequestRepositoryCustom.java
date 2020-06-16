package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;

import com.ocmms.cmms.model.hrm.Employee;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ProcurementRequestRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface ProcurementRequestRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param requester
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementRequest> findByRequester(Employee requester, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementRequest> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProcurementRequest> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
