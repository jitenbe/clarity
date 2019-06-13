package com.hex.clarity.core.service;

import java.util.List;

import com.hex.clarity.core.entity.ProjectMaster;

public interface ProjectService {

	String addProject(ProjectMaster project);

	List<ProjectMaster> getProjectList();

}
