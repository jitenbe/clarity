package com.hex.clarity.core.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hex.clarity.core.exception.ClarityException;
import com.hex.clarity.core.model.InvestmentMaster;
import com.hex.clarity.core.service.InvestmentService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class InvestmentController {
	private static final Logger log=LoggerFactory.getLogger(InvestmentController.class);
	
	@Autowired
	private InvestmentService investmentService;
	
	@PostMapping(value = "/investment/create")
	public ResponseEntity<?> addInvestment(@RequestBody InvestmentMaster investmentDeatils)
	{
		String response=null;
		if(null!=investmentDeatils)
		{
			response=investmentService.addInvestment(investmentDeatils);
		}
		
		return null;
		
	}

}
