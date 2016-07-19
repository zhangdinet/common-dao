package com.zhangdinet.api.entity;

import java.io.Serializable;

/**
 * 基础抽象响应码类
 * <p>
 * User: zhangdinet
 * Date: 2016-07-19 21:58
 */
public class BaseCode implements Serializable {

    private static final long serialVersionUID = 130186065644972963L;

    /**
     * 响应码
     */
    public int code;

    /**
     * 响应信息
     */
    public String msg;

    /**
     * 响应信息描述
     */
    public String desc;

    @Override
    public String toString() {
        return "BaseCode{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
