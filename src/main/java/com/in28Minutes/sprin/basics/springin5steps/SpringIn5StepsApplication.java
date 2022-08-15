package com.in28Minutes.sprin.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5StepsApplication {

//	Steps to follow ----->
//	  1.What are Beans ?  
//	  2.What are dependencies ? 
//	  3.Where to find beans
//	     (Here Spring automatically scans for beans in package that we have defined at line 1 ,
//	      and find where main application class is present using @SpringBootApplication annotation(line 7)   	
//	      This is called as 'Component Scan')? => No Need

//	  4.Get Instance of Application Context -> This maintains all the beans 
//	  5.Get Instance of Bean using Application Context


	public static void main(String[] args) {

//		Get Instance of Application Context
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsApplication.class, args);

//		Getting instance of BinarySearchImpl
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);

		int result = binarySearch.binarySearch(new int[] { 10, 12, 16 }, 7);

		System.out.println(result);

	}

}

//Internally things are executed -> 
//	1.Identified candidate component class: file 
//     	[/home/pavan7494/eclipse-workspace/spring-in-5-steps/target/classes/com/in28Minutes/sprin/basics/springin5steps/BinarySearchImpl
//	2.Identified candidate component class: file 
//		[/home/pavan7494/eclipse-workspace/spring-in-5-steps/target/classes/com/in28Minutes/sprin/basics/springin5steps/BubbleSortAlgorithm
//	3.Creating shared instance of singleton bean 'binarySearchImpl'
//	4.Creating shared instance of singleton bean 'bubbleSortAlgorithm'
//	5.Finished creating shared instance of singleton bean 'bubbleSortAlgorithm'
//	5.Autowiring by type from bean name 'binarySearchImpl' via constructor to bean named 'bubbleSortAlgorithm'
//  6.Finished creating shared instance of singleton bean 'bubbleSortAlgorithm'
