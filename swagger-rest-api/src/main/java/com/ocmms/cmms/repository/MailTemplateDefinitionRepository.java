package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.MailTemplateDefinition;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MailTemplateDefinitionRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "mailtemplatedefinition", path = "mailtemplatedefinition")
public interface MailTemplateDefinitionRepository extends  MailTemplateDefinitionRepositoryCustom,
		PagingAndSortingRepository<MailTemplateDefinition, Long> {
}
