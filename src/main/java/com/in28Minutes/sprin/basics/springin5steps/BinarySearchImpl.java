package com.in28Minutes.sprin.basics.springin5steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;

//	There are 3 ways to make dependency injection
//		a.Constructor Injection
//		b.Setter Injection
//		c.No setter or Constructor
//	From above last 2 injection techniques are same
//	
//	-> Constructor Injection is used when the dependencies are mandatory
//	-> Setter Injection is used when the dependencies are optional and it is ok if there is in-availability of dependencies
//	-> But, above cases are with earlier version , now even if we are using no setter injection and bean of particular dependency
//		is not available application context will not be created . Difference between above dependency injection ways is now
//	 	narrowing

	// a.Constructor Injection
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

	// b.Setter Injection
	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}

	public int binarySearch(int[] numbers, int numberToSrearchFor) {

		// Sorting an array(bubble Sort)
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		
		// Search the array
		

		// Return the Result
		return 3;
	}
}
