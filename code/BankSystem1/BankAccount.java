package com.java;

import java.util.Stack;

public class BankAccount {
//	private String type;
	private String Name;
	private int binding; //�󶨱��
	
	public int getBinding() {
		return binding;
	}
	
	public void setBinding(int binding) {
		this.binding = binding;
	}
	//	private float balance = 0;
	Stack stack = new Stack();
	
//	public String getType() {
//		return type;
//	}
//	public void setType(String type) {
//		this.type = type;
//	}
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
//	public float getBalance() {
//		return balance;
//	}
//	public void deposit(float balance) {
//		//��Ǯ
//		this.balance += balance;
//		String op = "�˻���" + getName() + "�����" + balance + ", " + getType() + "�������Ϊ��" + getBalance();
//		stack.push(op);
//	}
//	public void consume(float balance) {
//		if(this.balance >= balance)
//		{
//			this.balance -= balance;
//			System.out.println("ȡ��ɹ�������" + type + "�������Ϊ��" + this.getBalance());
//			String op = "�˻���" + getName() + "ȡ����" + balance + ", " + getType() + "�������Ϊ��" + getBalance();
//			stack.push(op);
//		}
//		else
//			System.out.println("�������㣡");
//			return;
//	}
	
}
