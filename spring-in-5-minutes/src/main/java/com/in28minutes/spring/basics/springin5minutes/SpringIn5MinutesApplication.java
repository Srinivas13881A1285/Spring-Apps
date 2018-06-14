package com.in28minutes.spring.basics.springin5minutes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringIn5MinutesApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5MinutesApplication.class, args);
		BinarySearch bean = applicationContext.getBean(BinarySearch.class);
		BinarySearch bean1 = applicationContext.getBean(BinarySearch.class);
		System.out.println(bean);
		System.out.println(bean1);
		int result = bean.binarySearch(new int[] {5, 56,23,4},6);
		System.out.println(result);
		
	}
}
                                                             