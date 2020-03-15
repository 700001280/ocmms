package com.ocmms.cmms.repository;
import com.ocmms.cmms.model.assistance.EmployeeTask;
import com.ocmms.cmms.model.assistance.TaskFormBean;
import com.ocmms.cmms.model.assistance.TaskTracking;


import io.springlets.data.jpa.repository.DetachableJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;
import org.springframework.roo.addon.layers.repository.jpa.annotations.finder.RooFinder;

/**
 * = TaskTrackingRepository
 TODO Auto-generated class documentation
 *
 */
@RooJpaRepository(entity = TaskTracking.class,  finders = {
		@RooFinder(value = "findByTaskOwner", returnType = TaskTracking.class, formBean=TaskFormBean.class) })
public interface TaskTrackingRepository extends DetachableJpaRepository<TaskTracking, Long>, TaskTrackingRepositoryCustom {
}
