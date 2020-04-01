package com.study.common.util;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@PropertySource(value = {"classpath:application-prod.yml"})
@ConfigurationProperties(prefix = "weixinpay")
@Component
@Data
public class ReadWeixinConfig {


    private String appid;

    private String mch_id;

    private String sign_key;


}
