package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;

/**
 * = NotificationUserStatusWithNumberRepositoryImpl
 *
 * Implementation of NotificationUserStatusWithNumberRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = NotificationUserStatusWithNumberRepositoryCustom.class)
public class NotificationUserStatusWithNumberRepositoryImpl extends QueryDslRepositorySupportExt<NotificationUserStatusWithNumber> implements NotificationUserStatusWithNumberRepositoryCustom{

    /**
     * Default constructor
     */
    NotificationUserStatusWithNumberRepositoryImpl() {
        super(NotificationUserStatusWithNumber.class);
    }
}