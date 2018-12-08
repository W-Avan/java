/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.syn;
/**
 * �������ģʽ��ȷ��һ����ֻ��һ������  (�ⲿ���ܴ�������ֻ��ʹ�����ڲ������Ķ���)
 *
 */
public class SynDemo02 {

	public static void main(String[] args) {
		JvmThread thread1 = new JvmThread(100);
		JvmThread thread2 = new JvmThread(200);
		thread1.start();
		thread2.start();
		
	}

}

class JvmThread extends Thread {
	private long time;
	public JvmThread() {

	}
	
	public JvmThread(long time) {
		this.time = time;
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + "--> ������" + Jvm.getInstance(time));
	}
}

/**
 * �������ģʽ
 * ȷ��һ����ֻ��һ������
 * ����ʽ  double checking
 * 1��������˽�л��������ⲿֱ�Ӵ�������
 * 2������һ��˽�еľ�̬����
 * 3������һ������Ĺ����ľ�̬���� ���ʸñ����� �������û�ж��� �����ö���
 *
 */
class Jvm {
	//����һ��˽�еľ�̬����
	private static Jvm instance = null;
	
	//������˽�л��������ⲿֱ�Ӵ�������
	private Jvm() {
		
	}
	
	public static Jvm getInstance(long time) {
		if(null == instance) {
			//a b   --> Ч�� �ṩ�Ѿ����ڶ���ķ���Ч��
			synchronized (Jvm.class) {
				if(null == instance) {
					try {
						Thread.sleep(time);  //��ʱ���Ŵ����Ŀ�����
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					instance = new Jvm();
				}	
			
			}
		}	
		return instance;
	}
	
	//����һ������Ĺ����ľ�̬���� ���ʸñ����� �������û�ж��� �����ö���
	public static Jvm getInstance3(long time) {
		//Ч�ʲ���  ���ڶ���Ҳ��Ҫ�ȴ�
		synchronized (Jvm.class) {
			if(null == instance) {
				try {
					Thread.sleep(time);  //��ʱ���Ŵ����Ŀ�����
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				instance = new Jvm();
			}	
			return instance;
		}
	}
	
	//����һ������Ĺ����ľ�̬���� ���ʸñ����� �������û�ж��� �����ö���
	public static synchronized Jvm getInstance2(long time) {
		if(null == instance) {
			try {
				Thread.sleep(time);  //��ʱ���Ŵ����Ŀ�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		return instance;
	}
	
	//����һ������Ĺ����ľ�̬���� ���ʸñ����� �������û�ж��� �����ö���
	public static Jvm getInstance1(long time) {
		if(null == instance) {
			try {
				Thread.sleep(time);  //��ʱ���Ŵ����Ŀ�����
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			instance = new Jvm();
		}
		return instance;
	}
}