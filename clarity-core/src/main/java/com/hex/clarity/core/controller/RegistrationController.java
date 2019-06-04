package com.hex.clarity.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hex.clarity.core.entity.Employee;
import com.hex.clarity.core.service.RegistrationService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class RegistrationController {

	@Autowired
	private RegistrationService empRegistrationService;
	
	@PostMapping(value = "/employee/create")
	public Employee addEmployee(@RequestBody Employee emp)
	{
		boolean _emp=empRegistrationService.addEmployee(emp);
		System.out.println(_emp);
		return emp;
		
	}
	
	
}
