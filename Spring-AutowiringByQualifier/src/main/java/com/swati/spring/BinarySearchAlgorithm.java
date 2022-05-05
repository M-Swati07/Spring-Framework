package com.swati.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.swati.spring.service.SortAlgorithmInterface;

@Component
public class BinarySearchAlgorithm {
	
	@Autowired
	@Qualifier("bubble")
	private SortAlgorithmInterface sortAlgo;

	public int binarySearch(int[] numbers, int searchNum) {

		int[] sortedArray = sortAlgo.sort(numbers);
		System.out.println(sortAlgo);
		return 9;
	}

}
