package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.pm.configuration.SortField;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = SortFieldRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = SortField.class)
public interface SortFieldRepository extends DetachableJpaRepository<SortField, Long>, SortFieldRepositoryCustom {
}
