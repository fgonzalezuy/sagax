package com.sagax.test.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sagax.test.model.StairwellResponse;
import com.sagax.test.service.SagaxService;

@Service
public class SagaxServiceImpl implements SagaxService{

	@Override
	public StairwellResponse getAmountOfStrides(List<Integer> numberOfFlights, int stepsPerStride) {
		int  returns = 0;
		for(int i = 0; i < numberOfFlights.size(); i++){
			int strides = (int)Math.ceil(numberOfFlights.get(i)/(double)stepsPerStride);
			returns = returns +strides;
			if(i< (numberOfFlights.size() - 1)){
				returns = returns+2;
			}
		}
		return new StairwellResponse(returns);
	}
	
	
}
