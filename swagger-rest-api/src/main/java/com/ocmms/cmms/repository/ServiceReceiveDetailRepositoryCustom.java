package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;

import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ServiceReceiveDetailRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface ServiceReceiveDetailRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceProcurementItemDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ServiceReceiveDetail> findByServiceProcurementItemDetail(
			ServiceProcurementItemDetail serviceProcurementItemDetail, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ServiceReceiveDetail> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ServiceReceiveDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
