/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.status;
/**
 * join:�ϲ��߳�
 * @author 52837
 *
 */

public class JoinDemo01 extends Thread {

	public static void main(String[] args) throws InterruptedException {
		JoinDemo01 demo01 = new JoinDemo01();
		Thread t = new Thread(demo01);  //����
		t.start();  //����
		//cpu��������
		
		
		for(int i = 0; i < 1000; i++) {
			if(i == 50) {
				t.join();  //main����...
			}
			System.out.println("main........" + i);
		}
		

	}
	
	@Override
	public void run() {
		super.run();
		for(int i =0; i < 1000; i++) {
			System.out.println("join......." + i);
		}
	}

}
