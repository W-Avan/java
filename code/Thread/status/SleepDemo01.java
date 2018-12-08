/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.status;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ����ʱ
 * 1������10������һ���ڴ�ӡһ��
 * 2������ʱ
 * @author 52837
 *
 */
public class SleepDemo01 {

	public static void main(String[] args) throws InterruptedException {
		Date endTime = new Date(System.currentTimeMillis() + 10 * 1000);  //��ǰʱ���10��
		long end = endTime.getTime();
		while(true) {
			//���
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			//������һ��ʱ��
			endTime = new Date(endTime.getTime() - 1000);
			//�ȴ�һ��
			Thread.sleep(1000);
			//10�����ڼ��� ���� �˳�
			if(end - 10000 > endTime.getTime()) {
				break;
			}
		}
	}
	
	public static void test1() throws InterruptedException {
		int num = 10;
		while(true) {
			System.out.println(num--);
			Thread.sleep(1000);
			if(num <= 0) {
				break;
			}
		}
	}

}
