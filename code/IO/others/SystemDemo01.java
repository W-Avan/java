/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * ��������
 * 1��System.in  ������ ��������
 * 2��System.out ����� ����̨���
 *    System.err
 *    
 * ==> �ض���
 * setIn()
 * setOut()
 * setErr()
 * FileDescriptor.in
 * FileDescriptor.out
 */
public class SystemDemo01 {

	public static void main(String[] args) throws FileNotFoundException {
		//test1();
		//test2();
		//�ض���
		System.setOut(
				new PrintStream(
						new BufferedOutputStream(
								new FileOutputStream("e:/IO/test/print.txt")
								),true)  //autoflush
				
				);
		System.out.println("s");  //����̨ --> �ļ�
		System.out.println("test");
		
		//�ؿ���̨
		System.setOut(
				new PrintStream(
						new BufferedOutputStream(
								new FileOutputStream(FileDescriptor.out)),true)
				);
		System.out.println("back...");
	}

	public static void test2() throws FileNotFoundException {
		InputStream is = System.in;  //��������
		is = new BufferedInputStream(
				new FileInputStream("e:/IO/test/print.txt")
				);
		Scanner sc = new Scanner(is);
//		System.out.println("�����룺");
		System.out.println(sc.nextLine());
	}
	
	public static void test1() {
		System.out.println("test");
		System.err.println("err");
	}
}
