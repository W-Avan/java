/* @16130110047 ��һ�� 528378795@qq.com */
package com.net.tcp.chat.demo01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ����������
 * @author 52837
 *
 */
public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(9999);
		Socket client = server.accept();
		//������
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String msg = dis.readUTF();
		//�����
		DataOutputStream dos = new DataOutputStream(client.getOutputStream());
		dos.writeUTF("server --> " + msg);
		dos.flush();
		
	}

}
