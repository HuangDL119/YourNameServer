package com.hdl.YourName.dto.sc;

/**
 * 服务端到客户端相应传输结构基类
 */
public class ResponseDtoBase{
	//请求成功失败等状态值
	public int errorCode;
	//可能的服务端提示文字信息，大多数情况不用
	public String content;
}