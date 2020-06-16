package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerCutterReplaceRecord;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerCutterReplaceRecordRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "pelletizercutterreplacerecord", path = "pelletizercutterreplacerecord")
public interface PelletizerCutterReplaceRecordRepository extends  PelletizerCutterReplaceRecordRepositoryCustom,
		PagingAndSortingRepository<PelletizerCutterReplaceRecord, Long>{
}
