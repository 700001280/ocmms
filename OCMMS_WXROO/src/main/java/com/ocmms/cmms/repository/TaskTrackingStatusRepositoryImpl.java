package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.assistance.TaskTrackingStatus;

/**
 * = TaskTrackingStatusRepositoryImpl
 *
 * Implementation of TaskTrackingStatusRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = TaskTrackingStatusRepositoryCustom.class)
public class TaskTrackingStatusRepositoryImpl extends QueryDslRepositorySupportExt<TaskTrackingStatus> implements TaskTrackingStatusRepositoryCustom{

    /**
     * Default constructor
     */
    TaskTrackingStatusRepositoryImpl() {
        super(TaskTrackingStatus.class);
    }
}