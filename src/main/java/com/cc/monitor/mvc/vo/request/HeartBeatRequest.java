package com.cc.monitor.mvc.vo.request;

import com.alibaba.fastjson.JSONObject;

public class HeartBeatRequest {

    public String device;
    public String ip;
    public int status;
    public long timestamp;

    public String getDevice() {
        return device;
    }

    public void setDevice(String device) {
        this.device = device;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("device", this.device);
        json.put("ip", this.ip);
        json.put("status", this.status);
        json.put("timestamp", this.timestamp);
        return json;
    }
}
