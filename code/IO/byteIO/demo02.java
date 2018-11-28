/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * ��.д���ļ�
	1.������ϵ�� File ���� Ŀ�ĵ�
	2.ѡ���� �ļ������ OutputStream FileOutputStream
	3.���� �� write() + flush
	4.�ͷ���Դ �� �ر�
 * @author 52837
 *
 */
public class demo02 {

	public static void main(String[] args) {
		//1.������ϵ�� File ���� Ŀ�ĵ�
		File dest = new File("E:/IO/test/test.txt");
		//2.ѡ���� �ļ������ OutputStream FileOutputStream
		OutputStream os = null;
		//��׷����ʽ д���ļ�
		try {
			os = new FileOutputStream(dest, false);  //trueΪ׷�ӣ� falseΪ����
			//3.����
			String string = "wyf is very good \r\n";
			//�ַ���ת�ֽ�����
			byte[] data = string.getBytes();
			os.write(data, 0, data.length);
			
			os.flush();  //ǿ��ˢ�³�ȥ
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("�ļ�δ�ҵ�");
		} catch (IOException e) {

			e.printStackTrace();
			System.out.println("�ļ�д��ʧ��");
		}finally {
			if(null != os) {
				try {
					os.close();
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println("�ر���Դʧ��");
				}
			}
		}
		

	}

}
