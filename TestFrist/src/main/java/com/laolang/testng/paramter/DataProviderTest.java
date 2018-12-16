package com.laolang.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {

    @Test(dataProvider = "data")
    public void test1(String name,int age){
        System.out.println("test1111方法,name = " + name + "; age = " + age);
    }

    @Test(dataProvider = "data")
    public void test2(String name,int age){
        System.out.println("test2222方法,name = " + name + "; age = " + age);
    }

    @DataProvider(name ="data")
    public Object[][] test3(Method method){
        Object[][] aaa = null;
        if(method.getName().equals("test1")){
            aaa = new Object[][]{
                    {"张三",22},
                    {"李四",24}
            };
        }else if(method.getName().equals("test2")){
            aaa = new Object[][]{
                    {"王五",40},
                    {"赵六",60}
            };
        }
        return aaa;
    }

}
