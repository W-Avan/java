/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.create;
/**
 * ʹ�� Runnable �����߳�
 * 1���� ʵ�� Runnable �ӿ� + ��д run()   --> ��ʵ��ɫ��
 * 2���������߳� ʹ�þ�̬����
 * 		1����������ʵ��ɫ
 * 		2�������������ɫ+ ��ʵ��ɫ����
 * 		3�������� .start() �����߳�
 * @author 52837
 *
 */

public class Programmer implements Runnable{
	
	@Override
	public void run() {
		for(int i =0; i < 1000; i++) {
			System.out.println("һ����HelloWorld.....");
		}
		
	}
}
