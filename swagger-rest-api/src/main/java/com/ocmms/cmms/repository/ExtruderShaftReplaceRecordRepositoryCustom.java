package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.ExtruderShaftReplaceRecord;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ExtruderShaftReplaceRecordRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface ExtruderShaftReplaceRecordRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ExtruderShaftReplaceRecord> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ExtruderShaftReplaceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
