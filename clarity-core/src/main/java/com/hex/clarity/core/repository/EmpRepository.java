package com.hex.clarity.core.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hex.clarity.core.entity.Employee;
@Repository
public interface EmpRepository extends CrudRepository<Employee, Long> {

	@Query("select e from Employee e where e.consultant_id = :consultant_id")
	Employee findByLanId(@Param("consultant_id")String consultant_id);

}
