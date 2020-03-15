package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.task.TaskOperationHeader;

/**
 * = TaskOperationHeaderRepositoryImpl
 *
 * Implementation of TaskOperationHeaderRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskOperationHeaderRepositoryCustom.class)
public class TaskOperationHeaderRepositoryImpl extends QueryDslRepositorySupportExt<TaskOperationHeader> implements TaskOperationHeaderRepositoryCustom{

    /**
     * Default constructor
     */
    TaskOperationHeaderRepositoryImpl() {
        super(TaskOperationHeader.class);
    }
}