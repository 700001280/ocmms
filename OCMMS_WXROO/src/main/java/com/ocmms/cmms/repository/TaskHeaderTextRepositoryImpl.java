package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.task.TaskHeaderText;

/**
 * = TaskHeaderTextRepositoryImpl
 *
 * Implementation of TaskHeaderTextRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskHeaderTextRepositoryCustom.class)
public class TaskHeaderTextRepositoryImpl extends QueryDslRepositorySupportExt<TaskHeaderText> implements TaskHeaderTextRepositoryCustom{

    /**
     * Default constructor
     */
    TaskHeaderTextRepositoryImpl() {
        super(TaskHeaderText.class);
    }
}