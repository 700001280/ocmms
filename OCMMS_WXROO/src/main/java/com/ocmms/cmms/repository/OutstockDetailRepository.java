package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.OutstockDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = OutstockDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = OutstockDetail.class)
public interface OutstockDetailRepository extends DetachableJpaRepository<OutstockDetail, Long>, OutstockDetailRepositoryCustom {
}
