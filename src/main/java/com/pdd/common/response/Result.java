package com.pdd.common.response;

import com.alibaba.fastjson.JSON;

import java.io.Serializable;

public class Result<T> implements Serializable {

    private static final long serialVersionUID = -2354377668069235864L;
    public int code = 200;
    private T data;
    private String msg = "成功！";

    public Result(){
    }
    public Result(T data){
        this.data = data;
    }
    public Result(int code, String msg){
        this.code = code;
        this.msg = msg;
    }



    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String toJson(){
        return JSON.toJSONString(this);
    }

    public static com.pdd.common.response.Result<?> fail(String message) {
        return new com.pdd.common.response.Result<>(500,message);
    }
}