/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ��������(����+String)������
 * 1.������ DataInputStream
 * 2.����� DataOutputStream
 * ������������ʹ�ö�̬
 * java.io.EOFException :û�ж�ȡ����ص����� 
 *
 */

public class DataDemo2 {

	public static void main(String[] args) {
		try {
			byte[] data = write();
			read(data);
			//write("E:/IO/test/data.txt");
			//read("E:/IO/test/array.txt");  //�Ƿ�����
			//read("E:/IO/test/data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ���ֽ������ж�ȡ����+����
	 * @throws IOException 
	 */
	public static void read(byte[] src) throws IOException {
		//ѡ����	
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(
						new ByteArrayInputStream(src))
				
				);
		
		//���� ��ȡ��˳����д��һ�£�������ڲ��ܶ�ȡ
		//��һ�£� ���ݴ�������
		double num1 = dis.readDouble();
		long num2 = dis.readLong();
		String str = dis.readUTF();
		
		dis.close();
		
		System.out.println(num1 + "-->" + num2 + "-->" + str);
	}

	/**
	 * ����+����������ֽ�������
	 * @throws IOException 
	 */
	public static byte[] write() throws IOException {
		//Ŀ������
		byte[] dest = null; 
		double point = 2.5;
		long num = 100L;
		String str = "��������";
		
		//ѡ���� ByteArrayOutputStream DataOutputStream
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(
						bos)
				);
		
		//����
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		dest = bos.toByteArray();
		
		
		dos.close();
		
		return dest;
	}
}
