package com.cc.monitor.mvc.vo.response;

import com.alibaba.fastjson.JSONObject;

public class HeartBeatResponse {

    private int status;
    private String message;

    public static HeartBeatResponse buildSuccess(){
        HeartBeatResponse response = new HeartBeatResponse();
        response.setMessage("ok");
        response.setStatus(0);

        return response;
    }

    public static HeartBeatResponse buildFail(int status,String message){
        HeartBeatResponse response = new HeartBeatResponse();
        response.setMessage(message);
        response.setStatus(status);

        return response;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public JSONObject toJson() {
        JSONObject json = new JSONObject();
        json.put("status", this.status);
        json.put("message", this.message);
        return json;
    }
}
