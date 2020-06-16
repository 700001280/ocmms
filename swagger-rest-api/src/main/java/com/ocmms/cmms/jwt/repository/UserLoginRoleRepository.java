/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.ocmms.cmms.jwt.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.transaction.annotation.Transactional;

import com.ocmms.cmms.jwt.domain.UserLogin;
import com.ocmms.cmms.jwt.domain.UserLoginRole;

/**
 * = Spring Data JPA repository for {@link UserLoginRole} entity
 * 
 * To get more info about Spring Data JPA repositories:
 * 
 * *
 * http://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories
 *
 * @see JPARepository
 * 
 * @author Enrique Ruiz at http://www.disid.com[DISID Corporation S.L.]
 * @author Cèsar Ordiñana at http://www.disid.com[DISID Corporation S.L.]
 * @author Juan Carlos García at http://www.disid.com[DISID Corporation S.L.]
 */
@Transactional(readOnly = true)
@RepositoryRestResource(collectionResourceRel = "userloginrole", path = "userloginrole")
public interface UserLoginRoleRepository
		extends JpaRepository<UserLoginRole, Long>, PagingAndSortingRepository<UserLoginRole, Long> {
	Optional<UserLoginRole> findByUserLogin(UserLogin userLogin);
}
