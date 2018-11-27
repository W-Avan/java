/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.File;

import java.io.File;
import java.io.FilenameFilter;

public class demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "E:/IO/";
		File src = new File(path);  //�ļ���
		if(src.isDirectory()) {  //���ڲ���ΪĿ¼
			System.out.println("------��Ŀ¼|�ļ���------");
			String[] subNames = src.list();
			for (String st : subNames) {
				System.out.println(st);
			}
			
			System.out.println("------��Ŀ¼|�ļ�File����------");
			File[] subFiles = src.listFiles();
			for (File file : subFiles) {
				System.out.println(file.getAbsolutePath());
			}
			
			System.out.println("------���ļ�.java����------");
			//�������ģʽ
			subFiles = src.listFiles(new FilenameFilter() {
				
				@Override
				/*
				 * dir ���� src
				 * @see java.io.FilenameFilter#accept(java.io.File, java.lang.String)
				 */
				public boolean accept(File dir, String name) {
					System.out.println(dir.getAbsolutePath());
					return new File(dir, name).isFile() && name.endsWith(".java");
				}
			});
			for (File file : subFiles) {
				System.out.println(file.getAbsolutePath());
			}
		}
	}

}
