package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.ReportTemplateDefinition;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ReportTemplateDefinitionRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "reporttemplatedefinition", path = "reporttemplatedefinition")
public interface ReportTemplateDefinitionRepository extends  ReportTemplateDefinitionRepositoryCustom,
		PagingAndSortingRepository<ReportTemplateDefinition, Long>  {
}
