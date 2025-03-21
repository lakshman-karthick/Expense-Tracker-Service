package com.expenseTracker.service;


import org.springframework.stereotype.Component;

public class MyFirstClass {

    private String myVar = "";

    public MyFirstClass(String myVar){
        this.myVar = myVar;
    }


    public String sayHello(){
        return "Hello from first Class:"+ myVar;
    }

}
