package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.mm.storage.InstockDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = InstockDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = InstockDetail.class)
public interface InstockDetailRepository extends DetachableJpaRepository<InstockDetail, Long>, InstockDetailRepositoryCustom {
}
