package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.UnitOfMeasure;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = UnitOfMeasureRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface UnitOfMeasureRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<UnitOfMeasure> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<UnitOfMeasure> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
