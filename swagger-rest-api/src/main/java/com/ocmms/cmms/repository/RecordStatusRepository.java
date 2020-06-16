package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.RecordStatus;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = RecordStatusRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "recordstatus", path = "recordstatus")
public interface RecordStatusRepository extends  RecordStatusRepositoryCustom,
		PagingAndSortingRepository<RecordStatus, Long>  {
}
