package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentStatus;
import com.ocmms.cmms.model.pm.technicalobject.QEquipmentStatus;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = EquipmentStatusRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class EquipmentStatusRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentStatus>
		implements EquipmentStatusRepositoryCustom {

	/**
	 * Default constructor
	 */
	EquipmentStatusRepositoryImpl() {
		super(EquipmentStatus.class);
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
	public static final String STATUS = "status";

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
	public Page<EquipmentStatus> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentStatus equipmentStatus = QEquipmentStatus.equipmentStatus;
		JPQLQuery<EquipmentStatus> query = from(equipmentStatus);
		Path<?>[] paths = new Path<?>[] { equipmentStatus.code, equipmentStatus.description, equipmentStatus.status,
				equipmentStatus.recordStatus, equipmentStatus.createdDate, equipmentStatus.createdBy,
				equipmentStatus.lastModifiedDate, equipmentStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, equipmentStatus.code)
				.map(DESCRIPTION, equipmentStatus.description).map(STATUS, equipmentStatus.status)
				.map(RECORD_STATUS, equipmentStatus.recordStatus).map(CREATED_DATE, equipmentStatus.createdDate)
				.map(CREATED_BY, equipmentStatus.createdBy).map(LAST_MODIFIED_DATE, equipmentStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentStatus);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentStatus> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentStatus equipmentStatus = QEquipmentStatus.equipmentStatus;
		JPQLQuery<EquipmentStatus> query = from(equipmentStatus);
		Path<?>[] paths = new Path<?>[] { equipmentStatus.code, equipmentStatus.description, equipmentStatus.status,
				equipmentStatus.recordStatus, equipmentStatus.createdDate, equipmentStatus.createdBy,
				equipmentStatus.lastModifiedDate, equipmentStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(equipmentStatus.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, equipmentStatus.code)
				.map(DESCRIPTION, equipmentStatus.description).map(STATUS, equipmentStatus.status)
				.map(RECORD_STATUS, equipmentStatus.recordStatus).map(CREATED_DATE, equipmentStatus.createdDate)
				.map(CREATED_BY, equipmentStatus.createdBy).map(LAST_MODIFIED_DATE, equipmentStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentStatus);
	}
}
