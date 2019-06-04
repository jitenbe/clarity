package com.hex.clarity.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hex.clarity.core.entity.Investment;
import com.hex.clarity.core.entity.InvestmentMaster;

@Repository
public interface InvestmentRepository extends CrudRepository<Investment,Long> {

}
