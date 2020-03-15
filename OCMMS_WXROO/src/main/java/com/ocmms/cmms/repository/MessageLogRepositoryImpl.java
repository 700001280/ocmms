package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.assistance.MessageLog;

/**
 * = MessageLogRepositoryImpl
 *
 * Implementation of MessageLogRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MessageLogRepositoryCustom.class)
public class MessageLogRepositoryImpl extends QueryDslRepositorySupportExt<MessageLog> implements MessageLogRepositoryCustom{

    /**
     * Default constructor
     */
    MessageLogRepositoryImpl() {
        super(MessageLog.class);
    }
}