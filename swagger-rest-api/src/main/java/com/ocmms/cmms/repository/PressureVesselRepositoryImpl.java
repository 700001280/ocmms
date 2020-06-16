package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.PressureVessel;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.QPressureVessel;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PressureVesselRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PressureVesselRepositoryImpl extends QueryDslRepositorySupportExt<PressureVessel>
		implements PressureVesselRepositoryCustom {

	/**
	 * Default constructor
	 */
	PressureVesselRepositoryImpl() {
		super(PressureVessel.class);
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
	public static final String MANUFACTURER_NAME = "manufacturerName";

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
	public static final String SERVICE_REGISTRATION_NUMBER = "serviceRegistrationNumber";

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
	public static final String WEIGHT_UNIT = "weightUnit";

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
	public static final String DESIGNED_SERVICE_LIFE = "designedServiceLife";

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
	public static final String PRESSURE_VESSEL_CATEGORY = "pressureVesselCategory";

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
	public static final String MAXIMUM_ALLOWABLE_WORKING_PRESSURE = "maximumAllowableWorkingPressure";

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
	public static final String DESIGN_PRESSURE = "designPressure";

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
	public Page<PressureVessel> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPressureVessel pressureVessel = QPressureVessel.pressureVessel;
		JPQLQuery<PressureVessel> query = from(pressureVessel);
		Path<?>[] paths = new Path<?>[] { pressureVessel.tag, pressureVessel.description,
				pressureVessel.descriptionLocal, pressureVessel.abcIndicator, pressureVessel.organization,
				pressureVessel.manufacturerModelNumber, pressureVessel.manufacturerSerialNumber,
				pressureVessel.manufacturerPartNumber, pressureVessel.memo, pressureVessel.recordStatus,
				pressureVessel.createdDate, pressureVessel.createdBy, pressureVessel.lastModifiedDate,
				pressureVessel.lastModifiedBy, pressureVessel.functionalLocation, pressureVessel.equipmentNumber,
				pressureVessel.superiorEquipment, pressureVessel.mainWorkCenter, pressureVessel.plannerGroup,
				pressureVessel.constructionDate, pressureVessel.countryOfManufacture, pressureVessel.manufacturer,
				pressureVessel.plantSection, pressureVessel.equipmentCategory, pressureVessel.objectType,
				pressureVessel.drawingNumber, pressureVessel.catalogProfile, pressureVessel.plantLocation,
				pressureVessel.constTypeMaterial, pressureVessel.sizeDimension, pressureVessel.grossWeight,
				pressureVessel.weightUnit, pressureVessel.acquisitionDate, pressureVessel.acquisitionValue,
				pressureVessel.acquisitionValueCurrency, pressureVessel.beginGuaranteeDate,
				pressureVessel.warrantyEndDate, pressureVessel.supplier, pressureVessel.contract,
				pressureVessel.ehssCritical, pressureVessel.criticalClassification, pressureVessel.assetCode,
				pressureVessel.startDepreciationCost, pressureVessel.depreciationYear, pressureVessel.capitalizedDate,
				pressureVessel.currentBookValue, pressureVessel.originalAssetId, pressureVessel.assetValueCurrency,
				pressureVessel.assetClassification, pressureVessel.lastInspectionDate,
				pressureVessel.nextInspectionDate, pressureVessel.serviceRegistrationNumber,
				pressureVessel.manufacturerName, pressureVessel.manufactureDate, pressureVessel.designedServiceLife,
				pressureVessel.designPressure, pressureVessel.maximumAllowableWorkingPressure,
				pressureVessel.pressureVesselCategory };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, pressureVessel.tag)
				.map(DESCRIPTION, pressureVessel.description).map(DESCRIPTION_LOCAL, pressureVessel.descriptionLocal)
				.map(ABC_INDICATOR, pressureVessel.abcIndicator).map(ORGANIZATION, pressureVessel.organization)
				.map(MANUFACTURER_MODEL_NUMBER, pressureVessel.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, pressureVessel.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, pressureVessel.manufacturerPartNumber).map(MEMO, pressureVessel.memo)
				.map(RECORD_STATUS, pressureVessel.recordStatus).map(CREATED_DATE, pressureVessel.createdDate)
				.map(CREATED_BY, pressureVessel.createdBy).map(LAST_MODIFIED_DATE, pressureVessel.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pressureVessel.lastModifiedBy)
				.map(FUNCTIONAL_LOCATION, pressureVessel.functionalLocation)
				.map(EQUIPMENT_NUMBER, pressureVessel.equipmentNumber)
				.map(SUPERIOR_EQUIPMENT, pressureVessel.superiorEquipment)
				.map(MAIN_WORK_CENTER, pressureVessel.mainWorkCenter).map(PLANNER_GROUP, pressureVessel.plannerGroup)
				.map(CONSTRUCTION_DATE, pressureVessel.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, pressureVessel.countryOfManufacture)
				.map(MANUFACTURER, pressureVessel.manufacturer).map(PLANT_SECTION, pressureVessel.plantSection)
				.map(EQUIPMENT_CATEGORY, pressureVessel.equipmentCategory).map(OBJECT_TYPE, pressureVessel.objectType)
				.map(DRAWING_NUMBER, pressureVessel.drawingNumber).map(CATALOG_PROFILE, pressureVessel.catalogProfile)
				.map(PLANT_LOCATION, pressureVessel.plantLocation)
				.map(CONST_TYPE_MATERIAL, pressureVessel.constTypeMaterial)
				.map(SIZE_DIMENSION, pressureVessel.sizeDimension).map(GROSS_WEIGHT, pressureVessel.grossWeight)
				.map(WEIGHT_UNIT, pressureVessel.weightUnit).map(ACQUISITION_DATE, pressureVessel.acquisitionDate)
				.map(ACQUISITION_VALUE, pressureVessel.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, pressureVessel.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, pressureVessel.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, pressureVessel.warrantyEndDate).map(SUPPLIER, pressureVessel.supplier)
				.map(CONTRACT, pressureVessel.contract).map(EHSS_CRITICAL, pressureVessel.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, pressureVessel.criticalClassification)
				.map(ASSET_CODE, pressureVessel.assetCode)
				.map(START_DEPRECIATION_COST, pressureVessel.startDepreciationCost)
				.map(DEPRECIATION_YEAR, pressureVessel.depreciationYear)
				.map(CAPITALIZED_DATE, pressureVessel.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, pressureVessel.currentBookValue)
				.map(ORIGINAL_ASSET_ID, pressureVessel.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, pressureVessel.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, pressureVessel.assetClassification)
				.map(LAST_INSPECTION_DATE, pressureVessel.lastInspectionDate)
				.map(NEXT_INSPECTION_DATE, pressureVessel.nextInspectionDate)
				.map(SERVICE_REGISTRATION_NUMBER, pressureVessel.serviceRegistrationNumber)
				.map(MANUFACTURER_NAME, pressureVessel.manufacturerName)
				.map(MANUFACTURE_DATE, pressureVessel.manufactureDate)
				.map(DESIGNED_SERVICE_LIFE, pressureVessel.designedServiceLife)
				.map(DESIGN_PRESSURE, pressureVessel.designPressure)
				.map(MAXIMUM_ALLOWABLE_WORKING_PRESSURE, pressureVessel.maximumAllowableWorkingPressure)
				.map(PRESSURE_VESSEL_CATEGORY, pressureVessel.pressureVesselCategory);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pressureVessel);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PressureVessel> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPressureVessel pressureVessel = QPressureVessel.pressureVessel;
		JPQLQuery<PressureVessel> query = from(pressureVessel);
		Path<?>[] paths = new Path<?>[] { pressureVessel.tag, pressureVessel.description,
				pressureVessel.descriptionLocal, pressureVessel.abcIndicator, pressureVessel.organization,
				pressureVessel.manufacturerModelNumber, pressureVessel.manufacturerSerialNumber,
				pressureVessel.manufacturerPartNumber, pressureVessel.memo, pressureVessel.recordStatus,
				pressureVessel.createdDate, pressureVessel.createdBy, pressureVessel.lastModifiedDate,
				pressureVessel.lastModifiedBy, pressureVessel.functionalLocation, pressureVessel.equipmentNumber,
				pressureVessel.superiorEquipment, pressureVessel.mainWorkCenter, pressureVessel.plannerGroup,
				pressureVessel.constructionDate, pressureVessel.countryOfManufacture, pressureVessel.manufacturer,
				pressureVessel.plantSection, pressureVessel.equipmentCategory, pressureVessel.objectType,
				pressureVessel.drawingNumber, pressureVessel.catalogProfile, pressureVessel.plantLocation,
				pressureVessel.constTypeMaterial, pressureVessel.sizeDimension, pressureVessel.grossWeight,
				pressureVessel.weightUnit, pressureVessel.acquisitionDate, pressureVessel.acquisitionValue,
				pressureVessel.acquisitionValueCurrency, pressureVessel.beginGuaranteeDate,
				pressureVessel.warrantyEndDate, pressureVessel.supplier, pressureVessel.contract,
				pressureVessel.ehssCritical, pressureVessel.criticalClassification, pressureVessel.assetCode,
				pressureVessel.startDepreciationCost, pressureVessel.depreciationYear, pressureVessel.capitalizedDate,
				pressureVessel.currentBookValue, pressureVessel.originalAssetId, pressureVessel.assetValueCurrency,
				pressureVessel.assetClassification, pressureVessel.lastInspectionDate,
				pressureVessel.nextInspectionDate, pressureVessel.serviceRegistrationNumber,
				pressureVessel.manufacturerName, pressureVessel.manufactureDate, pressureVessel.designedServiceLife,
				pressureVessel.designPressure, pressureVessel.maximumAllowableWorkingPressure,
				pressureVessel.pressureVesselCategory };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(pressureVessel.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TAG, pressureVessel.tag)
				.map(DESCRIPTION, pressureVessel.description).map(DESCRIPTION_LOCAL, pressureVessel.descriptionLocal)
				.map(ABC_INDICATOR, pressureVessel.abcIndicator).map(ORGANIZATION, pressureVessel.organization)
				.map(MANUFACTURER_MODEL_NUMBER, pressureVessel.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, pressureVessel.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, pressureVessel.manufacturerPartNumber).map(MEMO, pressureVessel.memo)
				.map(RECORD_STATUS, pressureVessel.recordStatus).map(CREATED_DATE, pressureVessel.createdDate)
				.map(CREATED_BY, pressureVessel.createdBy).map(LAST_MODIFIED_DATE, pressureVessel.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pressureVessel.lastModifiedBy)
				.map(FUNCTIONAL_LOCATION, pressureVessel.functionalLocation)
				.map(EQUIPMENT_NUMBER, pressureVessel.equipmentNumber)
				.map(SUPERIOR_EQUIPMENT, pressureVessel.superiorEquipment)
				.map(MAIN_WORK_CENTER, pressureVessel.mainWorkCenter).map(PLANNER_GROUP, pressureVessel.plannerGroup)
				.map(CONSTRUCTION_DATE, pressureVessel.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, pressureVessel.countryOfManufacture)
				.map(MANUFACTURER, pressureVessel.manufacturer).map(PLANT_SECTION, pressureVessel.plantSection)
				.map(EQUIPMENT_CATEGORY, pressureVessel.equipmentCategory).map(OBJECT_TYPE, pressureVessel.objectType)
				.map(DRAWING_NUMBER, pressureVessel.drawingNumber).map(CATALOG_PROFILE, pressureVessel.catalogProfile)
				.map(PLANT_LOCATION, pressureVessel.plantLocation)
				.map(CONST_TYPE_MATERIAL, pressureVessel.constTypeMaterial)
				.map(SIZE_DIMENSION, pressureVessel.sizeDimension).map(GROSS_WEIGHT, pressureVessel.grossWeight)
				.map(WEIGHT_UNIT, pressureVessel.weightUnit).map(ACQUISITION_DATE, pressureVessel.acquisitionDate)
				.map(ACQUISITION_VALUE, pressureVessel.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, pressureVessel.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, pressureVessel.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, pressureVessel.warrantyEndDate).map(SUPPLIER, pressureVessel.supplier)
				.map(CONTRACT, pressureVessel.contract).map(EHSS_CRITICAL, pressureVessel.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, pressureVessel.criticalClassification)
				.map(ASSET_CODE, pressureVessel.assetCode)
				.map(START_DEPRECIATION_COST, pressureVessel.startDepreciationCost)
				.map(DEPRECIATION_YEAR, pressureVessel.depreciationYear)
				.map(CAPITALIZED_DATE, pressureVessel.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, pressureVessel.currentBookValue)
				.map(ORIGINAL_ASSET_ID, pressureVessel.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, pressureVessel.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, pressureVessel.assetClassification)
				.map(LAST_INSPECTION_DATE, pressureVessel.lastInspectionDate)
				.map(NEXT_INSPECTION_DATE, pressureVessel.nextInspectionDate)
				.map(SERVICE_REGISTRATION_NUMBER, pressureVessel.serviceRegistrationNumber)
				.map(MANUFACTURER_NAME, pressureVessel.manufacturerName)
				.map(MANUFACTURE_DATE, pressureVessel.manufactureDate)
				.map(DESIGNED_SERVICE_LIFE, pressureVessel.designedServiceLife)
				.map(DESIGN_PRESSURE, pressureVessel.designPressure)
				.map(MAXIMUM_ALLOWABLE_WORKING_PRESSURE, pressureVessel.maximumAllowableWorkingPressure)
				.map(PRESSURE_VESSEL_CATEGORY, pressureVessel.pressureVesselCategory);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pressureVessel);
	}
}
