package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.notification.NotificationSystemStatus;

/**
 * = NotificationSystemStatusRepositoryImpl
 *
 * Implementation of NotificationSystemStatusRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = NotificationSystemStatusRepositoryCustom.class)
public class NotificationSystemStatusRepositoryImpl extends QueryDslRepositorySupportExt<NotificationSystemStatus> implements NotificationSystemStatusRepositoryCustom{

    /**
     * Default constructor
     */
    NotificationSystemStatusRepositoryImpl() {
        super(NotificationSystemStatus.class);
    }
}