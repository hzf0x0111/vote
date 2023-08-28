package com.example.vote.utils;
/*
    author：chenyao
    time: 2023/8/28
 */
public enum RespCode {
    Success(0, "Success."),
    Fail(1, "Fail.");

    private int code;
    private String desc;

    private RespCode(int code) {
        this.code = code;
    }

    private RespCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return this.code;
    }

    public String getDesc() {
        return this.desc;
    }

}
