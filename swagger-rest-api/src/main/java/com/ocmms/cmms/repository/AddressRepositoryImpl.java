package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.common.Address;
import com.ocmms.cmms.model.common.City;
import com.ocmms.cmms.model.common.QAddress;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = AddressRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class AddressRepositoryImpl extends QueryDslRepositorySupportExt<Address> implements AddressRepositoryCustom {

	/**
	 * Default constructor
	 */
	AddressRepositoryImpl() {
		super(Address.class);
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
	public static final String CITY = "city";

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
	public Page<Address> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QAddress address = QAddress.address;
		JPQLQuery<Address> query = from(address);
		Path<?>[] paths = new Path<?>[] { address.description, address.city, address.recordStatus, address.createdDate,
				address.createdBy, address.lastModifiedDate, address.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, address.description).map(CITY, address.city)
				.map(RECORD_STATUS, address.recordStatus).map(CREATED_DATE, address.createdDate)
				.map(CREATED_BY, address.createdBy).map(LAST_MODIFIED_DATE, address.lastModifiedDate)
				.map(LAST_MODIFIED_BY, address.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, address);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Address> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QAddress address = QAddress.address;
		JPQLQuery<Address> query = from(address);
		Path<?>[] paths = new Path<?>[] { address.description, address.city, address.recordStatus, address.createdDate,
				address.createdBy, address.lastModifiedDate, address.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(address.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, address.description).map(CITY, address.city)
				.map(RECORD_STATUS, address.recordStatus).map(CREATED_DATE, address.createdDate)
				.map(CREATED_BY, address.createdBy).map(LAST_MODIFIED_DATE, address.lastModifiedDate)
				.map(LAST_MODIFIED_BY, address.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, address);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param city
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<Address> findByCity(City city, GlobalSearch globalSearch, Pageable pageable) {
		QAddress address = QAddress.address;
		JPQLQuery<Address> query = from(address);
		Assert.notNull(city, "city is required");
		query.where(address.city.eq(city));
		Path<?>[] paths = new Path<?>[] { address.description, address.city, address.recordStatus, address.createdDate,
				address.createdBy, address.lastModifiedDate, address.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(DESCRIPTION, address.description).map(CITY, address.city)
				.map(RECORD_STATUS, address.recordStatus).map(CREATED_DATE, address.createdDate)
				.map(CREATED_BY, address.createdBy).map(LAST_MODIFIED_DATE, address.lastModifiedDate)
				.map(LAST_MODIFIED_BY, address.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, address);
	}
}
