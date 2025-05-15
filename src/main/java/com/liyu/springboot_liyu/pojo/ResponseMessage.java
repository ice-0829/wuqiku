package com.liyu.springboot_liyu.pojo;

public class ResponseMessage<T> {
    private Integer code;
    private String message;
    private T data;

    public ResponseMessage(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    //接口请求成功
    public static <T> ResponseMessage<T> success(T data) {
        return new ResponseMessage<T>(200, "success", data);
    }
}
