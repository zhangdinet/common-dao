package com.zhangdinet.api.entity;

import java.io.Serializable;

/**
 * 基础响应类
 *
 * User: zhangdinet
 * Date: 2016-07-19 21:20
 */
public class Response<T> extends BaseCode implements Serializable {

    private static final long serialVersionUID = 6675030809029070258L;

    public T data;

    public static <T> Response<T> wrapSuccess() {
        return wrapSuccess(null);
    }

    public static <T> Response<T> wrapSuccess(T data) {
        return wrapSuccess(data,BaseConstant.SUCCESS_MSG,"");
    }

    public static <T> Response<T> wrapSuccess(String msg) {
        return wrapSuccess(null,msg);
    }

    public static <T> Response<T> wrapSuccess(T data,String msg) {
        return wrapSuccess(data,msg,"");
    }

    public static <T> Response<T> wrapSuccess(T data,String msg,String desc){
        Response response = new Response();
        response.data = data;
        response.code = BaseConstant.SUCCESS_CODE;
        response.msg = msg;
        response.desc = desc;
        return response;
    }

    public static <T> Response<T> wrapError(){
        return wrapError(null,BaseConstant.FAIL_CODE);
    }

    public static <T> Response<T> wrapError(T data){
        return wrapError(data,BaseConstant.FAIL_CODE);
    }

    public static <T> Response<T> wrapError(int code){
        return wrapError(null,code);
    }

    public static <T> Response<T> wrapError(T data,int code){
        return wrapError(data,code,BaseConstant.FAIL_MSG);
    }

    public static <T> Response<T> wrapError(T data,int code,String msg){
        return wrapError(data,code,msg,"");
    }

    public static <T> Response<T> wrapError(T data,int code,String msg,String desc){
        Response response = new Response();
        response.data = data;
        response.code = code;
        response.msg = msg;
        response.desc = desc;
        return response;
    }
}
