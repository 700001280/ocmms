package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.assistance.TaskTrackingType;

/**
 * = TaskTrackingTypeRepositoryImpl
 *
 * Implementation of TaskTrackingTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskTrackingTypeRepositoryCustom.class)
public class TaskTrackingTypeRepositoryImpl extends QueryDslRepositorySupportExt<TaskTrackingType> implements TaskTrackingTypeRepositoryCustom{

    /**
     * Default constructor
     */
    TaskTrackingTypeRepositoryImpl() {
        super(TaskTrackingType.class);
    }
}