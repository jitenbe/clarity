package com.hex.clarity.core.serviceImpl;

import org.apache.log4j.spi.ErrorHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hex.clarity.core.constants.ClarityConstants;
import com.hex.clarity.core.enums.ErrorMessage;
import com.hex.clarity.core.exception.ClarityErrorHandler;
import com.hex.clarity.core.exception.ClarityException;
import com.hex.clarity.core.model.InvestmentMaster;
import com.hex.clarity.core.repository.InvestmentRepository;
import com.hex.clarity.core.service.InvestmentService;

@Service("investmentService")
public class InvestmentServiceImpl implements InvestmentService {
	private static final Logger log=LoggerFactory.getLogger(InvestmentServiceImpl.class);

	@Autowired
	private InvestmentRepository investmentRepository;
	@Autowired
	private ClarityErrorHandler errorHandler;
	@Override
	public String addInvestment(InvestmentMaster investmentDeatils) {
		String response=ClarityConstants.FAILED;
		try
		{
		InvestmentMaster investmaster=investmentRepository.save(investmentDeatils);
		if(null != investmaster)
		{
			response=ClarityConstants.SUCCESS;
		}
		else
		{
			throw new ClarityException(ErrorMessage.SAVE_FAILED);
		}
		}
		catch (ClarityException e) {
			String msg=errorHandler.buildMessage(e);
			log.info(msg);
		}
		
		return response;
		}
}
