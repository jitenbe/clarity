package com.hex.clarity.core.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hex.clarity.core.constants.ClarityConstants;
import com.hex.clarity.core.entity.ProjectMaster;
import com.hex.clarity.core.enums.ErrorMessage;
import com.hex.clarity.core.exception.ClarityException;
import com.hex.clarity.core.service.ProjectService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class ProjectController {
	private static final Logger log = LoggerFactory.getLogger(ProjectController.class);

	@Autowired
	private ProjectService projectService;

	@PostMapping(value = "/project/add")
	public <T> ResponseEntity<?> addProject(@RequestBody ProjectMaster project) {
		String response = null;

		
			if (project != null) {
				response = projectService.addProject(project);
			}
		
		if (response == null) {
			return new ResponseEntity<>((T) response, HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(ClarityConstants.SUCCESS, HttpStatus.OK);

	}

	  @GetMapping(value = "/project/list") 
	  public @ResponseBody
	  ResponseEntity<List<ProjectMaster>> getProjectList() { 
		  List<ProjectMaster> projectList=null;
	  
		  projectList=projectService.getProjectList();
	  
	  if(projectList==null || projectList.size()==0) { 
		  throw new ClarityException(ErrorMessage.NO_DATA); 
		  } 
	  return new ResponseEntity<List<ProjectMaster>>(projectList, HttpStatus.OK); }
	  
	
}
