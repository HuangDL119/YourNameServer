package com.hdl.YourName.dto.sc;

import com.hdl.YourName.dto.vo.VoDiary;

import java.util.List;
//��ҳˢ��ȫ���ռ�
public class SCDiaryList extends ResponseDtoBase {
	public List<VoDiary> entires;//�ռ�list,��ʱ���������µ��ڵ�һλ
	public int currentpage;//��ǰҳ��
	public int maxpage;//��ҳ��
}