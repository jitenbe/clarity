package com.hex.clarity.core.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hex.clarity.core.constants.ClarityConstants;
import com.hex.clarity.core.entity.ProjectMaster;
import com.hex.clarity.core.exception.ClarityErrorHandler;
import com.hex.clarity.core.repository.ProjectRepository;
import com.hex.clarity.core.service.ProjectService;

@Service("projectService")
public class ProjectServiceImpl implements ProjectService {

	@Autowired
	private ProjectRepository projectReporsitory;
	@Autowired
	private ClarityErrorHandler errorhandler;

	@Override
	public String addProject(ProjectMaster project) {
		String response = ClarityConstants.FAILED;
		try {
			ProjectMaster p_master = projectReporsitory.save(project);
			if (p_master != null) {
				response = ClarityConstants.SUCCESS;
				return response;
			}
		} catch (Exception e) {

		}

		return response;
	}

	@Override
	public List<ProjectMaster> getProjectList() {
		Iterable<ProjectMaster> iterabelProjectMaster = null;
		List<ProjectMaster> projectList = new ArrayList<>();
		try {
			iterabelProjectMaster = projectReporsitory.findAll();
			if (iterabelProjectMaster != null) {
				iterabelProjectMaster.forEach(projectList::add);
			}
			if (projectList.size() > 0) {
				return projectList;
			}
		} catch (Exception e) {
		}
		return projectList;
	}

}
