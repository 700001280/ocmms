package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.SortField;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = SortFieldRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface SortFieldRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<SortField> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<SortField> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
