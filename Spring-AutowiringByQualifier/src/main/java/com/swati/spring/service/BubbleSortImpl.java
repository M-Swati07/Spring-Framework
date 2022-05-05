package com.swati.spring.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSortImpl implements SortAlgorithmInterface{
	
	public int[] sort(int[] numbers) {
		return numbers;
	}

}
