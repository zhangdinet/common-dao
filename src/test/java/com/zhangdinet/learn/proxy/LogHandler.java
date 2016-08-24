package com.zhangdinet.learn.proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * User: hzzhangdi3
 * Date: 2016-08-24 15:23
 */
public class LogHandler implements InvocationHandler {

    private static Logger logger = LoggerFactory.getLogger(LogHandler.class);

    private Object object;

    public Object newInstance(Object o){
        this.object = o;
        return Proxy.newProxyInstance(LogHandler.class.getClassLoader(),object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        logger.info("before invoke");
        Object ret = method.invoke(object,args);
        logger.info("invoke end");
        return ret;
    }
}
