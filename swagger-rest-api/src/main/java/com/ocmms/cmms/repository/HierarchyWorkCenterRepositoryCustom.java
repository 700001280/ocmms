package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;

import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.WorkCenterResponsible;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = HierarchyWorkCenterRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface HierarchyWorkCenterRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<HierarchyWorkCenter> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param responsible
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<HierarchyWorkCenter> findByResponsible(WorkCenterResponsible responsible,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<HierarchyWorkCenter> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<HierarchyWorkCenter> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
