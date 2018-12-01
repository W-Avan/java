/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.buffered;
/**
 * �ַ������� + ��������(���ܷ�����̬)
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedCharDemo {

	public static void main(String[] args) {
		//�������ַ��Ĵ��ı�
		//����Դ
		File src = new File("E:/IO/test/demo02.java");
		File dest = new File("E:/IO/test/char.txt");
		//ѡ����
		BufferedReader reader = null;
		BufferedWriter wt = null;
		try {
			reader = new BufferedReader(new FileReader(src));
			wt = new BufferedWriter(new FileWriter(dest));
			//��ȡ����
			/*
			char[] flush = new char[1024];
			int len = 0;
			while(-1 != (len = reader.read(flush))) {
				wt.write(flush, 0, len);
			} */
			//���������Ĳ���
			String line = null;
			while(null != (line = reader.readLine())) {
				wt.write(line);
			//	wt.append("\r\n");
				wt.newLine();  //���з���
			}
			wt.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Դ�ļ�������");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("�ļ���ȡʧ��");
		}finally {
			if(null != wt) {
				try {
					wt.close();
				}catch (IOException e) {
					e.printStackTrace();
				} 
			}
			if(null != reader) {
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
