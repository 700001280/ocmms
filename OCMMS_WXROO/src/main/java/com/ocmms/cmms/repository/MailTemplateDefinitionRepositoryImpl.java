package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.system.MailTemplateDefinition;

/**
 * = MailTemplateDefinitionRepositoryImpl
 *
 * Implementation of MailTemplateDefinitionRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = MailTemplateDefinitionRepositoryCustom.class)
public class MailTemplateDefinitionRepositoryImpl extends QueryDslRepositorySupportExt<MailTemplateDefinition> implements MailTemplateDefinitionRepositoryCustom{

    /**
     * Default constructor
     */
    MailTemplateDefinitionRepositoryImpl() {
        super(MailTemplateDefinition.class);
    }
}