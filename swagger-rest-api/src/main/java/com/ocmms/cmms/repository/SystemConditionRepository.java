package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = SystemConditionRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "systemcondition", path = "systemcondition")
public interface SystemConditionRepository extends  SystemConditionRepositoryCustom,
		PagingAndSortingRepository<SystemCondition, Long>  {
}
