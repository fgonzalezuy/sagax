package com.sagax.test.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sagax.test.model.StairwellResponse;
import com.sagax.test.service.SagaxService;

@RestController	
@RequestMapping("/")
public class SagaxController {
	

	@Autowired
	SagaxService sagaxService;
	
	@RequestMapping("hola")
	public String hola(){
		return "hola";
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "stairwell", produces=MediaType.APPLICATION_JSON_VALUE)
	public StairwellResponse getFilterFields(@RequestParam(required=true) Integer[] numberOfFlights, @RequestParam(required=true) int stepsPerStride){
		return sagaxService.getAmountOfStrides(Arrays.asList(numberOfFlights), stepsPerStride);
	}
}
