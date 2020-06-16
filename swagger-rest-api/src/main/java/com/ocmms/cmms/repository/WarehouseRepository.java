package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.Warehouse;
import com.ocmms.cmms.model.hrm.Organization;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WarehouseRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "warehouse", path = "warehouse")
public interface WarehouseRepository extends  WarehouseRepositoryCustom,
		PagingAndSortingRepository<Warehouse, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);
}
