package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ServiceReceiveDetailRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "servicereceivedetail", path = "servicereceivedetail")
public interface ServiceReceiveDetailRepository extends  ServiceReceiveDetailRepositoryCustom,
		PagingAndSortingRepository<ServiceReceiveDetail, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceProcurementItemDetail
	 * @return Long
	 */
	public abstract long countByServiceProcurementItemDetail(ServiceProcurementItemDetail serviceProcurementItemDetail);
}
