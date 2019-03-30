package com.ourside.wxapp.service;

import com.ourside.wxapp.model.response.DoResult;

/**
 * @Author Czz
 * @Description 微信登录接口
 * @Date 2019-03-30 13:54
 * @Version 1.0
 */
public interface WxLoginService {

    /**
     * 微信登录
     *
     * @param code
     * @return
     */
    public DoResult apiLogin(String code);
}
