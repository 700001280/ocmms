package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.task.TaskHeader;

/**
 * = TaskHeaderRepositoryImpl
 *
 * Implementation of TaskHeaderRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskHeaderRepositoryCustom.class)
public class TaskHeaderRepositoryImpl extends QueryDslRepositorySupportExt<TaskHeader> implements TaskHeaderRepositoryCustom{

    /**
     * Default constructor
     */
    TaskHeaderRepositoryImpl() {
        super(TaskHeader.class);
    }
}