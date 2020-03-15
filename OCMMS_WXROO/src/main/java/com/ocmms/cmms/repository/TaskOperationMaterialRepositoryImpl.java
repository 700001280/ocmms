package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.task.TaskOperationMaterial;

/**
 * = TaskOperationMaterialRepositoryImpl
 *
 * Implementation of TaskOperationMaterialRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskOperationMaterialRepositoryCustom.class)
public class TaskOperationMaterialRepositoryImpl extends QueryDslRepositorySupportExt<TaskOperationMaterial> implements TaskOperationMaterialRepositoryCustom{

    /**
     * Default constructor
     */
    TaskOperationMaterialRepositoryImpl() {
        super(TaskOperationMaterial.class);
    }
}