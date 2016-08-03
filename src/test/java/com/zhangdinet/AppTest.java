package com.zhangdinet;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

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
}