package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = SystemConditionRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = SystemCondition.class)
public interface SystemConditionRepository extends DetachableJpaRepository<SystemCondition, Long>, SystemConditionRepositoryCustom {
}
