/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ��װ����
 * 
 *
 */
public class BufferedIn {

	public static void main(String[] args) throws IOException {
		InputStream is = System.in;
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		System.out.println("������");
		String msg = br.readLine();
		System.out.println(msg);
	}

}
