package com.imooc;

import java.util.Scanner;

public class Initail {
	static int  [] arr = new int[100];
	Scanner sc = new Scanner(System.in);
	public void page0() {
		System.out.println("ллʹ��");
	}
	public int page1() {
		int k;
		System.out.println("��ӭʹ�ô���⳵ϵͳ ");
		System.out.println("���Ƿ�Ҫ�⳵: 1.�� 0.��");
		System.out.print("�����룺");
		k = sc.nextInt();
		return k;
	}
	public int page2() {
		int k;
		System.out.println("�����⳵�����ͼ���Ŀ��");
		System.out.println("��� | �������� | ���/�죩 | ����");
		System.out.println("1.  |�µ�A4  | 500Ԫ/��     |  ���ˣ�4�� ");
		System.out.println("2.  |���Դ�6 | 400Ԫ/��     |  ���ˣ�4��");
		System.out.println("3.  |Ƥ��ѩ6 | 450Ԫ/��     |  ����4�� �ػ���2��");
		System.out.println("4.  |����       | 800Ԫ/��     |  ���ˣ�20��");
		System.out.println("5.  |�ɻ���    | 400Ԫ/��     |  �ػ���4��");
		System.out.println("6.  |��ά��    | 1000Ԫ/��   |  �ػ���20��");
		System.out.println("��������Ҫ��������������");
		k = sc.nextInt();
		return k;
	}
	public int page3(int n) {
		int i, k;
		//int  [] arr = new int[n];
		for(i = 1; i <= n; i++) {
			System.out.println("�������" + i + "��������ţ�");
			arr[i-1] = sc.nextInt();
		}
		System.out.println("�������⳵������");
		k = sc.nextInt();
		return k;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PCar p1 = new PCar();
		p1.setName("�µ�A4");
		p1.setRent(500);
		p1.setManned(4);
		
		PCar p2 = new PCar();
		p2.setName("���Դ�6");
		p2.setRent(400);
		p2.setManned(4);
		
		P_MCar p3 = new P_MCar();
		p3.setName("Ƥ��ѩ6");
		p3.setRent(450);
		p3.setManned(4);
		p3.setCargo(2);
		
		PCar p4 = new PCar();
		p4.setName("����");
		p4.setRent(800);
		p4.setManned(20);
		
		MCar p5 = new MCar();
		p5.setName("�ɻ���");
		p5.setRent(400);
		p5.setCargo(4);
		
		MCar p6 = new MCar();
		p6.setName("��ά��");
		p6.setRent(1000);
		p6.setCargo(20);
		
		
		Initail car = new Initail();
		int p = 0, k = 1;
		double q = 0.0, t = 0.0;
		String [] Nam = new String [100];
		String [] nam = new String [100];
		while(k != 0)
		{
			k = car.page1();
			switch(k)
			{
			case 1:
				int i = car.page2();   
				int m = car.page3(i);  //�⳵����
				for(int j = 0; j < i; j++)
				{
					switch(arr[j])
					{
					case 1:
						p = p + p1.getManned();
						Nam[j] = p1.getName();
						t = t + p1.getRent();
						break;
					case 2:
						p = p + p2.getManned();
						Nam[j] = p2.getName();
						t = t + p2.getRent();
						break;
					case 3:
						p = p + p3.getManned();
						q = q +p3.getCargo();
						Nam[j] = p3.getName();
						nam[j] = p3.getName();
						t = t + p3.getRent();
						break;
					case 4:
						p = p + p4.getManned();
						Nam[j] = p4.getName();
						t = t + p4.getRent();
						break;
					case 5:
						q = q + p5.getCargo();
						Nam[j] = p5.getName();
						nam[j] = p5.getName();
						t = t + p5.getRent();
						break;
					case 6:
						q = q + p6.getCargo();
						Nam[j] = p6.getName();
						nam[j] = p6.getName();
						t = t + p6.getRent();
						break;
					}
				}
				System.out.println("�����ʵ���");
				System.out.println("***�����˵ĳ��У�");
				for(int h = 0; h < i; h++)
				{
					if(Nam[h] == null)
					{
						continue;
					}
					System.out.print(Nam[h] + "  ");
				}
				System.out.println("�����ˣ�" + p + "��");
				System.out.println("***�ػ��ĳ��У� ");
				for(int h = 0; h < i; h++)
				{
					if(nam[h] == null)
					{
						continue;
					}
					System.out.print(nam[h] + "  ");
				}
				System.out.println("���ػ���" + q + "��");
				System.out.println("***�⳵�ܼ۸� " +  t * m + "Ԫ");
				k = 0;
				break;
			case 0:
				car.page0();
				k = 0;
				break;
			}
		}
		
	}
}
