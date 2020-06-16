package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.RecordStatus;
import com.ocmms.cmms.model.system.QRecordStatus;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = RecordStatusRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class RecordStatusRepositoryImpl extends QueryDslRepositorySupportExt<RecordStatus>
		implements RecordStatusRepositoryCustom {

	/**
	 * Default constructor
	 */
	RecordStatusRepositoryImpl() {
		super(RecordStatus.class);
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
	public static final String CODE = "code";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_BY = "lastModifiedBy";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

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
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<RecordStatus> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QRecordStatus recordStatus = QRecordStatus.recordStatus;
		JPQLQuery<RecordStatus> query = from(recordStatus);
		Path<?>[] paths = new Path<?>[] { recordStatus.code, recordStatus.description, recordStatus.createdDate,
				recordStatus.createdBy, recordStatus.lastModifiedDate, recordStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, recordStatus.code)
				.map(DESCRIPTION, recordStatus.description).map(CREATED_DATE, recordStatus.createdDate)
				.map(CREATED_BY, recordStatus.createdBy).map(LAST_MODIFIED_DATE, recordStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, recordStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, recordStatus);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<RecordStatus> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QRecordStatus recordStatus = QRecordStatus.recordStatus;
		JPQLQuery<RecordStatus> query = from(recordStatus);
		Path<?>[] paths = new Path<?>[] { recordStatus.code, recordStatus.description, recordStatus.createdDate,
				recordStatus.createdBy, recordStatus.lastModifiedDate, recordStatus.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(recordStatus.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, recordStatus.code)
				.map(DESCRIPTION, recordStatus.description).map(CREATED_DATE, recordStatus.createdDate)
				.map(CREATED_BY, recordStatus.createdBy).map(LAST_MODIFIED_DATE, recordStatus.lastModifiedDate)
				.map(LAST_MODIFIED_BY, recordStatus.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, recordStatus);
	}
}
