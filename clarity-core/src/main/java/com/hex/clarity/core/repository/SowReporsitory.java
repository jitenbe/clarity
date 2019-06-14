package com.hex.clarity.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hex.clarity.core.entity.SowMaster;

@Repository
public interface SowReporsitory extends CrudRepository<SowMaster, Long> {

	

}
