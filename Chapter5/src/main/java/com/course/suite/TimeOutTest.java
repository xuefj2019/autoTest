package com.course.suite;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/2/25.
 */
public class TimeOutTest {

    @Test(timeOut = 5000)
    public void test1() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test1");

    }


    @Test(timeOut = 1000)
    public void test2() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("test1");

    }
}
