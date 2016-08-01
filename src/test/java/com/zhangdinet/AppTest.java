package com.zhangdinet;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * Use to start test
 *
 * User: hzzhangdi3
 * Date: 2016-08-01 15:00
 */
public class AppTest {

    App app;

    @BeforeMethod
    public void setUp() throws Exception {
        app = new App();
    }

    @AfterMethod
    public void tearDown() throws Exception {

    }

    @Test
    public void testAdd() throws Exception {
        int a=20;
        int b=10;
        int c= app.add(a,b);
        System.out.print(c);
        int d = app.add(2,3);
        System.out.print(d);
    }

    @Test
    public void testSub() throws Exception {
        int a=20;
        int b=10;
        int c= app.sub(a,b);
        System.out.print(c);
    }

}