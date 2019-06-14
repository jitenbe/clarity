package com.hex.clarity.core.service;

import java.util.List;

import com.hex.clarity.core.entity.InvestmentMaster;

public interface InvestmentService {
	String addInvestmentDetails(InvestmentMaster investment);
	List<String> getInvestmentTypeList();
	List<InvestmentMaster> getInvestmentList();
}
