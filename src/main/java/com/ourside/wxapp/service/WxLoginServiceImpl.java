package com.ourside.wxapp.service;

import com.ourside.wxapp.exception.ExceptionCast;
import com.ourside.wxapp.model.CommonCode;
import com.ourside.wxapp.model.response.DoResult;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.time.Duration;

/**
 * @Author Czz
 * @Description 微信登录业务实现
 * @Date 2019-03-30 13:55
 * @Version 1.0
 */
@Service
public class WxLoginServiceImpl implements WxLoginService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private RedisTemplate<String, String> redisTemplate;

    /**
     * 微信api登录
     *
     * @param code
     * @return
     */
    @Override
    public DoResult apiLogin(String code) {
        String appid = "xxxx";
        String secret = "xxxxx";
        String url = "https://api.weixin.qq.com/sns/jscode2session?appid="
                + appid
                + "&secret=" + secret
                + "&js_code=" + code
                + "&grant_type=authorization_code";
        String resData = this.restTemplate.getForObject(url, String.class);
        if (StringUtils.contains(resData, "errcode")) {
            ExceptionCast.cast(CommonCode.FAIL);
        }
        // 返回前端
        String ticket = "WXAPP_" + DigestUtils.md5Hex(resData);
        String redisKey = "WX_LOGIN_" + ticket;
//        this.redisTemplate.opsForValue().set(redisKey, resData, Duration.ofDays(7));
        return new DoResult(CommonCode.SUCCESS, ticket);
    }
}
