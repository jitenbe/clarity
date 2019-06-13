package com.hex.clarity.core.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project_master")
public class ProjectMaster implements Serializable {
	
	private static final long serialVersionUID = 1L;

	public ProjectMaster() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "project_master_id")
	private Long projectMasterId;
	
	@Column(name = "project_name")
	private String projectName;

	@OneToMany(fetch = FetchType.LAZY, cascade= CascadeType.ALL)
	@JoinColumn(name = "project_master_id")
	private List<SowMaster> sows=new ArrayList<>();

	public List<SowMaster> getSows() {
		return sows;
	}

	public void setSows(List<SowMaster> sows) {
		this.sows = sows;
	}

	public Long getProjectMasterId() {
		return projectMasterId;
	}

	public void setProjectMasterId(Long projectMasterId) {
		this.projectMasterId = projectMasterId;
	}


	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public String toString() {
		return "ProjectMaster [projectMasterId=" + projectMasterId + ", projectName=" + projectName + ", sows=" + sows
				+ "]";
	}
}
