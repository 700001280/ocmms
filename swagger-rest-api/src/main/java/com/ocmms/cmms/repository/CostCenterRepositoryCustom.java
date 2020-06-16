package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.fico.CostCenter;

import com.ocmms.cmms.model.hrm.Organization;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = CostCenterRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface CostCenterRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<CostCenter> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<CostCenter> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<CostCenter> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
