package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatus;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = EquipmentStatusRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface EquipmentStatusRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<EquipmentStatus> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<EquipmentStatus> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
