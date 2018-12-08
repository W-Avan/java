/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.info;
/**
 * ���ȼ������ʣ� ���Ǿ��Ե��Ⱥ�˳��
 * MAX_PRIORITY   10
 * NORM_PRIORITY  5  (Ĭ��)
 * MIN_PRIORITY   1
 *
 * setPriority()  �������ȼ�
 * getPriority()
 */
public class InfoDemo02 {

	public static void main(String[] args) throws InterruptedException {
		MyThread it1 = new MyThread();
		Thread p1 = new Thread(it1, "����1");
		MyThread it2 = new MyThread();
		Thread p2 = new Thread(it2, "����2");
		
		p1.setPriority(Thread.MIN_PRIORITY); //�������ȼ�
		p2.setPriority(Thread.MAX_PRIORITY); //�������ȼ�
		p1.start();
		p2.start();
		
		Thread.sleep(50);
		
		it1.stop();
		it2.stop();
	}

}
