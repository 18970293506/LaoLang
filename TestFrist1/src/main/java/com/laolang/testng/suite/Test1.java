package com.laolang.testng.suite;

import org.testng.annotations.Test;

public class Test1 {
    @Test(enabled = false)
    public void test(){
        System.out.println("Test1");
    }
}
