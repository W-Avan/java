/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.create;
/**
 * ģ���������
 * 1���������߳� �̳� Thread   +��дrun(�߳���)
 * 2��ʹ���̣߳� ����������� + ����.start() ����     �߳�����
 * @author 52837
 *
 */

public class Rabbit extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("��������" + i + "��");
		}
		
	}
	
}

class Tortoise extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("�ڹ�����" + i + "��");
		}
		
	}
	
}
