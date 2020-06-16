package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoDetail;

import com.ocmms.cmms.model.loto.LotoInfo;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = LotoDetailRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface LotoDetailRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param lotoInfo
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoDetail> findByLotoInfo(LotoInfo lotoInfo, GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoDetail> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
