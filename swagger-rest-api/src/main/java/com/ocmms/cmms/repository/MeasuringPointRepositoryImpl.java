package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.measuringpoint.MeasuringPoint;
import com.ocmms.cmms.model.pm.measuringpoint.QMeasuringPoint;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = MeasuringPointRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MeasuringPointRepositoryImpl extends QueryDslRepositorySupportExt<MeasuringPoint>
		implements MeasuringPointRepositoryCustom {

	/**
	 * Default constructor
	 */
	MeasuringPointRepositoryImpl() {
		super(MeasuringPoint.class);
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
	public static final String MEDIUM = "medium";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEASURING_TYPE = "measuringType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UPPER_INTERLOCK = "upperInterlock";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOW_LIMIT = "lowLimit";

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
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEASURING_TAG = "measuringTag";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UNIT_OF_MEASURE = "unitOfMeasure";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT = "equipment";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOW_ALARM = "lowAlarm";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UPPER_LIMIT = "upperLimit";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String UPPER_ALARM = "upperAlarm";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LOW_INTERLOCK = "lowInterlock";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MeasuringPoint> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMeasuringPoint measuringPoint = QMeasuringPoint.measuringPoint;
		JPQLQuery<MeasuringPoint> query = from(measuringPoint);
		Path<?>[] paths = new Path<?>[] { measuringPoint.measuringTag, measuringPoint.description,
				measuringPoint.measuringType, measuringPoint.medium, measuringPoint.lowLimit, measuringPoint.upperLimit,
				measuringPoint.lowAlarm, measuringPoint.upperAlarm, measuringPoint.lowInterlock,
				measuringPoint.upperInterlock, measuringPoint.unitOfMeasure, measuringPoint.equipment,
				measuringPoint.recordStatus, measuringPoint.createdDate, measuringPoint.createdBy,
				measuringPoint.lastModifiedDate, measuringPoint.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MEASURING_TAG, measuringPoint.measuringTag)
				.map(DESCRIPTION, measuringPoint.description).map(MEASURING_TYPE, measuringPoint.measuringType)
				.map(MEDIUM, measuringPoint.medium).map(LOW_LIMIT, measuringPoint.lowLimit)
				.map(UPPER_LIMIT, measuringPoint.upperLimit).map(LOW_ALARM, measuringPoint.lowAlarm)
				.map(UPPER_ALARM, measuringPoint.upperAlarm).map(LOW_INTERLOCK, measuringPoint.lowInterlock)
				.map(UPPER_INTERLOCK, measuringPoint.upperInterlock).map(UNIT_OF_MEASURE, measuringPoint.unitOfMeasure)
				.map(EQUIPMENT, measuringPoint.equipment).map(RECORD_STATUS, measuringPoint.recordStatus)
				.map(CREATED_DATE, measuringPoint.createdDate).map(CREATED_BY, measuringPoint.createdBy)
				.map(LAST_MODIFIED_DATE, measuringPoint.lastModifiedDate)
				.map(LAST_MODIFIED_BY, measuringPoint.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, measuringPoint);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MeasuringPoint> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMeasuringPoint measuringPoint = QMeasuringPoint.measuringPoint;
		JPQLQuery<MeasuringPoint> query = from(measuringPoint);
		Path<?>[] paths = new Path<?>[] { measuringPoint.measuringTag, measuringPoint.description,
				measuringPoint.measuringType, measuringPoint.medium, measuringPoint.lowLimit, measuringPoint.upperLimit,
				measuringPoint.lowAlarm, measuringPoint.upperAlarm, measuringPoint.lowInterlock,
				measuringPoint.upperInterlock, measuringPoint.unitOfMeasure, measuringPoint.equipment,
				measuringPoint.recordStatus, measuringPoint.createdDate, measuringPoint.createdBy,
				measuringPoint.lastModifiedDate, measuringPoint.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(measuringPoint.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MEASURING_TAG, measuringPoint.measuringTag)
				.map(DESCRIPTION, measuringPoint.description).map(MEASURING_TYPE, measuringPoint.measuringType)
				.map(MEDIUM, measuringPoint.medium).map(LOW_LIMIT, measuringPoint.lowLimit)
				.map(UPPER_LIMIT, measuringPoint.upperLimit).map(LOW_ALARM, measuringPoint.lowAlarm)
				.map(UPPER_ALARM, measuringPoint.upperAlarm).map(LOW_INTERLOCK, measuringPoint.lowInterlock)
				.map(UPPER_INTERLOCK, measuringPoint.upperInterlock).map(UNIT_OF_MEASURE, measuringPoint.unitOfMeasure)
				.map(EQUIPMENT, measuringPoint.equipment).map(RECORD_STATUS, measuringPoint.recordStatus)
				.map(CREATED_DATE, measuringPoint.createdDate).map(CREATED_BY, measuringPoint.createdBy)
				.map(LAST_MODIFIED_DATE, measuringPoint.lastModifiedDate)
				.map(LAST_MODIFIED_BY, measuringPoint.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, measuringPoint);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MeasuringPoint> findByEquipment(Equipment equipment, GlobalSearch globalSearch, Pageable pageable) {
		QMeasuringPoint measuringPoint = QMeasuringPoint.measuringPoint;
		JPQLQuery<MeasuringPoint> query = from(measuringPoint);
		Assert.notNull(equipment, "equipment is required");
		query.where(measuringPoint.equipment.eq(equipment));
		Path<?>[] paths = new Path<?>[] { measuringPoint.measuringTag, measuringPoint.description,
				measuringPoint.measuringType, measuringPoint.medium, measuringPoint.lowLimit, measuringPoint.upperLimit,
				measuringPoint.lowAlarm, measuringPoint.upperAlarm, measuringPoint.lowInterlock,
				measuringPoint.upperInterlock, measuringPoint.unitOfMeasure, measuringPoint.equipment,
				measuringPoint.recordStatus, measuringPoint.createdDate, measuringPoint.createdBy,
				measuringPoint.lastModifiedDate, measuringPoint.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MEASURING_TAG, measuringPoint.measuringTag)
				.map(DESCRIPTION, measuringPoint.description).map(MEASURING_TYPE, measuringPoint.measuringType)
				.map(MEDIUM, measuringPoint.medium).map(LOW_LIMIT, measuringPoint.lowLimit)
				.map(UPPER_LIMIT, measuringPoint.upperLimit).map(LOW_ALARM, measuringPoint.lowAlarm)
				.map(UPPER_ALARM, measuringPoint.upperAlarm).map(LOW_INTERLOCK, measuringPoint.lowInterlock)
				.map(UPPER_INTERLOCK, measuringPoint.upperInterlock).map(UNIT_OF_MEASURE, measuringPoint.unitOfMeasure)
				.map(EQUIPMENT, measuringPoint.equipment).map(RECORD_STATUS, measuringPoint.recordStatus)
				.map(CREATED_DATE, measuringPoint.createdDate).map(CREATED_BY, measuringPoint.createdBy)
				.map(LAST_MODIFIED_DATE, measuringPoint.lastModifiedDate)
				.map(LAST_MODIFIED_BY, measuringPoint.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, measuringPoint);
	}
}
