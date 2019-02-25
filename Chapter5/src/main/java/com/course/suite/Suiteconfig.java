package com.course.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * Created by Administrator on 2019/2/25.
 */
public class Suiteconfig {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("beforesuite");
    }


    @AfterSuite
    public void aftersuite(){
        System.out.println("aftersuite");
    }
}
