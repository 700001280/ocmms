package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.workorder.WorkOrderHeader;
import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.pm.technicalobject.MaintenanceActivityType;
import com.ocmms.cmms.model.pm.technicalobject.SystemCondition;
import com.ocmms.cmms.model.pm.workorder.WorkOrderType;
import com.ocmms.cmms.model.pm.workorder.WorkOrderUserStatusWithNumber;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = WorkOrderHeaderRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "workorderheader", path = "workorderheader")
public interface WorkOrderHeaderRepository extends  WorkOrderHeaderRepositoryCustom,
		PagingAndSortingRepository<WorkOrderHeader, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param userStatus
	 * @return Long
	 */
	public abstract long countByUserStatus(WorkOrderUserStatusWithNumber userStatus);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param workOrderType
	 * @return Long
	 */
	public abstract long countByWorkOrderType(WorkOrderType workOrderType);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemCondition
	 * @return Long
	 */
	public abstract long countBySystemCondition(SystemCondition systemCondition);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param activityType
	 * @return Long
	 */
	public abstract long countByActivityType(MaintenanceActivityType activityType);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationHeader
	 * @return Long
	 */
	public abstract long countByNotificationHeader(NotificationHeader notificationHeader);
}
