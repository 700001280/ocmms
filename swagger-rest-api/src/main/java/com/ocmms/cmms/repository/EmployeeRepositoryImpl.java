package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.fico.CostCenter;
import com.ocmms.cmms.model.hrm.Organization;
import com.ocmms.cmms.model.hrm.QEmployee;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = EmployeeRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class EmployeeRepositoryImpl extends QueryDslRepositorySupportExt<Employee> implements EmployeeRepositoryCustom {

	/**
	 * Default constructor
	 */
	EmployeeRepositoryImpl() {
		super(Employee.class);
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
	public static final String PHONE = "phone";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String SEX = "sex";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PERSON_NUMBER = "personNumber";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String COST_CENTER = "costCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String EMAIL = "email";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String LAST_NAME = "lastName";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FIRST_NAME = "firstName";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String ORGANIZATION = "organization";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String MAINT_WORK_CENTER = "maintWorkCenter";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String USERNAME = "username";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String TITLE = "title";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String FAX = "fax";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String BIRTHDAY = "birthday";

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
	public Page<Employee> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QEmployee employee = QEmployee.employee;
		JPQLQuery<Employee> query = from(employee);
		Path<?>[] paths = new Path<?>[] { employee.organization, employee.costCenter, employee.maintWorkCenter,
				employee.personNumber, employee.username, employee.email, employee.phone, employee.firstName,
				employee.lastName, employee.title, employee.fax, employee.sex, employee.birthday, employee.memo,
				employee.recordStatus, employee.createdDate, employee.createdBy, employee.lastModifiedDate,
				employee.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, employee.organization)
				.map(COST_CENTER, employee.costCenter).map(MAINT_WORK_CENTER, employee.maintWorkCenter)
				.map(PERSON_NUMBER, employee.personNumber).map(USERNAME, employee.username).map(EMAIL, employee.email)
				.map(PHONE, employee.phone).map(FIRST_NAME, employee.firstName).map(LAST_NAME, employee.lastName)
				.map(TITLE, employee.title).map(FAX, employee.fax).map(SEX, employee.sex)
				.map(BIRTHDAY, employee.birthday).map(MEMO, employee.memo).map(RECORD_STATUS, employee.recordStatus)
				.map(CREATED_DATE, employee.createdDate).map(CREATED_BY, employee.createdBy)
				.map(LAST_MODIFIED_DATE, employee.lastModifiedDate).map(LAST_MODIFIED_BY, employee.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, employee);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Employee> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QEmployee employee = QEmployee.employee;
		JPQLQuery<Employee> query = from(employee);
		Path<?>[] paths = new Path<?>[] { employee.organization, employee.costCenter, employee.maintWorkCenter,
				employee.personNumber, employee.username, employee.email, employee.phone, employee.firstName,
				employee.lastName, employee.title, employee.fax, employee.sex, employee.birthday, employee.memo,
				employee.recordStatus, employee.createdDate, employee.createdBy, employee.lastModifiedDate,
				employee.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(employee.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, employee.organization)
				.map(COST_CENTER, employee.costCenter).map(MAINT_WORK_CENTER, employee.maintWorkCenter)
				.map(PERSON_NUMBER, employee.personNumber).map(USERNAME, employee.username).map(EMAIL, employee.email)
				.map(PHONE, employee.phone).map(FIRST_NAME, employee.firstName).map(LAST_NAME, employee.lastName)
				.map(TITLE, employee.title).map(FAX, employee.fax).map(SEX, employee.sex)
				.map(BIRTHDAY, employee.birthday).map(MEMO, employee.memo).map(RECORD_STATUS, employee.recordStatus)
				.map(CREATED_DATE, employee.createdDate).map(CREATED_BY, employee.createdBy)
				.map(LAST_MODIFIED_DATE, employee.lastModifiedDate).map(LAST_MODIFIED_BY, employee.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, employee);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param costCenter
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Employee> findByCostCenter(CostCenter costCenter, GlobalSearch globalSearch, Pageable pageable) {
		QEmployee employee = QEmployee.employee;
		JPQLQuery<Employee> query = from(employee);
		Assert.notNull(costCenter, "costCenter is required");
		query.where(employee.costCenter.eq(costCenter));
		Path<?>[] paths = new Path<?>[] { employee.organization, employee.costCenter, employee.maintWorkCenter,
				employee.personNumber, employee.username, employee.email, employee.phone, employee.firstName,
				employee.lastName, employee.title, employee.fax, employee.sex, employee.birthday, employee.memo,
				employee.recordStatus, employee.createdDate, employee.createdBy, employee.lastModifiedDate,
				employee.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, employee.organization)
				.map(COST_CENTER, employee.costCenter).map(MAINT_WORK_CENTER, employee.maintWorkCenter)
				.map(PERSON_NUMBER, employee.personNumber).map(USERNAME, employee.username).map(EMAIL, employee.email)
				.map(PHONE, employee.phone).map(FIRST_NAME, employee.firstName).map(LAST_NAME, employee.lastName)
				.map(TITLE, employee.title).map(FAX, employee.fax).map(SEX, employee.sex)
				.map(BIRTHDAY, employee.birthday).map(MEMO, employee.memo).map(RECORD_STATUS, employee.recordStatus)
				.map(CREATED_DATE, employee.createdDate).map(CREATED_BY, employee.createdBy)
				.map(LAST_MODIFIED_DATE, employee.lastModifiedDate).map(LAST_MODIFIED_BY, employee.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, employee);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param organization
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Employee> findByOrganization(Organization organization, GlobalSearch globalSearch, Pageable pageable) {
		QEmployee employee = QEmployee.employee;
		JPQLQuery<Employee> query = from(employee);
		Assert.notNull(organization, "organization is required");
		query.where(employee.organization.eq(organization));
		Path<?>[] paths = new Path<?>[] { employee.organization, employee.costCenter, employee.maintWorkCenter,
				employee.personNumber, employee.username, employee.email, employee.phone, employee.firstName,
				employee.lastName, employee.title, employee.fax, employee.sex, employee.birthday, employee.memo,
				employee.recordStatus, employee.createdDate, employee.createdBy, employee.lastModifiedDate,
				employee.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(ORGANIZATION, employee.organization)
				.map(COST_CENTER, employee.costCenter).map(MAINT_WORK_CENTER, employee.maintWorkCenter)
				.map(PERSON_NUMBER, employee.personNumber).map(USERNAME, employee.username).map(EMAIL, employee.email)
				.map(PHONE, employee.phone).map(FIRST_NAME, employee.firstName).map(LAST_NAME, employee.lastName)
				.map(TITLE, employee.title).map(FAX, employee.fax).map(SEX, employee.sex)
				.map(BIRTHDAY, employee.birthday).map(MEMO, employee.memo).map(RECORD_STATUS, employee.recordStatus)
				.map(CREATED_DATE, employee.createdDate).map(CREATED_BY, employee.createdBy)
				.map(LAST_MODIFIED_DATE, employee.lastModifiedDate).map(LAST_MODIFIED_BY, employee.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, employee);
	}
}
