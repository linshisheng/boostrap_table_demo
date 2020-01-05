package com.oppo.pojo.common;

import lombok.Data;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/5 16:17
 */

@Data
public class Result <T>{
    private int code;
    private String msg;
    private Object data;

    /**
     *  成功时候的调用
     * */
    public static  <T> Result<T> success(SuccessMsg successMsg){
        return new Result<T>(successMsg);
    }

    /**
     *  失败时候的调用
     * */
    public static  <T> Result<T> error(CodeMsg codeMsg){
        return new Result<T>(codeMsg);
    }

    private Result(T data) {
        this.data = data;
    }

    private Result(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    private Result(CodeMsg codeMsg) {
        if(codeMsg != null) {
            this.code = codeMsg.getCode();
            this.msg = codeMsg.getMsg();
            this.data = "发生异常，请查看异常信息";
        }
    }

    private Result(SuccessMsg successMsg) {
        if(successMsg != null) {
            this.code = successMsg.getCode();
            this.msg = successMsg.getMsg();
            this.data=successMsg.getObject();
        }
    }
}
