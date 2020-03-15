package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.loto.IsolationMethod;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = IsolationMethodRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = IsolationMethod.class)
public interface IsolationMethodRepository extends DetachableJpaRepository<IsolationMethod, Long>, IsolationMethodRepositoryCustom {
}
