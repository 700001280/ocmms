package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PreventiveMaintenanceStandardRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "preventivemaintenancestandard", path = "preventivemaintenancestandard")
public interface PreventiveMaintenanceStandardRepository extends  PreventiveMaintenanceStandardRepositoryCustom,
		PagingAndSortingRepository<PreventiveMaintenanceStandard, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param owner
	 * @return Long
	 */
	public abstract long countByOwner(Employee owner);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObjects
	 * @return Long
	 */
	public abstract long countByTechnicalObjectsContains(TechnicalObject technicalObjects);
}
