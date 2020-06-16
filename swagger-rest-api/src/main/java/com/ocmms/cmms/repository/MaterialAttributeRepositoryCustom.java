package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialAttribute;

import com.ocmms.cmms.model.mm.master.MaterialCatalog;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = MaterialAttributeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface MaterialAttributeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param materialCatalog
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialAttribute> findByMaterialCatalog(MaterialCatalog materialCatalog,
			GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialAttribute> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<MaterialAttribute> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
