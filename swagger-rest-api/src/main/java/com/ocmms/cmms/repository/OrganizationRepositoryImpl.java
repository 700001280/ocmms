package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.hrm.QOrganization;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = OrganizationRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class OrganizationRepositoryImpl extends QueryDslRepositorySupportExt<Organization>
		implements OrganizationRepositoryCustom {

	/**
	 * Default constructor
	 */
	OrganizationRepositoryImpl() {
		super(Organization.class);
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
	public static final String ORG_NAME = "orgName";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PHONE = "phone";

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
	public static final String CODE = "code";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MAIL = "mail";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String DESCRIPTION = "description";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String POSTAL_CODE = "postalCode";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String WEB = "web";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ACTIVE = "active";
	
	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SORTS = "sorts";


	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ADDRESS = "address";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FAX = "fax";

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Organization> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QOrganization organization = QOrganization.organization;
		JPQLQuery<Organization> query = from(organization);
		Path<?>[] paths = new Path<?>[] { organization.code, organization.orgName, organization.description,
				organization.postalCode, organization.phone, organization.fax, organization.web, organization.mail,
				organization.recordStatus, organization.createdDate, organization.createdBy,
				organization.lastModifiedDate, organization.lastModifiedBy, organization.sorts, organization.active,
				organization.address };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, organization.code).map(ORG_NAME, organization.orgName)
				.map(DESCRIPTION, organization.description).map(POSTAL_CODE, organization.postalCode)
				.map(PHONE, organization.phone).map(FAX, organization.fax).map(WEB, organization.web)
				.map(MAIL, organization.mail).map(RECORD_STATUS, organization.recordStatus)
				.map(CREATED_DATE, organization.createdDate).map(CREATED_BY, organization.createdBy)
				.map(LAST_MODIFIED_DATE, organization.lastModifiedDate)
				.map(LAST_MODIFIED_BY, organization.lastModifiedBy)
				.map(SORTS, organization.sorts).map(ACTIVE, organization.active).map(ADDRESS, organization.address);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, organization);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Organization> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QOrganization organization = QOrganization.organization;
		JPQLQuery<Organization> query = from(organization);
		Path<?>[] paths = new Path<?>[] { organization.code, organization.orgName, organization.description,
				organization.postalCode, organization.phone, organization.fax, organization.web, organization.mail,
				organization.recordStatus, organization.createdDate, organization.createdBy,
				organization.lastModifiedDate, organization.lastModifiedBy, organization.sorts, organization.active,
				organization.address };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(organization.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, organization.code).map(ORG_NAME, organization.orgName)
				.map(DESCRIPTION, organization.description).map(POSTAL_CODE, organization.postalCode)
				.map(PHONE, organization.phone).map(FAX, organization.fax).map(WEB, organization.web)
				.map(MAIL, organization.mail).map(RECORD_STATUS, organization.recordStatus)
				.map(CREATED_DATE, organization.createdDate).map(CREATED_BY, organization.createdBy)
				.map(LAST_MODIFIED_DATE, organization.lastModifiedDate)
				.map(LAST_MODIFIED_BY, organization.lastModifiedBy)
				.map(SORTS, organization.sorts).map(ACTIVE, organization.active).map(ADDRESS, organization.address);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, organization);
	}


}
