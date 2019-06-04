package com.hex.clarity.core.service;

import com.hex.clarity.core.entity.Employee;

public interface LoginService {
	
public Boolean authenticateEmployee(Employee emp);

public Employee authenticateEmployee(String lanId, String password);
}
