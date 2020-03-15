package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.task.TaskType;

/**
 * = TaskTypeRepositoryImpl
 *
 * Implementation of TaskTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskTypeRepositoryCustom.class)
public class TaskTypeRepositoryImpl extends QueryDslRepositorySupportExt<TaskType> implements TaskTypeRepositoryCustom{

    /**
     * Default constructor
     */
    TaskTypeRepositoryImpl() {
        super(TaskType.class);
    }
}