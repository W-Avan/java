/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.convert;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


/**
 * ת�������ֽ�תΪ�ַ�
 * 1������� OutputStreamWriter  ����
 * 2�������� InputStreamReader  ����
 * @author 52837
 *
 */

public class ConvertDemo02 {

	public static void main(String[] args) throws IOException {
		//ָ���ַ���
		BufferedReader br = new BufferedReader(
				new InputStreamReader(
						new FileInputStream(
								new File("E:/IO/test/demo02.java")),"UTF-8")
				);
		
		//д���ļ�
		BufferedWriter bw = new BufferedWriter(
				new OutputStreamWriter(
						new FileOutputStream(
								new File("E:/IO/test/enconder.java")), "utf-8")
				);
		String info = null;
		while(null != (info = br.readLine()))
		{
			bw.write(info);
			bw.newLine();
		}
		bw.flush();
		if(null != bw) {
			bw.close();
		}
		if(null != br) {
			br.close();
		}
		
	}

}
