package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.task.TaskOperationText;

/**
 * = TaskOperationTextRepositoryImpl
 *
 * Implementation of TaskOperationTextRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskOperationTextRepositoryCustom.class)
public class TaskOperationTextRepositoryImpl extends QueryDslRepositorySupportExt<TaskOperationText> implements TaskOperationTextRepositoryCustom{

    /**
     * Default constructor
     */
    TaskOperationTextRepositoryImpl() {
        super(TaskOperationText.class);
    }
}