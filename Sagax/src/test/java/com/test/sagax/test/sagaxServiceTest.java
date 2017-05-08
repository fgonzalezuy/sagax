package com.test.sagax.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.sagax.test.configuration.WebApplication;
import com.sagax.test.model.StairwellResponse;
import com.sagax.test.service.SagaxService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebApplication.class, loader = AnnotationConfigContextLoader.class)
public class sagaxServiceTest {

	@Autowired
	SagaxService service;
	
	
	
	@Test
	public void testMockCreation(){
	
		List<Integer> l1 = new ArrayList<>(1);
		l1.add(17);
		int steps1 = 3;
		StairwellResponse res1 = service.getAmountOfStrides(l1, steps1);
		Assert.assertEquals(res1.getReturns(), 6);
		
		List<Integer> l2 = new ArrayList<>(2);
		l2.add(17);
		l2.add(17);
		int steps2 = 3;
		StairwellResponse res2 = service.getAmountOfStrides(l2, steps2);
		Assert.assertEquals(res2.getReturns(), 14);
		
		List<Integer> l3 = new ArrayList<>(7);
		l3.add(4);
		l3.add(9);
		l3.add(8);
		l3.add(11);
		l3.add(7);
		l3.add(20);
		l3.add(14);
		int steps3 = 2;
		StairwellResponse res3 = service.getAmountOfStrides(l3, steps3);
		Assert.assertEquals(res3.getReturns(), 50);
		
	}
	
}
