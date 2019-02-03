package com.cc.monitor.mvc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestServerController {

    @RequestMapping(value = {"/hello"}, method = RequestMethod.GET)
    public String hello(){
        return "Hello World";
    }
}
