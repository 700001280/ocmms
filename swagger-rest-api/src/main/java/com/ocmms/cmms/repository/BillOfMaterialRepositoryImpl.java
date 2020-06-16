package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.BillOfMaterial;
import com.ocmms.cmms.model.mm.master.MaterialCatalog;
import com.ocmms.cmms.model.pm.technicalobject.QBillOfMaterial;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = BillOfMaterialRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class BillOfMaterialRepositoryImpl extends QueryDslRepositorySupportExt<BillOfMaterial>
		implements BillOfMaterialRepositoryCustom {

	/**
	 * Default constructor
	 */
	BillOfMaterialRepositoryImpl() {
		super(BillOfMaterial.class);
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
	public static final String DRAWING_NUMBER = "drawingNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TECH_POSITION_NUMBER = "techPositionNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ABC_INDICATOR = "abcIndicator";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANUFACTURER_SERIAL_NUMBER = "manufacturerSerialNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String POSITION_NUMBER = "positionNumber";

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
	public static final String NEED_STOCK = "needStock";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SAFESTOCK = "safestock";

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
	public static final String BOM_COMPONENT = "bomComponent";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SET_SIZE = "setSize";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MANUFACTURER_PART_NUMBER = "manufacturerPartNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TAG = "tag";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PARAMETER = "parameter";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<BillOfMaterial> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QBillOfMaterial billOfMaterial = QBillOfMaterial.billOfMaterial;
		JPQLQuery<BillOfMaterial> query = from(billOfMaterial);
		Path<?>[] paths = new Path<?>[] { billOfMaterial.tag, billOfMaterial.description,
				billOfMaterial.descriptionLocal, billOfMaterial.abcIndicator, billOfMaterial.organization,
				billOfMaterial.manufacturerModelNumber, billOfMaterial.manufacturerSerialNumber,
				billOfMaterial.manufacturerPartNumber, billOfMaterial.memo, billOfMaterial.recordStatus,
				billOfMaterial.createdDate, billOfMaterial.createdBy, billOfMaterial.lastModifiedDate,
				billOfMaterial.lastModifiedBy, billOfMaterial.bomComponent, billOfMaterial.setSize,
				billOfMaterial.safestock, billOfMaterial.unit, billOfMaterial.drawingNumber,
				billOfMaterial.techPositionNumber, billOfMaterial.parameter, billOfMaterial.positionNumber,
				billOfMaterial.needStock };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, billOfMaterial.tag)
				.map(DESCRIPTION, billOfMaterial.description).map(DESCRIPTION_LOCAL, billOfMaterial.descriptionLocal)
				.map(ABC_INDICATOR, billOfMaterial.abcIndicator).map(ORGANIZATION, billOfMaterial.organization)
				.map(MANUFACTURER_MODEL_NUMBER, billOfMaterial.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, billOfMaterial.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, billOfMaterial.manufacturerPartNumber).map(MEMO, billOfMaterial.memo)
				.map(RECORD_STATUS, billOfMaterial.recordStatus).map(CREATED_DATE, billOfMaterial.createdDate)
				.map(CREATED_BY, billOfMaterial.createdBy).map(LAST_MODIFIED_DATE, billOfMaterial.lastModifiedDate)
				.map(LAST_MODIFIED_BY, billOfMaterial.lastModifiedBy).map(BOM_COMPONENT, billOfMaterial.bomComponent)
				.map(SET_SIZE, billOfMaterial.setSize).map(SAFESTOCK, billOfMaterial.safestock)
				.map(UNIT, billOfMaterial.unit).map(DRAWING_NUMBER, billOfMaterial.drawingNumber)
				.map(TECH_POSITION_NUMBER, billOfMaterial.techPositionNumber).map(PARAMETER, billOfMaterial.parameter)
				.map(POSITION_NUMBER, billOfMaterial.positionNumber).map(NEED_STOCK, billOfMaterial.needStock);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, billOfMaterial);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<BillOfMaterial> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QBillOfMaterial billOfMaterial = QBillOfMaterial.billOfMaterial;
		JPQLQuery<BillOfMaterial> query = from(billOfMaterial);
		Path<?>[] paths = new Path<?>[] { billOfMaterial.tag, billOfMaterial.description,
				billOfMaterial.descriptionLocal, billOfMaterial.abcIndicator, billOfMaterial.organization,
				billOfMaterial.manufacturerModelNumber, billOfMaterial.manufacturerSerialNumber,
				billOfMaterial.manufacturerPartNumber, billOfMaterial.memo, billOfMaterial.recordStatus,
				billOfMaterial.createdDate, billOfMaterial.createdBy, billOfMaterial.lastModifiedDate,
				billOfMaterial.lastModifiedBy, billOfMaterial.bomComponent, billOfMaterial.setSize,
				billOfMaterial.safestock, billOfMaterial.unit, billOfMaterial.drawingNumber,
				billOfMaterial.techPositionNumber, billOfMaterial.parameter, billOfMaterial.positionNumber,
				billOfMaterial.needStock };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(billOfMaterial.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TAG, billOfMaterial.tag)
				.map(DESCRIPTION, billOfMaterial.description).map(DESCRIPTION_LOCAL, billOfMaterial.descriptionLocal)
				.map(ABC_INDICATOR, billOfMaterial.abcIndicator).map(ORGANIZATION, billOfMaterial.organization)
				.map(MANUFACTURER_MODEL_NUMBER, billOfMaterial.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, billOfMaterial.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, billOfMaterial.manufacturerPartNumber).map(MEMO, billOfMaterial.memo)
				.map(RECORD_STATUS, billOfMaterial.recordStatus).map(CREATED_DATE, billOfMaterial.createdDate)
				.map(CREATED_BY, billOfMaterial.createdBy).map(LAST_MODIFIED_DATE, billOfMaterial.lastModifiedDate)
				.map(LAST_MODIFIED_BY, billOfMaterial.lastModifiedBy).map(BOM_COMPONENT, billOfMaterial.bomComponent)
				.map(SET_SIZE, billOfMaterial.setSize).map(SAFESTOCK, billOfMaterial.safestock)
				.map(UNIT, billOfMaterial.unit).map(DRAWING_NUMBER, billOfMaterial.drawingNumber)
				.map(TECH_POSITION_NUMBER, billOfMaterial.techPositionNumber).map(PARAMETER, billOfMaterial.parameter)
				.map(POSITION_NUMBER, billOfMaterial.positionNumber).map(NEED_STOCK, billOfMaterial.needStock);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, billOfMaterial);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param bomComponent
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<BillOfMaterial> findByBomComponent(MaterialCatalog bomComponent, GlobalSearch globalSearch,
			Pageable pageable) {
		QBillOfMaterial billOfMaterial = QBillOfMaterial.billOfMaterial;
		JPQLQuery<BillOfMaterial> query = from(billOfMaterial);
		Assert.notNull(bomComponent, "bomComponent is required");
		query.where(billOfMaterial.bomComponent.eq(bomComponent));
		Path<?>[] paths = new Path<?>[] { billOfMaterial.tag, billOfMaterial.description,
				billOfMaterial.descriptionLocal, billOfMaterial.abcIndicator, billOfMaterial.organization,
				billOfMaterial.manufacturerModelNumber, billOfMaterial.manufacturerSerialNumber,
				billOfMaterial.manufacturerPartNumber, billOfMaterial.memo, billOfMaterial.recordStatus,
				billOfMaterial.createdDate, billOfMaterial.createdBy, billOfMaterial.lastModifiedDate,
				billOfMaterial.lastModifiedBy, billOfMaterial.bomComponent, billOfMaterial.setSize,
				billOfMaterial.safestock, billOfMaterial.unit, billOfMaterial.drawingNumber,
				billOfMaterial.techPositionNumber, billOfMaterial.parameter, billOfMaterial.positionNumber,
				billOfMaterial.needStock };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, billOfMaterial.tag)
				.map(DESCRIPTION, billOfMaterial.description).map(DESCRIPTION_LOCAL, billOfMaterial.descriptionLocal)
				.map(ABC_INDICATOR, billOfMaterial.abcIndicator).map(ORGANIZATION, billOfMaterial.organization)
				.map(MANUFACTURER_MODEL_NUMBER, billOfMaterial.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, billOfMaterial.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, billOfMaterial.manufacturerPartNumber).map(MEMO, billOfMaterial.memo)
				.map(RECORD_STATUS, billOfMaterial.recordStatus).map(CREATED_DATE, billOfMaterial.createdDate)
				.map(CREATED_BY, billOfMaterial.createdBy).map(LAST_MODIFIED_DATE, billOfMaterial.lastModifiedDate)
				.map(LAST_MODIFIED_BY, billOfMaterial.lastModifiedBy).map(BOM_COMPONENT, billOfMaterial.bomComponent)
				.map(SET_SIZE, billOfMaterial.setSize).map(SAFESTOCK, billOfMaterial.safestock)
				.map(UNIT, billOfMaterial.unit).map(DRAWING_NUMBER, billOfMaterial.drawingNumber)
				.map(TECH_POSITION_NUMBER, billOfMaterial.techPositionNumber).map(PARAMETER, billOfMaterial.parameter)
				.map(POSITION_NUMBER, billOfMaterial.positionNumber).map(NEED_STOCK, billOfMaterial.needStock);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, billOfMaterial);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObjects
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<BillOfMaterial> findByTechnicalObjectsContains(TechnicalObject technicalObjects,
			GlobalSearch globalSearch, Pageable pageable) {
		QBillOfMaterial billOfMaterial = QBillOfMaterial.billOfMaterial;
		JPQLQuery<BillOfMaterial> query = from(billOfMaterial);
		Assert.notNull(technicalObjects, "technicalObjects is required");
		query.where(billOfMaterial.technicalObjects.contains(technicalObjects));
		Path<?>[] paths = new Path<?>[] { billOfMaterial.tag, billOfMaterial.description,
				billOfMaterial.descriptionLocal, billOfMaterial.abcIndicator, billOfMaterial.organization,
				billOfMaterial.manufacturerModelNumber, billOfMaterial.manufacturerSerialNumber,
				billOfMaterial.manufacturerPartNumber, billOfMaterial.memo, billOfMaterial.recordStatus,
				billOfMaterial.createdDate, billOfMaterial.createdBy, billOfMaterial.lastModifiedDate,
				billOfMaterial.lastModifiedBy, billOfMaterial.bomComponent, billOfMaterial.setSize,
				billOfMaterial.safestock, billOfMaterial.unit, billOfMaterial.drawingNumber,
				billOfMaterial.techPositionNumber, billOfMaterial.parameter, billOfMaterial.positionNumber,
				billOfMaterial.needStock };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TAG, billOfMaterial.tag)
				.map(DESCRIPTION, billOfMaterial.description).map(DESCRIPTION_LOCAL, billOfMaterial.descriptionLocal)
				.map(ABC_INDICATOR, billOfMaterial.abcIndicator).map(ORGANIZATION, billOfMaterial.organization)
				.map(MANUFACTURER_MODEL_NUMBER, billOfMaterial.manufacturerModelNumber)
				.map(MANUFACTURER_SERIAL_NUMBER, billOfMaterial.manufacturerSerialNumber)
				.map(MANUFACTURER_PART_NUMBER, billOfMaterial.manufacturerPartNumber).map(MEMO, billOfMaterial.memo)
				.map(RECORD_STATUS, billOfMaterial.recordStatus).map(CREATED_DATE, billOfMaterial.createdDate)
				.map(CREATED_BY, billOfMaterial.createdBy).map(LAST_MODIFIED_DATE, billOfMaterial.lastModifiedDate)
				.map(LAST_MODIFIED_BY, billOfMaterial.lastModifiedBy).map(BOM_COMPONENT, billOfMaterial.bomComponent)
				.map(SET_SIZE, billOfMaterial.setSize).map(SAFESTOCK, billOfMaterial.safestock)
				.map(UNIT, billOfMaterial.unit).map(DRAWING_NUMBER, billOfMaterial.drawingNumber)
				.map(TECH_POSITION_NUMBER, billOfMaterial.techPositionNumber).map(PARAMETER, billOfMaterial.parameter)
				.map(POSITION_NUMBER, billOfMaterial.positionNumber).map(NEED_STOCK, billOfMaterial.needStock);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, billOfMaterial);
	}
}
