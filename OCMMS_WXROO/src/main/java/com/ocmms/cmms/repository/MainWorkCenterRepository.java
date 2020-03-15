package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MainWorkCenterRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MainWorkCenter.class)
public interface MainWorkCenterRepository extends DetachableJpaRepository<MainWorkCenter, Long>, MainWorkCenterRepositoryCustom {
}
