package com.expenseTracker.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExpenseTrackerServiceApplication {

	public static void main(String[] args) {

		var ctx = SpringApplication.run(ExpenseTrackerServiceApplication.class, args);

		MyFirstService myFirstService = ctx.getBean(MyFirstService.class);
		System.out.println(myFirstService.tellAStory());
		System.out.println(myFirstService.getVersion());
		System.out.println(myFirstService.getOSName());
		System.out.println(myFirstService.customPrint());
	}

}
