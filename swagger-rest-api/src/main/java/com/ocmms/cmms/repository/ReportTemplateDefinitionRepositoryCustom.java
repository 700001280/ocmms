package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.ReportTemplateDefinition;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * = ReportTemplateDefinitionRepositoryCustom TODO Auto-generated class
 * documentation
 *
 */

public interface ReportTemplateDefinitionRepositoryCustom {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ReportTemplateDefinition> findAll(GlobalSearch globalSearch, Pageable pageable);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public abstract Page<ReportTemplateDefinition> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable);
}
