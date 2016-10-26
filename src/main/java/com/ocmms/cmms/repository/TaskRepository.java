package com.ocmms.cmms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.security.access.annotation.Secured;
import com.ocmms.cmms.model.Tasks;

@Secured({ "ROLE_USER", "ROLE_ADMIN" })
@RepositoryRestResource(collectionResourceRel = "tasks", path = "tasks")
public interface TaskRepository extends PagingAndSortingRepository<Tasks, Long> {

	

}
