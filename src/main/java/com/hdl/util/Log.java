package com.hdl.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public interface Log {
	Logger core = LoggerFactory.getLogger("core");
	Logger sys = LoggerFactory.getLogger("sys");
	//用户
	Logger user = LoggerFactory.getLogger("user");
	Logger msg = LoggerFactory.getLogger("msg");
    //场景
	Logger scene = LoggerFactory.getLogger("scene");
	//测试
	Logger test = LoggerFactory.getLogger("test");

}
