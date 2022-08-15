package com.in28Minutes.sprin.basics.springin5steps;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithm implements SortAlgorithm {
	public int[] sort(int[] numbers) {
		// Logic for quick Sort
		System.out.println("QuickSort");
		return numbers;
	}
}
