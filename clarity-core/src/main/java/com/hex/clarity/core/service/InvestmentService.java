package com.hex.clarity.core.service;

import com.hex.clarity.core.beans.InvestmentCreationRequest;
import com.hex.clarity.core.entity.Investment;
import com.hex.clarity.core.entity.InvestmentMaster;

public interface InvestmentService {

	String addInvestment(InvestmentMaster investmentDeatils);
	String addInvestment(Investment investments);
	Investment getInvestmentModel(InvestmentCreationRequest investments);
}
