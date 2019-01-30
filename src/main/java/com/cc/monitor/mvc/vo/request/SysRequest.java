package com.cc.monitor.mvc.vo.request;

public class SysRequest {

    private String device;
    private long timestamp;

    /**
     * 内存指标
     */

    // 总内存 单位byte
    private long mem_total_size;
    // 内存使用比率
    private float mem_used;
    // 内存缓存比率
    private float mem_cached;
    // 内存交换比率
    private float mem_swap;

    /**
     * Cpu指标
     */
    // Cpu使用比率
    private float cpu_used;

    /**
     * 磁盘指标
     */
    //磁盘总量 单位 byte
    private long disk_total_size;
    // 磁盘当前占用率
    private float disk_used;

    /**
     * 网络流量指标
     */

    // 网络最大支持流量 单位 nyte
    private long netflow_total_size;
    // 网络通道占用率
    private float netflow_used;


}
