package com.sagax.test.service;

import java.util.List;

import com.sagax.test.model.StairwellResponse;

public interface SagaxService {

	StairwellResponse getAmountOfStrides(List<Integer> numberOfFlights, int stepsPerStride );
		
}
