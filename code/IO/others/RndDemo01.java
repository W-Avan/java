/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.others;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * �ļ��ķָ�˼·
 * 1���ָ�Ŀ��� size    n��
 * 2��ÿһ��Ĵ�С blockSize
 * 	���һ���С���ܵ��ļ���С - (n - 1) * blockSize
 */

public class RndDemo01 {

	public static void main(String[] args) throws IOException {
		RandomAccessFile rnd = new RandomAccessFile(new File("e:/IO/test/char.txt"), "r");
		rnd.seek(40);
		//���建���С
		byte[] flush = new byte[1024];
		//���ܳ���
		int len = 0;
		
		while (-1 != (len = rnd.read(flush))) {
			if(len >= 20) {
				System.out.println(new String(flush, 0, 20));
				break;
			}else
				System.out.println(new String(flush, 0, len));
		}
		
		rnd.close();
	}

}
