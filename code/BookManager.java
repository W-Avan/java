package com.imooc.project1;

import java.util.Scanner;

public class BookManager {
	private static Scanner console = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] books = {"C����", "���ݽṹ",  "�������", "����", "��ѧ����", "ë��"};
		while(true) {
			System.out.println("�������1-�������Ʋ���ͼ�飻 2-������Ų���ͼ��");
			String book;
			try {
				int command = inputCommand();
				switch(command) {
				case 1:
					book = getBookByName(books);
					System.out.println("book:" + book);
					break;
				case 2:
					book = getBookByNumber(books);
					System.out.println("book:" + book);
					break;
				case -1:
					System.out.println("������������������ʾ�����������");
					continue;
					default:
						System.out.println("�����������");
						continue;
				}
				break;
			}catch(Exception bne) {
				System.out.println(bne.getMessage());
				continue;
			}
		}
	}

	private static String getBookByName(String[] books) throws Exception {
		System.out.println("����ͼ�����ƣ�");
		String name = console.next();
		for(int i = 0; i < books.length; i++) {
			if(name.equals(books[i]))
			{
				return books[i];
			}
		}
		throw new Exception("ͼ�鲻���ڣ�");
	}
	
	private static String getBookByNumber(String[] books) throws Exception{
		while(true) {
			System.out.println("����ͼ����ţ�");
			try {
				int index = console.nextInt();
				if(index == -1)
				{
					System.out.println("������������������ʾ�����������");
					continue;
				}
				String book = books[index];
				return book;
			}catch(ArrayIndexOutOfBoundsException e) {
				Exception bookNotExists = new Exception("ͼ�鲻���ڣ�");
				bookNotExists.initCause(e);
				throw bookNotExists;
			}
		}
	}
	
	private static int inputCommand() {
		int command;
		try {
			command = console.nextInt();
			return command;
		}catch(Exception e) {
			console = new Scanner(System.in);
			return -1;
		}
	}
}
