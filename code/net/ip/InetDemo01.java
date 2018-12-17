/* @16130110047 ��һ�� 528378795@qq.com */
package com.net.ip;
/**
 * û�з�װ�˿�
 */
import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo01 {

	public static void main(String[] args) throws UnknownHostException {
		//ʹ��getLocalHost��������InetAddress����
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());  //���أ�10.177.207.126
		System.out.println(addr.getHostName());  //����������  
		//���������õ�InetAddress����
		addr = InetAddress.getByName("www.163.com");
		System.out.println(addr.getHostAddress());  //����163��������ip�� 219.145.171.124
		System.out.println(addr.getHostName());  //����� www.163.com
		//����ip�õ�InetAddress����
		addr = InetAddress.getByName("61.135.253.15");
		System.out.println(addr.getHostAddress());  //����163��������ip:61.135.253.15
		System.out.println(addr.getHostName());  //���ip������������������ip��ַ�����ڻ���DNS��������

	}

}
