package com.hex.clarity.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hex.clarity.core.beans.InvestmentCreationRequest;
import com.hex.clarity.core.constants.ClarityConstants;
import com.hex.clarity.core.entity.Consultant;
import com.hex.clarity.core.entity.Investment;
import com.hex.clarity.core.entity.InvestmentMaster;
import com.hex.clarity.core.exception.ClarityException;
import com.hex.clarity.core.service.InvestmentService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class InvestmentController {
	private static final Logger log=LoggerFactory.getLogger(InvestmentController.class);
	
	@Autowired
	private InvestmentService investmentService;
	
	@SuppressWarnings("unchecked")
	@PostMapping(value = "/investment/create")
	public <T> ResponseEntity<?> addInvestment(@RequestBody InvestmentCreationRequest investments)
	{
		String response=null;
		
		  if(investments !=null)
		  { 
			  Investment investment=investmentService.getInvestmentModel(investments);
			  if(investment !=null)
			  {
			  response=investmentService.addInvestment(investment);
			  }
		  }
		  if(response==null)
		  {
			  return new ResponseEntity<>((T)response,HttpStatus.INTERNAL_SERVER_ERROR);
		  }
		 
		
		return new ResponseEntity<>(ClarityConstants.SUCCESS,HttpStatus.OK);
		
	}

}
