package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.routine.PelletizerUpRollerMaintenanceRecord;
import com.ocmms.cmms.model.pm.routine.QPelletizerUpRollerMaintenanceRecord;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = PelletizerUpRollerMaintenanceRecordRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class PelletizerUpRollerMaintenanceRecordRepositoryImpl
		extends QueryDslRepositorySupportExt<PelletizerUpRollerMaintenanceRecord>
		implements PelletizerUpRollerMaintenanceRecordRepositoryCustom {

	/**
	 * Default constructor
	 */
	PelletizerUpRollerMaintenanceRecordRepositoryImpl() {
		super(PelletizerUpRollerMaintenanceRecord.class);
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
	public Page<PelletizerUpRollerMaintenanceRecord> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QPelletizerUpRollerMaintenanceRecord pelletizerUpRollerMaintenanceRecord = QPelletizerUpRollerMaintenanceRecord.pelletizerUpRollerMaintenanceRecord;
		JPQLQuery<PelletizerUpRollerMaintenanceRecord> query = from(pelletizerUpRollerMaintenanceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerUpRollerMaintenanceRecord.materialCatalog,
				pelletizerUpRollerMaintenanceRecord.serialNumber, pelletizerUpRollerMaintenanceRecord.maintStartDate,
				pelletizerUpRollerMaintenanceRecord.maintEndDate, pelletizerUpRollerMaintenanceRecord.description,
				pelletizerUpRollerMaintenanceRecord.downtime, pelletizerUpRollerMaintenanceRecord.shutdown,
				pelletizerUpRollerMaintenanceRecord.worker, pelletizerUpRollerMaintenanceRecord.supportVendor,
				pelletizerUpRollerMaintenanceRecord.procurementOrder, pelletizerUpRollerMaintenanceRecord.recordStatus,
				pelletizerUpRollerMaintenanceRecord.createdDate, pelletizerUpRollerMaintenanceRecord.createdBy,
				pelletizerUpRollerMaintenanceRecord.lastModifiedDate,
				pelletizerUpRollerMaintenanceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, pelletizerUpRollerMaintenanceRecord.materialCatalog)
				.map(SERIAL_NUMBER, pelletizerUpRollerMaintenanceRecord.serialNumber)
				.map(MAINT_START_DATE, pelletizerUpRollerMaintenanceRecord.maintStartDate)
				.map(MAINT_END_DATE, pelletizerUpRollerMaintenanceRecord.maintEndDate)
				.map(DESCRIPTION, pelletizerUpRollerMaintenanceRecord.description)
				.map(DOWNTIME, pelletizerUpRollerMaintenanceRecord.downtime)
				.map(SHUTDOWN, pelletizerUpRollerMaintenanceRecord.shutdown)
				.map(WORKER, pelletizerUpRollerMaintenanceRecord.worker)
				.map(SUPPORT_VENDOR, pelletizerUpRollerMaintenanceRecord.supportVendor)
				.map(PROCUREMENT_ORDER, pelletizerUpRollerMaintenanceRecord.procurementOrder)
				.map(RECORD_STATUS, pelletizerUpRollerMaintenanceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerUpRollerMaintenanceRecord.createdDate)
				.map(CREATED_BY, pelletizerUpRollerMaintenanceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerUpRollerMaintenanceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerUpRollerMaintenanceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerUpRollerMaintenanceRecord);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<PelletizerUpRollerMaintenanceRecord> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch,
			Pageable pageable) {
		QPelletizerUpRollerMaintenanceRecord pelletizerUpRollerMaintenanceRecord = QPelletizerUpRollerMaintenanceRecord.pelletizerUpRollerMaintenanceRecord;
		JPQLQuery<PelletizerUpRollerMaintenanceRecord> query = from(pelletizerUpRollerMaintenanceRecord);
		Path<?>[] paths = new Path<?>[] { pelletizerUpRollerMaintenanceRecord.materialCatalog,
				pelletizerUpRollerMaintenanceRecord.serialNumber, pelletizerUpRollerMaintenanceRecord.maintStartDate,
				pelletizerUpRollerMaintenanceRecord.maintEndDate, pelletizerUpRollerMaintenanceRecord.description,
				pelletizerUpRollerMaintenanceRecord.downtime, pelletizerUpRollerMaintenanceRecord.shutdown,
				pelletizerUpRollerMaintenanceRecord.worker, pelletizerUpRollerMaintenanceRecord.supportVendor,
				pelletizerUpRollerMaintenanceRecord.procurementOrder, pelletizerUpRollerMaintenanceRecord.recordStatus,
				pelletizerUpRollerMaintenanceRecord.createdDate, pelletizerUpRollerMaintenanceRecord.createdBy,
				pelletizerUpRollerMaintenanceRecord.lastModifiedDate,
				pelletizerUpRollerMaintenanceRecord.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(pelletizerUpRollerMaintenanceRecord.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper()
				.map(MATERIAL_CATALOG, pelletizerUpRollerMaintenanceRecord.materialCatalog)
				.map(SERIAL_NUMBER, pelletizerUpRollerMaintenanceRecord.serialNumber)
				.map(MAINT_START_DATE, pelletizerUpRollerMaintenanceRecord.maintStartDate)
				.map(MAINT_END_DATE, pelletizerUpRollerMaintenanceRecord.maintEndDate)
				.map(DESCRIPTION, pelletizerUpRollerMaintenanceRecord.description)
				.map(DOWNTIME, pelletizerUpRollerMaintenanceRecord.downtime)
				.map(SHUTDOWN, pelletizerUpRollerMaintenanceRecord.shutdown)
				.map(WORKER, pelletizerUpRollerMaintenanceRecord.worker)
				.map(SUPPORT_VENDOR, pelletizerUpRollerMaintenanceRecord.supportVendor)
				.map(PROCUREMENT_ORDER, pelletizerUpRollerMaintenanceRecord.procurementOrder)
				.map(RECORD_STATUS, pelletizerUpRollerMaintenanceRecord.recordStatus)
				.map(CREATED_DATE, pelletizerUpRollerMaintenanceRecord.createdDate)
				.map(CREATED_BY, pelletizerUpRollerMaintenanceRecord.createdBy)
				.map(LAST_MODIFIED_DATE, pelletizerUpRollerMaintenanceRecord.lastModifiedDate)
				.map(LAST_MODIFIED_BY, pelletizerUpRollerMaintenanceRecord.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, pelletizerUpRollerMaintenanceRecord);
	}
}
