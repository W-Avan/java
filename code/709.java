package com.imooc;

import java.util.Scanner;

public class Solution {
    public String toLowerCase(String str) {
        return str.toLowerCase();
    }
	
	public static void main(String[] arg) {
		Solution st = new Solution();
		Scanner console = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String J = console.next();
		String S = st.toLowerCase(J);

		System.out.println("ȫ��ת��ΪСд��" + S);
	}
}
