package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerCutterMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.QPelletizerCutterMaintenanceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerCutterMaintenanceRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PelletizerCutterMaintenanceRecordRepositoryImpl
		extends QueryDslRepositorySupportExt<PelletizerCutterMaintenanceRecord>
		implements PelletizerCutterMaintenanceRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	PelletizerCutterMaintenanceRecordRepositoryImpl() {
		super(PelletizerCutterMaintenanceRecord.class);
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
	public Page<PelletizerCutterMaintenanceRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPelletizerCutterMaintenanceRecord pelletizerCutterMaintenanceRecord = QPelletizerCutterMaintenanceRecord.pelletizerCutterMaintenanceRecord;
		JPQLQuery<PelletizerCutterMaintenanceRecord> query = from(pelletizerCutterMaintenanceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerCutterMaintenanceRecord.materialCatalog,
				pelletizerCutterMaintenanceRecord.serialNumber, pelletizerCutterMaintenanceRecord.maintStartDate,
				pelletizerCutterMaintenanceRecord.maintEndDate, pelletizerCutterMaintenanceRecord.description,
				pelletizerCutterMaintenanceRecord.downtime, pelletizerCutterMaintenanceRecord.shutdown,
				pelletizerCutterMaintenanceRecord.worker, pelletizerCutterMaintenanceRecord.supportVendor,
				pelletizerCutterMaintenanceRecord.procurementOrder, pelletizerCutterMaintenanceRecord.recordStatus,
				pelletizerCutterMaintenanceRecord.createdDate, pelletizerCutterMaintenanceRecord.createdBy,
				pelletizerCutterMaintenanceRecord.lastModifiedDate, pelletizerCutterMaintenanceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, pelletizerCutterMaintenanceRecord.materialCatalog)
				.map(SERIAL_NUMBER, pelletizerCutterMaintenanceRecord.serialNumber)
				.map(MAINT_START_DATE, pelletizerCutterMaintenanceRecord.maintStartDate)
				.map(MAINT_END_DATE, pelletizerCutterMaintenanceRecord.maintEndDate)
				.map(DESCRIPTION, pelletizerCutterMaintenanceRecord.description)
				.map(DOWNTIME, pelletizerCutterMaintenanceRecord.downtime)
				.map(SHUTDOWN, pelletizerCutterMaintenanceRecord.shutdown)
				.map(WORKER, pelletizerCutterMaintenanceRecord.worker)
				.map(SUPPORT_VENDOR, pelletizerCutterMaintenanceRecord.supportVendor)
				.map(PROCUREMENT_ORDER, pelletizerCutterMaintenanceRecord.procurementOrder)
				.map(RECORD_STATUS, pelletizerCutterMaintenanceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerCutterMaintenanceRecord.createdDate)
				.map(CREATED_BY, pelletizerCutterMaintenanceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerCutterMaintenanceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerCutterMaintenanceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerCutterMaintenanceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PelletizerCutterMaintenanceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPelletizerCutterMaintenanceRecord pelletizerCutterMaintenanceRecord = QPelletizerCutterMaintenanceRecord.pelletizerCutterMaintenanceRecord;
		JPQLQuery<PelletizerCutterMaintenanceRecord> query = from(pelletizerCutterMaintenanceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerCutterMaintenanceRecord.materialCatalog,
				pelletizerCutterMaintenanceRecord.serialNumber, pelletizerCutterMaintenanceRecord.maintStartDate,
				pelletizerCutterMaintenanceRecord.maintEndDate, pelletizerCutterMaintenanceRecord.description,
				pelletizerCutterMaintenanceRecord.downtime, pelletizerCutterMaintenanceRecord.shutdown,
				pelletizerCutterMaintenanceRecord.worker, pelletizerCutterMaintenanceRecord.supportVendor,
				pelletizerCutterMaintenanceRecord.procurementOrder, pelletizerCutterMaintenanceRecord.recordStatus,
				pelletizerCutterMaintenanceRecord.createdDate, pelletizerCutterMaintenanceRecord.createdBy,
				pelletizerCutterMaintenanceRecord.lastModifiedDate, pelletizerCutterMaintenanceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(pelletizerCutterMaintenanceRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, pelletizerCutterMaintenanceRecord.materialCatalog)
				.map(SERIAL_NUMBER, pelletizerCutterMaintenanceRecord.serialNumber)
				.map(MAINT_START_DATE, pelletizerCutterMaintenanceRecord.maintStartDate)
				.map(MAINT_END_DATE, pelletizerCutterMaintenanceRecord.maintEndDate)
				.map(DESCRIPTION, pelletizerCutterMaintenanceRecord.description)
				.map(DOWNTIME, pelletizerCutterMaintenanceRecord.downtime)
				.map(SHUTDOWN, pelletizerCutterMaintenanceRecord.shutdown)
				.map(WORKER, pelletizerCutterMaintenanceRecord.worker)
				.map(SUPPORT_VENDOR, pelletizerCutterMaintenanceRecord.supportVendor)
				.map(PROCUREMENT_ORDER, pelletizerCutterMaintenanceRecord.procurementOrder)
				.map(RECORD_STATUS, pelletizerCutterMaintenanceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerCutterMaintenanceRecord.createdDate)
				.map(CREATED_BY, pelletizerCutterMaintenanceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerCutterMaintenanceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerCutterMaintenanceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerCutterMaintenanceRecord);
	}
}
