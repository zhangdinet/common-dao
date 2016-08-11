package com.zhangdinet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * Main测试类
 *
 * User: zhangdinet
 * Date: 2016-08-11 14:06
 */
public class MainTest {

    static Logger logger = LoggerFactory.getLogger(MainTest.class);

    public static void main(String[] args){
        logger.error("This is a demo test in {} class at {}", MainTest.class.getName(),new Date());
    }

}
