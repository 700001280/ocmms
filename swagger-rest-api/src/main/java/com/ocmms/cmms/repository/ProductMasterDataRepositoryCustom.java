package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.configuration.ProductMasterData;

import com.ocmms.cmms.model.pp.configuration.ProductType;
import com.ocmms.cmms.model.pp.configuration.ShaftType;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ProductMasterDataRepositoryCustom TODO Auto-generated class documentation
 *
 */

public interface ProductMasterDataRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param shaftType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProductMasterData> findByShaftType(ShaftType shaftType, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param productType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProductMasterData> findByProductType(ProductType productType, GlobalSearch globalSearch,
			Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProductMasterData> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ProductMasterData> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
