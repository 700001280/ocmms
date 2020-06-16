package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.mm.storage.ServiceReceiveDetail;
import com.ocmms.cmms.model.mm.procurement.ServiceProcurementItemDetail;
import com.ocmms.cmms.model.mm.storage.QServiceReceiveDetail;
import com.querydsl.core.types.Path;
import com.querydsl.jpa.JPQLQuery;

import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

/**
 * = ServiceReceiveDetailRepositoryImpl TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
public class ServiceReceiveDetailRepositoryImpl extends QueryDslRepositorySupportExt<ServiceReceiveDetail>
		implements ServiceReceiveDetailRepositoryCustom {

	/**
	 * Default constructor
	 */
	ServiceReceiveDetailRepositoryImpl() {
		super(ServiceReceiveDetail.class);
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
	public static final String QUANTITY = "quantity";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String CREATED_DATE = "createdDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PAYMENT_SUBMITTER = "paymentSubmitter";

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
	public static final String SERVICE_PROCUREMENT_ITEM_DETAIL = "serviceProcurementItemDetail";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String INVOICE_DATE = "invoiceDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECEIVE_DATE = "receiveDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String KEEPER = "keeper";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String PAYMENT_DATE = "paymentDate";

	/**
	 * TODO Auto-generated attribute documentation
	 *
	 */
	public static final String RECEIVER = "receiver";

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
	public Page<ServiceReceiveDetail> findAll(GlobalSearch globalSearch, Pageable pageable) {
		QServiceReceiveDetail serviceReceiveDetail = QServiceReceiveDetail.serviceReceiveDetail;
		JPQLQuery<ServiceReceiveDetail> query = from(serviceReceiveDetail);
		Path<?>[] paths = new Path<?>[] { serviceReceiveDetail.quantity, serviceReceiveDetail.receiveDate,
				serviceReceiveDetail.receiver, serviceReceiveDetail.keeper,
				serviceReceiveDetail.serviceProcurementItemDetail, serviceReceiveDetail.invoiceDate,
				serviceReceiveDetail.paymentSubmitter, serviceReceiveDetail.paymentDate, serviceReceiveDetail.memo,
				serviceReceiveDetail.closed, serviceReceiveDetail.recordStatus, serviceReceiveDetail.createdDate,
				serviceReceiveDetail.createdBy, serviceReceiveDetail.lastModifiedDate,
				serviceReceiveDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(QUANTITY, serviceReceiveDetail.quantity)
				.map(RECEIVE_DATE, serviceReceiveDetail.receiveDate).map(RECEIVER, serviceReceiveDetail.receiver)
				.map(KEEPER, serviceReceiveDetail.keeper)
				.map(SERVICE_PROCUREMENT_ITEM_DETAIL, serviceReceiveDetail.serviceProcurementItemDetail)
				.map(INVOICE_DATE, serviceReceiveDetail.invoiceDate)
				.map(PAYMENT_SUBMITTER, serviceReceiveDetail.paymentSubmitter)
				.map(PAYMENT_DATE, serviceReceiveDetail.paymentDate).map(MEMO, serviceReceiveDetail.memo)
				.map(CLOSED, serviceReceiveDetail.closed).map(RECORD_STATUS, serviceReceiveDetail.recordStatus)
				.map(CREATED_DATE, serviceReceiveDetail.createdDate).map(CREATED_BY, serviceReceiveDetail.createdBy)
				.map(LAST_MODIFIED_DATE, serviceReceiveDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, serviceReceiveDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, serviceReceiveDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param ids
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ServiceReceiveDetail> findAllByIdsIn(List<Long> ids, GlobalSearch globalSearch, Pageable pageable) {
		QServiceReceiveDetail serviceReceiveDetail = QServiceReceiveDetail.serviceReceiveDetail;
		JPQLQuery<ServiceReceiveDetail> query = from(serviceReceiveDetail);
		Path<?>[] paths = new Path<?>[] { serviceReceiveDetail.quantity, serviceReceiveDetail.receiveDate,
				serviceReceiveDetail.receiver, serviceReceiveDetail.keeper,
				serviceReceiveDetail.serviceProcurementItemDetail, serviceReceiveDetail.invoiceDate,
				serviceReceiveDetail.paymentSubmitter, serviceReceiveDetail.paymentDate, serviceReceiveDetail.memo,
				serviceReceiveDetail.closed, serviceReceiveDetail.recordStatus, serviceReceiveDetail.createdDate,
				serviceReceiveDetail.createdBy, serviceReceiveDetail.lastModifiedDate,
				serviceReceiveDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		// Also, filter by the provided ids
		query.where(serviceReceiveDetail.id.in(ids));
		AttributeMappingBuilder mapping = buildMapper().map(QUANTITY, serviceReceiveDetail.quantity)
				.map(RECEIVE_DATE, serviceReceiveDetail.receiveDate).map(RECEIVER, serviceReceiveDetail.receiver)
				.map(KEEPER, serviceReceiveDetail.keeper)
				.map(SERVICE_PROCUREMENT_ITEM_DETAIL, serviceReceiveDetail.serviceProcurementItemDetail)
				.map(INVOICE_DATE, serviceReceiveDetail.invoiceDate)
				.map(PAYMENT_SUBMITTER, serviceReceiveDetail.paymentSubmitter)
				.map(PAYMENT_DATE, serviceReceiveDetail.paymentDate).map(MEMO, serviceReceiveDetail.memo)
				.map(CLOSED, serviceReceiveDetail.closed).map(RECORD_STATUS, serviceReceiveDetail.recordStatus)
				.map(CREATED_DATE, serviceReceiveDetail.createdDate).map(CREATED_BY, serviceReceiveDetail.createdBy)
				.map(LAST_MODIFIED_DATE, serviceReceiveDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, serviceReceiveDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, serviceReceiveDetail);
	}

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param serviceProcurementItemDetail
	 * @param globalSearch
	 * @param pageable
	 * @return Page
	 */
	public Page<ServiceReceiveDetail> findByServiceProcurementItemDetail(
			ServiceProcurementItemDetail serviceProcurementItemDetail, GlobalSearch globalSearch, Pageable pageable) {
		QServiceReceiveDetail serviceReceiveDetail = QServiceReceiveDetail.serviceReceiveDetail;
		JPQLQuery<ServiceReceiveDetail> query = from(serviceReceiveDetail);
		Assert.notNull(serviceProcurementItemDetail, "serviceProcurementItemDetail is required");
		query.where(serviceReceiveDetail.serviceProcurementItemDetail.eq(serviceProcurementItemDetail));
		Path<?>[] paths = new Path<?>[] { serviceReceiveDetail.quantity, serviceReceiveDetail.receiveDate,
				serviceReceiveDetail.receiver, serviceReceiveDetail.keeper,
				serviceReceiveDetail.serviceProcurementItemDetail, serviceReceiveDetail.invoiceDate,
				serviceReceiveDetail.paymentSubmitter, serviceReceiveDetail.paymentDate, serviceReceiveDetail.memo,
				serviceReceiveDetail.closed, serviceReceiveDetail.recordStatus, serviceReceiveDetail.createdDate,
				serviceReceiveDetail.createdBy, serviceReceiveDetail.lastModifiedDate,
				serviceReceiveDetail.lastModifiedBy };
		applyGlobalSearch(globalSearch, query, paths);
		AttributeMappingBuilder mapping = buildMapper().map(QUANTITY, serviceReceiveDetail.quantity)
				.map(RECEIVE_DATE, serviceReceiveDetail.receiveDate).map(RECEIVER, serviceReceiveDetail.receiver)
				.map(KEEPER, serviceReceiveDetail.keeper)
				.map(SERVICE_PROCUREMENT_ITEM_DETAIL, serviceReceiveDetail.serviceProcurementItemDetail)
				.map(INVOICE_DATE, serviceReceiveDetail.invoiceDate)
				.map(PAYMENT_SUBMITTER, serviceReceiveDetail.paymentSubmitter)
				.map(PAYMENT_DATE, serviceReceiveDetail.paymentDate).map(MEMO, serviceReceiveDetail.memo)
				.map(CLOSED, serviceReceiveDetail.closed).map(RECORD_STATUS, serviceReceiveDetail.recordStatus)
				.map(CREATED_DATE, serviceReceiveDetail.createdDate).map(CREATED_BY, serviceReceiveDetail.createdBy)
				.map(LAST_MODIFIED_DATE, serviceReceiveDetail.lastModifiedDate)
				.map(LAST_MODIFIED_BY, serviceReceiveDetail.lastModifiedBy);
		applyPagination(pageable, query, mapping);
		applyOrderById(query);
		return loadPage(query, pageable, serviceReceiveDetail);
	}
}
