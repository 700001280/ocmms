package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.loto.LotoBaseInfo;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = LotoBaseInfoRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface LotoBaseInfoRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoBaseInfo> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<LotoBaseInfo> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
