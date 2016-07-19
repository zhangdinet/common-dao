package com.zhangdinet.api.entity;

import java.io.Serializable;

/**
 * 基础响应类
 *
 * User: zhangdinet
 * Date: 2016-07-19 21:20
 */
public class Response<T> implements Serializable {

    private static final long serialVersionUID = 6675030809029070258L;

    private T data;

    private int data;

    private String msg;

    private String desc;


    public T getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "data=" + data +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
