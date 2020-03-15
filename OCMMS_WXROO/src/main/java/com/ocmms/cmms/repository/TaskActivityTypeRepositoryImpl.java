package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.task.TaskActivityType;

/**
 * = TaskActivityTypeRepositoryImpl
 *
 * Implementation of TaskActivityTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskActivityTypeRepositoryCustom.class)
public class TaskActivityTypeRepositoryImpl extends QueryDslRepositorySupportExt<TaskActivityType> implements TaskActivityTypeRepositoryCustom{

    /**
     * Default constructor
     */
    TaskActivityTypeRepositoryImpl() {
        super(TaskActivityType.class);
    }
}