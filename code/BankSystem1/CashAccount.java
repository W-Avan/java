package com.java;

public class CashAccount extends BankAccount {
	private double balance = 0;
	public double getBalance() {
		return balance;
	}
	public void deposit(double balance) {
		//��Ǯ
		this.balance += balance;
		String op = "�˻���" + getName() + "�����" + balance + ", �ֽ��˻��������Ϊ��" + getBalance();
		stack.push(op);
	}
	public void consume(double balance) {
		//ȡ��
		if(this.balance >= balance){
			this.balance -= balance;
			System.out.println("��ȡ�ɹ��������ֽ��˻�" + "�����Ϊ��" + this.getBalance());
			String op = "�˻���" + getName() + "ȡ����" + balance + ", �ֽ��˻��������Ϊ��" + getBalance();
			stack.push(op);
		}
		else
			System.out.println("�������㣡");
			return;
	}
}
