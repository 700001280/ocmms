package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.OperationRelationship;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = OperationRelationshipRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = OperationRelationship.class)
public interface OperationRelationshipRepository extends DetachableJpaRepository<OperationRelationship, Long>, OperationRelationshipRepositoryCustom {
}
