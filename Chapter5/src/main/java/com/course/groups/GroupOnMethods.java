package com.course.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2019/2/25.
 */
public class GroupOnMethods {

    @Test(groups = "server" )
    public void test01(){
        System.out.println("server端测试用例");
    }

    @BeforeGroups
    public void beforeonMethods(){
        System.out.println("server端测试用例执行之前用例");
    }

    @AfterGroups
    public void  afteronMethods(){
        System.out.println("server端测试用例执行之后用例");
    }

    @Test(groups = "server")
    public void test02(){
        System.out.println("客户端测试01");
    }

    @Test(groups = "server")
    public void test03(){
        System.out.println("客户端测试02");
    }



    @Test(groups = "stu")
    public void test04(){
        System.out.println("客户端测试stu");
    }

    @Test(groups = "stu")
    public void test05(){
        System.out.println("客户端测试stu");
    }
}
