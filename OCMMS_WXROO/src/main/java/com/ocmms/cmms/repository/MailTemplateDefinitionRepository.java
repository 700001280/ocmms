package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.system.MailTemplateDefinition;
import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

/**
 * = MailTemplateDefinitionRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = MailTemplateDefinition.class)
public interface MailTemplateDefinitionRepository extends DetachableJpaRepository<MailTemplateDefinition, Long>, MailTemplateDefinitionRepositoryCustom {
}
