package com.ocmms.cmms.jwt.controllers;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class MaterialInstock {

	@NotBlank
	private String username;

	@NotBlank
	private String material;

	@NotBlank
	private Long location;

	@NotBlank
	private BigDecimal quantity;

	private String memo;

}
