package com.ourside.wxapp.controller;

import com.ourside.wxapp.api.WxLogingApiController;
import com.ourside.wxapp.exception.ExceptionCast;
import com.ourside.wxapp.model.CommonCode;
import com.ourside.wxapp.model.response.DoResult;
import com.ourside.wxapp.service.WxLoginService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Czz
 * @Description 登录控制层
 * @Date 2019-03-30 11:57
 * @Version 1.0
 */
@RestController
@RequestMapping("wx")
public class WxLogingController implements WxLogingApiController {

    @Autowired
    private WxLoginService wxLoginService;

    /**
     * 微信登录
     *
     * @param code
     * @return
     */
    @Override
    @PostMapping("/login")
    public DoResult login(@RequestParam(value = "code", required = true) String code) {
        if (StringUtils.isEmpty(code)) {
            ExceptionCast.cast(CommonCode.INVALIDPARAM);
        }
        return wxLoginService.apiLogin(code);
    }
}
