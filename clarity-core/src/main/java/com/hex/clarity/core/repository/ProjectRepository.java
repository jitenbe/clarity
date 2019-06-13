package com.hex.clarity.core.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hex.clarity.core.entity.ProjectMaster;

@Repository
public interface ProjectRepository extends CrudRepository<ProjectMaster, Long> {

}
