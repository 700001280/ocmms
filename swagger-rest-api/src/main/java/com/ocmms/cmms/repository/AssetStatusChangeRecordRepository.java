package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetStatusChangeRecord;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = AssetStatusChangeRecordRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "assetstatuschangerecord", path = "assetstatuschangerecord")
public interface AssetStatusChangeRecordRepository extends  AssetStatusChangeRecordRepositoryCustom,
		PagingAndSortingRepository<AssetStatusChangeRecord, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @return Long
	 */
	public abstract long countByEquipment(Equipment equipment);
}
