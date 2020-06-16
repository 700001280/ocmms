package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.configuration.ProductType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ProductTypeRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface ProductTypeRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProductType> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProductType> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
