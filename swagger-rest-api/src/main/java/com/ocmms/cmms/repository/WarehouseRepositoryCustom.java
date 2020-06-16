package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.Warehouse;

import com.ocmms.cmms.model.hrm.Organization;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = WarehouseRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface WarehouseRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Warehouse> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Warehouse> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Warehouse> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
