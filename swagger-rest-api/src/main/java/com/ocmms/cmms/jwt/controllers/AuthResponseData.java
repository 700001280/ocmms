package com.ocmms.cmms.jwt.controllers;

import com.ocmms.cmms.web.RestResponseDataMode;
import com.ocmms.cmms.jwt.payload.response.JwtResponse;
import lombok.Data;

@Data
public class AuthResponseData extends RestResponseDataMode {
private JwtResponse data;

}
