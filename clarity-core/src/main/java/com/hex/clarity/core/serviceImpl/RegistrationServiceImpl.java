package com.hex.clarity.core.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.hex.clarity.core.entity.Employee;
import com.hex.clarity.core.repository.EmpRepository;
import com.hex.clarity.core.service.RegistrationService;

@Service("empRegistrationService")
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	private EmpRepository empRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public boolean addEmployee(Employee emp) {

		boolean status = false;
		try {
			if (emp != null) {
				emp.setPassword(passwordEncoder.encode(emp.getPassword()));
				empRepository.save(emp);
				status = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return status;
	}

	@Override
	public boolean auntheticateEmployee(Employee emp) {
		// TODO Auto-generated method stub
		return false;
	}

	}
