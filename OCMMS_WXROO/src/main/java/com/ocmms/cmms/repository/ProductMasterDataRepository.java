package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pp.configuration.ProductMasterData;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ProductMasterDataRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ProductMasterData.class)
public interface ProductMasterDataRepository extends DetachableJpaRepository<ProductMasterData, Long>, ProductMasterDataRepositoryCustom {
}
