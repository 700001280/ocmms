package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoDetailType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = LotoDetailTypeRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "lotodetailtype", path = "lotodetailtype")
public interface LotoDetailTypeRepository extends  LotoDetailTypeRepositoryCustom,
		PagingAndSortingRepository<LotoDetailType, Long> {
}
