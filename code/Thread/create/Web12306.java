/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.create;
/**
 * ���㹲����Դ
 * @author 52837
 *
 */
public class Web12306 implements Runnable{
	private int num = 50;

	@Override
	public void run() {
		while(true) {
			if(num <= 0) {
				break;
			}
			System.out.println(Thread.currentThread().getName() + "������" + num--);	
		}
	}
	
	public static void main(String[] args) {
		//��ʵ��ɫ
		Web12306 web = new Web12306();
		//����
		Thread t1 = new Thread(web, "·�˼�");
		Thread t2 = new Thread(web, "��ţ��");
		Thread t3 = new Thread(web, "����ʨ");
		//�����߳�
		t1.start();
		t2.start();
		t3.start();
	}
}
