/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.create;

public class RabbitApp {

	public static void main(String[] args) {
		//�����������
		Rabbit rab = new Rabbit();
		Tortoise tos = new Tortoise();
		
		//����start() ����
		rab.start();  //��Ҫ����run����
		tos.start();
		
		for(int i = 0; i < 1000; i++) {
			System.out.println("main==>" + i);
		}
	}

}
