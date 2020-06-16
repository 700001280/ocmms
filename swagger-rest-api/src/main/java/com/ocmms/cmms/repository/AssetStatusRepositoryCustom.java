package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.asset.AssetStatus;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = AssetStatusRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface AssetStatusRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AssetStatus> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<AssetStatus> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
