package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.routine.PelletizerReplaceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerReplaceRecordRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "pelletizerreplacerecord", path = "pelletizerreplacerecord")
public interface PelletizerReplaceRecordRepository extends  PelletizerReplaceRecordRepositoryCustom,
		PagingAndSortingRepository<PelletizerReplaceRecord, Long>{
}
