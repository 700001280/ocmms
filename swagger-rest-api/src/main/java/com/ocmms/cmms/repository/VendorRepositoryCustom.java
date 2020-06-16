package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.srm.Vendor;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = VendorRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface VendorRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Vendor> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<Vendor> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable);
}
