package com.in28Minutes.sprin.basics.springin5steps;

public class BinarySearchImpl {

	private SortAlgorithm sortAlgorithm;

	// Constructor
	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}


	public int binarySearch(int[] numbers, int numberToSrearchFor) {

		// Sorting an array(bubble Sort)
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		
		// Search the array
		

		// Return the Result
		return 3;
	}
}
