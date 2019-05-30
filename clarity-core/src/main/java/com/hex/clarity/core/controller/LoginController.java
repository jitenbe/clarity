package com.hex.clarity.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hex.clarity.core.enums.ErrorMessage;
import com.hex.clarity.core.exception.ClarityErrorHandler;
import com.hex.clarity.core.exception.ClarityException;
import com.hex.clarity.core.model.Employee;
import com.hex.clarity.core.service.LoginService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class LoginController {
private static final Logger log=LoggerFactory.getLogger(LoginController.class);
	@Autowired
	private LoginService loginService;
	
	@Autowired
	private ClarityErrorHandler errorHandler;

	@PostMapping(value = "/employee/login")
	public ResponseEntity<?> auntheticateEmployee(@RequestBody Employee emp) throws ClarityException {

		Boolean employee_status = loginService.authenticateEmployee(emp);
		if (employee_status) {
			return ResponseEntity.ok().build();
		}
		else
		{
			ClarityException e=new ClarityException(ErrorMessage.NO_DATA);
			String msg=errorHandler.buildMessage(e);
			log.error(msg);
		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();

	}

}
