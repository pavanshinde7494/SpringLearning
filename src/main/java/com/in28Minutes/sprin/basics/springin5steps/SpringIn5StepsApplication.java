package com.in28Minutes.sprin.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

	private static final String BinarySearchImpl = null;

//	Steps to follow ----->
//	  1.What are Beans ?  
//	  2.What are dependencies ? 
//	  3.Where to find beans ? => No Need
//	  4.Get Instance of Application Context
//	  5.Get Instance of Bean using Application Context
//	  

	public static void main(String[] args) {

//		Get Instance of Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

//		Getting instance of BinarySearchImpl
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] { 10, 12, 16 }, 7);

		System.out.println(result);

	}

}
