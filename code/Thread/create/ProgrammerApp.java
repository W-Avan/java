/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.create;
/**
 * �Ƽ� Runnable �����߳�
 * 	1�������ⵥ�̳еľ�����
 * 	2�������ڹ�����Դ
 * @author 52837
 *
 */

public class ProgrammerApp {

	public static void main(String[] args) {
		 //1����������ʵ��ɫ
		Programmer pro = new Programmer();
		 //2�������������ɫ+ ��ʵ��ɫ����
		Thread proxy = new Thread(pro);
		 //3�������� .start() �����߳�
		proxy.start();
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("һ����qq......");
		}

	}

}
