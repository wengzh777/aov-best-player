package com.wzh.aovbpbg.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: wzh
 * @description: com.wzh.aovbpbg.controller
 * @date:2019/12/4
 */
@Api(value = "测试控制器",tags = {"用于测试swagger"})
@RestController
@RequestMapping("test")
@Slf4j
public class TestController {

    @ApiOperation(value="跟用户打招呼",httpMethod = "GET")
    @ApiImplicitParam(name = "name" ,value = "用户名" ,required = true ,dataType = "String", paramType = "path")
    @GetMapping("sayHello/{name}")
    public String sayHello(@PathVariable("name")@ApiParam("用户姓名") String name){
        log.info("hello {}",name);
        return "hello " + name;
    }
}
