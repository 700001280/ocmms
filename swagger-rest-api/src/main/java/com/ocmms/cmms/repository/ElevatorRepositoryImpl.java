package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.Elevator;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.QElevator;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = ElevatorRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ElevatorRepositoryImpl extends QueryDslRepositorySupportExt<Elevator> implements ElevatorRepositoryCustom {

	/**
	 * Default constructor
	 */
	ElevatorRepositoryImpl() {
		super(Elevator.class);
	}

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PLANNER_GROUP = "plannerGroup";

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
	public static final String SUPERIOR_EQUIPMENT = "superiorEquipment";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FUNCTIONAL_LOCATION = "functionalLocation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CATALOG_PROFILE = "catalogProfile";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String START_DEPRECIATION_COST = "startDepreciationCost";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MAIN_WORK_CENTER = "mainWorkCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANUFACTURER_PART_NUMBER = "manufacturerPartNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String COUNTRY_OF_MANUFACTURE = "countryOfManufacture";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WEIGHT_UNIT = "weightUnit";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PARAMETER = "parameter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_BY = "createdBy";

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
	public static final String CONSTRUCTION_DATE = "constructionDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EQUIPMENT_CATEGORY = "equipmentCategory";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PLANT_SECTION = "plantSection";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ASSET_CLASSIFICATION = "assetClassification";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EHSS_CRITICAL = "ehssCritical";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WARRANTY_END_DATE = "warrantyEndDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACQUISITION_VALUE = "acquisitionValue";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DEPRECIATION_YEAR = "depreciationYear";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String GROSS_WEIGHT = "grossWeight";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ASSET_VALUE_CURRENCY = "assetValueCurrency";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CURRENT_BOOK_VALUE = "currentBookValue";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CONST_TYPE_MATERIAL = "constTypeMaterial";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String BEGIN_GUARANTEE_DATE = "beginGuaranteeDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CONTRACT = "contract";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OBJECT_TYPE = "objectType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUPPLIER = "supplier";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACQUISITION_DATE = "acquisitionDate";

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
	public static final String EQUIPMENT_NUMBER = "equipmentNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACQUISITION_VALUE_CURRENCY = "acquisitionValueCurrency";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PLANT_LOCATION = "plantLocation";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CAPITALIZED_DATE = "capitalizedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DRAWING_NUMBER = "drawingNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ABC_INDICATOR = "abcIndicator";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ASSET_CODE = "assetCode";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANUFACTURER = "manufacturer";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORIGINAL_ASSET_ID = "originalAssetId";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SIZE_DIMENSION = "sizeDimension";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TAG = "tag";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CRITICAL_CLASSIFICATION = "criticalClassification";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Elevator> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QElevator elevator = QElevator.elevator;
		JPQLQuery<Elevator> query = from(elevator);
		Path<?>[] paths = new Path<?>[] { elevator.tag, elevator.description, elevator.descriptionLocal,
				elevator.abcIndicator, elevator.organization, elevator.manufacturerModelNumber,
				elevator.manufacturerSerialNumber, elevator.manufacturerPartNumber, elevator.memo,
				elevator.recordStatus, elevator.createdDate, elevator.createdBy, elevator.lastModifiedDate,
				elevator.lastModifiedBy, elevator.functionalLocation, elevator.equipmentNumber,
				elevator.superiorEquipment, elevator.mainWorkCenter, elevator.plannerGroup, elevator.constructionDate,
				elevator.countryOfManufacture, elevator.manufacturer, elevator.plantSection, elevator.equipmentCategory,
				elevator.objectType, elevator.drawingNumber, elevator.catalogProfile, elevator.plantLocation,
				elevator.constTypeMaterial, elevator.sizeDimension, elevator.grossWeight, elevator.weightUnit,
				elevator.acquisitionDate, elevator.acquisitionValue, elevator.acquisitionValueCurrency,
				elevator.beginGuaranteeDate, elevator.warrantyEndDate, elevator.supplier, elevator.contract,
				elevator.ehssCritical, elevator.criticalClassification, elevator.assetCode,
				elevator.startDepreciationCost, elevator.depreciationYear, elevator.capitalizedDate,
				elevator.currentBookValue, elevator.originalAssetId, elevator.assetValueCurrency,
				elevator.assetClassification, elevator.lastInspectionDate, elevator.nextInspectionDate,
				elevator.parameter };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, elevator.tag).map(DESCRIPTION, elevator.description)
				.map(DESCRIPTION_LOCAL, elevator.descriptionLocal).map(ABC_INDICATOR, elevator.abcIndicator)
				.map(ORGANIZATION, elevator.organization)
				.map(MANUFACTURER_MODEL_NUMBER, elevator.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, elevator.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, elevator.manufacturerPartNumber).map(MEMO, elevator.memo)
				.map(RECORD_STATUS, elevator.recordStatus).map(CREATED_DATE, elevator.createdDate)
				.map(CREATED_BY, elevator.createdBy).map(LAST_MODIFIED_DATE, elevator.lastModifiedDate)
				.map(LAST_MODIFIED_BY, elevator.lastModifiedBy).map(FUNCTIONAL_LOCATION, elevator.functionalLocation)
				.map(EQUIPMENT_NUMBER, elevator.equipmentNumber).map(SUPERIOR_EQUIPMENT, elevator.superiorEquipment)
				.map(MAIN_WORK_CENTER, elevator.mainWorkCenter).map(PLANNER_GROUP, elevator.plannerGroup)
				.map(CONSTRUCTION_DATE, elevator.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, elevator.countryOfManufacture).map(MANUFACTURER, elevator.manufacturer)
				.map(PLANT_SECTION, elevator.plantSection).map(EQUIPMENT_CATEGORY, elevator.equipmentCategory)
				.map(OBJECT_TYPE, elevator.objectType).map(DRAWING_NUMBER, elevator.drawingNumber)
				.map(CATALOG_PROFILE, elevator.catalogProfile).map(PLANT_LOCATION, elevator.plantLocation)
				.map(CONST_TYPE_MATERIAL, elevator.constTypeMaterial).map(SIZE_DIMENSION, elevator.sizeDimension)
				.map(GROSS_WEIGHT, elevator.grossWeight).map(WEIGHT_UNIT, elevator.weightUnit)
				.map(ACQUISITION_DATE, elevator.acquisitionDate).map(ACQUISITION_VALUE, elevator.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, elevator.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, elevator.beginGuaranteeDate).map(WARRANTY_END_DATE, elevator.warrantyEndDate)
				.map(SUPPLIER, elevator.supplier).map(CONTRACT, elevator.contract)
				.map(EHSS_CRITICAL, elevator.ehssCritical).map(CRITICAL_CLASSIFICATION, elevator.criticalClassification)
				.map(ASSET_CODE, elevator.assetCode).map(START_DEPRECIATION_COST, elevator.startDepreciationCost)
				.map(DEPRECIATION_YEAR, elevator.depreciationYear).map(CAPITALIZED_DATE, elevator.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, elevator.currentBookValue).map(ORIGINAL_ASSET_ID, elevator.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, elevator.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, elevator.assetClassification)
				.map(LAST_INSPECTION_DATE, elevator.lastInspectionDate)
				.map(NEXT_INSPECTION_DATE, elevator.nextInspectionDate).map(PARAMETER, elevator.parameter);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, elevator);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Elevator> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QElevator elevator = QElevator.elevator;
		JPQLQuery<Elevator> query = from(elevator);
		Path<?>[] paths = new Path<?>[] { elevator.tag, elevator.description, elevator.descriptionLocal,
				elevator.abcIndicator, elevator.organization, elevator.manufacturerModelNumber,
				elevator.manufacturerSerialNumber, elevator.manufacturerPartNumber, elevator.memo,
				elevator.recordStatus, elevator.createdDate, elevator.createdBy, elevator.lastModifiedDate,
				elevator.lastModifiedBy, elevator.functionalLocation, elevator.equipmentNumber,
				elevator.superiorEquipment, elevator.mainWorkCenter, elevator.plannerGroup, elevator.constructionDate,
				elevator.countryOfManufacture, elevator.manufacturer, elevator.plantSection, elevator.equipmentCategory,
				elevator.objectType, elevator.drawingNumber, elevator.catalogProfile, elevator.plantLocation,
				elevator.constTypeMaterial, elevator.sizeDimension, elevator.grossWeight, elevator.weightUnit,
				elevator.acquisitionDate, elevator.acquisitionValue, elevator.acquisitionValueCurrency,
				elevator.beginGuaranteeDate, elevator.warrantyEndDate, elevator.supplier, elevator.contract,
				elevator.ehssCritical, elevator.criticalClassification, elevator.assetCode,
				elevator.startDepreciationCost, elevator.depreciationYear, elevator.capitalizedDate,
				elevator.currentBookValue, elevator.originalAssetId, elevator.assetValueCurrency,
				elevator.assetClassification, elevator.lastInspectionDate, elevator.nextInspectionDate,
				elevator.parameter };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(elevator.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TAG, elevator.tag).map(DESCRIPTION, elevator.description)
				.map(DESCRIPTION_LOCAL, elevator.descriptionLocal).map(ABC_INDICATOR, elevator.abcIndicator)
				.map(ORGANIZATION, elevator.organization)
				.map(MANUFACTURER_MODEL_NUMBER, elevator.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, elevator.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, elevator.manufacturerPartNumber).map(MEMO, elevator.memo)
				.map(RECORD_STATUS, elevator.recordStatus).map(CREATED_DATE, elevator.createdDate)
				.map(CREATED_BY, elevator.createdBy).map(LAST_MODIFIED_DATE, elevator.lastModifiedDate)
				.map(LAST_MODIFIED_BY, elevator.lastModifiedBy).map(FUNCTIONAL_LOCATION, elevator.functionalLocation)
				.map(EQUIPMENT_NUMBER, elevator.equipmentNumber).map(SUPERIOR_EQUIPMENT, elevator.superiorEquipment)
				.map(MAIN_WORK_CENTER, elevator.mainWorkCenter).map(PLANNER_GROUP, elevator.plannerGroup)
				.map(CONSTRUCTION_DATE, elevator.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, elevator.countryOfManufacture).map(MANUFACTURER, elevator.manufacturer)
				.map(PLANT_SECTION, elevator.plantSection).map(EQUIPMENT_CATEGORY, elevator.equipmentCategory)
				.map(OBJECT_TYPE, elevator.objectType).map(DRAWING_NUMBER, elevator.drawingNumber)
				.map(CATALOG_PROFILE, elevator.catalogProfile).map(PLANT_LOCATION, elevator.plantLocation)
				.map(CONST_TYPE_MATERIAL, elevator.constTypeMaterial).map(SIZE_DIMENSION, elevator.sizeDimension)
				.map(GROSS_WEIGHT, elevator.grossWeight).map(WEIGHT_UNIT, elevator.weightUnit)
				.map(ACQUISITION_DATE, elevator.acquisitionDate).map(ACQUISITION_VALUE, elevator.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, elevator.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, elevator.beginGuaranteeDate).map(WARRANTY_END_DATE, elevator.warrantyEndDate)
				.map(SUPPLIER, elevator.supplier).map(CONTRACT, elevator.contract)
				.map(EHSS_CRITICAL, elevator.ehssCritical).map(CRITICAL_CLASSIFICATION, elevator.criticalClassification)
				.map(ASSET_CODE, elevator.assetCode).map(START_DEPRECIATION_COST, elevator.startDepreciationCost)
				.map(DEPRECIATION_YEAR, elevator.depreciationYear).map(CAPITALIZED_DATE, elevator.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, elevator.currentBookValue).map(ORIGINAL_ASSET_ID, elevator.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, elevator.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, elevator.assetClassification)
				.map(LAST_INSPECTION_DATE, elevator.lastInspectionDate)
				.map(NEXT_INSPECTION_DATE, elevator.nextInspectionDate).map(PARAMETER, elevator.parameter);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, elevator);
	}
}
