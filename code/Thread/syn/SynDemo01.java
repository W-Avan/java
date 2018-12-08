/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.syn;


public class SynDemo01 {

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

/**
 * �̰߳�ȫ����
 * @author 52837
 *
 */

class Web12306 implements Runnable{
	private int num = 10;
	private boolean flag = true;
	@Override
	public void run() {
		while(flag) {
			test5();
		}
	}
	
	public void test6() {
		if(num <= 0) {
			flag = false;
			return;
		}
		
		synchronized(this) {
			try {
				Thread.sleep(100);   //ģ����ʱ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "������" + num--);	
		}
		
	}
	
	//�̲߳���ȫ ������Դ����ȷ
	public void test5() {
		synchronized((Integer)num) {
			if(num <= 0) {
			flag = false;
			return;
			}
			try {
				Thread.sleep(100);   //ģ����ʱ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "������" + num--);	
		}
		
	}
	
	//�̲߳���ȫ ������Χ����ȷ
	public void test4 () {
		//b c 1
		synchronized(this) {
			//b
			if(num <= 0) {
				flag = false;
				return;
			}
		}
		//a 
		try {
			Thread.sleep(100);   //ģ����ʱ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "������" + num--);	
	}
	 
	//�̰߳�ȫ ������ȷ
	public void test3() {
		synchronized(this) {
			if(num <= 0) {
			flag = false;
			return;
			}
			try {
				Thread.sleep(100);   //ģ����ʱ
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + "������" + num--);	
		}
	}
	
	
	public synchronized void test2() {
		if(num <= 0) {
			flag = false;
			return;
		}
		try {
			Thread.sleep(100);   //ģ����ʱ
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "������" + num--);	
	}
	
	//�̲߳���ȫ
	public void test1() {
		if(num <= 0) {
			flag = false;
			return;
		}
		try {
			Thread.sleep(500); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread().getName() + "������" + num--);	
	}
}