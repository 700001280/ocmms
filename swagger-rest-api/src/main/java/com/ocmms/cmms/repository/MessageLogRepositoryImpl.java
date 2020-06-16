package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.assistance.MessageLog;
import com.ocmms.cmms.model.assistance.QMessageLog;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MessageLogRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class MessageLogRepositoryImpl extends QueryDslRepositorySupportExt<MessageLog>
		implements MessageLogRepositoryCustom {

	/**
	 * Default constructor
	 */
	MessageLogRepositoryImpl() {
		super(MessageLog.class);
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
	public static final String MESSAGE = "message";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECEIVER_ROLE = "receiverRole";

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
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MessageLog> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMessageLog messageLog = QMessageLog.messageLog;
		JPQLQuery<MessageLog> query = from(messageLog);
		Path<?>[] paths = new Path<?>[] { messageLog.message, messageLog.receiverRole, messageLog.recordStatus,
				messageLog.createdDate, messageLog.createdBy, messageLog.lastModifiedDate, messageLog.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(MESSAGE, messageLog.message)
				.map(RECEIVER_ROLE, messageLog.receiverRole).map(RECORD_STATUS, messageLog.recordStatus)
				.map(CREATED_DATE, messageLog.createdDate).map(CREATED_BY, messageLog.createdBy)
				.map(LAST_MODIFIED_DATE, messageLog.lastModifiedDate).map(LAST_MODIFIED_BY, messageLog.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, messageLog);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MessageLog> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMessageLog messageLog = QMessageLog.messageLog;
		JPQLQuery<MessageLog> query = from(messageLog);
		Path<?>[] paths = new Path<?>[] { messageLog.message, messageLog.receiverRole, messageLog.recordStatus,
				messageLog.createdDate, messageLog.createdBy, messageLog.lastModifiedDate, messageLog.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(messageLog.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(MESSAGE, messageLog.message)
				.map(RECEIVER_ROLE, messageLog.receiverRole).map(RECORD_STATUS, messageLog.recordStatus)
				.map(CREATED_DATE, messageLog.createdDate).map(CREATED_BY, messageLog.createdBy)
				.map(LAST_MODIFIED_DATE, messageLog.lastModifiedDate).map(LAST_MODIFIED_BY, messageLog.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, messageLog);
	}
}
