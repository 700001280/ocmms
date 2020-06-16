package com.ocmms.cmms.repository;

import com.ocmms.cmms.model.pm.notification.NotificationHeader;
import com.ocmms.cmms.model.hrm.Employee;
import com.ocmms.cmms.model.pm.configuration.PlantLocation;
import com.ocmms.cmms.model.pm.configuration.PlantSection;
import com.ocmms.cmms.model.pm.notification.NotificationPriority;
import com.ocmms.cmms.model.pm.notification.NotificationSystemStatus;
import com.ocmms.cmms.model.pm.notification.NotificationType;
import com.ocmms.cmms.model.pm.notification.NotificationUserStatusWithNumber;
import com.ocmms.cmms.model.pm.technicalobject.TechnicalObject;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

/**
 * = NotificationHeaderRepository TODO Auto-generated class documentation
 *
 */

@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "notificationheader", path = "notificationheader")
public interface NotificationHeaderRepository extends  NotificationHeaderRepositoryCustom,
		PagingAndSortingRepository<NotificationHeader, Long> {

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param userStatus
	 * @return Long
	 */
	public abstract long countByUserStatus(NotificationUserStatusWithNumber userStatus);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plantSection
	 * @return Long
	 */
	public abstract long countByPlantSection(PlantSection plantSection);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param plantLocation
	 * @return Long
	 */
	public abstract long countByPlantLocation(PlantLocation plantLocation);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param notificationType
	 * @return Long
	 */
	public abstract long countByNotificationType(NotificationType notificationType);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param technicalObject
	 * @return Long
	 */
	public abstract long countByTechnicalObject(TechnicalObject technicalObject);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param reportedBy
	 * @return Long
	 */
	public abstract long countByReportedBy(Employee reportedBy);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param priority
	 * @return Long
	 */
	public abstract long countByPriority(NotificationPriority priority);

	/**
	 * TODO Auto-generated method documentation
	 *
	 * @param systemStatus
	 * @return Long
	 */
	public abstract long countBySystemStatus(NotificationSystemStatus systemStatus);
}
