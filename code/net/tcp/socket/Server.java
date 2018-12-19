/* @16130110047 ��һ�� 528378795@qq.com */
package com.net.tcp.socket;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ���������������� ������
 * 1������������ ָ���˿� ServerSocket(int port)
 * 2�����տͻ������ӣ� ����ʽ
 * 3���������� + ��������
 */
public class Server {

	public static void main(String[] args) throws IOException {
		//1������������ ָ���˿� ServerSocket(int port)
		ServerSocket server = new ServerSocket(8888);
		//2�����տͻ������� ����ʽ
		Socket socket = server.accept();
		System.out.println("һ���ͻ��˽�������");
		//3����������
		/*
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(socket.getOutputStream()));
		String msg = "��ӭʹ��";  ///����û�л��з�����ȡ�ǰ��ж�ȡ
		bw.write(msg);
		bw.newLine();  //����Ҫ���ϻ��з��������ȡʱ�ᱨ��
		bw.flush();
		*/
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		String str = "��ӭʹ��";
		dos.writeUTF(str);
		dos.flush();
	}

}
