package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetInventoryRecord;

import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = AssetInventoryRecordRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface AssetInventoryRecordRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AssetInventoryRecord> findByEquipment(Equipment equipment, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AssetInventoryRecord> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AssetInventoryRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
