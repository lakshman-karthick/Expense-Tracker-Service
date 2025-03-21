package com.expenseTracker.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@PropertySources({
        @PropertySource("classpath:custom.properties")
})
public class MyFirstService {
//    @Autowired
//    @Qualifier("bean1")
    private MyFirstClass myFirstClass;
    private Environment environment;

    @Value("${my.prop}")
    private String customString;

    @Value("spring.application.name")
    private String appProp;

//    @Autowired
//    public void injectDependencies(@Qualifier("bean2") MyFirstClass myFirstClass){
//        this.myFirstClass = myFirstClass;
//    }

    @Autowired
    public void setMyFirstClass(@Qualifier("bean2") MyFirstClass myFirstClass){
        this.myFirstClass = myFirstClass;
    }

//    public MyFirstService(@Qualifier("bean2") MyFirstClass myFirstClass){
//        this.myFirstClass = myFirstClass;
//    }

    public String tellAStory(){
        return "The dependency is saying: "+ myFirstClass.sayHello();
    }

    public String customPrint(){
        return "The dependency is saying: "+ customString + " " + appProp;
    }

    public String getVersion(){
        return "The version is: " + environment.getProperty("java.version");
    }

    public String getOSName(){
        return "The version is: " + environment.getProperty("os.name");
    }

    @Autowired
    public void setEnvironment(Environment environment){
        this.environment = environment;
    }


}
