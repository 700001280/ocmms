package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.TreeMenu;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = TreeMenuRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface TreeMenuRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TreeMenu> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<TreeMenu> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
