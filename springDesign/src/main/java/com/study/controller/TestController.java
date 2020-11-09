package com.study.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Api(value = "测试接口", tags = "测试接口")
@RestController
@RequestMapping("/api/test")
public class TestController {

    @ApiOperation(value = "getByCode", notes = "根据code获取字符串")
    @ApiImplicitParam(value = "编码", name = "code", required = true, dataType = "String", paramType = "query")
    @GetMapping("/getByCode")
    public Map<String, Object> getByCode(String code){
        Map<String, Object> map = new HashMap<>();
        map.put("code", code);
        return map;
    }

    @ApiOperation(value = "login", notes = "登陆")
    @ApiImplicitParams({
            @ApiImplicitParam(value = "用户名", name = "username", dataType = "String", required = true, paramType = "form"),
            @ApiImplicitParam(value = "密码", name = "password", dataType = "String", required = true, paramType = "form")
    })
    @PostMapping("/login")
    public Map<String, Object> login(String username, String password) {
        Map<String, Object> map = new HashMap<>();
        map.put("code", 200);
        map.put("message", "登陆成功");
        return map;
    }

}
