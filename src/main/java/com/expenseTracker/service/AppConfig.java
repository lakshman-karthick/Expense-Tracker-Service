package com.expenseTracker.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("bean1")
//    @Qualifier("bean1")
    public MyFirstClass myFirstBean(){
        return new MyFirstClass("Hello, Lakshman 1st");
    }

    @Bean("bean2")
//    @Qualifier("bean2")
    public MyFirstClass mySecondBean(){
        return new MyFirstClass("Hello, Lakshman 2nd");
    }
}
