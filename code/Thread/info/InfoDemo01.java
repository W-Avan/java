/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.info;
/**
 * Thread.currentThread()     :��ǰ�߳�
 * setName()     ����������
 * getName()     ����ȡ����
 * isAlive()     ���ж�״̬
 *
 */
public class InfoDemo01 {

	public static void main(String[] args) throws InterruptedException {
		MyThread it = new MyThread();
		Thread proxy = new Thread(it, "����");
		proxy.setName("test");
		System.out.println(proxy.getName());
		System.out.println(Thread.currentThread().getName());  //main
		
		proxy.start();
		System.out.println("������״̬��" + proxy.isAlive());
		
		Thread.sleep(50);
		it.stop();
		Thread.sleep(100);
		System.out.println("ֹͣ��״̬��" + proxy.isAlive());
	}

}
