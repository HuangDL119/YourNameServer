package com.hdl.YourName.dto.cs;

/**
 * 按照参数查找日记列表请求
 */
public class CSDiaryList extends LoginedUserDto {
	public int pageSize;//每个分页日记数量
	public int currentpage;//当前页码
}