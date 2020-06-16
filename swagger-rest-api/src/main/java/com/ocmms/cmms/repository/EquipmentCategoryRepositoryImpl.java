package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentCategory;
import com.ocmms.cmms.model.pm.technicalobject.QEquipmentCategory;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EquipmentCategoryRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class EquipmentCategoryRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentCategory>
		implements EquipmentCategoryRepositoryCustom {

	/**
	 * Default constructor
	 */
	EquipmentCategoryRepositoryImpl() {
		super(EquipmentCategory.class);
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
	public static final String CODE = "code";

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
	public Page<EquipmentCategory> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentCategory equipmentCategory = QEquipmentCategory.equipmentCategory;
		JPQLQuery<EquipmentCategory> query = from(equipmentCategory);
		Path<?>[] paths = new Path<?>[] { equipmentCategory.code, equipmentCategory.description,
				equipmentCategory.recordStatus, equipmentCategory.createdDate, equipmentCategory.createdBy,
				equipmentCategory.lastModifiedDate, equipmentCategory.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, equipmentCategory.code)
				.map(DESCRIPTION, equipmentCategory.description).map(RECORD_STATUS, equipmentCategory.recordStatus)
				.map(CREATED_DATE, equipmentCategory.createdDate).map(CREATED_BY, equipmentCategory.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentCategory.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentCategory.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentCategory);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentCategory> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentCategory equipmentCategory = QEquipmentCategory.equipmentCategory;
		JPQLQuery<EquipmentCategory> query = from(equipmentCategory);
		Path<?>[] paths = new Path<?>[] { equipmentCategory.code, equipmentCategory.description,
				equipmentCategory.recordStatus, equipmentCategory.createdDate, equipmentCategory.createdBy,
				equipmentCategory.lastModifiedDate, equipmentCategory.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(equipmentCategory.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, equipmentCategory.code)
				.map(DESCRIPTION, equipmentCategory.description).map(RECORD_STATUS, equipmentCategory.recordStatus)
				.map(CREATED_DATE, equipmentCategory.createdDate).map(CREATED_BY, equipmentCategory.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentCategory.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentCategory.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentCategory);
	}
}
