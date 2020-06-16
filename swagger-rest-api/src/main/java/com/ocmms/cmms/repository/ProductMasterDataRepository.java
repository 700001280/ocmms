package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pp.configuration.ProductMasterData;

import com.ocmms.cmms.model.pp.configuration.ProductType;
import com.ocmms.cmms.model.pp.configuration.ShaftType;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ProductMasterDataRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "productmasterdata", path = "productmasterdata")
public interface ProductMasterDataRepository extends  ProductMasterDataRepositoryCustom,
		PagingAndSortingRepository<ProductMasterData, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param shaftType
	 * @return Long
	 */
	public abstract long countByShaftType(ShaftType shaftType);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param productType
	 * @return Long
	 */
	public abstract long countByProductType(ProductType productType);
}
