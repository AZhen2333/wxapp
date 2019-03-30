package com.ourside.wxapp.api;

import com.ourside.wxapp.model.response.DoResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

/**
 * @Author Czz
 * @Description 微信登录api
 * @Date 2019-03-30 11:57
 * @Version 1.0
 */
@Api(value = "微信登录接口", description = "微信登录接口，提供微信登录业务")
public interface WxLogingApiController {

    @ApiOperation("微信登录")
    @ApiImplicitParam(name = "code", value = "微信login()返回code", required = true, paramType = "query", dataType = "String")
    DoResult login(String code);

}
