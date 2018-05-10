package com.habilmohammed.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.habilmohammed.spring.basics.springin5steps.basic.BinarySearchImpl;

@Configuration
@ComponentScan("com.habilmohammed.spring.basics.springin5steps")
public class SpringIn5StepsBasicApplicationWithSpring {

	public static void main(String[] args) {
	
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringIn5StepsBasicApplicationWithSpring.class);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		System.out.println(binarySearch.binarySearch(new int[] {1 , 2, 3}, 2));
		System.out.println(binarySearch1.binarySearch(new int[] {1 , 2, 3}, 2));
		
		applicationContext.close();
		
	}
}