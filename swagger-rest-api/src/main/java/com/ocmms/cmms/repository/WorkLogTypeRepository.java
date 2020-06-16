package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.WorkLogType;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkLogTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "worklogtype", path = "worklogtype")
public interface WorkLogTypeRepository extends  WorkLogTypeRepositoryCustom,
		PagingAndSortingRepository<WorkLogType, String> {
}
