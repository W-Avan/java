/* @16130110047 ��һ�� 528378795@qq.com */
package com.java;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 0;
		for(int i = 0; i < args.length; i++) {
			k = 0;
			for(int j = 0; j < args[i].length(); j++) {
				//�ж��Ƿ�ȫΪ����
				if(!(Character.isDigit(args[i].charAt(j)))) {
					k = 1;
					break;
				}
			}
			if(k == 0) {
				k = i;   //kΪΪ�����ֵ��ַ�������
				break;
			}
		}
		String st = "";
		for(int r = 0; r < k; r++) {
			if(r != k - 1) {
				st += args[r];
				st += " ";
			}else {
				st += args[r];
			}
		}
		
		System.out.println(st.substring(Integer.parseInt(args[k]), Integer.parseInt(args[k + 1]) + Integer.parseInt(args[k])));
	}

}
