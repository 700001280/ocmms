package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderMaterial;
import com.ocmms.cmms.model.pm.workorder.QWorkOrderMaterial;
import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = WorkOrderMaterialRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class WorkOrderMaterialRepositoryImpl extends QueryDslRepositorySupportExt<WorkOrderMaterial>
		implements WorkOrderMaterialRepositoryCustom {

	/**
	 * Default constructor
	 */
	WorkOrderMaterialRepositoryImpl() {
		super(WorkOrderMaterial.class);
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
	public static final String WORK_ORDER = "workOrder";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PART_NAME = "partName";

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
	public static final String QUANTITY = "quantity";

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
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL = "material";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderMaterial> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderMaterial workOrderMaterial = QWorkOrderMaterial.workOrderMaterial;
		JPQLQuery<WorkOrderMaterial> query = from(workOrderMaterial);
		Path<?>[] paths = new Path<?>[] { workOrderMaterial.workOrder, workOrderMaterial.material,
				workOrderMaterial.quantity, workOrderMaterial.partName, workOrderMaterial.unit,
				workOrderMaterial.recordStatus, workOrderMaterial.createdDate, workOrderMaterial.createdBy,
				workOrderMaterial.lastModifiedDate, workOrderMaterial.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER, workOrderMaterial.workOrder)
				.map(MATERIAL, workOrderMaterial.material).map(QUANTITY, workOrderMaterial.quantity)
				.map(PART_NAME, workOrderMaterial.partName).map(UNIT, workOrderMaterial.unit)
				.map(RECORD_STATUS, workOrderMaterial.recordStatus).map(CREATED_DATE, workOrderMaterial.createdDate)
				.map(CREATED_BY, workOrderMaterial.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderMaterial.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderMaterial.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderMaterial);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderMaterial> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QWorkOrderMaterial workOrderMaterial = QWorkOrderMaterial.workOrderMaterial;
		JPQLQuery<WorkOrderMaterial> query = from(workOrderMaterial);
		Path<?>[] paths = new Path<?>[] { workOrderMaterial.workOrder, workOrderMaterial.material,
				workOrderMaterial.quantity, workOrderMaterial.partName, workOrderMaterial.unit,
				workOrderMaterial.recordStatus, workOrderMaterial.createdDate, workOrderMaterial.createdBy,
				workOrderMaterial.lastModifiedDate, workOrderMaterial.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(workOrderMaterial.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER, workOrderMaterial.workOrder)
				.map(MATERIAL, workOrderMaterial.material).map(QUANTITY, workOrderMaterial.quantity)
				.map(PART_NAME, workOrderMaterial.partName).map(UNIT, workOrderMaterial.unit)
				.map(RECORD_STATUS, workOrderMaterial.recordStatus).map(CREATED_DATE, workOrderMaterial.createdDate)
				.map(CREATED_BY, workOrderMaterial.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderMaterial.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderMaterial.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderMaterial);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrder
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<WorkOrderMaterial> findByWorkOrder(WorkOrderHeader workOrder, GlobalSearch globalSearch,
			Pageable pageable) {
		QWorkOrderMaterial workOrderMaterial = QWorkOrderMaterial.workOrderMaterial;
		JPQLQuery<WorkOrderMaterial> query = from(workOrderMaterial);
		Assert.notNull(workOrder, "workOrder is required");
		query.where(workOrderMaterial.workOrder.eq(workOrder));
		Path<?>[] paths = new Path<?>[] { workOrderMaterial.workOrder, workOrderMaterial.material,
				workOrderMaterial.quantity, workOrderMaterial.partName, workOrderMaterial.unit,
				workOrderMaterial.recordStatus, workOrderMaterial.createdDate, workOrderMaterial.createdBy,
				workOrderMaterial.lastModifiedDate, workOrderMaterial.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(WORK_ORDER, workOrderMaterial.workOrder)
				.map(MATERIAL, workOrderMaterial.material).map(QUANTITY, workOrderMaterial.quantity)
				.map(PART_NAME, workOrderMaterial.partName).map(UNIT, workOrderMaterial.unit)
				.map(RECORD_STATUS, workOrderMaterial.recordStatus).map(CREATED_DATE, workOrderMaterial.createdDate)
				.map(CREATED_BY, workOrderMaterial.createdBy)
				.map(LAST_MODIFIED_DATE, workOrderMaterial.lastModifiedDate)
				.map(LAST_MODIFIED_BY, workOrderMaterial.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, workOrderMaterial);
	}
}
