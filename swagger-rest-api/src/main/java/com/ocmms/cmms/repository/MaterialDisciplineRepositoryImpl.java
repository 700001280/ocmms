package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.master.MaterialDiscipline;
import com.ocmms.cmms.model.mm.master.QMaterialDiscipline;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MaterialDisciplineRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MaterialDisciplineRepositoryImpl extends QueryDslRepositorySupportExt<MaterialDiscipline>
		implements MaterialDisciplineRepositoryCustom {

	/**
	 * Default constructor
	 */
	MaterialDisciplineRepositoryImpl() {
		super(MaterialDiscipline.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DISCIPLINE = "discipline";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialDiscipline> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMaterialDiscipline materialDiscipline = QMaterialDiscipline.materialDiscipline;
		JPQLQuery<MaterialDiscipline> query = from(materialDiscipline);
		Path<?>[] paths = new Path<?>[] { materialDiscipline.description, materialDiscipline.discipline,
				materialDiscipline.recordStatus, materialDiscipline.createdDate, materialDiscipline.createdBy,
				materialDiscipline.lastModifiedDate, materialDiscipline.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, materialDiscipline.description)
				.map(DISCIPLINE, materialDiscipline.discipline).map(RECORD_STATUS, materialDiscipline.recordStatus)
				.map(CREATED_DATE, materialDiscipline.createdDate).map(CREATED_BY, materialDiscipline.createdBy)
				.map(LAST_MODIFIED_DATE, materialDiscipline.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialDiscipline.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialDiscipline);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MaterialDiscipline> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMaterialDiscipline materialDiscipline = QMaterialDiscipline.materialDiscipline;
		JPQLQuery<MaterialDiscipline> query = from(materialDiscipline);
		Path<?>[] paths = new Path<?>[] { materialDiscipline.description, materialDiscipline.discipline,
				materialDiscipline.recordStatus, materialDiscipline.createdDate, materialDiscipline.createdBy,
				materialDiscipline.lastModifiedDate, materialDiscipline.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(materialDiscipline.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, materialDiscipline.description)
				.map(DISCIPLINE, materialDiscipline.discipline).map(RECORD_STATUS, materialDiscipline.recordStatus)
				.map(CREATED_DATE, materialDiscipline.createdDate).map(CREATED_BY, materialDiscipline.createdBy)
				.map(LAST_MODIFIED_DATE, materialDiscipline.lastModifiedDate)
				.map(LAST_MODIFIED_BY, materialDiscipline.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, materialDiscipline);
	}
}
