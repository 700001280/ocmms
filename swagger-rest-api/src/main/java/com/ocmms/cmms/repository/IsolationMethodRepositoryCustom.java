package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.IsolationMethod;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = IsolationMethodRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface IsolationMethodRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<IsolationMethod> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<IsolationMethod> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
