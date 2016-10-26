package com.ocmms.cmms.model;

import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.validator.constraints.*;

@Entity
@Table(name = "users")
public class Users implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	private static final String NOT_BLANK_MESSAGE = "{notBlank.message}";
	private static final String EMAIL_MESSAGE = "{email.message}";

	@Id
	@Column(name = "username", length = 256)
	@NotBlank(message = Users.NOT_BLANK_MESSAGE)
	private String userName;

	@JsonIgnore
	@NotBlank(message = Users.NOT_BLANK_MESSAGE)
	@Column(name = "password", length = 256)
	private String password;

	@Column(name = "role", length = 50)
	private String role = "ROLE_USER";

	@Column(name = "enabled")
	private Boolean enabled;

	@Column(name = "created")
	private Instant created;

	@Column(name = "email")
	@NotBlank(message = Users.NOT_BLANK_MESSAGE)
	@Email(message = Users.EMAIL_MESSAGE)
	private String email;

	@Column(name = "cell")
	private String cell;

	@Column(name = "phone")
	private String phone;

	public Users() {
	}

	public Users(String userName, String password, Boolean enabled, String email, String cell, String phone,
			String role) {
		this.userName = userName;
		this.password = password;
		this.enabled = enabled;
		this.created = Instant.now();
		this.email = email;
		this.cell = cell;
		this.phone = phone;
		this.role = role;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	public Instant getCreated() {
		return created;
	}

	public void setCreated(Instant created) {
		this.created = created;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCell() {
		return cell;
	}

	public void setCell(String cell) {
		this.cell = cell;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
