package com.hex.clarity.core.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hex.clarity.core.constants.ClarityConstants;
import com.hex.clarity.core.entity.ProjectMaster;
import com.hex.clarity.core.entity.SowMaster;
import com.hex.clarity.core.repository.ProjectRepository;
import com.hex.clarity.core.repository.SowReporsitory;
import com.hex.clarity.core.service.SowService;

@Service("sowService")
public class SowServiceImpl implements SowService {

	@Autowired
	private SowReporsitory sowReporsitory;

	@Autowired
	private ProjectRepository ProjectRepository;

	@Override
	public String addSow(SowMaster sow) {
		String response = ClarityConstants.FAILED;
		ProjectMaster projectMaster = null;
		List<SowMaster> sowList =  new ArrayList<SowMaster>();;
		ProjectMaster p_master = null;
		try {
			if (sow != null) {
				if (sow.getProjectMasterId() != 0) {
					projectMaster = ProjectRepository.findOne(sow.getProjectMasterId());
				}
				if (null != projectMaster) {
					sowList=projectMaster.getSows();
					sowList.add(sow);
					if(sowList !=null && sowList.size()>0 )
					{
					projectMaster.setSows(sowList);
					}
					p_master = ProjectRepository.save(projectMaster);
				}

				if (p_master != null) {
					response = ClarityConstants.SUCCESS;
					return response;
				}
			}
		} catch (Exception e) {

		}
		return response;
	}

	@Override
	public List<SowMaster> getSowsByprojectId(Long projectId) {
		List<SowMaster> sowList=null;
		//sowList=sowReporsitory.findByProjectId(projectId);		
		if(sowList.size()>0)
		{
			return sowList;
		}
		return sowList;
	}

}
