package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.measuringpoint.MeasuringType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = MeasuringTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface MeasuringTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MeasuringType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MeasuringType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
