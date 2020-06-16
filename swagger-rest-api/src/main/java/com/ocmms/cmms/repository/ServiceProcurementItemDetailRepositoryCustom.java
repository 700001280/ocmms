package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;

import com.ocmms.cmms.model.mm.master.ServiceCatalog;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ServiceProcurementItemDetailRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface ServiceProcurementItemDetailRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ServiceProcurementItemDetail> findByServiceCatalog(ServiceCatalog serviceCatalog,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ServiceProcurementItemDetail> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ServiceProcurementItemDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
