package com.java;

import java.util.Scanner;

public class CreditAccount extends BankAccount {
	Scanner console = new Scanner(System.in);
	private double limit; //���
	private double balance; //���

	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance += balance;
	}

	public double getLimit() {
		return limit;
	}

	public int setLimit(String st) {
		if(st.equals("Primary")) {
			//����
			limit = 5000.0;
		}
		else if(st.equals("Intermediate")) {
			//�м�
			limit = 10000.0;
		}
		else if(st.equals("Senior")) {
			//�߼�
			limit = 20000.0;
		}
		else {
			System.out.println("��������ȷ�����ÿ�����: Primary or Intermediate or Senior)!");
			return -1;
		}
		balance = limit;
		return 0;
	}
	
	public void borrow() {
		//ˢ��
		System.out.println("������ˢ����");
		double st = console.nextDouble();
		if(st > balance) {
			System.out.println("�������㣡");
		}
		else {
			balance -= st;
			System.out.println("ˢ���ɹ���");
		}
	}
	
	public double repay() {
		//����
		System.out.println("�������ÿ����Ϊ��" + limit + ", �������Ϊ��" + balance + ", ���軹�" + (limit - balance));
		return (limit - balance);
	}
	
}
