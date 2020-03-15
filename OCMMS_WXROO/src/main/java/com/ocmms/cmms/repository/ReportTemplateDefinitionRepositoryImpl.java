package com.ocmms.cmms.repository;

import io.springlets.data.jpa.repository.support.QueryDslRepositorySupportExt;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.ocmms.cmms.model.system.ReportTemplateDefinition;

/**
 * = ReportTemplateDefinitionRepositoryImpl
 *
 * Implementation of ReportTemplateDefinitionRepositoryCustom
 *
 */
@RooJpaRepositoryCustomImpl(repository = ReportTemplateDefinitionRepositoryCustom.class)
public class ReportTemplateDefinitionRepositoryImpl extends QueryDslRepositorySupportExt<ReportTemplateDefinition> implements ReportTemplateDefinitionRepositoryCustom{

    /**
     * Default constructor
     */
    ReportTemplateDefinitionRepositoryImpl() {
        super(ReportTemplateDefinition.class);
    }
}