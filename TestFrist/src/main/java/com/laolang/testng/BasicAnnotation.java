package com.laolang.testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("测试玩玩");

    }

    @Test
    public void testCase2(){
        System.out.println("测试用例2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("测试之前的步骤");

    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("测试之后的步骤");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("类之前步骤");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("类之后步骤");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("测试套件之前");
    }


    @AfterSuite
    public void afterSuite(){
        System.out.println("测试套件之后");
    }

}
