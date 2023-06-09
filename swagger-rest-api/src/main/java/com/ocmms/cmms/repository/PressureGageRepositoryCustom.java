package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureGage;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PressureGageRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface PressureGageRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PressureGage> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PressureGage> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
