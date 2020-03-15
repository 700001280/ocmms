package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = HierarchyWorkCenterRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = HierarchyWorkCenter.class)
public interface HierarchyWorkCenterRepository extends DetachableJpaRepository<HierarchyWorkCenter, Long>, HierarchyWorkCenterRepositoryCustom {
}
