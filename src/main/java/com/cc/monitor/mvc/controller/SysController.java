package com.cc.monitor.mvc.controller;

import com.cc.monitor.mvc.service.HeartBeatService;
import com.cc.monitor.mvc.vo.request.HeartBeatRequest;
import com.cc.monitor.mvc.vo.response.HeartBeatResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/sys", produces = "application/json;charset=utf-8")
public class SysController {

    @Autowired
    private HeartBeatService heartBeatService;

    @RequestMapping(value = {"/heartbeat"}, method = RequestMethod.POST)
    @ResponseBody
    public HeartBeatResponse heartbeat(HeartBeatRequest request){

        if(!heartBeatService.accept(request)) {
            return HeartBeatResponse.buildFail(1,"fail");
        }

        return HeartBeatResponse.buildSuccess();
    }

    @RequestMapping(value = {"/info"}, method = RequestMethod.POST)
    @ResponseBody
    public HeartBeatResponse info(HeartBeatRequest request){
        return null;
    }



}
