package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerReplaceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerUpRollerReplaceRecordRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "pelletizeruprollerreplacerecord", path = "pelletizeruprollerreplacerecord")
public interface PelletizerUpRollerReplaceRecordRepository extends  PelletizerUpRollerReplaceRecordRepositoryCustom,
		PagingAndSortingRepository<PelletizerUpRollerReplaceRecord, Long>{
}
