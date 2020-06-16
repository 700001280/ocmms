package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.regulatory.Hoist;
import com.ocmms.cmms.model.pm.technicalobject.regulatory.QHoist;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = HoistRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class HoistRepositoryImpl extends QueryDslRepositorySupportExt<Hoist> implements HoistRepositoryCustom {

	/**
	 * Default constructor
	 */
	HoistRepositoryImpl() {
		super(Hoist.class);
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
	public static final String INSTALLATION_DATE = "installationDate";

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
	public static final String ON_SERVICE_DATE = "onServiceDate";

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
	public Page<Hoist> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QHoist hoist = QHoist.hoist;
		JPQLQuery<Hoist> query = from(hoist);
		Path<?>[] paths = new Path<?>[] { hoist.tag, hoist.description, hoist.descriptionLocal, hoist.abcIndicator,
				hoist.organization, hoist.manufacturerModelNumber, hoist.manufacturerSerialNumber,
				hoist.manufacturerPartNumber, hoist.memo, hoist.recordStatus, hoist.createdDate, hoist.createdBy,
				hoist.lastModifiedDate, hoist.lastModifiedBy, hoist.functionalLocation, hoist.equipmentNumber,
				hoist.superiorEquipment, hoist.mainWorkCenter, hoist.plannerGroup, hoist.constructionDate,
				hoist.countryOfManufacture, hoist.manufacturer, hoist.plantSection, hoist.equipmentCategory,
				hoist.objectType, hoist.drawingNumber, hoist.catalogProfile, hoist.plantLocation,
				hoist.constTypeMaterial, hoist.sizeDimension, hoist.grossWeight, hoist.weightUnit,
				hoist.acquisitionDate, hoist.acquisitionValue, hoist.acquisitionValueCurrency, hoist.beginGuaranteeDate,
				hoist.warrantyEndDate, hoist.supplier, hoist.contract, hoist.ehssCritical, hoist.criticalClassification,
				hoist.assetCode, hoist.startDepreciationCost, hoist.depreciationYear, hoist.capitalizedDate,
				hoist.currentBookValue, hoist.originalAssetId, hoist.assetValueCurrency, hoist.assetClassification,
				hoist.lastInspectionDate, hoist.nextInspectionDate, hoist.parameter, hoist.manufacturerName,
				hoist.installationDate, hoist.onServiceDate };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, hoist.tag).map(DESCRIPTION, hoist.description)
				.map(DESCRIPTION_LOCAL, hoist.descriptionLocal).map(ABC_INDICATOR, hoist.abcIndicator)
				.map(ORGANIZATION, hoist.organization).map(MANUFACTURER_MODEL_NUMBER, hoist.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, hoist.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, hoist.manufacturerPartNumber).map(MEMO, hoist.memo)
				.map(RECORD_STATUS, hoist.recordStatus).map(CREATED_DATE, hoist.createdDate)
				.map(CREATED_BY, hoist.createdBy).map(LAST_MODIFIED_DATE, hoist.lastModifiedDate)
				.map(LAST_MODIFIED_BY, hoist.lastModifiedBy).map(FUNCTIONAL_LOCATION, hoist.functionalLocation)
				.map(EQUIPMENT_NUMBER, hoist.equipmentNumber).map(SUPERIOR_EQUIPMENT, hoist.superiorEquipment)
				.map(MAIN_WORK_CENTER, hoist.mainWorkCenter).map(PLANNER_GROUP, hoist.plannerGroup)
				.map(CONSTRUCTION_DATE, hoist.constructionDate).map(COUNTRY_OF_MANUFACTURE, hoist.countryOfManufacture)
				.map(MANUFACTURER, hoist.manufacturer).map(PLANT_SECTION, hoist.plantSection)
				.map(EQUIPMENT_CATEGORY, hoist.equipmentCategory).map(OBJECT_TYPE, hoist.objectType)
				.map(DRAWING_NUMBER, hoist.drawingNumber).map(CATALOG_PROFILE, hoist.catalogProfile)
				.map(PLANT_LOCATION, hoist.plantLocation).map(CONST_TYPE_MATERIAL, hoist.constTypeMaterial)
				.map(SIZE_DIMENSION, hoist.sizeDimension).map(GROSS_WEIGHT, hoist.grossWeight)
				.map(WEIGHT_UNIT, hoist.weightUnit).map(ACQUISITION_DATE, hoist.acquisitionDate)
				.map(ACQUISITION_VALUE, hoist.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, hoist.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, hoist.beginGuaranteeDate).map(WARRANTY_END_DATE, hoist.warrantyEndDate)
				.map(SUPPLIER, hoist.supplier).map(CONTRACT, hoist.contract).map(EHSS_CRITICAL, hoist.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, hoist.criticalClassification).map(ASSET_CODE, hoist.assetCode)
				.map(START_DEPRECIATION_COST, hoist.startDepreciationCost)
				.map(DEPRECIATION_YEAR, hoist.depreciationYear).map(CAPITALIZED_DATE, hoist.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, hoist.currentBookValue).map(ORIGINAL_ASSET_ID, hoist.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, hoist.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, hoist.assetClassification)
				.map(LAST_INSPECTION_DATE, hoist.lastInspectionDate).map(NEXT_INSPECTION_DATE, hoist.nextInspectionDate)
				.map(PARAMETER, hoist.parameter).map(MANUFACTURER_NAME, hoist.manufacturerName)
				.map(INSTALLATION_DATE, hoist.installationDate).map(ON_SERVICE_DATE, hoist.onServiceDate);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, hoist);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Hoist> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QHoist hoist = QHoist.hoist;
		JPQLQuery<Hoist> query = from(hoist);
		Path<?>[] paths = new Path<?>[] { hoist.tag, hoist.description, hoist.descriptionLocal, hoist.abcIndicator,
				hoist.organization, hoist.manufacturerModelNumber, hoist.manufacturerSerialNumber,
				hoist.manufacturerPartNumber, hoist.memo, hoist.recordStatus, hoist.createdDate, hoist.createdBy,
				hoist.lastModifiedDate, hoist.lastModifiedBy, hoist.functionalLocation, hoist.equipmentNumber,
				hoist.superiorEquipment, hoist.mainWorkCenter, hoist.plannerGroup, hoist.constructionDate,
				hoist.countryOfManufacture, hoist.manufacturer, hoist.plantSection, hoist.equipmentCategory,
				hoist.objectType, hoist.drawingNumber, hoist.catalogProfile, hoist.plantLocation,
				hoist.constTypeMaterial, hoist.sizeDimension, hoist.grossWeight, hoist.weightUnit,
				hoist.acquisitionDate, hoist.acquisitionValue, hoist.acquisitionValueCurrency, hoist.beginGuaranteeDate,
				hoist.warrantyEndDate, hoist.supplier, hoist.contract, hoist.ehssCritical, hoist.criticalClassification,
				hoist.assetCode, hoist.startDepreciationCost, hoist.depreciationYear, hoist.capitalizedDate,
				hoist.currentBookValue, hoist.originalAssetId, hoist.assetValueCurrency, hoist.assetClassification,
				hoist.lastInspectionDate, hoist.nextInspectionDate, hoist.parameter, hoist.manufacturerName,
				hoist.installationDate, hoist.onServiceDate };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(hoist.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TAG, hoist.tag).map(DESCRIPTION, hoist.description)
				.map(DESCRIPTION_LOCAL, hoist.descriptionLocal).map(ABC_INDICATOR, hoist.abcIndicator)
				.map(ORGANIZATION, hoist.organization).map(MANUFACTURER_MODEL_NUMBER, hoist.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, hoist.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, hoist.manufacturerPartNumber).map(MEMO, hoist.memo)
				.map(RECORD_STATUS, hoist.recordStatus).map(CREATED_DATE, hoist.createdDate)
				.map(CREATED_BY, hoist.createdBy).map(LAST_MODIFIED_DATE, hoist.lastModifiedDate)
				.map(LAST_MODIFIED_BY, hoist.lastModifiedBy).map(FUNCTIONAL_LOCATION, hoist.functionalLocation)
				.map(EQUIPMENT_NUMBER, hoist.equipmentNumber).map(SUPERIOR_EQUIPMENT, hoist.superiorEquipment)
				.map(MAIN_WORK_CENTER, hoist.mainWorkCenter).map(PLANNER_GROUP, hoist.plannerGroup)
				.map(CONSTRUCTION_DATE, hoist.constructionDate).map(COUNTRY_OF_MANUFACTURE, hoist.countryOfManufacture)
				.map(MANUFACTURER, hoist.manufacturer).map(PLANT_SECTION, hoist.plantSection)
				.map(EQUIPMENT_CATEGORY, hoist.equipmentCategory).map(OBJECT_TYPE, hoist.objectType)
				.map(DRAWING_NUMBER, hoist.drawingNumber).map(CATALOG_PROFILE, hoist.catalogProfile)
				.map(PLANT_LOCATION, hoist.plantLocation).map(CONST_TYPE_MATERIAL, hoist.constTypeMaterial)
				.map(SIZE_DIMENSION, hoist.sizeDimension).map(GROSS_WEIGHT, hoist.grossWeight)
				.map(WEIGHT_UNIT, hoist.weightUnit).map(ACQUISITION_DATE, hoist.acquisitionDate)
				.map(ACQUISITION_VALUE, hoist.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, hoist.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, hoist.beginGuaranteeDate).map(WARRANTY_END_DATE, hoist.warrantyEndDate)
				.map(SUPPLIER, hoist.supplier).map(CONTRACT, hoist.contract).map(EHSS_CRITICAL, hoist.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, hoist.criticalClassification).map(ASSET_CODE, hoist.assetCode)
				.map(START_DEPRECIATION_COST, hoist.startDepreciationCost)
				.map(DEPRECIATION_YEAR, hoist.depreciationYear).map(CAPITALIZED_DATE, hoist.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, hoist.currentBookValue).map(ORIGINAL_ASSET_ID, hoist.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, hoist.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, hoist.assetClassification)
				.map(LAST_INSPECTION_DATE, hoist.lastInspectionDate).map(NEXT_INSPECTION_DATE, hoist.nextInspectionDate)
				.map(PARAMETER, hoist.parameter).map(MANUFACTURER_NAME, hoist.manufacturerName)
				.map(INSTALLATION_DATE, hoist.installationDate).map(ON_SERVICE_DATE, hoist.onServiceDate);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, hoist);
	}
}
