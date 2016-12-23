package com.hdl.YourName.dto.cs;

/**
 * 找回资料请求
 * 找回成功返回SCLogin可直接登陆
 */
public class CSRecovery extends RequestDtoBase {
	public String recoveryKey;//注册时候填写的找回用个KEY
}