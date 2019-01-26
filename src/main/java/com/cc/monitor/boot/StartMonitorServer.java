package com.cc.monitor.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 服务启动入口
 */
@SpringBootApplication
public class StartMonitorServer {

    public static void main(String[] args) {
        SpringApplication.run(StartMonitorServer.class, args);
    }
}
