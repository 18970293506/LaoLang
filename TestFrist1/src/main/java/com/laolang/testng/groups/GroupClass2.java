package com.laolang.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupClass2 {
    public void class1(){
        System.out.println("这是第贰个类学生组11111");
    }
    public void class2(){
        System.out.println("这是第贰个类学生组22222");
    }
}