package com.hdl.YourName.dto.constant;

/**
 * 错误状态编码
 * 状态信息为0表示正常按照约定返回信息
 * >0表示有错误状态，请参照错误状态编码提示用户各种文字
 * Created by HuangDL on 2016/12/18.
 */
public class ErrorCode {
    public static final int SUC=0;           //成功
    public static final int ERR_PARM=1;      //参数不合法
    public static final int ERR_NO_USER=2;   //用户不存在
    public static final int ERR_PASSWORD=3;  //错误的用户名或密码
    public static final int ERR_SESSION=4;   //回话过期请重新登录
    public static final int ERR_RECOVERY_KEY=5;   //错误的资料找回KEY
}
