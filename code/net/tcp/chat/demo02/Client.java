/* @16130110047 ��һ�� 528378795@qq.com */
package com.net.tcp.chat.demo02;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * �����ͻ��ˣ� �������� + ��������
 * д�����ݣ������
 * ��ȡ���ݣ�������
 * 
 * ���������������ͬһ���߳���  Ӧ�ö������� �˴˶���
 *
 */
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket client = new Socket("localhost", 9999);
		//����̨������
		new Thread(new Send(client)).start();  //һ��·��
		new Thread(new Receive(client)).start();
	}

}
