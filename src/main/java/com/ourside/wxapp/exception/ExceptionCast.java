package com.ourside.wxapp.exception;

import com.ourside.wxapp.model.ResultCode;

/**
 * @Author Czz
 * @Description 自定义异常生成
 * @Date 2019-03-30 13:48
 * @Version 1.0
 */
public class ExceptionCast {
    public static void cast(ResultCode resultCode) {
        throw new CustomException(resultCode);
    }
}
