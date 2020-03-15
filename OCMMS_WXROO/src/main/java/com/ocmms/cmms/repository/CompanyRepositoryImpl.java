package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.hrm.Company;

/**
 * = CompanyRepositoryImpl
 *
 * Implementation of CompanyRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = CompanyRepositoryCustom.class)
public class CompanyRepositoryImpl extends QueryDslRepositorySupportExt<Company> implements CompanyRepositoryCustom{

    /**
     * Default constructor
     */
    CompanyRepositoryImpl() {
        super(Company.class);
    }
}