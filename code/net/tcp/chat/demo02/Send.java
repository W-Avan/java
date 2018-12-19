/* @16130110047 ��һ�� 528378795@qq.com */
package com.net.tcp.chat.demo02;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * �������� �߳�
 * @author 52837
 *
 */
public class Send implements Runnable{
	//�ӿ���̨������
	private BufferedReader console;
	//�ܵ������
	private DataOutputStream dos;
	private boolean isRunning = true; 
	
	public Send() {
		console = new BufferedReader(new InputStreamReader(System.in));
	}
	public Send(Socket client) {
		this();
		try {
			dos = new DataOutputStream(client.getOutputStream());
		} catch (IOException e) {
			isRunning = false;
			CloseUtil.closeAll(dos, console);
		}
	}
	
	/* 
	 * 1���ӿ���̨��������
	 */
	public String getMsgFromConsole() {
		try {
			return console.readLine();
		} catch (IOException e) {
			
		}
		return "";
	}
	
	/**
	 * 1���ӿ���̨��������
	 * 2����������
	 */
	public void send() {
		String msg = getMsgFromConsole();
		if(null != msg && !msg.equals("")) {
			try {
				dos.writeUTF(msg);
				dos.flush();  //ǿ��ˢ��
			} catch (IOException e) {
				//e.printStackTrace();
				isRunning = false;
				CloseUtil.closeAll(dos, console);
			}
		}
	}
	
	public void run() {
		//�߳���
		while(isRunning) {
			send();
		}
	}

}
