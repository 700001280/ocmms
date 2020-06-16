package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetInventoryRecord;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AssetInventoryRecordRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "assetinventoryrecord", path = "assetinventoryrecord")
public interface AssetInventoryRecordRepository extends  AssetInventoryRecordRepositoryCustom,
		PagingAndSortingRepository<AssetInventoryRecord, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @return Long
	 */
	public abstract long countByEquipment(Equipment equipment);
}
