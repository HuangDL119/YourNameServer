package com.hdl.YourName.dto.vo;

/**
 *  �ռ�����ͨ��ʵ��ṹ
 */
public class VoDiary{
	public long id;//�ռ�id
	public long modifyDate;//���һ���޸ĵ�ʱ��timestamp
	public long createDate;//д�ռǵ�ʱ��timestamp
	public long ownerUserId;//�ռ�ӵ����ID
	public long writerUserId;//д��ƪ�ռ�ʱ���userId
	public String writerUserName;//д��ƪ�ռǵ��˵�����
	public String title;//�ռǱ���
	public String content;//�ռ�����
	public String image;//�ռ���ͼurl
	public String location;//��λ���꣬�����߿����Զ������֣�
	public int feeling;//����
	public int weather;//����
	//������������
}