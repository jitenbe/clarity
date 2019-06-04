package com.hex.clarity.core.serviceImpl;

import java.util.HashSet;
import java.util.Set;

import javax.transaction.Transactional;

import org.apache.log4j.spi.ErrorHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hex.clarity.core.beans.InvestmentCreationRequest;
import com.hex.clarity.core.constants.ClarityConstants;
import com.hex.clarity.core.entity.Consultant;
import com.hex.clarity.core.entity.Investment;
import com.hex.clarity.core.entity.InvestmentMaster;
import com.hex.clarity.core.enums.ErrorMessage;
import com.hex.clarity.core.exception.ClarityErrorHandler;
import com.hex.clarity.core.exception.ClarityException;
import com.hex.clarity.core.repository.InvestmentRepository;
import com.hex.clarity.core.service.InvestmentService;

@Service("investmentService")
@Transactional
public class InvestmentServiceImpl implements InvestmentService {
	private static final Logger log=LoggerFactory.getLogger(InvestmentServiceImpl.class);

	@Autowired
	private InvestmentRepository investmentRepository;
	@Autowired
	private ClarityErrorHandler errorHandler;
	@Override
	public String addInvestment(Investment investmentDeatils) {
		String response=ClarityConstants.FAILED;
		try
		{
			
		if(investmentDeatils !=null)
		{
		Investment investmaster=investmentRepository.save(investmentDeatils);
		if(null != investmaster)
		{
			response=ClarityConstants.SUCCESS;
		}
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
	
	
	@Override
	public String addInvestment(InvestmentMaster investmentDeatils) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Investment getInvestmentModel(InvestmentCreationRequest investments) {
		Investment investment=null;
		Set<Consultant> consultantSet=new HashSet<Consultant>();
		{
			if(null !=investments)
			{
				Consultant consultant=new Consultant();
				investment=new Investment();
				investment.setConsultant_id(investments.getConsultant_id());
				investment.setInvestment_id(investments.getInvestment_code());
				investment.setInvestment_name(investments.getInvestment_name());
				investment.setIs_deliverable_in_current_week(investments.getIs_deliverbales_in_current_week());
				investment.setTask_name(investments.getClient_requirement_name());
				consultant.setConsultant_id(investments.getConsultant_id());
				consultant.setFirst_name(investments.getFirstname());
				consultant.setLast_name(investments.getLastname());
				consultant.setInvestment_id(investments.getInvestment_code().toString());
				consultant.setLocation(investments.getLocation());
				consultantSet.add(consultant);
				investment.setConsultants(consultantSet);
				return investment;
			}
			
		}
		return investment;
	}
	
}
