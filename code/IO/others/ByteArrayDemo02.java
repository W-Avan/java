/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


/**
 * 1.�ļ�  --����-> �ֽ�����
 *  1).�ļ�������
 *  2).�ֽ����������
 * 
 * 2.�ֽ�����  --����-> �ļ�
 *  1).�ֽ�����������
 *  2).�ļ������
 *
 */
public class ByteArrayDemo02 {

	public static void main(String[] args) throws IOException {
		byte[] data = getBytesFromFile("E:/IO/test/a.txt");
		toFileFromByteArray(data, "E:/IO/test/array.txt");
	//	System.out.println(new String(data));
	}
	
	/**
	 * 2.�ֽ����� --����->�ļ�
	 */
	public static void toFileFromByteArray(byte[] src, String destPath)throws IOException {
		//����Դ
		//Ŀ�ĵ�
		File dest = new File(destPath);
		
		//ѡ����
		//�ֽ�����������
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		//�ļ������
		OutputStream os = new BufferedOutputStream(new FileOutputStream(dest));
		
		//���� ���϶�ȡ�ֽ�����
		byte[] flush = new byte[1024];
		int len = 0;
		while(-1 != (len = is.read(flush))) {
			//д�����ļ�
			os.write(flush, 0, len);
		}
		os.flush();
		
		os.close();
		is.close();

	}
	
	/*
	 * 1.�ļ�  --����-> �ֽ�����
	 */
	public static byte[] getBytesFromFile(String srcPath) throws IOException {
		//�����ļ�Դ
		File src = new File(srcPath);
		//�����ֽ�����Ŀ�ĵ�
		byte[] dest = null;
		
		//ѡ����
		//�ļ�������
		InputStream is = new BufferedInputStream(new FileInputStream(src));
		//�ֽ������������ ����ʹ�ö�̬
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		//���� ���϶�ȡ�ļ� д���ֽ���������
		byte[] flush = new byte[1024];
		int len = 0;
		while(-1 != (len = is.read(flush))) {
			bos.write(flush, 0, len);
		}
		bos.flush();
		//��ȡ����
		dest = bos.toByteArray();
		return dest;
	}
}
