package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.hrm.OrgComInformation;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = OrgComInformationRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = OrgComInformation.class)
public interface OrgComInformationRepository extends DetachableJpaRepository<OrgComInformation, Long>, OrgComInformationRepositoryCustom {
}
