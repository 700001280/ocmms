package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.assistance.TaskTrackingPriority;

/**
 * = TaskTrackingPriorityRepositoryImpl
 *
 * Implementation of TaskTrackingPriorityRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskTrackingPriorityRepositoryCustom.class)
public class TaskTrackingPriorityRepositoryImpl extends QueryDslRepositorySupportExt<TaskTrackingPriority> implements TaskTrackingPriorityRepositoryCustom{

    /**
     * Default constructor
     */
    TaskTrackingPriorityRepositoryImpl() {
        super(TaskTrackingPriority.class);
    }
}