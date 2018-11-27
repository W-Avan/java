/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.File;

import java.io.File;
import java.util.Arrays;

/**
 * ������ＶĿ¼|�ļ�����(����·��)
 * 1��listFiles()
 * 2���ݹ�
 * @author 52837
 *
 */
public class demo05 {

	public static void main(String[] args) {
		String path = "E:/IO";
		File parent = new File(path);
		printName(parent);
		
		File[] roots = File.listRoots();
		System.out.println(Arrays.toString(roots));
	}
	
	/**
	 * ���·��
	 */
	public static void printName(File src) {
		if(null == src || !src.exists()) {
			return;
		}
		System.out.println(src.getAbsolutePath());
		if(src.isDirectory()) {  //�ļ���
			for(File sub : src.listFiles()) {
				printName(sub);
			}
		}
	}

}
