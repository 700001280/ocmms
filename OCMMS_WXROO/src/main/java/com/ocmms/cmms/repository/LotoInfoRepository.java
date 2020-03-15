package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.loto.LotoInfo;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = LotoInfoRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = LotoInfo.class)
public interface LotoInfoRepository extends DetachableJpaRepository<LotoInfo, Long>, LotoInfoRepositoryCustom {
}
