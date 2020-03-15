package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.loto.LotoBaseInfo;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = LotoBaseInfoRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = LotoBaseInfo.class)
public interface LotoBaseInfoRepository extends DetachableJpaRepository<LotoBaseInfo, Long>, LotoBaseInfoRepositoryCustom {
}
