package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.EquipmentScrappingRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EquipmentScrappingRecordRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "equipmentscrappingrecord", path = "equipmentscrappingrecord")
public interface EquipmentScrappingRecordRepository extends  EquipmentScrappingRecordRepositoryCustom,
		PagingAndSortingRepository<EquipmentScrappingRecord, Long>  {
}
