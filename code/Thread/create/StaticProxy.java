/* @16130110047 ��һ�� 528378795@qq.com */
package com.thread.create;


/**
 * ��̬���� ���ģʽ
 * 1����ʵ��ɫ
 * 2�������ɫ��������ʵ��ɫ������
 * 3������ ʵ����ͬ�Ľӿ�
 * @author 52837
 *
 */
public class StaticProxy {

	public static void main(String[] args) {
		//������ʵ��ɫ
		You you = new You();
		//���������ɫ + ��ʵ��ɫ������
		WeddingCompany company = new WeddingCompany(you);
		//ִ������
		company.marry();

	}

}
//�ӿ�
interface Marry{
	void marry();
}
//��ʵ��ɫ
class You implements Marry{
	@Override
	public void marry() {
		System.out.println("you and �϶����ˡ�����");
	}	
}
//�����ɫ
class WeddingCompany implements Marry{
	private Marry you;
	
	public WeddingCompany() {
		super();
	}
	
	public WeddingCompany(Marry you) {
		super();
		this.you = you;
	}
	
	private void Before() {
		System.out.println("�������ѡ�����");
	}
	
	private void After() {
		System.out.println("������...");
	}
	
	@Override
	public void marry() {
		Before();
		you.marry();
		After();
	}
}
