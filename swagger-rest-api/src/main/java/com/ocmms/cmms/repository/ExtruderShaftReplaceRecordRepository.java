package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.routine.ExtruderShaftReplaceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ExtruderShaftReplaceRecordRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "extrudershaftreplacerecord", path = "extrudershaftreplacerecord")
public interface ExtruderShaftReplaceRecordRepository extends  ExtruderShaftReplaceRecordRepositoryCustom,
		PagingAndSortingRepository<ExtruderShaftReplaceRecord, Long>  {
}
