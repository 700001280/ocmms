package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.StorageType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = StorageTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface StorageTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<StorageType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<StorageType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
