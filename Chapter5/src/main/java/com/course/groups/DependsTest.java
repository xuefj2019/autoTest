package com.course.groups;

import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/2/25.
 */
public class DependsTest {



    @Test(dependsOnMethods = {"test01"})
    public void test02(){
        System.out.println("test02");
    }

    @Test
    public void test01(){
        System.out.println("test01");
    }
}
