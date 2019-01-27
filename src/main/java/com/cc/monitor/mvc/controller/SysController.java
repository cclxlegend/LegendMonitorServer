package com.cc.monitor.mvc.controller;

import com.cc.monitor.mvc.service.HeartBeatService;
import com.cc.monitor.mvc.vo.request.HeartBeatRequest;
import com.cc.monitor.mvc.vo.response.HeartBeatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sys", produces = "application/json;charset=utf-8")
public class SysController {

    @Autowired
    private HeartBeatService heartBeatService;

    public HeartBeatResponse heartbeat(HeartBeatRequest request){


        return HeartBeatResponse.buildSuccess();
    }

}
