package com.zhangdinet.learn.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * User: hzzhangdi3
 * Date: 2016-08-24 15:22
 */
public class AddImpl implements Add {

    private static Logger logger = LoggerFactory.getLogger(AddImpl.class);

    @Override
    public int add(int a, int b) {
        int c= a + b;
        System.out.println(c);
        return c;
    }
}
