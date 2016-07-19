package com.zhangdinet.api.entity;

/**
 *
 * User: zhangdi
 * Date: 2016-07-19 23:12
 * <p>
 * 错误分为两类：1开头，系统错误 1000001；2开头，应用错误 2000001
 * 一共7位，前3位代表错误类型，后4位表示具体错误
 */
public class BaseConstant {

    /**
     * ========== 错误码 ==========
     * 定义常量，方便调整次序及给他人显示
     */
    public static final int SUCCESS_CODE = 2000001;
    public static final int FAIL_CODE = 2000002;
    public static final int NOT_LOGIN_CODE = 2000003;
    public static final int ACCESS_DENYED_CODE = 2000004;

    /**
     * ========== 错误类型 ==========
     */
    public static final String SUCCESS_MSG = "成功";
    public static final String FAIL_MSG = "失败";
    public static final String NOT_LOGIN_MSG = "未登录";
    public static final String ACCESS_DENYED_MSG = "没有权限执行此操作";
}
