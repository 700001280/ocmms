package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.configuration.HierarchyWorkCenter;

/**
 * = HierarchyWorkCenterRepositoryImpl
 *
 * Implementation of HierarchyWorkCenterRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = HierarchyWorkCenterRepositoryCustom.class)
public class HierarchyWorkCenterRepositoryImpl extends QueryDslRepositorySupportExt<HierarchyWorkCenter> implements HierarchyWorkCenterRepositoryCustom{

    /**
     * Default constructor
     */
    HierarchyWorkCenterRepositoryImpl() {
        super(HierarchyWorkCenter.class);
    }
}