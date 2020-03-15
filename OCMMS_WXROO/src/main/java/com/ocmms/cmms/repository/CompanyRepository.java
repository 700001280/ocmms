package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.hrm.Company;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = CompanyRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = Company.class)
public interface CompanyRepository extends DetachableJpaRepository<Company, Long>, CompanyRepositoryCustom {
}
