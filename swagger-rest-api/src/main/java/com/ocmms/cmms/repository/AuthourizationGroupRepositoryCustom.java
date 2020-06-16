package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.AuthourizationGroup;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = AuthourizationGroupRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface AuthourizationGroupRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AuthourizationGroup> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AuthourizationGroup> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
