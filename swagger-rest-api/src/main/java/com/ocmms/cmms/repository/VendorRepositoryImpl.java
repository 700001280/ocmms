package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.srm.Vendor;
import com.ocmms.cmms.model.srm.QVendor;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;

/**
 * = VendorRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class VendorRepositoryImpl extends QueryDslRepositorySupportExt<Vendor> implements VendorRepositoryCustom {

	/**
	 * Default constructor
	 */
	VendorRepositoryImpl() {
		super(Vendor.class);
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
	public static final String RESPONSIBLE = "responsible";

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
	public static final String LAST_MODIFIED_DATE = "lastModifiedDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CERTIFICATION = "certification";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECORD_STATUS = "recordStatus";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String AVAILABLE = "available";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String COMPANY_NAME = "companyName";

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
	public Page<Vendor> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QVendor vendor = QVendor.vendor;
		JPQLQuery<Vendor> query = from(vendor);
		Path<?>[] paths = new Path<?>[] { vendor.code, vendor.companyName, vendor.address, vendor.postalCode,
				vendor.phone, vendor.fax, vendor.web, vendor.mail, vendor.recordStatus, vendor.createdDate,
				vendor.createdBy, vendor.lastModifiedDate, vendor.lastModifiedBy, vendor.available, vendor.responsible,
				vendor.certification };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(CODE, vendor.code).map(COMPANY_NAME, vendor.companyName)
				.map(ADDRESS, vendor.address).map(POSTAL_CODE, vendor.postalCode).map(PHONE, vendor.phone)
				.map(FAX, vendor.fax).map(WEB, vendor.web).map(MAIL, vendor.mail)
				.map(RECORD_STATUS, vendor.recordStatus).map(CREATED_DATE, vendor.createdDate)
				.map(CREATED_BY, vendor.createdBy).map(LAST_MODIFIED_DATE, vendor.lastModifiedDate)
				.map(LAST_MODIFIED_BY, vendor.lastModifiedBy).map(AVAILABLE, vendor.available)
				.map(RESPONSIBLE, vendor.responsible).map(CERTIFICATION, vendor.certification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, vendor);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Vendor> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QVendor vendor = QVendor.vendor;
		JPQLQuery<Vendor> query = from(vendor);
		Path<?>[] paths = new Path<?>[] { vendor.code, vendor.companyName, vendor.address, vendor.postalCode,
				vendor.phone, vendor.fax, vendor.web, vendor.mail, vendor.recordStatus, vendor.createdDate,
				vendor.createdBy, vendor.lastModifiedDate, vendor.lastModifiedBy, vendor.available, vendor.responsible,
				vendor.certification };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(vendor.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(CODE, vendor.code).map(COMPANY_NAME, vendor.companyName)
				.map(ADDRESS, vendor.address).map(POSTAL_CODE, vendor.postalCode).map(PHONE, vendor.phone)
				.map(FAX, vendor.fax).map(WEB, vendor.web).map(MAIL, vendor.mail)
				.map(RECORD_STATUS, vendor.recordStatus).map(CREATED_DATE, vendor.createdDate)
				.map(CREATED_BY, vendor.createdBy).map(LAST_MODIFIED_DATE, vendor.lastModifiedDate)
				.map(LAST_MODIFIED_BY, vendor.lastModifiedBy).map(AVAILABLE, vendor.available)
				.map(RESPONSIBLE, vendor.responsible).map(CERTIFICATION, vendor.certification);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, vendor);
	}
}
