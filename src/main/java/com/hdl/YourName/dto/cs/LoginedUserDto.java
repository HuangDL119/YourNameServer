package com.hdl.YourName.dto.cs;

/**
 * 客户端登录验证后的请求消息体封装类
 * 必须传递SESSION参数用于服务器登陆状态判断
 * Created by HuangDL on 2016/12/18.
 */
public class LoginedUserDto extends RequestDtoBase
{
    //登录成功后服务器返还的SESSION信息，每次通讯都要传递
    public String session;
}
