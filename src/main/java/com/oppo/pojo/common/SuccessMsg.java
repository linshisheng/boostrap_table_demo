package com.oppo.pojo.common;

import lombok.Data;

/**
 * @author Lin Shisheng
 * @version 1.0
 * @date 2020/1/5 16:19
 */

@Data
public class SuccessMsg {


    private int code;
    private String msg;
    private Object object;

    //返回值无参数返回的时候返回
    public static SuccessMsg SUCCESS = new SuccessMsg(200,"操作成功！","该方法无需返回值");
    //返回值中需要带参数返回
    public static SuccessMsg successResult(Object object){
        SuccessMsg successMsg = new SuccessMsg();
        successMsg.setCode(200);
        successMsg.setMsg("操作成功！");
        successMsg.setObject(object);
        return successMsg;
    }

    private SuccessMsg() {}
    private SuccessMsg(int code, String msg,Object o) {
        this.code = code;
        this.msg = msg;
        this.object=o;
    }
}
