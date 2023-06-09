package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.ServiceCatalog;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ServiceCatalogRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface ServiceCatalogRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ServiceCatalog> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ServiceCatalog> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
