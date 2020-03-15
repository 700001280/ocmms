package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.loto.LotoDetail;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = LotoDetailRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = LotoDetail.class)
public interface LotoDetailRepository extends DetachableJpaRepository<LotoDetail, Long>, LotoDetailRepositoryCustom {
}
