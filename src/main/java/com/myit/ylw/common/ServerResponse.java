package com.myit.ylw.common;

import org.codehaus.jackson.annotate.JsonIgnore;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import java.io.Serializable;

/**
 * Created by H1 on 2018/2/25.
 */
//保证序列化json时，如果是null可以也会消失
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class ServerResponse<T> implements Serializable {
    private int status;
    private  String msg;
    private T data;
    private ServerResponse (int status){
        this.status=status;
    }
    private ServerResponse (int status,T data){
        this.status=status;
        this.data=data;
    }
    private ServerResponse (int status,String msg,T data){
        this.status=status;
        this.msg=msg;
        this.data=data;
    }
    private ServerResponse (int status,String msg){
        this.status=status;
        this.msg=msg;
    }
    //使isSuccess不在json序列化结果当中
    @JsonIgnore
    public boolean isSuccess(){
        return this.status==ResponseCode.SUCCESS.getCode();
    }

    public int getStatus() {
        return status;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }
    //登陆成功没有返回数据和成功的信息
    public static <T> ServerResponse<T> createBySuccess(){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode());
    }
    //登录成功自定义提示的信息
    public static <T> ServerResponse<T> createBySuccessMessage(String msg) {
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg);
    }

    /**
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T>ServerResponse<T> createBySuccess(T data){
        return new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),data);
    }
    public static <T>ServerResponse<T> createBySuccess(String msg,T data){
        return  new ServerResponse<T>(ResponseCode.SUCCESS.getCode(),msg,data);
    }

    public  static <T>ServerResponse<T> createByErro(){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),ResponseCode.ERROR.getDesc());
    }
    public  static <T>ServerResponse<T> createByErroMessage(String erroMessage){
        return new ServerResponse<T>(ResponseCode.ERROR.getCode(),erroMessage);
    }
    public  static <T>ServerResponse<T> createByErroCodeMessage(int erroCode,String erroMessage){
        return new ServerResponse<T>(erroCode,erroMessage);
    }
}
