/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.pro;
/**
 * һ����������ͬ����Դ
 * ������������ģʽ �źŵƷ�
 * wait() :�ȴ����ͷ���   sleep  :���ͷ���
 * notify() / notifyAll() : ����
 * ��synchronizedһ��ʹ��
 */
public class Movie {
	private String pic;
	//�źŵ�
	//flag  --> T�� �����������������ߵȴ���������ɺ�֪ͨ����
	//flag  --> F�� ���������ѣ������ߵȴ���������ɺ�֪ͨ����
	private boolean flag = true;
	/**
	 * ����
	 * @param pic
	 */
	public synchronized void play(String pic) {
		if(!flag) {  //�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//�������
		this.pic = pic;		
		//֪ͨ����
		this.notify();
		//ֹͣ����
		this.flag = false;
		System.out.println("������:" + pic);
		
	}
	
	public synchronized void watch() {
		if(flag) {  //�����ߵȴ�
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		//��ʼ����
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//�������
		System.out.println("����:" + pic);
		//֪ͨ����
		this.notify();
		//ֹͣ����
		this.flag = true;
	}
}
