package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.RecordStatus;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = RecordStatusRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface RecordStatusRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<RecordStatus> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<RecordStatus> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
