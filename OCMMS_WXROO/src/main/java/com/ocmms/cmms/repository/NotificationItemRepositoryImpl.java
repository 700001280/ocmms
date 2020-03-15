package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.notification.NotificationItem;

/**
 * = NotificationItemRepositoryImpl
 *
 * Implementation of NotificationItemRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = NotificationItemRepositoryCustom.class)
public class NotificationItemRepositoryImpl extends QueryDslRepositorySupportExt<NotificationItem> implements NotificationItemRepositoryCustom{

    /**
     * Default constructor
     */
    NotificationItemRepositoryImpl() {
        super(NotificationItem.class);
    }
}