package com.cc.monitor.mvc.vo.request;

public class SysRequest {

    private String device;
    private long timestamp;

    /**
     * 内存指标
     */

    // 总内存 单位byte
    private long mem_total;
    // 剩余内存
    private long mem_free;
    // 交换的虚拟内存
    private long mem_commited_vitual;

    /**
     * Cpu指标
     */
    // Cpu使用比率
    private double cpu_load;
    // 当前进程占用CPU比率
    private double process_cpu_load;

    /**
     * 磁盘指标
     */
    // 磁盘总量 单位 byte
    private long disk_total;
    // 当前磁盘容量
    private long disk_free;
}
