package com.cc.monitor.util;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class IpUtil {

    public static long convertToIp(String ipStr) {
        String[] ipArray = ipStr.split(".");
        int ip = 0;
        ip += Integer.parseInt(ipArray[0]) * 256 * 256 * 256;
        ip += Integer.parseInt(ipArray[1]) * 256 * 256;
        ip += Integer.parseInt(ipArray[2]) * 256;
        ip += Integer.parseInt(ipArray[3]);

        return ip;
    }

    public static String convertToString(long ip){
        StringBuilder retStr = new StringBuilder();
        retStr.append((ip >> 24)&0xFF).append(".")
                .append((ip >> 16)&0xFF).append(".")
                .append((ip>>8)&0xFF).append(".")
                .append(ip&0xFF);
        return retStr.toString();
    }

    public static String getIpFromRequest(HttpServletRequest request){
        String ip = firstIp(request.getHeader("X-Forwarded-For"));
        if (StringUtils.isEmpty(ip) || "unknown".equalsIgnoreCase(ip)) {
            ip = request.getRemoteAddr();
        }
        return ip;
    }

    private static String firstIp(String ip){
        return StringUtils.substringBefore(ip, ",");
    }

}
