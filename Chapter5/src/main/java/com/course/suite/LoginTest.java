package com.course.suite;

import com.sun.org.apache.xpath.internal.SourceTree;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/2/25.
 */
public class LoginTest {

    @BeforeMethod
    public void beforemethod(){
        System.out.println("beforemethod");
    }

    @AfterMethod
    public void aftermethod(){
        System.out.println("aftermethod");
    }

    @Test
    public void login01(){
        System.out.println("正向流程1");
    }

    @Test
    public void login02(){
        System.out.println("正向流程2");
    }

    @Test
    public void login03(){
        System.out.println("正向流程3");
    }


    @Test
    public void login04(){
        System.out.println("正向流程4");
    }
}
