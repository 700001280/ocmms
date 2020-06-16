package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.BarcodeDefinition;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = BarcodeDefinitionRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface BarcodeDefinitionRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<BarcodeDefinition> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<BarcodeDefinition> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
