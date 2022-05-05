package com.swati.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.swati.spring.service.SortAlgorithmInterface;

@Component
public class BinarySearchAlgorithm {
	
	@Autowired
	private SortAlgorithmInterface bubbleSortImpl;

	public int binarySearch(int[] numbers, int searchNum) {

		int[] sortedArray = bubbleSortImpl.sort(numbers);
		System.out.println(bubbleSortImpl);
		return 9;
	}

}
