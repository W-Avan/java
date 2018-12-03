/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
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

public class DataDemo01 {

	public static void main(String[] args) {
		try {
			//write("E:/IO/test/data.txt");
			//read("E:/IO/test/array.txt");  //�Ƿ�����
			read("E:/IO/test/data.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * ���ļ��ж�ȡ����+����
	 * @throws IOException 
	 */
	public static void read(String destPath) throws IOException {
		//����Դ
		File src = new File(destPath);
		//ѡ����
		DataInputStream dis = new DataInputStream(
				new BufferedInputStream(
						new FileInputStream(src))
				
				);
		
		//���� ��ȡ��˳����д��һ�£�������ڲ��ܶ�ȡ
		//��һ�£� ���ݴ�������
		double num1 = dis.readDouble();
		long num2 = dis.readLong();
		String str = dis.readUTF();
		
		dis.close();
		
		System.out.println(num2 + "-->" + str);
	}

	/**
	 * ����+����������ļ�
	 * @throws IOException 
	 */
	public static void write(String destPath) throws IOException {
		double point = 2.5;
		long num = 100L;
		String str = "��������";
		
		//����Դ
		File dest = new File(destPath);
		//ѡ���� DataOutputStream
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(dest))
				);
		
		//����
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		
		dos.flush();
		dos.close();
	}
}
