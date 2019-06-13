package com.hex.clarity.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hex.clarity.core.entity.SowMaster;

@Repository
public interface SowReporsitory extends CrudRepository<SowMaster, Long> {

}
