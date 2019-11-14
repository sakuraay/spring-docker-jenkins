package com.levi.springdockerjenkins.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  测试docker-jenkins自动化部署
 * </p>
 *
 * @author Levi
 * @since 2019/11/14
 */
@RestController
@RequestMapping("/docker")
public class DockerTestController {

    @RequestMapping("/hello")
    public String helloDocker(){
        return "hello Docker  -- from Levi";
    }
}
