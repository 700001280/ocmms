package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PartMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.QPartMaintenanceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PartMaintenanceRecordRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class PartMaintenanceRecordRepositoryImpl extends QueryDslRepositorySupportExt<PartMaintenanceRecord>
		implements PartMaintenanceRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	PartMaintenanceRecordRepositoryImpl() {
		super(PartMaintenanceRecord.class);
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
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MAINT_START_DATE = "maintStartDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUPPORT_VENDOR = "supportVendor";

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
	public static final String DOWNTIME = "downtime";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WORKER = "worker";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SERIAL_NUMBER = "serialNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PROCUREMENT_ORDER = "procurementOrder";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MATERIAL_CATALOG = "materialCatalog";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SHUTDOWN = "shutdown";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MAINT_END_DATE = "maintEndDate";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PartMaintenanceRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPartMaintenanceRecord partMaintenanceRecord = QPartMaintenanceRecord.partMaintenanceRecord;
		JPQLQuery<PartMaintenanceRecord> query = from(partMaintenanceRecord);
		Path<?>[] paths = new Path<?>[] { partMaintenanceRecord.materialCatalog, partMaintenanceRecord.serialNumber,
				partMaintenanceRecord.maintStartDate, partMaintenanceRecord.maintEndDate,
				partMaintenanceRecord.description, partMaintenanceRecord.downtime, partMaintenanceRecord.shutdown,
				partMaintenanceRecord.worker, partMaintenanceRecord.supportVendor,
				partMaintenanceRecord.procurementOrder, partMaintenanceRecord.recordStatus,
				partMaintenanceRecord.createdDate, partMaintenanceRecord.createdBy,
				partMaintenanceRecord.lastModifiedDate, partMaintenanceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, partMaintenanceRecord.materialCatalog)
				.map(SERIAL_NUMBER, partMaintenanceRecord.serialNumber)
				.map(MAINT_START_DATE, partMaintenanceRecord.maintStartDate)
				.map(MAINT_END_DATE, partMaintenanceRecord.maintEndDate)
				.map(DESCRIPTION, partMaintenanceRecord.description).map(DOWNTIME, partMaintenanceRecord.downtime)
				.map(SHUTDOWN, partMaintenanceRecord.shutdown).map(WORKER, partMaintenanceRecord.worker)
				.map(SUPPORT_VENDOR, partMaintenanceRecord.supportVendor)
				.map(PROCUREMENT_ORDER, partMaintenanceRecord.procurementOrder)
				.map(RECORD_STATUS, partMaintenanceRecord.recordStatus)
				.map(CREATED_DATE, partMaintenanceRecord.createdDate).map(CREATED_BY, partMaintenanceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, partMaintenanceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, partMaintenanceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, partMaintenanceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PartMaintenanceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QPartMaintenanceRecord partMaintenanceRecord = QPartMaintenanceRecord.partMaintenanceRecord;
		JPQLQuery<PartMaintenanceRecord> query = from(partMaintenanceRecord);
		Path<?>[] paths = new Path<?>[] { partMaintenanceRecord.materialCatalog, partMaintenanceRecord.serialNumber,
				partMaintenanceRecord.maintStartDate, partMaintenanceRecord.maintEndDate,
				partMaintenanceRecord.description, partMaintenanceRecord.downtime, partMaintenanceRecord.shutdown,
				partMaintenanceRecord.worker, partMaintenanceRecord.supportVendor,
				partMaintenanceRecord.procurementOrder, partMaintenanceRecord.recordStatus,
				partMaintenanceRecord.createdDate, partMaintenanceRecord.createdBy,
				partMaintenanceRecord.lastModifiedDate, partMaintenanceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(partMaintenanceRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MATERIAL_CATALOG, partMaintenanceRecord.materialCatalog)
				.map(SERIAL_NUMBER, partMaintenanceRecord.serialNumber)
				.map(MAINT_START_DATE, partMaintenanceRecord.maintStartDate)
				.map(MAINT_END_DATE, partMaintenanceRecord.maintEndDate)
				.map(DESCRIPTION, partMaintenanceRecord.description).map(DOWNTIME, partMaintenanceRecord.downtime)
				.map(SHUTDOWN, partMaintenanceRecord.shutdown).map(WORKER, partMaintenanceRecord.worker)
				.map(SUPPORT_VENDOR, partMaintenanceRecord.supportVendor)
				.map(PROCUREMENT_ORDER, partMaintenanceRecord.procurementOrder)
				.map(RECORD_STATUS, partMaintenanceRecord.recordStatus)
				.map(CREATED_DATE, partMaintenanceRecord.createdDate).map(CREATED_BY, partMaintenanceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, partMaintenanceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, partMaintenanceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, partMaintenanceRecord);
	}
}
