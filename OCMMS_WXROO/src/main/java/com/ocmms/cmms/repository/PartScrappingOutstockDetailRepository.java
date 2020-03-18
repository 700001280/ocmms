package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.PartScrappingOutstockDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = PartScrappingOutstockDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = PartScrappingOutstockDetail.class)
public interface PartScrappingOutstockDetailRepository extends DetachableJpaRepository<PartScrappingOutstockDetail, Long>, PartScrappingOutstockDetailRepositoryCustom {
}
