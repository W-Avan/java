package com.imooc;

import java.util.Scanner;

public class Solution {
	public int numJewelsIntStones(String J, String S) {
		return S.replaceAll("[^" + J + "]", "").length();  // [^ ָ���ַ��� ] ָ���ǳ�ָ���ַ�������������ַ���
	}
	
	public static void main(String[] arg) {
		Solution st = new Solution();
		Scanner console = new Scanner(System.in);
		System.out.println("�������鱦��");
		String J = console.next();
		System.out.println("������ʯͷ��");
		String S =console.next();
		int x = st.numJewelsIntStones(J, S);
		System.out.println("ʯͷ���鱦������" + x);
	}
}
