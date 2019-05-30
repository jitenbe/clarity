package com.hex.clarity.core.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import com.hex.clarity.core.model.Employee;
import com.hex.clarity.core.repository.EmpRepository;
import com.hex.clarity.core.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

	@Autowired
	private EmpRepository empRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public Boolean authenticateEmployee(Employee emp) {
		boolean status = false;
		String consultant_id = emp.getConsultant_id();
		String raw_password = emp.getPassword();
		try {
			if (emp.getConsultant_id() != null) {

				Employee result_emp = empRepository.findByLanId(consultant_id);
				if (result_emp != null) {
					if (consultant_id.equals(result_emp.getConsultant_id())) {

						if (passwordEncoder.matches(raw_password, result_emp.getPassword())) {

							status = true;
						}

					}

				}
			}
		} catch (Exception e) {

		}

		return status;

	}

	@Override
	public Employee authenticateEmployee(String lanId, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
