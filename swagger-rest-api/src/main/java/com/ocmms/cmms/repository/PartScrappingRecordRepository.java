package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.routine.PartScrappingRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PartScrappingRecordRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "partscrappingrecord", path = "partscrappingrecord")
public interface PartScrappingRecordRepository extends  PartScrappingRecordRepositoryCustom,
		PagingAndSortingRepository<PartScrappingRecord, Long>{
}
