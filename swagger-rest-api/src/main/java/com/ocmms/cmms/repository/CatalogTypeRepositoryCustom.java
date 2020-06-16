package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.CatalogType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = CatalogTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface CatalogTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<CatalogType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<CatalogType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
