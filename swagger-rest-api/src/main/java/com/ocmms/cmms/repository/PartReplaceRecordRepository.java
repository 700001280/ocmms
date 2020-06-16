package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PartReplaceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PartReplaceRecordRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "partreplacerecord", path = "partreplacerecord")
public interface PartReplaceRecordRepository extends  PartReplaceRecordRepositoryCustom,
		PagingAndSortingRepository<PartReplaceRecord, Long> {
}
