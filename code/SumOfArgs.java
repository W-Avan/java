/* @16130110047 ��һ�� 528378795@qq.com */

package com.java;

public class SumOfArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 0;
		for(int i = 0; i < args.length; i++) {
			for(int j =0; j < args[i].length(); j++) {
				if(Character.isDigit(args[i].charAt(j))) {  //�ж�ָ���ַ��Ƿ�Ϊ����
					k += Integer.parseInt(args[i]);
				}
			}
		
		}
		System.out.println(k);
	}

}
