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
package com.ocmms.cmms.jwt.domain;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * Some applications require the user to have a login in order to gain access to
 * the application.
 *
 * This JPA Entity models the user login given to a user.
 *
 * @author Enrique Ruiz at http://www.disid.com[DISID Corporation S.L.]
 * @author Cèsar Ordiñana at http://www.disid.com[DISID Corporation S.L.]
 * @author Juan Carlos García at http://www.disid.com[DISID Corporation S.L.]
 */
//@JsonIgnoreProperties({ "hibernateLazyInitializer" })
@Entity
@Table(name = "USER_LOGIN")
@Data
public class UserLogin {

	@Column(name = "USER_LOGIN_ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "userLoginGen")
	@Id
	@SequenceGenerator(name = "userLoginGen", sequenceName = "SEQ_USER_LOGIN")
	private Long id;

	@Column(name = "VERSION")
	@Version
	private long version;

	@Column(name = "USERNAME", unique = true)
	@NotNull
	@Size(max = 30)
	@Pattern(regexp = "^[^<>\\\\'\"&;%]*$")
	private String username;

	@Column(name = "PASSWORD")
	@NotNull
	@Size(max = 255)
	private String password;

	@Column(name = "FROM_DATE")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar fromDate;

	@Column(name = "THRU_DATE")
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar thruDate;

	@Column(name = "NEED_CHANGE_PASSWORD")
	private Boolean needChangePassword;

	@Column(name = "LOCKED")
	private Boolean locked;

	@NotBlank
	@Size(max = 50)
	@Email
	@Column(name = "EMAIL")
	private String email;

	@Column(name = "OPENID")
	@NotNull
	@Size(max = 255)
	private String openId;
	
	@Column(name = "AVATAR")	
	@Size(max = 255)
	private String avatar;
	

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userLogin")
	private Set<UserLoginRole> userLoginRoles = new HashSet<UserLoginRole>();	

	@Override
	public String toString() {
		return "UserLogin {" + "id='" + id + '\'' + ", username='" + username + '\'' + ", fromDate='" + fromDate + '\''
				+ ", thruDate='" + thruDate + '\'' + ", needChangePassword='" + needChangePassword + '\'' + ", locked='"
				+ locked + '\'' + ", version='" + version + '\'' + "} " + super.toString();
	}

}
