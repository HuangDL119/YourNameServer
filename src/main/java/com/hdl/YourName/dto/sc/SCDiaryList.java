package com.hdl.YourName.dto.sc;

import com.hdl.YourName.dto.vo.VoDiary;

import java.util.List;
//按页刷新全部日记
public class SCDiaryList extends ResponseDtoBase {
	public List<VoDiary> entires;//日记list,按时间排序，最新的在第一位
	public int currentpage;//当前页码
	public int maxpage;//总页码
}