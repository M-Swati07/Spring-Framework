package com.swati.spring.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class QuickSortImpl implements SortAlgorithmInterface {
	
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
