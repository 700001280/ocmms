package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;

/**
 * = NotificationPriorityRepositoryImpl
 *
 * Implementation of NotificationPriorityRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = NotificationPriorityRepositoryCustom.class)
public class NotificationPriorityRepositoryImpl extends QueryDslRepositorySupportExt<NotificationPriority> implements NotificationPriorityRepositoryCustom{

    /**
     * Default constructor
     */
    NotificationPriorityRepositoryImpl() {
        super(NotificationPriority.class);
    }
}