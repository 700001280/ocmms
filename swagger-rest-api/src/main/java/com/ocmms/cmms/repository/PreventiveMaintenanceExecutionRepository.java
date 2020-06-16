package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceExecution;

import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PreventiveMaintenanceExecutionRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "preventivemaintenanceexecution", path = "preventivemaintenanceexecution")
public interface PreventiveMaintenanceExecutionRepository extends  PreventiveMaintenanceExecutionRepositoryCustom,
		PagingAndSortingRepository<PreventiveMaintenanceExecution, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @return Long
	 */
	public abstract long countByTechnicalObject(TechnicalObject technicalObject);
}
