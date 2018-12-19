/* @16130110047 ��һ�� 528378795@qq.com */
package com.net.tcp.chat.demo02;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * �����߳�
 * @author 52837
 *
 */
public class Receive implements Runnable{
	//������
	private DataInputStream dis;
	//�̱߳�ʶ
	private boolean isRunning = true;
	
	public Receive() {
	}
	public Receive(Socket client) {
		try {
			dis = new DataInputStream(client.getInputStream());
		} catch (IOException e) {
			//e.printStackTrace();
			isRunning = false;
			CloseUtil.closeAll(dis);
		}
	}
	
	/**
	 * ��������
	 */
	public String receive() {
		String msg = "";
		try {
			msg = dis.readUTF();
		} catch (IOException e) {
			//e.printStackTrace();
			isRunning = false;
			CloseUtil.closeAll(dis);
		}
		return msg;
	}
	
	
	public void run() {
		//�߳���
		while(isRunning) {
			System.out.println(receive());
		}
	}

}
