package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureVessel;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = PressureVesselRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface PressureVesselRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PressureVessel> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<PressureVessel> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
