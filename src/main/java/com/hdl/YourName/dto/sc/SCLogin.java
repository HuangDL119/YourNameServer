package com.hdl.YourName.dto.sc;

import com.hdl.YourName.dto.vo.VoUserSimple;

/**
 * 登录消息传输
 * 登陆成功后发给客户端
 * Created by HuangDL on 2016/12/18.
 */
public class SCLogin extends ResponseDtoBase{
    //用于本次登录后的所有会话
    public String session;
    //当前登录用户资料
    public VoUserSimple user;
    //交换用户信息，可能为NULL
    public VoUserSimple matchUser;
    public int matchState;//用户当前状态//正常，交换中，等等
    public int synchronous;//同步率

}
