package com.course.groups;

import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * Created by Administrator on 2019/2/25.
 */
public class ParamterTest {


    /*
    参数化数据来源是xml文件
     */
    //    @Test
    //    @Parameters({"name","age"})
    //    public void test01(String name,int age){
    //        System.out.println("name="+name+":age="+age);
    //    }


    /**
     * 参数化数据来源是dataprivider
     * @param name
     * @param age
     */
    @Test(dataProvider = "data")
    public void test02(String name,int age){
        System.out.println("name="+name+":age="+age);
    }

    @DataProvider(name = "data")
    public Object[][] dataprivider(){
        Object[][] o = new Object[][]{
                {"张三",20},
                {"李四",30},
                {"王五",40},
        };
        return o;
    }


    /**
     *参数化来源是dataprovider
     * @param name
     * @param age
     */
    @Test(dataProvider = "datatest")
    public void test1(String name,int age){
        System.out.println("test100000000"+"name="+name+":age="+age);
    }

    @Test(dataProvider = "datatest")
    public void test2(String name,int age){
        System.out.println("test200000000"+"name="+name+":age="+age);
    }

    @DataProvider(name="datatest")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"zhangsan",20},
                    {"lisi",30}
            };
        }
        else if(method.getName().equals("test2")){
            result = new Object[][]{
                    {"aaaa", 20},
                    {"bbbb", 30}
            };
        }
        return result;
    }
}
