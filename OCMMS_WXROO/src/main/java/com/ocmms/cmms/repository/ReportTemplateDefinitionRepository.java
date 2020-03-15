package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.system.ReportTemplateDefinition;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = ReportTemplateDefinitionRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = ReportTemplateDefinition.class)
public interface ReportTemplateDefinitionRepository extends DetachableJpaRepository<ReportTemplateDefinition, Long>, ReportTemplateDefinitionRepositoryCustom {
}
