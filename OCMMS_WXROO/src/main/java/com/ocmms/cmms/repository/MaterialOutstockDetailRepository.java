package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.MaterialOutstockDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MaterialOutstockDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MaterialOutstockDetail.class)
public interface MaterialOutstockDetailRepository extends DetachableJpaRepository<MaterialOutstockDetail, Long>, MaterialOutstockDetailRepositoryCustom {
}
