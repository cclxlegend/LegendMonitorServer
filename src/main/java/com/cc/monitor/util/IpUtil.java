package com.cc.monitor.util;

public class IpUtil {

    public static long convertIp(String ipStr) {
        String[] ipArray = ipStr.split(".");
        int ip = 0;
        ip += Integer.parseInt(ipArray[0]) * 256 * 256 * 256;
        ip += Integer.parseInt(ipArray[1]) * 256 * 256;
        ip += Integer.parseInt(ipArray[2]) * 256;
        ip += Integer.parseInt(ipArray[3]);

        return ip;
    }
}
