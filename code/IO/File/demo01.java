/* @16130110047 ��һ�� 528378795@qq.com */
/*
 * ��������
 * 1��·���ָ��� ;
 * 2���ļ��ָ��  \ ��Windows��    / ��Linux �ȣ�
 */

package com.IO.File;

import java.io.File;

public class demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(File.pathSeparator);    //·���ָ���
		System.out.println(File.separator);
		//·��������ʽ
		String path = "E:\\GUI\\1.jpg";
		path = "E:" + File.separator + "GUI" + File.separator + "1.jpg";  //�ʺ϶�̬����ʱʹ�ã����Ƕ�ֵ ���Ƽ�ʹ��
		//�Ƽ���ʽ
		path = "E:/GUI/1.jpg";
		
		
		
		
	}

}
