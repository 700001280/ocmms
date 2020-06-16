package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.procurement.ProcurementRequest;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.mm.procurement.QProcurementRequest;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = ProcurementRequestRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ProcurementRequestRepositoryImpl extends QueryDslRepositorySupportExt<ProcurementRequest>
		implements ProcurementRequestRepositoryCustom {

	/**
	 * Default constructor
	 */
	ProcurementRequestRepositoryImpl() {
		super(ProcurementRequest.class);
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
	public static final String REQUEST_NUMBER = "requestNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CLOSED = "closed";

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
	public static final String REQUESTER = "requester";

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
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SUBMIT_DATE = "submitDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String REQUEST_DATE = "requestDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CATALOG_TYPE = "catalogType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PRIORITY_TYPE = "priorityType";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MEMO = "memo";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProcurementRequest> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QProcurementRequest procurementRequest = QProcurementRequest.procurementRequest;
		JPQLQuery<ProcurementRequest> query = from(procurementRequest);
		Path<?>[] paths = new Path<?>[] { procurementRequest.priorityType, procurementRequest.catalogType,
				procurementRequest.requester, procurementRequest.submitDate, procurementRequest.requestDate,
				procurementRequest.requestNumber, procurementRequest.organization, procurementRequest.memo,
				procurementRequest.closed, procurementRequest.recordStatus, procurementRequest.createdDate,
				procurementRequest.createdBy, procurementRequest.lastModifiedDate, procurementRequest.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PRIORITY_TYPE, procurementRequest.priorityType)
				.map(CATALOG_TYPE, procurementRequest.catalogType).map(REQUESTER, procurementRequest.requester)
				.map(SUBMIT_DATE, procurementRequest.submitDate).map(REQUEST_DATE, procurementRequest.requestDate)
				.map(REQUEST_NUMBER, procurementRequest.requestNumber)
				.map(ORGANIZATION, procurementRequest.organization).map(MEMO, procurementRequest.memo)
				.map(CLOSED, procurementRequest.closed).map(RECORD_STATUS, procurementRequest.recordStatus)
				.map(CREATED_DATE, procurementRequest.createdDate).map(CREATED_BY, procurementRequest.createdBy)
				.map(LAST_MODIFIED_DATE, procurementRequest.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementRequest.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementRequest);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProcurementRequest> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QProcurementRequest procurementRequest = QProcurementRequest.procurementRequest;
		JPQLQuery<ProcurementRequest> query = from(procurementRequest);
		Path<?>[] paths = new Path<?>[] { procurementRequest.priorityType, procurementRequest.catalogType,
				procurementRequest.requester, procurementRequest.submitDate, procurementRequest.requestDate,
				procurementRequest.requestNumber, procurementRequest.organization, procurementRequest.memo,
				procurementRequest.closed, procurementRequest.recordStatus, procurementRequest.createdDate,
				procurementRequest.createdBy, procurementRequest.lastModifiedDate, procurementRequest.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(procurementRequest.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(PRIORITY_TYPE, procurementRequest.priorityType)
				.map(CATALOG_TYPE, procurementRequest.catalogType).map(REQUESTER, procurementRequest.requester)
				.map(SUBMIT_DATE, procurementRequest.submitDate).map(REQUEST_DATE, procurementRequest.requestDate)
				.map(REQUEST_NUMBER, procurementRequest.requestNumber)
				.map(ORGANIZATION, procurementRequest.organization).map(MEMO, procurementRequest.memo)
				.map(CLOSED, procurementRequest.closed).map(RECORD_STATUS, procurementRequest.recordStatus)
				.map(CREATED_DATE, procurementRequest.createdDate).map(CREATED_BY, procurementRequest.createdBy)
				.map(LAST_MODIFIED_DATE, procurementRequest.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementRequest.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementRequest);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param requester
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ProcurementRequest> findByRequester(Employee requester, GlobalSearch globalSearch, Pageable pageable) {
		QProcurementRequest procurementRequest = QProcurementRequest.procurementRequest;
		JPQLQuery<ProcurementRequest> query = from(procurementRequest);
		Assert.notNull(requester, "requester is required");
		query.where(procurementRequest.requester.eq(requester));
		Path<?>[] paths = new Path<?>[] { procurementRequest.priorityType, procurementRequest.catalogType,
				procurementRequest.requester, procurementRequest.submitDate, procurementRequest.requestDate,
				procurementRequest.requestNumber, procurementRequest.organization, procurementRequest.memo,
				procurementRequest.closed, procurementRequest.recordStatus, procurementRequest.createdDate,
				procurementRequest.createdBy, procurementRequest.lastModifiedDate, procurementRequest.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(PRIORITY_TYPE, procurementRequest.priorityType)
				.map(CATALOG_TYPE, procurementRequest.catalogType).map(REQUESTER, procurementRequest.requester)
				.map(SUBMIT_DATE, procurementRequest.submitDate).map(REQUEST_DATE, procurementRequest.requestDate)
				.map(REQUEST_NUMBER, procurementRequest.requestNumber)
				.map(ORGANIZATION, procurementRequest.organization).map(MEMO, procurementRequest.memo)
				.map(CLOSED, procurementRequest.closed).map(RECORD_STATUS, procurementRequest.recordStatus)
				.map(CREATED_DATE, procurementRequest.createdDate).map(CREATED_BY, procurementRequest.createdBy)
				.map(LAST_MODIFIED_DATE, procurementRequest.lastModifiedDate)
				.map(LAST_MODIFIED_BY, procurementRequest.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, procurementRequest);
	}
}
