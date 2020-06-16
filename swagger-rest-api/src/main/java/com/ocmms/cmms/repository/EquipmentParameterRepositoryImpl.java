package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentParameter;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.pm.technicalobject.QEquipmentParameter;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = EquipmentParameterRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class EquipmentParameterRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentParameter>
		implements EquipmentParameterRepositoryCustom {

	/**
	 * Default constructor
	 */
	EquipmentParameterRepositoryImpl() {
		super(EquipmentParameter.class);
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
	public static final String PARAMETER_NAME = "parameterName";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UNIT = "unit";

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
	public Page<EquipmentParameter> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentParameter equipmentParameter = QEquipmentParameter.equipmentParameter;
		JPQLQuery<EquipmentParameter> query = from(equipmentParameter);
		Path<?>[] paths = new Path<?>[] { equipmentParameter.parameterName, equipmentParameter.description,
				equipmentParameter.unit, equipmentParameter.recordStatus, equipmentParameter.createdDate,
				equipmentParameter.createdBy, equipmentParameter.lastModifiedDate, equipmentParameter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PARAMETER_NAME, equipmentParameter.parameterName)
				.map(DESCRIPTION, equipmentParameter.description).map(UNIT, equipmentParameter.unit)
				.map(RECORD_STATUS, equipmentParameter.recordStatus).map(CREATED_DATE, equipmentParameter.createdDate)
				.map(CREATED_BY, equipmentParameter.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentParameter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentParameter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentParameter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentParameter> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentParameter equipmentParameter = QEquipmentParameter.equipmentParameter;
		JPQLQuery<EquipmentParameter> query = from(equipmentParameter);
		Path<?>[] paths = new Path<?>[] { equipmentParameter.parameterName, equipmentParameter.description,
				equipmentParameter.unit, equipmentParameter.recordStatus, equipmentParameter.createdDate,
				equipmentParameter.createdBy, equipmentParameter.lastModifiedDate, equipmentParameter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(equipmentParameter.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(PARAMETER_NAME, equipmentParameter.parameterName)
				.map(DESCRIPTION, equipmentParameter.description).map(UNIT, equipmentParameter.unit)
				.map(RECORD_STATUS, equipmentParameter.recordStatus).map(CREATED_DATE, equipmentParameter.createdDate)
				.map(CREATED_BY, equipmentParameter.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentParameter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentParameter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentParameter);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipments
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentParameter> findByEquipmentsContains(Equipment equipments, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipmentParameter equipmentParameter = QEquipmentParameter.equipmentParameter;
		JPQLQuery<EquipmentParameter> query = from(equipmentParameter);
		Assert.notNull(equipments, "equipments is required");
		query.where(equipmentParameter.equipments.contains(equipments));
		Path<?>[] paths = new Path<?>[] { equipmentParameter.parameterName, equipmentParameter.description,
				equipmentParameter.unit, equipmentParameter.recordStatus, equipmentParameter.createdDate,
				equipmentParameter.createdBy, equipmentParameter.lastModifiedDate, equipmentParameter.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PARAMETER_NAME, equipmentParameter.parameterName)
				.map(DESCRIPTION, equipmentParameter.description).map(UNIT, equipmentParameter.unit)
				.map(RECORD_STATUS, equipmentParameter.recordStatus).map(CREATED_DATE, equipmentParameter.createdDate)
				.map(CREATED_BY, equipmentParameter.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentParameter.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentParameter.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentParameter);
	}
}
