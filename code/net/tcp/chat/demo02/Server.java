/* @16130110047 ��һ�� 528378795@qq.com */
package com.net.tcp.chat.demo02;

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
		while(true) {
			Socket client = server.accept();
			//д������
			//������
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			while(true) {
				String msg = dis.readUTF();
				System.out.println(msg);
				//�����
				dos.writeUTF("server --> " + msg);
				dos.flush();
			}
		}
		
	}

}
