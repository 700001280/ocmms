package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.technicalobject.EquipmentLubrication;
import com.ocmms.cmms.model.pm.technicalobject.Equipment;
import com.ocmms.cmms.model.pm.technicalobject.QEquipmentLubrication;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = EquipmentLubricationRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class EquipmentLubricationRepositoryImpl extends QueryDslRepositorySupportExt<EquipmentLubrication>
		implements EquipmentLubricationRepositoryCustom {

	/**
	 * Default constructor
	 */
	EquipmentLubricationRepositoryImpl() {
		super(EquipmentLubrication.class);
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
	public static final String RUNTIME_CYCLE_UNIT = "runtimeCycleUnit";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RUNTIME_CYCLE = "runtimeCycle";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FILL_QUANTITY = "fillQuantity";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LUB_UNIT = "lubUnit";

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
	public static final String LUB_POINT = "lubPoint";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String INTERVAL_CYCLE = "intervalCycle";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_CATALOG = "materialCatalog";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String INTERVAL_CYCLE_UNIT = "intervalCycleUnit";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentLubrication> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentLubrication equipmentLubrication = QEquipmentLubrication.equipmentLubrication;
		JPQLQuery<EquipmentLubrication> query = from(equipmentLubrication);
		Path<?>[] paths = new Path<?>[] { equipmentLubrication.materialCatalog, equipmentLubrication.fillQuantity,
				equipmentLubrication.lubPoint, equipmentLubrication.lubUnit, equipmentLubrication.intervalCycleUnit,
				equipmentLubrication.intervalCycle, equipmentLubrication.runtimeCycleUnit,
				equipmentLubrication.runtimeCycle, equipmentLubrication.description, equipmentLubrication.recordStatus,
				equipmentLubrication.createdDate, equipmentLubrication.createdBy, equipmentLubrication.lastModifiedDate,
				equipmentLubrication.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, equipmentLubrication.materialCatalog)
				.map(FILL_QUANTITY, equipmentLubrication.fillQuantity).map(LUB_POINT, equipmentLubrication.lubPoint)
				.map(LUB_UNIT, equipmentLubrication.lubUnit)
				.map(INTERVAL_CYCLE_UNIT, equipmentLubrication.intervalCycleUnit)
				.map(INTERVAL_CYCLE, equipmentLubrication.intervalCycle)
				.map(RUNTIME_CYCLE_UNIT, equipmentLubrication.runtimeCycleUnit)
				.map(RUNTIME_CYCLE, equipmentLubrication.runtimeCycle)
				.map(DESCRIPTION, equipmentLubrication.description)
				.map(RECORD_STATUS, equipmentLubrication.recordStatus)
				.map(CREATED_DATE, equipmentLubrication.createdDate).map(CREATED_BY, equipmentLubrication.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentLubrication.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentLubrication.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentLubrication);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentLubrication> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QEquipmentLubrication equipmentLubrication = QEquipmentLubrication.equipmentLubrication;
		JPQLQuery<EquipmentLubrication> query = from(equipmentLubrication);
		Path<?>[] paths = new Path<?>[] { equipmentLubrication.materialCatalog, equipmentLubrication.fillQuantity,
				equipmentLubrication.lubPoint, equipmentLubrication.lubUnit, equipmentLubrication.intervalCycleUnit,
				equipmentLubrication.intervalCycle, equipmentLubrication.runtimeCycleUnit,
				equipmentLubrication.runtimeCycle, equipmentLubrication.description, equipmentLubrication.recordStatus,
				equipmentLubrication.createdDate, equipmentLubrication.createdBy, equipmentLubrication.lastModifiedDate,
				equipmentLubrication.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(equipmentLubrication.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, equipmentLubrication.materialCatalog)
				.map(FILL_QUANTITY, equipmentLubrication.fillQuantity).map(LUB_POINT, equipmentLubrication.lubPoint)
				.map(LUB_UNIT, equipmentLubrication.lubUnit)
				.map(INTERVAL_CYCLE_UNIT, equipmentLubrication.intervalCycleUnit)
				.map(INTERVAL_CYCLE, equipmentLubrication.intervalCycle)
				.map(RUNTIME_CYCLE_UNIT, equipmentLubrication.runtimeCycleUnit)
				.map(RUNTIME_CYCLE, equipmentLubrication.runtimeCycle)
				.map(DESCRIPTION, equipmentLubrication.description)
				.map(RECORD_STATUS, equipmentLubrication.recordStatus)
				.map(CREATED_DATE, equipmentLubrication.createdDate).map(CREATED_BY, equipmentLubrication.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentLubrication.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentLubrication.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentLubrication);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param equipments
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<EquipmentLubrication> findByEquipmentsContains(Equipment equipments, GlobalSearch globalSearch,
			Pageable pageable) {
		QEquipmentLubrication equipmentLubrication = QEquipmentLubrication.equipmentLubrication;
		JPQLQuery<EquipmentLubrication> query = from(equipmentLubrication);
		Assert.notNull(equipments, "equipments is required");
		query.where(equipmentLubrication.equipments.contains(equipments));
		Path<?>[] paths = new Path<?>[] { equipmentLubrication.materialCatalog, equipmentLubrication.fillQuantity,
				equipmentLubrication.lubPoint, equipmentLubrication.lubUnit, equipmentLubrication.intervalCycleUnit,
				equipmentLubrication.intervalCycle, equipmentLubrication.runtimeCycleUnit,
				equipmentLubrication.runtimeCycle, equipmentLubrication.description, equipmentLubrication.recordStatus,
				equipmentLubrication.createdDate, equipmentLubrication.createdBy, equipmentLubrication.lastModifiedDate,
				equipmentLubrication.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, equipmentLubrication.materialCatalog)
				.map(FILL_QUANTITY, equipmentLubrication.fillQuantity).map(LUB_POINT, equipmentLubrication.lubPoint)
				.map(LUB_UNIT, equipmentLubrication.lubUnit)
				.map(INTERVAL_CYCLE_UNIT, equipmentLubrication.intervalCycleUnit)
				.map(INTERVAL_CYCLE, equipmentLubrication.intervalCycle)
				.map(RUNTIME_CYCLE_UNIT, equipmentLubrication.runtimeCycleUnit)
				.map(RUNTIME_CYCLE, equipmentLubrication.runtimeCycle)
				.map(DESCRIPTION, equipmentLubrication.description)
				.map(RECORD_STATUS, equipmentLubrication.recordStatus)
				.map(CREATED_DATE, equipmentLubrication.createdDate).map(CREATED_BY, equipmentLubrication.createdBy)
				.map(LAST_MODIFIED_DATE, equipmentLubrication.lastModifiedDate)
				.map(LAST_MODIFIED_BY, equipmentLubrication.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, equipmentLubrication);
	}
}
