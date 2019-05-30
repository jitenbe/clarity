package com.hex.clarity.core.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ClarityController {
	@RequestMapping("/api/hi")
	  public String hi() {
	    return "Hexaware";
	  }


}
