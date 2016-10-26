package com.ocmms.cmms.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import com.ocmms.cmms.model.Users;

public interface UsersRepository extends PagingAndSortingRepository<Users, String> {
	public Users findOneByUserName(String username);
}