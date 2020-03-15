package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.common.Province;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ProvinceRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Province.class)
public interface ProvinceRepository extends DetachableJpaRepository<Province, Long>, ProvinceRepositoryCustom {
}
