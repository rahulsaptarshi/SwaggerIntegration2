package com.rahul.example.SwaggerIntegration2.controller;

import io.swagger.annotations.ApiOperation;
import org.apache.catalina.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    @ApiOperation("Get User Name of Application")
    @GetMapping("/getUserName")
    public String getUserName() {
        LOGGER.info("featching user name..");
        return "User is Demo";
    }
}
