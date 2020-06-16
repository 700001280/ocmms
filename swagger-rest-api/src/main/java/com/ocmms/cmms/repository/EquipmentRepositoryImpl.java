package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.asset.AssetClassification;
import com.ocmms.cmms.model.eshem.CriticalClassification;
import com.ocmms.cmms.model.pm.configuration.MainWorkCenter;
import com.ocmms.cmms.model.pm.configuration.ObjectType;
import com.ocmms.cmms.model.pm.configuration.PlannerGroup;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.pm.technicalobject.EquipmentCategory;
import com.ocmms.cmms.model.pm.technicalobject.FunctionalLocation;
import com.ocmms.cmms.model.pm.technicalobject.QEquipment;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = EquipmentRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class EquipmentRepositoryImpl extends QueryDslRepositorySupportExt<Equipment>
		implements EquipmentRepositoryCustom {

	/**
	 * Default constructor
	 */
	EquipmentRepositoryImpl() {
		super(Equipment.class);
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
	public static final String CREATED_BY = "createdBy";

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
	public Page<Equipment> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(equipment.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param assetClassification
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findByAssetClassification(AssetClassification assetClassification, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Assert.notNull(assetClassification, "assetClassification is required");
		query.where(equipment.assetClassification.eq(assetClassification));
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param criticalClassification
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findByCriticalClassification(CriticalClassification criticalClassification,
			GlobalSearch globalSearch, Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Assert.notNull(criticalClassification, "criticalClassification is required");
		query.where(equipment.criticalClassification.eq(criticalClassification));
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipmentCategory
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findByEquipmentCategory(EquipmentCategory equipmentCategory, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Assert.notNull(equipmentCategory, "equipmentCategory is required");
		query.where(equipment.equipmentCategory.eq(equipmentCategory));
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param functionalLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findByFunctionalLocation(FunctionalLocation functionalLocation, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Assert.notNull(functionalLocation, "functionalLocation is required");
		query.where(equipment.functionalLocation.eq(functionalLocation));
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param mainWorkCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findByMainWorkCenter(MainWorkCenter mainWorkCenter, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Assert.notNull(mainWorkCenter, "mainWorkCenter is required");
		query.where(equipment.mainWorkCenter.eq(mainWorkCenter));
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param objectType
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findByObjectType(ObjectType objectType, GlobalSearch globalSearch, Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Assert.notNull(objectType, "objectType is required");
		query.where(equipment.objectType.eq(objectType));
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plannerGroup
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findByPlannerGroup(PlannerGroup plannerGroup, GlobalSearch globalSearch, Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Assert.notNull(plannerGroup, "plannerGroup is required");
		query.where(equipment.plannerGroup.eq(plannerGroup));
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plantLocation
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findByPlantLocation(PlantLocation plantLocation, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Assert.notNull(plantLocation, "plantLocation is required");
		query.where(equipment.plantLocation.eq(plantLocation));
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plantSection
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findByPlantSection(PlantSection plantSection, GlobalSearch globalSearch, Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Assert.notNull(plantSection, "plantSection is required");
		query.where(equipment.plantSection.eq(plantSection));
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param superiorEquipment
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Equipment> findBySuperiorEquipment(TechnicalObject superiorEquipment, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipment equipment = QEquipment.equipment;
		JPQLQuery<Equipment> query = from(equipment);
		Assert.notNull(superiorEquipment, "superiorEquipment is required");
		query.where(equipment.superiorEquipment.eq(superiorEquipment));
		Path<?>[] paths = new Path<?>[] { equipment.tag, equipment.description, equipment.descriptionLocal,
				equipment.abcIndicator, equipment.organization, equipment.manufacturerModelNumber,
				equipment.manufacturerSerialNumber, equipment.manufacturerPartNumber, equipment.memo,
				equipment.recordStatus, equipment.createdDate, equipment.createdBy, equipment.lastModifiedDate,
				equipment.lastModifiedBy, equipment.functionalLocation, equipment.equipmentNumber,
				equipment.superiorEquipment, equipment.mainWorkCenter, equipment.plannerGroup,
				equipment.constructionDate, equipment.countryOfManufacture, equipment.manufacturer,
				equipment.plantSection, equipment.equipmentCategory, equipment.objectType, equipment.drawingNumber,
				equipment.catalogProfile, equipment.plantLocation, equipment.constTypeMaterial, equipment.sizeDimension,
				equipment.grossWeight, equipment.weightUnit, equipment.acquisitionDate, equipment.acquisitionValue,
				equipment.acquisitionValueCurrency, equipment.beginGuaranteeDate, equipment.warrantyEndDate,
				equipment.supplier, equipment.contract, equipment.ehssCritical, equipment.criticalClassification,
				equipment.assetCode, equipment.startDepreciationCost, equipment.depreciationYear,
				equipment.capitalizedDate, equipment.currentBookValue, equipment.originalAssetId,
				equipment.assetValueCurrency, equipment.assetClassification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, equipment.tag).map(DESCRIPTION, equipment.description)
				.map(DESCRIPTION_LOCAL, equipment.descriptionLocal).map(ABC_INDICATOR, equipment.abcIndicator)
				.map(ORGANIZATION, equipment.organization)
				.map(MANUFACTURER_MODEL_NUMBER, equipment.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, equipment.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, equipment.manufacturerPartNumber).map(MEMO, equipment.memo)
				.map(RECORD_STATUS, equipment.recordStatus).map(CREATED_DATE, equipment.createdDate)
				.map(CREATED_BY, equipment.createdBy).map(LAST_MODIFIED_DATE, equipment.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipment.lastModifiedBy).map(FUNCTIONAL_LOCATION, equipment.functionalLocation)
				.map(EQUIPMENT_NUMBER, equipment.equipmentNumber).map(SUPERIOR_EQUIPMENT, equipment.superiorEquipment)
				.map(MAIN_WORK_CENTER, equipment.mainWorkCenter).map(PLANNER_GROUP, equipment.plannerGroup)
				.map(CONSTRUCTION_DATE, equipment.constructionDate)
				.map(COUNTRY_OF_MANUFACTURE, equipment.countryOfManufacture).map(MANUFACTURER, equipment.manufacturer)
				.map(PLANT_SECTION, equipment.plantSection).map(EQUIPMENT_CATEGORY, equipment.equipmentCategory)
				.map(OBJECT_TYPE, equipment.objectType).map(DRAWING_NUMBER, equipment.drawingNumber)
				.map(CATALOG_PROFILE, equipment.catalogProfile).map(PLANT_LOCATION, equipment.plantLocation)
				.map(CONST_TYPE_MATERIAL, equipment.constTypeMaterial).map(SIZE_DIMENSION, equipment.sizeDimension)
				.map(GROSS_WEIGHT, equipment.grossWeight).map(WEIGHT_UNIT, equipment.weightUnit)
				.map(ACQUISITION_DATE, equipment.acquisitionDate).map(ACQUISITION_VALUE, equipment.acquisitionValue)
				.map(ACQUISITION_VALUE_CURRENCY, equipment.acquisitionValueCurrency)
				.map(BEGIN_GUARANTEE_DATE, equipment.beginGuaranteeDate)
				.map(WARRANTY_END_DATE, equipment.warrantyEndDate).map(SUPPLIER, equipment.supplier)
				.map(CONTRACT, equipment.contract).map(EHSS_CRITICAL, equipment.ehssCritical)
				.map(CRITICAL_CLASSIFICATION, equipment.criticalClassification).map(ASSET_CODE, equipment.assetCode)
				.map(START_DEPRECIATION_COST, equipment.startDepreciationCost)
				.map(DEPRECIATION_YEAR, equipment.depreciationYear).map(CAPITALIZED_DATE, equipment.capitalizedDate)
				.map(CURRENT_BOOK_VALUE, equipment.currentBookValue).map(ORIGINAL_ASSET_ID, equipment.originalAssetId)
				.map(ASSET_VALUE_CURRENCY, equipment.assetValueCurrency)
				.map(ASSET_CLASSIFICATION, equipment.assetClassification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipment);
	}
}
