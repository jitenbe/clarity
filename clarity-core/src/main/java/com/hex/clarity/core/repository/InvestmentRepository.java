package com.hex.clarity.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hex.clarity.core.model.InvestmentMaster;

@Repository
public interface InvestmentRepository extends CrudRepository<InvestmentMaster,Long> {

}
