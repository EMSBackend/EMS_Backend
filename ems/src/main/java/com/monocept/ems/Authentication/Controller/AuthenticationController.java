package com.monocept.ems.Authentication.Controller;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.monocept.ems.Authentication.DTO.LoginRequestDTO;
import com.monocept.ems.Authentication.Service.AuthenticationService;

@RestController
@RequestMapping("/auth/v1")
public class AuthenticationController {

	private static final Logger logger = LoggerFactory.getLogger(AuthenticationController.class);

	@Autowired
	private AuthenticationService authenticationService;

	@PostMapping("/login")
	public ResponseEntity<?> login(@Valid @RequestBody LoginRequestDTO loginRequestDTO, Errors error) {
		logger.info("Inside AuthenticationController :: Inside login");
		if (error.hasErrors()) {
			return new ResponseEntity<>(error.getAllErrors().get(0).getDefaultMessage(), HttpStatus.BAD_REQUEST);
		}
		return authenticationService.login(loginRequestDTO);
	}
	
	@PostMapping("/login1")
	@PreAuthorize("hasRole('ROLE_COADMIN')")
	public ResponseEntity<?> login1(@Valid @RequestBody LoginRequestDTO loginRequestDTO, Errors error) {
		logger.info("Inside AuthenticationController :: Inside login");
		if (error.hasErrors()) {
			return new ResponseEntity<>(error.getAllErrors().get(0).getDefaultMessage(), HttpStatus.BAD_REQUEST);
		}
		return authenticationService.login(loginRequestDTO);
	}

}
