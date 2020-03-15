package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithoutNumber;

/**
 * = NotificationUserStatusWithoutNumberRepositoryImpl
 *
 * Implementation of NotificationUserStatusWithoutNumberRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = NotificationUserStatusWithoutNumberRepositoryCustom.class)
public class NotificationUserStatusWithoutNumberRepositoryImpl extends QueryDslRepositorySupportExt<NotificationUserStatusWithoutNumber> implements NotificationUserStatusWithoutNumberRepositoryCustom{

    /**
     * Default constructor
     */
    NotificationUserStatusWithoutNumberRepositoryImpl() {
        super(NotificationUserStatusWithoutNumber.class);
    }
}