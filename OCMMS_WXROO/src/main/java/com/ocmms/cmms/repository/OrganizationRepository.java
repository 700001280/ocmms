package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.hrm.Organization;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = OrganizationRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Organization.class)
public interface OrganizationRepository extends DetachableJpaRepository<Organization, Long>, OrganizationRepositoryCustom {
}
