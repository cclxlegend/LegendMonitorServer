package com.cc.monitor.mvc.service;

import com.cc.monitor.mvc.vo.request.HeartBeatRequest;
import org.springframework.stereotype.Service;

@Service
public class HeartBeatService {

    public boolean accept(HeartBeatRequest request){



        return true;
    }


}
