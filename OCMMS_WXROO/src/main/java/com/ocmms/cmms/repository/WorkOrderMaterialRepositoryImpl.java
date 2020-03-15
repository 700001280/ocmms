package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;

/**
 * = WorkOrderMaterialRepositoryImpl
 *
 * Implementation of WorkOrderMaterialRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = WorkOrderMaterialRepositoryCustom.class)
public class WorkOrderMaterialRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderMaterial> implements WorkOrderMaterialRepositoryCustom{

    /**
     * Default constructor
     */
    WorkOrderMaterialRepositoryImpl() {
        super(WorkOrderMaterial.class);
    }
}