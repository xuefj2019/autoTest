package com.course.testng;

import org.testng.annotations.*;

/**
 * Created by Administrator on 2019/2/25.
 */
public class BasicAnniotation {
    @Test
    public void test1(){
        System.out.println("this is case");
    }

    @Test
    public void test2(){
        System.out.println("this is case2");
    }

    @BeforeMethod
    public void beforemethodtest(){
        System.out.println("测试方法之前");
    }

    @AfterMethod
    public void aftermethodtest(){
        System.out.println("测试方法之后");//sout

    }

    @BeforeClass
    public void beforclass(){
        System.out.println("类之前");
    }

    @AfterClass
    public void afterclass(){
        System.out.println("类之后");
    }

    public void suite(){
        System.out.println("suite.xml");
    }

}
