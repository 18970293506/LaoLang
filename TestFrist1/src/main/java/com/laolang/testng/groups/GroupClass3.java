package com.laolang.testng.groups;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

@Test(groups = "teacher")
public class GroupClass3 {
    public void class1(){
        System.out.println("这是第叁个类教师组11111");
    }
    public void class2(){
        System.out.println("这是第叁个类教师组22222");
    }

    @BeforeGroups ("stu")
    public void beforeGroups(){
        System.out.println("组测试之前");
    }


}
