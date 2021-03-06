package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.system.MailTemplateDefinition;
import com.ocmms.cmms.model.system.QMailTemplateDefinition;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = MailTemplateDefinitionRepositoryImpl TODO Auto-generated class
 * documentation
 *
 */

@Transactional(readOnly = true)
public class MailTemplateDefinitionRepositoryImpl extends QueryDslRepositorySupportExt<MailTemplateDefinition>
		implements MailTemplateDefinitionRepositoryCustom {

	/**
	 * Default constructor
	 */
	MailTemplateDefinitionRepositoryImpl() {
		super(MailTemplateDefinition.class);
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
	public static final String CC_RECEIVERS = "ccReceivers";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TO_RECEIVERS = "toReceivers";

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
	public static final String CLASS_NAME = "className";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String OWNER = "Owner";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECEIVER_NAME = "receiverName";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SYSTEM_DEFAULT = "systemDefault";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TEMPLATE = "template";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TITLE = "title";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MailTemplateDefinition> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QMailTemplateDefinition mailTemplateDefinition = QMailTemplateDefinition.mailTemplateDefinition;
		JPQLQuery<MailTemplateDefinition> query = from(mailTemplateDefinition);
		Path<?>[] paths = new Path<?>[] { mailTemplateDefinition.template, mailTemplateDefinition.className,
				mailTemplateDefinition.description, mailTemplateDefinition.title, mailTemplateDefinition.toReceivers,
				mailTemplateDefinition.ccReceivers, mailTemplateDefinition.receiverName, mailTemplateDefinition.Owner,
				mailTemplateDefinition.systemDefault, mailTemplateDefinition.recordStatus,
				mailTemplateDefinition.createdDate, mailTemplateDefinition.createdBy,
				mailTemplateDefinition.lastModifiedDate, mailTemplateDefinition.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(TEMPLATE, mailTemplateDefinition.template)
				.map(CLASS_NAME, mailTemplateDefinition.className).map(DESCRIPTION, mailTemplateDefinition.description)
				.map(TITLE, mailTemplateDefinition.title).map(TO_RECEIVERS, mailTemplateDefinition.toReceivers)
				.map(CC_RECEIVERS, mailTemplateDefinition.ccReceivers)
				.map(RECEIVER_NAME, mailTemplateDefinition.receiverName).map(OWNER, mailTemplateDefinition.Owner)
				.map(SYSTEM_DEFAULT, mailTemplateDefinition.systemDefault)
				.map(RECORD_STATUS, mailTemplateDefinition.recordStatus)
				.map(CREATED_DATE, mailTemplateDefinition.createdDate).map(CREATED_BY, mailTemplateDefinition.createdBy)
				.map(LAST_MODIFIED_DATE, mailTemplateDefinition.lastModifiedDate)
				.map(LAST_MODIFIED_BY, mailTemplateDefinition.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, mailTemplateDefinition);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<MailTemplateDefinition> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QMailTemplateDefinition mailTemplateDefinition = QMailTemplateDefinition.mailTemplateDefinition;
		JPQLQuery<MailTemplateDefinition> query = from(mailTemplateDefinition);
		Path<?>[] paths = new Path<?>[] { mailTemplateDefinition.template, mailTemplateDefinition.className,
				mailTemplateDefinition.description, mailTemplateDefinition.title, mailTemplateDefinition.toReceivers,
				mailTemplateDefinition.ccReceivers, mailTemplateDefinition.receiverName, mailTemplateDefinition.Owner,
				mailTemplateDefinition.systemDefault, mailTemplateDefinition.recordStatus,
				mailTemplateDefinition.createdDate, mailTemplateDefinition.createdBy,
				mailTemplateDefinition.lastModifiedDate, mailTemplateDefinition.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(mailTemplateDefinition.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(TEMPLATE, mailTemplateDefinition.template)
				.map(CLASS_NAME, mailTemplateDefinition.className).map(DESCRIPTION, mailTemplateDefinition.description)
				.map(TITLE, mailTemplateDefinition.title).map(TO_RECEIVERS, mailTemplateDefinition.toReceivers)
				.map(CC_RECEIVERS, mailTemplateDefinition.ccReceivers)
				.map(RECEIVER_NAME, mailTemplateDefinition.receiverName).map(OWNER, mailTemplateDefinition.Owner)
				.map(SYSTEM_DEFAULT, mailTemplateDefinition.systemDefault)
				.map(RECORD_STATUS, mailTemplateDefinition.recordStatus)
				.map(CREATED_DATE, mailTemplateDefinition.createdDate).map(CREATED_BY, mailTemplateDefinition.createdBy)
				.map(LAST_MODIFIED_DATE, mailTemplateDefinition.lastModifiedDate)
				.map(LAST_MODIFIED_BY, mailTemplateDefinition.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, mailTemplateDefinition);
	}
}
