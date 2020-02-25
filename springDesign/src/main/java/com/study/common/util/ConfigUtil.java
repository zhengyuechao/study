package com.study.common.util;

import org.springframework.util.StringUtils;

public class ConfigUtil {

	static PropertiesLoader GLOB_CONFIG = null;

    static {
        init();
    }

    private static void init() {
        //输入配置文件名，一个或多个
        GLOB_CONFIG = new PropertiesLoader("application-param.properties");
    }

    public static String getConfig(String key) {
        if (GLOB_CONFIG == null) {
            init();
        }
        String value = GLOB_CONFIG.getProperty(key);
        if (StringUtils.isEmpty(value)) {
            value = "";
        }
        return value;
    }
    public static void main(String[] args) {
		System.out.println(getConfig("my"));
	}
}
