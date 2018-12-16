package com.laolang.testng.multiThread;

import org.testng.annotations.Test;

public class MultiTheradOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 8)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id : %s%n",Thread.currentThread().getId());
    }
}
