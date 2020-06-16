package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.ProjectMemo;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ProjectMemoRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface ProjectMemoRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProjectMemo> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProjectMemo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
