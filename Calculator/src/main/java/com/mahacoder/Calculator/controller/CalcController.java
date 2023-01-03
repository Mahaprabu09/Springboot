package com.mahacoder.Calculator.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mahacoder.Calculator.service.CalcService;
@RestController
public class CalcController {
	@Autowired
	CalcService calcService;
	public int calcDiv(@PathVariable int a,@PathVariable int b) {
		return calcService.testDiv(a,b);
	}

}
