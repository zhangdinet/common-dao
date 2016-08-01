package com.zhangdinet;

import org.testng.annotations.Test;

/**
 * User: hzzhangdi3
 * Date: 2016-08-01 15:00
 */
public class AppTest {

    @Test
    public void testAdd() throws Exception {
        int a=20;
        int b=10;
        int c= App.add(a,b);
        System.out.print(c);
    }

    @Test
    public void testSub() throws Exception {
        int a=20;
        int b=10;
        int c= App.sub(a,b);
        System.out.print(c);
    }

}