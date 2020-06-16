package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.ReliefValve;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.QReliefValve;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ReliefValveRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ReliefValveRepositoryImpl extends QueryDslRepositorySupportExt<ReliefValve>
		implements ReliefValveRepositoryCustom {

	/**
	 * Default constructor
	 */
	ReliefValveRepositoryImpl() {
		super(ReliefValve.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CONNECTION_TYPE = "connectionType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANUFACTURER_MODEL_NUMBER = "manufacturerModelNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION_LOCAL = "descriptionLocal";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORKING_PRESSURE = "workingPressure";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESIGN_TEMPERATURE = "designTemperature";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_INSPECTION_DATE = "lastInspectionDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SETTING_PRESSURE = "settingPressure";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANUFACTURER_PART_NUMBER = "manufacturerPartNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NOMINAL_PRESSURE = "nominalPressure";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANUFACTURE_DATE = "manufactureDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FLUID_STATE = "fluidState";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORKING_TEMPERATURE = "workingTemperature";

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
	public static final String ABC_INDICATOR = "abcIndicator";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NEXT_INSPECTION_DATE = "nextInspectionDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANUFACTURER_SERIAL_NUMBER = "manufacturerSerialNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String NOMINAL_DIAMETER = "nominalDiameter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESIGNED_SERVICE_LIFE = "designedServiceLife";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CLASSIFICATION_CATEGORY = "classificationCategory";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DISCHARGE_LOCATION = "dischargeLocation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TAG = "tag";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ReliefValve> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QReliefValve reliefValve = QReliefValve.reliefValve;
		JPQLQuery<ReliefValve> query = from(reliefValve);
		Path<?>[] paths = new Path<?>[] { reliefValve.tag, reliefValve.description, reliefValve.descriptionLocal,
				reliefValve.abcIndicator, reliefValve.organization, reliefValve.manufacturerModelNumber,
				reliefValve.manufacturerSerialNumber, reliefValve.manufacturerPartNumber, reliefValve.memo,
				reliefValve.recordStatus, reliefValve.createdDate, reliefValve.createdBy, reliefValve.lastModifiedDate,
				reliefValve.lastModifiedBy, reliefValve.lastInspectionDate, reliefValve.nextInspectionDate,
				reliefValve.nominalPressure, reliefValve.workingPressure, reliefValve.settingPressure,
				reliefValve.nominalDiameter, reliefValve.designTemperature, reliefValve.workingTemperature,
				reliefValve.connectionType, reliefValve.medium, reliefValve.fluidState, reliefValve.dischargeLocation,
				reliefValve.manufactureDate, reliefValve.designedServiceLife, reliefValve.classificationCategory };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, reliefValve.tag)
				.map(DESCRIPTION, reliefValve.description).map(DESCRIPTION_LOCAL, reliefValve.descriptionLocal)
				.map(ABC_INDICATOR, reliefValve.abcIndicator).map(ORGANIZATION, reliefValve.organization)
				.map(MANUFACTURER_MODEL_NUMBER, reliefValve.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, reliefValve.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, reliefValve.manufacturerPartNumber).map(MEMO, reliefValve.memo)
				.map(RECORD_STATUS, reliefValve.recordStatus).map(CREATED_DATE, reliefValve.createdDate)
				.map(CREATED_BY, reliefValve.createdBy).map(LAST_MODIFIED_DATE, reliefValve.lastModifiedDate)
				.map(LAST_MODIFIED_BY, reliefValve.lastModifiedBy)
				.map(LAST_INSPECTION_DATE, reliefValve.lastInspectionDate)
				.map(NEXT_INSPECTION_DATE, reliefValve.nextInspectionDate)
				.map(NOMINAL_PRESSURE, reliefValve.nominalPressure).map(WORKING_PRESSURE, reliefValve.workingPressure)
				.map(SETTING_PRESSURE, reliefValve.settingPressure).map(NOMINAL_DIAMETER, reliefValve.nominalDiameter)
				.map(DESIGN_TEMPERATURE, reliefValve.designTemperature)
				.map(WORKING_TEMPERATURE, reliefValve.workingTemperature)
				.map(CONNECTION_TYPE, reliefValve.connectionType).map(MEDIUM, reliefValve.medium)
				.map(FLUID_STATE, reliefValve.fluidState).map(DISCHARGE_LOCATION, reliefValve.dischargeLocation)
				.map(MANUFACTURE_DATE, reliefValve.manufactureDate)
				.map(DESIGNED_SERVICE_LIFE, reliefValve.designedServiceLife)
				.map(CLASSIFICATION_CATEGORY, reliefValve.classificationCategory);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, reliefValve);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ReliefValve> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QReliefValve reliefValve = QReliefValve.reliefValve;
		JPQLQuery<ReliefValve> query = from(reliefValve);
		Path<?>[] paths = new Path<?>[] { reliefValve.tag, reliefValve.description, reliefValve.descriptionLocal,
				reliefValve.abcIndicator, reliefValve.organization, reliefValve.manufacturerModelNumber,
				reliefValve.manufacturerSerialNumber, reliefValve.manufacturerPartNumber, reliefValve.memo,
				reliefValve.recordStatus, reliefValve.createdDate, reliefValve.createdBy, reliefValve.lastModifiedDate,
				reliefValve.lastModifiedBy, reliefValve.lastInspectionDate, reliefValve.nextInspectionDate,
				reliefValve.nominalPressure, reliefValve.workingPressure, reliefValve.settingPressure,
				reliefValve.nominalDiameter, reliefValve.designTemperature, reliefValve.workingTemperature,
				reliefValve.connectionType, reliefValve.medium, reliefValve.fluidState, reliefValve.dischargeLocation,
				reliefValve.manufactureDate, reliefValve.designedServiceLife, reliefValve.classificationCategory };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(reliefValve.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TAG, reliefValve.tag)
				.map(DESCRIPTION, reliefValve.description).map(DESCRIPTION_LOCAL, reliefValve.descriptionLocal)
				.map(ABC_INDICATOR, reliefValve.abcIndicator).map(ORGANIZATION, reliefValve.organization)
				.map(MANUFACTURER_MODEL_NUMBER, reliefValve.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, reliefValve.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, reliefValve.manufacturerPartNumber).map(MEMO, reliefValve.memo)
				.map(RECORD_STATUS, reliefValve.recordStatus).map(CREATED_DATE, reliefValve.createdDate)
				.map(CREATED_BY, reliefValve.createdBy).map(LAST_MODIFIED_DATE, reliefValve.lastModifiedDate)
				.map(LAST_MODIFIED_BY, reliefValve.lastModifiedBy)
				.map(LAST_INSPECTION_DATE, reliefValve.lastInspectionDate)
				.map(NEXT_INSPECTION_DATE, reliefValve.nextInspectionDate)
				.map(NOMINAL_PRESSURE, reliefValve.nominalPressure).map(WORKING_PRESSURE, reliefValve.workingPressure)
				.map(SETTING_PRESSURE, reliefValve.settingPressure).map(NOMINAL_DIAMETER, reliefValve.nominalDiameter)
				.map(DESIGN_TEMPERATURE, reliefValve.designTemperature)
				.map(WORKING_TEMPERATURE, reliefValve.workingTemperature)
				.map(CONNECTION_TYPE, reliefValve.connectionType).map(MEDIUM, reliefValve.medium)
				.map(FLUID_STATE, reliefValve.fluidState).map(DISCHARGE_LOCATION, reliefValve.dischargeLocation)
				.map(MANUFACTURE_DATE, reliefValve.manufactureDate)
				.map(DESIGNED_SERVICE_LIFE, reliefValve.designedServiceLife)
				.map(CLASSIFICATION_CATEGORY, reliefValve.classificationCategory);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, reliefValve);
	}
}
