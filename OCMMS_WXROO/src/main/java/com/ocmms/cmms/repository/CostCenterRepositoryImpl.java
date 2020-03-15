package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.fico.CostCenter;

/**
 * = CostCenterRepositoryImpl
 *
 * Implementation of CostCenterRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = CostCenterRepositoryCustom.class)
public class CostCenterRepositoryImpl extends QueryDslRepositorySupportExt<CostCenter> implements CostCenterRepositoryCustom{

    /**
     * Default constructor
     */
    CostCenterRepositoryImpl() {
        super(CostCenter.class);
    }
}