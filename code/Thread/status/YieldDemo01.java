/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.status;

public class YieldDemo01 extends Thread {

	public static void main(String[] args) {
		YieldDemo01 demo01 = new YieldDemo01();
		Thread t = new Thread(demo01);  //����
		t.start();  //����
		//cpu��������
		
		
		for(int i = 0; i < 1000; i++) {
			if(i % 20 == 0) {
				Thread.yield();  //��ͣ���ֳ�main
			}
			System.out.println("main........" + i);
		}
		
	}

	@Override
	public void run() {
		for(int i =0; i < 1000; i++) {
			System.out.println("yield......." + i);
		}
	}
}
