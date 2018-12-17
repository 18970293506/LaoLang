package com.laolang.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PrarmterTest {

    @Test
    @Parameters({"name1","age1"})
    public void test1(String name ,int age){
        System.out.println("name = " + name + "; age = " + age);
    }

    @Test
    @Parameters({"name","age"})
    public void test2(String name ,int age){
        System.out.println("name = " + name + "; age = " + age);
    }
}
