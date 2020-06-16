package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoDetail;

import com.ocmms.cmms.model.loto.LotoInfo;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = LotoDetailRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "lotodetail", path = "lotodetail")
public interface LotoDetailRepository extends  LotoDetailRepositoryCustom,
		PagingAndSortingRepository<LotoDetail, Long>  {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfo
	 * @return Long
	 */
	public abstract long countByLotoInfo(LotoInfo lotoInfo);
}
