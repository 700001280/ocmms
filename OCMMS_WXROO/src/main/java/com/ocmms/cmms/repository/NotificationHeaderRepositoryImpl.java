package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;

/**
 * = NotificationHeaderRepositoryImpl
 *
 * Implementation of NotificationHeaderRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = NotificationHeaderRepositoryCustom.class)
public class NotificationHeaderRepositoryImpl extends QueryDslRepositorySupportExt<NotificationHeader> implements NotificationHeaderRepositoryCustom{

    /**
     * Default constructor
     */
    NotificationHeaderRepositoryImpl() {
        super(NotificationHeader.class);
    }
}