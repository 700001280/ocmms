package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.eshem.CriticalClassification;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = CriticalClassificationRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface CriticalClassificationRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<CriticalClassification> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<CriticalClassification> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
