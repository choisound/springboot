package com.cyx.domain;

import javax.security.auth.login.FailedLoginException;

public enum RespCode {
    SUCCESS(1,"成功"),
    FAIL(0,"失败");
    private int code;
    private String msg;
    RespCode(int code, String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }
}
