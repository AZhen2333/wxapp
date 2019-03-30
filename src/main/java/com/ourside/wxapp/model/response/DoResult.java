package com.ourside.wxapp.model.response;

import com.ourside.wxapp.model.ResultCode;
import lombok.Data;
import lombok.ToString;

/**
 * @Author Czz
 * @Description 操作返回结果
 * @Date 2019-03-30 13:51
 * @Version 1.0
 */
@Data
@ToString
public class DoResult extends ResponseResult {

    Object data;

    public DoResult(ResultCode resultCode, Object data) {
        super(resultCode);
        this.data = data;

    }
}
