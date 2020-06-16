package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceContent;

import com.ocmms.cmms.model.pm.pm.PreventiveMaintenanceStandard;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PreventiveMaintenanceContentRepository TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "preventivemaintenancecontent", path = "preventivemaintenancecontent")
public interface PreventiveMaintenanceContentRepository extends  PreventiveMaintenanceContentRepositoryCustom,
		PagingAndSortingRepository<PreventiveMaintenanceContent, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param preventiveMaintenanceStandard
	 * @return Long
	 */
	public abstract long countByPreventiveMaintenanceStandard(
			PreventiveMaintenanceStandard preventiveMaintenanceStandard);
}
