/* @16130110047 ��һ�� 528378795@qq.com */
/*
 * ���·�������·������File����
 * 1�����·��
 * 	File(String parent, String child)  ==>File("E:/GUI", "1.jpg")
 * 	File(File parent, String child)    ==>File(new File("E:/GUI"), "1.jpg")
 */
package com.IO.File;

import java.io.File;

public class demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String parentPath = "E:/GUI";
		String name = "1.jpg";
		//���·��
		File src = new File(parentPath, name);
		src = new File(new File(parentPath), name);
		//���
		System.out.println(src.getName());
		System.out.println(src.getPath());
		//����·��
		src = new File("E:/GUI/1.jpg");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		//�����̷��� �Ե�ǰuser.dir����
		src = new File("text.txt");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
	}

}
