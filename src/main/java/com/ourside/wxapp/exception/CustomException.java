package com.ourside.wxapp.exception;

import com.ourside.wxapp.model.ResultCode;

/**
 * @Author Czz
 * @Description 自定义异常
 * @Date 2019-03-30 13:48
 * @Version 1.0
 */
public class CustomException extends RuntimeException {

    // 错误代码
    private ResultCode resultCode;

    public CustomException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public ResultCode getResultCode() {
        return resultCode;
    }
}
