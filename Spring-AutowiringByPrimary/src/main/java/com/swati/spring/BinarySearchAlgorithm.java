package com.swati.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.swati.spring.service.SortAlgorithmInterface;

//Sorted Array needed for Binary Search
//Search the array
//Return the result
 
@Component
public class BinarySearchAlgorithm {
	
	//use the interface(SortAlgorithmInterface) instead of using the implementation of BubbleSortAlgorithm/QuickSortAlgorithm
	//private coz using the interface
	
	@Autowired
	private SortAlgorithmInterface sortAlgorithm;
	
	//Autowiring happens through this constructor below - ** CONSTRUCTOR INJECTION ** - but it is not required to be used as application can run without it also
	//Constructor for BinarySearch
	public BinarySearchAlgorithm(SortAlgorithmInterface sortAlgorithmInterface) {
		super();
		this.sortAlgorithm = sortAlgorithmInterface;
	}

	
	public int binarySearch(int[] numbers, int searchNum) {

		//BubbleSortAlgorithm bubble = new BubbleSortAlgorithm();	//Tightly coupled - can't change dynamically if you want to switch b/w 
		//int[] sortedArray = bubble.sort(numbers);				//bubble and quick sort - so SortAlgorithmInterface is created which 
																//implements both the sorting techniques and can switched.
		
		int[] sortedArray = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 9;
	}

}
