package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.ScrewElement;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ScrewElementRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface ScrewElementRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ScrewElement> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ScrewElement> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
