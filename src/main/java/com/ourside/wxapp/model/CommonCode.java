package com.ourside.wxapp.model;

import lombok.ToString;

/**
 * @Author Czz
 * @Description 通用结果代码集
 * @Date 2019-03-30 11:58
 * @Version 1.0
 */
@ToString
public enum CommonCode implements ResultCode {
    INVALIDPARAM(false, 10003, "非法参数"),
    SUCCESS(true, 10000, "操作成功！"),
    FAIL(false, 11111, "操作失败！"),
    UNAUTHENTICATED(false, 10001, "此操作需要登陆系统！"),
    UNAUTHORISE(false, 10002, "权限不足，无权操作！"),
    SERVER_ERROR(false, 99999, "抱歉，系统繁忙，请稍后重试！"),
    UNAUTHEXIST(false, 10003, "用户登录，用户验证未通过：未知用户！"),
    UNAUTHPASS(false, 10004, "用户登录，用户验证未通过：帐号或密码输入错误！"),
    AUTHDELFREEZE(false, 10005, "用户登录，用户验证未通过：用户已冻结，请联系管理员");
    boolean success;
    //操作代码
    int code;
    //提示信息
    String message;

    private CommonCode(boolean success, int code, String message) {
        this.success = success;
        this.code = code;
        this.message = message;
    }

    @Override
    public boolean success() {
        return success;
    }

    @Override
    public int code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }
}
