package com.in28minutes.spring.basics.springin5minutes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;
	
	
	public BinarySearch(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	
	

	public  int binarySearch(int a[],int key) {
	
		
		// implement sort logic
		
		int[] sortedNumbers = sortAlgorithm.sort(a);
		
		
		// implement search logic
		
		return 3;
	}

}
