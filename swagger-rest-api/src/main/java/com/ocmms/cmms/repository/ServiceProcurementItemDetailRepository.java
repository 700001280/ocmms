package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import com.ocmms.cmms.model.mm.master.ServiceCatalog;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ServiceProcurementItemDetailRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "serviceprocurementitemdetail", path = "serviceprocurementitemdetail")
public interface ServiceProcurementItemDetailRepository extends  ServiceProcurementItemDetailRepositoryCustom,
		PagingAndSortingRepository<ServiceProcurementItemDetail, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceCatalog
	 * @return Long
	 */
	public abstract long countByServiceCatalog(ServiceCatalog serviceCatalog);
}
