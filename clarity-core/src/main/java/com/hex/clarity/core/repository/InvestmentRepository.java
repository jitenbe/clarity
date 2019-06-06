package com.hex.clarity.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hex.clarity.core.entity.InvestmentMaster;
import com.hex.clarity.core.entity.ListOfValues;

@Repository
public interface InvestmentRepository extends CrudRepository<InvestmentMaster,Long> {

	@Query("select s from ListOfValues s where s.list_type=:investment_type")
	List<ListOfValues> getInvestmentTypeList(@Param("investment_type")String investment_type);

}
