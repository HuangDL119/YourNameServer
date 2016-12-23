package com.hdl.YourName.dto.vo;

/**
 *  日记内容通信实体结构
 */
public class VoDiary{
	public long id;//日记id
	public long modifyDate;//最近一次修改的时间timestamp
	public long createDate;//写日记的时间timestamp
	public long ownerUserId;//日记拥有者ID
	public long writerUserId;//写这篇日记时候的userId
	public String writerUserName;//写这篇日记的人的名称
	public String title;//日记标题
	public String content;//日记内容
	public String image;//日记配图url
	public String location;//定位坐标，（或者可以自定义文字）
	public int feeling;//心情
	public int weather;//天气
	//其他参数待定
}