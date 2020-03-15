package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pp.configuration.ProductType;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ProductTypeRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ProductType.class)
public interface ProductTypeRepository extends DetachableJpaRepository<ProductType, Long>, ProductTypeRepositoryCustom {
}
