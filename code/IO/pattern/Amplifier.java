/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.pattern;
/*
 * ������
 * ������֮��Ĺ�ϵ
 * 1���������β�|�ֲ�����
 * 2������������
 * 		�ۺϣ����� �����벿�� ��һ�µ��������� ������
 * 		��ϣ����� �����벿�� һ�µ��������� �������
 * 3���̳У��������ϵ
 * 4��ʵ�֣��ӿ���ʵ�����ϵ
 */
public class Amplifier {
	private Voice voice;
	
	public Amplifier() {
		
	}

	public Amplifier(Voice voice) {
		super();
		this.voice = voice;
	}
	
	public void say() {
		System.out.println(voice.getVoice() * 1000);
	}
}
