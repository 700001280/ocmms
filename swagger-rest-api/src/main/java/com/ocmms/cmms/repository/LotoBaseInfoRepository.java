package com.ocmms.cmms.repository;


import com.ocmms.cmms.model.loto.LotoBaseInfo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = LotoBaseInfoRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "lotobaseinfo", path = "lotobaseinfo")
public interface LotoBaseInfoRepository extends  LotoBaseInfoRepositoryCustom,
		PagingAndSortingRepository<LotoBaseInfo, Long>  {
}
