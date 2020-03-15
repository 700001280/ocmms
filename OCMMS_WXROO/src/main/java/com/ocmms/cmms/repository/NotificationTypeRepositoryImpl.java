package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.notification.NotificationType;

/**
 * = NotificationTypeRepositoryImpl
 *
 * Implementation of NotificationTypeRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = NotificationTypeRepositoryCustom.class)
public class NotificationTypeRepositoryImpl extends QueryDslRepositorySupportExt<NotificationType> implements NotificationTypeRepositoryCustom{

    /**
     * Default constructor
     */
    NotificationTypeRepositoryImpl() {
        super(NotificationType.class);
    }
}