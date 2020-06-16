package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.EquipmentScrappingRecord;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = EquipmentScrappingRecordRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface EquipmentScrappingRecordRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<EquipmentScrappingRecord> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<EquipmentScrappingRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
