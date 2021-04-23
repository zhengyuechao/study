package com.study.exception;

/**
 * @description: 服务接口类
 * @author: zheng 
 */
public interface BaseErrorInfoInterface {

    /**
     *  错误码
     * @return
     */
    String getResultCode();

    /**
     * 错误描述
     * @return
     */
    String getResultMsg();
}

