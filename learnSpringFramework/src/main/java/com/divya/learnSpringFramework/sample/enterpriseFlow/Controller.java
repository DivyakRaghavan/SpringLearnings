package com.divya.learnSpringFramework.sample.enterpriseFlow;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Sending Response in right format
@RestController
public class Controller {

	//If user URL has "/sum" Then display 100 
	@Autowired
	private BusinessService businessService;
	@GetMapping("/sum")
	public long dispSum()
	{
		return businessService.calculateSum();
	}
}
//To implement business Logic
@Component
class BusinessService
{
	@Autowired
	private DataService data;
	
	public long calculateSum()
	{
		List<Integer> sum=data.dataToSum();
		int result=sum.stream().reduce(Integer::sum).get();
		return result;
	}
}

//Getting Data
@Component
class DataService
{
	public List<Integer> dataToSum()
	{
		List<Integer> values=Arrays.asList(12,45,12,34);
		return values;
		
	}
	
}
