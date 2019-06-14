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
import com.hex.clarity.core.entity.InvestmentMaster;
import com.hex.clarity.core.enums.ErrorMessage;
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
	@PostMapping(value = "/investment/add")
	public <T> ResponseEntity<?> addInvestment(@RequestBody InvestmentMaster investment)
	{
		String response=null;
		
		  if(investment !=null)
		  { 
			  if(investment !=null)
			  {
			  response=investmentService.addInvestmentDetails(investment);
			  }
		  }
		  if(response==null)
		  {
			  return new ResponseEntity<>((T)response,HttpStatus.INTERNAL_SERVER_ERROR);
		  }
		return new ResponseEntity<>(ClarityConstants.SUCCESS,HttpStatus.OK);
		
	}
	@GetMapping(value = "/investmenttype/list")
	public @ResponseBody ResponseEntity<List<String>> getInvestmentTypeList()
	{
		List<String> investment_type_list=null;
		
		investment_type_list=investmentService.getInvestmentTypeList();
		if(investment_type_list==null || investment_type_list.size()==0)
		{
			throw new ClarityException(ErrorMessage.NO_DATA);
		}
		return new ResponseEntity<List<String>>(investment_type_list, HttpStatus.OK);
	}
	
	@GetMapping(value = "/investment/list")
	public @ResponseBody ResponseEntity<List<InvestmentMaster>> getInvestmentList()
	{
		List<InvestmentMaster> investment_list=null;
		
		investment_list=investmentService.getInvestmentList();
		if(investment_list==null || investment_list.size()==0)
		{
			throw new ClarityException(ErrorMessage.NO_DATA);
		}
		return new ResponseEntity<List<InvestmentMaster>>(investment_list, HttpStatus.OK);
	}

}
