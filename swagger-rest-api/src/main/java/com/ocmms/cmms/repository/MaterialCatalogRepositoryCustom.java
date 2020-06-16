package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * = MaterialCatalogRepositoryCustom TODO Auto-generated class documentation
 *
 */
public interface MaterialCatalogRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialCatalog> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialCatalog> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
