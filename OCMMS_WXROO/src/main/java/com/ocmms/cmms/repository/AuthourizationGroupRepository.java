package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.AuthourizationGroup;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = AuthourizationGroupRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = AuthourizationGroup.class)
public interface AuthourizationGroupRepository extends DetachableJpaRepository<AuthourizationGroup, Long>, AuthourizationGroupRepositoryCustom {
}
