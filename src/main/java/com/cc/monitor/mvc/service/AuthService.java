package com.cc.monitor.mvc.service;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service("authService")
public class AuthService {

    public boolean doAuthentication(HttpServletRequest httpServletRequest) {

        String deviceName = httpServletRequest.getParameter("device.name");
        String deviceKey = httpServletRequest.getParameter("");

        return false;

    }
}
