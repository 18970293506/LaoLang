package com.laolang.testng.suite;

import org.testng.annotations.*;

public class suite {
    @BeforeSuite
    public void beforSuite(){
        System.out.println("套件之前");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("套件之后");
    }

    @BeforeTest
    public void beforTest(){
        System.out.println("Test之前");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("test之后");
    }
}
