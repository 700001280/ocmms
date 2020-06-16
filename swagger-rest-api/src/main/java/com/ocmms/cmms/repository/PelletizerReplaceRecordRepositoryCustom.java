package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerReplaceRecord;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PelletizerReplaceRecordRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface PelletizerReplaceRecordRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PelletizerReplaceRecord> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PelletizerReplaceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
