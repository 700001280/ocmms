package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.pm.configuration.AbcIndicator;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TechnicalObjectRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "technicalobject", path = "technicalobject")
public interface TechnicalObjectRepository extends  TechnicalObjectRepositoryCustom,
		PagingAndSortingRepository<TechnicalObject, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @return Long
	 */
	public abstract long countByOrganization(Organization organization);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param abcIndicator
	 * @return Long
	 */
	public abstract long countByAbcIndicator(AbcIndicator abcIndicator);
}
