package com.swati.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.swati.spring.service.BubbleSortImpl;
import com.swati.spring.service.QuickSortImpl;

@SpringBootApplication
public class SpringAutowingByPrimary {

	public static void main(String[] args) {
		
		//BinarySearchAlgorithm bs = new BinarySearchAlgorithm(new QuickSortImpl());
		
		ApplicationContext applicationContext = SpringApplication.run(SpringAutowingByPrimary.class, args);
		BinarySearchAlgorithm bs = applicationContext.getBean(BinarySearchAlgorithm.class);
		int result = bs.binarySearch(new int[] {1, 10, 4}, 9);
		System.out.println(result);
		
		 
		
	}

}

//1. BinarySearchAlgorithm - bean
//2. new QuickSortImpl - is a bean and will need to wire it as dependency on 3.
//3. SortAlgorithmInterface - dependency for 1.

//What are beans ? -----by adding @Component to it
//What are the dependencies of a bean ? -----by adding @Autowired to it
//Where to search for beans ?
//ApplicationContext manages all the beans
