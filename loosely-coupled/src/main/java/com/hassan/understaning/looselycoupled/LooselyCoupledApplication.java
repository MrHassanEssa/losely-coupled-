package com.hassan.understaning.looselycoupled;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LooselyCoupledApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext applicationContext = SpringApplication.run(LooselyCoupledApplication.class, args);
		
		BinarySearch binarysearch=applicationContext.getBean(BinarySearch.class);
				binarysearch.binarySearch(new int[] {3,7,6,5}, 5);

	}

}
