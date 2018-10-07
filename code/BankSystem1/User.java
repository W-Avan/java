package com.java;


import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class User {
	Scanner console = new Scanner(System.in);
	private String name;
	private int CardNum = 0;
	public Set<CashAccount> cashAccounts = new HashSet();
	public Set<CreditAccount> creditAccounts = new HashSet();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getCardNum() {
		return CardNum;
	}
	
	public void increaseCard() {
		CardNum += 1;
	}
	
	public void reduceCashCard(String st, CashAccount cash) {
		if(this.CardNum < 1) {
			System.out.println("��û�п����˻���ִ��������");
			return;
		}else {
//			if(st.equals("CashAccount")) {
				cashAccounts.remove(cash);
				CardNum -= 1;
//			}
//			if(st.equals("CreditAccount")) {
//				creditAccounts.remove(account);
//				CardNum -= 1;
//			}
//			else
//				System.out.println("û�и������˻����޷�������");
		}
	}
	
	public void reduceCreditCard(String st, CreditAccount credit) {
		if(this.CardNum < 1) {
			System.out.println("��û�п����˻���ִ��������");
			return;
		}else {
//			if(st.equals("CashAccount")) {
//				cashAccounts.remove(cash);
//				CardNum -= 1;
//			}
//			if(st.equals("CreditAccount")) {
				creditAccounts.remove(credit);
				CardNum -= 1;
//			}
//			else
//				System.out.println("û�и������˻����޷�������");
		}
	}
	
	public void CreateAccount() {
		//�����˻�
		System.out.println("�������˻�����(CashAccount or CreditAccount)��");
		String type = console.next();
		System.out.println("�������˻����ƣ�");
		String st = console.next();

		if(type.equals("CashAccount")) {
			CashAccount cash = new CashAccount();
			cash.setName(st);
			System.out.println("�����ð���Կ��");
			int ssh = console.nextInt();
			cash.setBinding(ssh);
			System.out.println("�����ɹ���");
			increaseCard();
			cashAccounts.add(cash);
		}else if(type.equals("CreditAccount")) {
			CreditAccount credit = new CreditAccount();
			credit.setName(st);
			System.out.println("�������������ÿ�����(Primary or Intermediate or Senior)��");
			String level = console.next();
			if(credit.setLimit(level) != -1) {
				System.out.println("���������Կ��");
				int ssh = console.nextInt();
				credit.setBinding(ssh);
				System.out.println("�����ɹ���");
				for (CashAccount cash : cashAccounts) {
					if(cash.getBinding() == ssh) {
						System.out.println("�󶨳ɹ���");
						increaseCard();
						creditAccounts.add(credit);
					}else {
						System.out.println("��ʧ�ܣ�");
					}
				}
			}
			
		}else {
			System.out.println("��������ȷ���˻�����(CashAccount or CreditAccount)");
			return;
		}

	}
	
	public void DeleteAccount() {
		// ����
		System.out.println("������Ҫע�����˻�����(CashAccount or CreditAccount)��");
		String st = console.next();
		System.out.println("������Ҫע�����˻�����");
		String name = console.next();
		int k = 0;
		if(st.equals("CashAccount")) {
			for (CashAccount cash : cashAccounts) {
				if(cash.getName().equals(name)) {
					reduceCashCard(name, cash);
					k = 1;
				}
			}
		}
		else if(st.equals("CreditAccount")) {
			for (CreditAccount credit : creditAccounts) {
				if(credit.getName().equals(name)){
					reduceCreditCard(name, credit);
					k = 1;
				}
				
			}
		}
		if(k == 0) 
			System.out.println("��û�и����͵��˻�������ע����");
		if(k == 1)
			System.out.println("ע���ɹ���");
		
	}
	
	public void store() {
		//���򻹿�
		System.out.println("������Ҫ�������˻�����(CashAccount or CreditAccount)��");
		String st = console.next();
		System.out.println("������Ҫ�������˻�����");
		String name = console.next();
		int k = 0;
//		BankAccount account;
		if(st.equals("CashAccount")) {
			k = -1;
			CashAccount account;
			for (CashAccount cash : cashAccounts) {
				if(cash.getName().equals(name)) {
					account = cash;
					System.out.println("��������Ҫ�洢�Ľ�");
					double balance = console.nextDouble();
					cash.deposit(balance);
					k = 1;
					System.out.println("�洢�ɹ��������˻���Ϊ" + account.getName() + "��CashAccount�����Ϊ��" + account.getBalance());
					break;
				}
			}
			if(k == 0) {
				System.out.println("��û�и��˻����޷���");
			}
		}
		else if(st.equals("CreditAccount")){
			k = -1;
			CreditAccount account;
			for (CreditAccount credit : creditAccounts) {
				if(credit.getName().equals(name)) {
					k = 1;
					account = credit;
					double money = credit.repay();  //���軹Ǯ��
					if(money == credit.getLimit()) {
						System.out.println("��Ŀǰ���軹�");
						break;
					}else {
						for (CashAccount cash : cashAccounts) {
							if(cash.getBinding() == credit.getBinding()) {  //�Ӷ�Ӧ�󶨵��ֽ��û��п�ȡ
								if(cash.getBalance() >= money)
								{
									cash.consume(money);
									credit.setBalance(money);
									System.out.println("����ɹ���");
									credit.repay();
									break;
								}
								else {
									System.out.println("���󶨵��ֽ��û������㣬�޷����");
									break;
								}
							}
						}
					}
				}
			}
		}
		if(k == 0) {
			System.out.println("��������ȷ���˻�����(CashAccount or CreditAccount)");
		}
		if(k == -1)
			System.out.println("��Ŀǰ��������û�д��˻���");
		
	}
	
	public void remove() {
		//ȡ�������
		System.out.println("��������Ҫ�������˻�����(CashAccount or CreditAccount)��");
		String st = console.next();
		System.out.println("������Ҫ�������˻�����");
		String name = console.next();
		int k = 0;
		if(st.equals("CashAccount")) {
			k = -1;
			for (CashAccount cash : cashAccounts) {
				if(cash.getName().equals(name)) {
					System.out.println("������Ҫȡ���");
					double money =console.nextDouble();
					cash.consume(money);
					k = 1;
					break;
				}
			}
//			if(k == 0) {
//				System.out.println("δ�ҵ���Ӧ���˻����޷�ִ�в�����");
//			}
		}
		else if(st.equals("CreditAccount")) {
			k = -1;
			for (CreditAccount credit : creditAccounts) {
				if(credit.getName().equals(name)) {
					credit.borrow();
					k = 1;
					break;
				}
			}
//			if(k == 0) {
//				System.out.println("δ�ҵ���Ӧ���˻����޷�ִ�в�����");
//			}
		}
		if(k == 0) {
			System.out.println("��������ȷ���˻�����(CashAccount or CreditAccount)");
		}
		if(k == -1)
			System.out.println("��Ŀǰ��������û�д��˻���");
	}
	
	public void modifyAccountName() {
		//�޸��˻�����
		System.out.println("��������Ҫ�������˻�����(CashAccount or CreditAccount)��");
		String st = console.next();
		System.out.println("������Ҫ�������˻�����");
		String name = console.next();
		int k = 0;
		if(st.equals("CashAccount")) {
			for (CashAccount cash : cashAccounts) {
				if(cash.getName().equals(name)) {
					System.out.println("�������޸ĺ���˻�����");
					String Name = console.next();
					cash.setName(Name);
					System.out.println("�޸ĳɹ���");
					k = 1;
					break;
				}
			}
			if(k == 0) {
				System.out.println("δ�ҵ���Ӧ���˻����޷�ִ�в�����");
			}
		}
		else if(st.equals("CreditAccount")) {
			for (CreditAccount credit : creditAccounts) {
				if(credit.getName().equals(name)) {
					System.out.println("�������޸ĺ���˻�����");
					String Name = console.next();
					credit.setName(Name);
					System.out.println("�޸ĳɹ���");
					k = 1;
					break;
				}
			}
			if(k == 0) {
				System.out.println("δ�ҵ���Ӧ���˻����޷�ִ�в�����");
			}
		}
	}
	
	public void showAccounts() {
		//��ӡ����˻���Ϣ
		System.out.println("------ CashAccount ------");
		for (CashAccount cash : cashAccounts) {
			System.out.println("�˻���: " + cash.getName() + ", ���: " + cash.getBalance() + ", ����Կ: " + cash.getBinding());
		}
		System.out.println("------ CreditAccount ------");
		for (CreditAccount credit : creditAccounts) {
			System.out.println("�˻���: " + credit.getName() + ", �����: " + credit.getLimit() + ", ���: " + credit.getBalance() + ", ����Կ: " + credit.getBinding());
		}
	}
	
	public void showOperate() {
		int i = 0;
		System.out.println("------ CashAccount ------");
		for (CashAccount cash : cashAccounts) {
			System.out.println("Account: " + cash.getName());
			i++;
			if(cash.stack.size() > 6) {
				System.out.println(cash.stack.pop());
				System.out.println(cash.stack.pop());
				System.out.println(cash.stack.pop());
				System.out.println(cash.stack.pop());
				System.out.println(cash.stack.pop());
				System.out.println(cash.stack.pop());
			}
			else {
				for(int k = 0; k < cash.stack.size(); k++) {
					System.out.println(cash.stack.pop());
				}
				System.out.println(cash.stack);
			}
		}
		
		System.out.println("------ CreditAccount ------");
		for (CreditAccount credit : creditAccounts) {
			System.out.println("Account: " + credit.getName());
			i++;
			if(credit.stack.size() > 6) {
				System.out.println(credit.stack.pop());
				System.out.println(credit.stack.pop());
				System.out.println(credit.stack.pop());
				System.out.println(credit.stack.pop());
				System.out.println(credit.stack.pop());
				System.out.println(credit.stack.pop());
			}
			else {
				for(int k = 0; k < credit.stack.size(); k++) {
					System.out.println(credit.stack.pop());
				}
				System.out.println(credit.stack);
			}
		}
		
		
		
	}
	
}
