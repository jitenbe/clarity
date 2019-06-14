package com.hex.clarity.core.service;

import java.util.List;

import com.hex.clarity.core.entity.SowMaster;

public interface SowService {

	String addSow(SowMaster sow);

	List<SowMaster> getSowsByprojectId(Long projectId);

}
