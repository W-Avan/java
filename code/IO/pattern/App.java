/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.pattern;

public class App {

	public static void main(String[] args) {
		Voice v = new Voice();
		v.say();
		Amplifier amp = new Amplifier(v);
		amp.say();
	}

}
