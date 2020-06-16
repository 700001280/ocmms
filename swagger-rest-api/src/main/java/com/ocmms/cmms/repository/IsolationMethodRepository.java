package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.IsolationMethod;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = IsolationMethodRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "isolationmethod", path = "isolationmethod")
public interface IsolationMethodRepository extends  IsolationMethodRepositoryCustom,
		PagingAndSortingRepository<IsolationMethod, Long> {
}
