/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.convert;

import java.io.UnsupportedEncodingException;





public class ConvertDemo01 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "�й�";
		byte[] data = str.getBytes();
		//�ֽ���������
		System.out.println(new String(data, 0, 3));
	}
	/**
	 * ����������ַ���������ͬ����������
	 * @throws UnsupportedEncodingException
	 */
	
	public static void test1() throws UnsupportedEncodingException {
		 //���� byte -> char
		 String str = "�й�";  //gbk
		 //���� char -> byte
		 byte[] data = str.getBytes();
		 //����������ַ���ͳһ
		 System.out.println(new String(data));
		 //����������ַ�����ͳһ
		 data = str.getBytes("utf-8");  //�趨�����ַ���
		 //��ͬ��������
		 System.out.println(new String(data));
		 
		 System.out.println(new String(data, "utf-8"));
	}

}
