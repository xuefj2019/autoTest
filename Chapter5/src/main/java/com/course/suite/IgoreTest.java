package com.course.suite;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/2/25.
 */
public class IgoreTest {

    @Test
    public void igoremethod1(){
        System.out.println("testdddddddddddddddddddd");
    }

    @Test(enabled = false)
    public void igoremethod2(){
        System.out.println("testwwwwwwwwwwwwwwwwwwww");
    }
}
