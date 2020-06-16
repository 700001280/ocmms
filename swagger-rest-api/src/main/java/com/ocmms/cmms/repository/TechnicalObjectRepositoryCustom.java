package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.AbcIndicator;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TechnicalObjectRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface TechnicalObjectRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TechnicalObject> findByOrganization(Organization organization, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param abcIndicator
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TechnicalObject> findByAbcIndicator(AbcIndicator abcIndicator, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TechnicalObject> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TechnicalObject> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
