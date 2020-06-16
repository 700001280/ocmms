package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.task.TaskOperationMaterial;
import com.ocmms.cmms.model.pm.task.QTaskOperationMaterial;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = TaskOperationMaterialRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class TaskOperationMaterialRepositoryImpl extends QueryDslRepositorySupportExt<TaskOperationMaterial>
		implements TaskOperationMaterialRepositoryCustom {

	/**
	 * Default constructor
	 */
	TaskOperationMaterialRepositoryImpl() {
		super(TaskOperationMaterial.class);
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
	public static final String TASK_OPERATION_HEADER = "taskOperationHeader";

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
	public Page<TaskOperationMaterial> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QTaskOperationMaterial taskOperationMaterial = QTaskOperationMaterial.taskOperationMaterial;
		JPQLQuery<TaskOperationMaterial> query = from(taskOperationMaterial);
		Path<?>[] paths = new Path<?>[] { taskOperationMaterial.taskOperationHeader, taskOperationMaterial.material,
				taskOperationMaterial.quantity, taskOperationMaterial.recordStatus, taskOperationMaterial.createdDate,
				taskOperationMaterial.createdBy, taskOperationMaterial.lastModifiedDate,
				taskOperationMaterial.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(TASK_OPERATION_HEADER, taskOperationMaterial.taskOperationHeader)
				.map(MATERIAL, taskOperationMaterial.material).map(QUANTITY, taskOperationMaterial.quantity)
				.map(RECORD_STATUS, taskOperationMaterial.recordStatus)
				.map(CREATED_DATE, taskOperationMaterial.createdDate).map(CREATED_BY, taskOperationMaterial.createdBy)
				.map(LAST_MODIFIED_DATE, taskOperationMaterial.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskOperationMaterial.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskOperationMaterial);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<TaskOperationMaterial> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QTaskOperationMaterial taskOperationMaterial = QTaskOperationMaterial.taskOperationMaterial;
		JPQLQuery<TaskOperationMaterial> query = from(taskOperationMaterial);
		Path<?>[] paths = new Path<?>[] { taskOperationMaterial.taskOperationHeader, taskOperationMaterial.material,
				taskOperationMaterial.quantity, taskOperationMaterial.recordStatus, taskOperationMaterial.createdDate,
				taskOperationMaterial.createdBy, taskOperationMaterial.lastModifiedDate,
				taskOperationMaterial.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(taskOperationMaterial.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(TASK_OPERATION_HEADER, taskOperationMaterial.taskOperationHeader)
				.map(MATERIAL, taskOperationMaterial.material).map(QUANTITY, taskOperationMaterial.quantity)
				.map(RECORD_STATUS, taskOperationMaterial.recordStatus)
				.map(CREATED_DATE, taskOperationMaterial.createdDate).map(CREATED_BY, taskOperationMaterial.createdBy)
				.map(LAST_MODIFIED_DATE, taskOperationMaterial.lastModifiedDate)
				.map(LAST_MODIFIED_BY, taskOperationMaterial.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, taskOperationMaterial);
	}
}
