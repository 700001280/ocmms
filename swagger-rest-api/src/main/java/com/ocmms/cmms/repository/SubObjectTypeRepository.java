package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.configuration.SubObjectType;
import com.ocmms.cmms.model.pm.configuration.ObjectType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = SubObjectTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "subobjecttype", path = "subobjecttype")
public interface SubObjectTypeRepository extends  SubObjectTypeRepositoryCustom,
		PagingAndSortingRepository<SubObjectType, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param objectType
	 * @return Long
	 */
	public abstract long countByObjectType(ObjectType objectType);
}
