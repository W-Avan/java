/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.pro;

public class App {

	public static void main(String[] args) {
		//��ͬ����Դ
		Movie m = new Movie();
		
		//���߳�
		Player p = new Player(m);
		Watcher w = new Watcher(m);
		
		new Thread(p).start();
		new Thread(w).start();		
	}

}
