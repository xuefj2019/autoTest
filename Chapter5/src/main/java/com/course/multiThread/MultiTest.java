package com.course.multiThread;

import org.testng.annotations.Test;

/**testng的多线程测试
 * Created by Administrator on 2019/2/25.
 */
public class MultiTest {


    /**
     * (invocationCount = 10,threadPoolSize = 3)多线程运行用例,此时线程数是10个，线程池是3个
     */
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println("多线程测试");
        System.out.println("线程："+Thread.currentThread().getId());
    }

}
