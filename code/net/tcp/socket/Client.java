/* @16130110047 ��һ�� 528378795@qq.com */
package com.net.tcp.socket;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 1�������ͻ��� �����ƶ������� + �˿� ��ʱ��������
 * 	Socket(String host, int port)
 * 2���������� + ��������
 */
public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//1�������ͻ��� ����ָ�������� + �˿� ��ʱ��������
		Socket client = new Socket("localhost", 8888);
		//2����ȡ����
		/*
		BufferedReader br = new BufferedReader(
				new InputStreamReader(client.getInputStream()));
		String msg = br.readLine();
		System.out.println(msg);
		*/
		
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String str = dis.readUTF();
		System.out.println(str);
	}

}
