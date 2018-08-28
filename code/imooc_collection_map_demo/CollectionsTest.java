package com.imooc.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

/**
 * ��Ҫ��ɣ�
 * 1.ͨ��Collections.sort()��������Integer���͵�List��������
 * 2.��String���͵�List��������
 * 3.���������ͷ��͵�List����������StudentΪ����
 * @author 52837
 *
 */
public class CollectionsTest {

	/**
	 * 1.ͨ��Collections.sort()��������Integer���͵�List��������
	 * ����һ��Integer���͵�List������ʮ��100���ڵĲ��ظ����������
	 * ����Collection.sort()���������������
	 * @param args
	 */
	public void testSort1() {
		List<Integer> integerList = new ArrayList<Integer>();
		//����ʮ��100���ڵĲ��ظ��������
		Random random = new Random();
		Integer k;
		for(int i = 0; i < 10; i++) {
			do {
				k = random.nextInt(100);
			}while(integerList.contains(k));
			integerList.add(k);
			System.out.println("�ɹ����������" + k);
		}
		System.out.println("------------����ǰ-------------");
		for (Integer integer : integerList) {
			System.out.println("Ԫ�أ�" + integer);
		}
		System.out.println("------------�����-------------");
		Collections.sort(integerList);
		for (Integer integer : integerList) {
			System.out.println("Ԫ�أ�" + integer);
		}
	}
	
	/**
	 *  2.��String���͵�List��������
	 *  ����String���͵�List��������������StringԪ�أ�
	 *  ����sort�������ٴ�����������˳��
	 * @param args
	 */
	public void testSort2() {
		List<String> stringList = new ArrayList<String>();
		stringList.add("microsoft");
		stringList.add("google");
		stringList.add("lenovo");
		System.out.println("-----------����ǰ-----------");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�" + string);
		}
		Collections.sort(stringList);
		System.out.println("-----------�����-----------");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�" + string);
		}
	}
	
	/**
	 * 2.2��String���͵�List��������
	 * 1.������List<String>֮�����������ʮ������ַ���
	 * 2.ÿ���ַ����ĳ���Ϊ10���ڵ��������
	 * 3.ÿ���ַ�����ÿ���ַ���Ϊ������ɵ��ַ����ַ������ظ�
	 * 4.ÿ������ַ��������ظ�
	 * @param args
	 */
	//length�û�Ҫ������ַ����ĳ���
	public static String getRandomString(int length) {
		String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		Random random = new Random();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < random.nextInt(length); i++) {
			int number = random.nextInt(62);
			sb.append(str.charAt(number));
		}
		return sb.toString();
	}
	
	public void testSort2_2() {
		List<String> stringList = new ArrayList<String>();
		Random random = new Random();
		String st;
		for(int i = 0; i < 10; i++) {
			do {
				st = getRandomString(10);
			}while(stringList.contains(st));
			stringList.add(st);
			System.out.println("�ɹ�����ַ�����" + st);
		}
		System.out.println("-----------����ǰ-----------");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�" + string);
		}
		Collections.sort(stringList);
		System.out.println("-----------�����-----------");
		for (String string : stringList) {
			System.out.println("Ԫ�أ�" + string);
		}
	}	
	
	/**
	 * 3.���������ͷ��͵�List����������StudentΪ����
	 * @param args
	 */
	public void testSort3() {
		List<Student> studentList = new ArrayList<Student>();
		Random random = new Random();

		for(int i = 0; i < 3; i++) {
			Student k = new Student();
			System.out.println("������ѧ��������");
			Scanner console = new Scanner(System.in);
			String name = console.next();
			do {
				k.id = random.nextInt(1000) + "";	
			}while(studentList.contains(k));
			k.name = name;
			studentList.add(k);
			System.out.println("�ɹ����ѧ����" + k.id + ":" + k.name);
		}
		System.out.println("-----------����ǰ----------");
		for (Student student : studentList) {
			System.out.println("ѧ����" + student.id + ":" + student.name);
		}
		Collections.sort(studentList);
		System.out.println("-----------����ǰ----------");
		for (Student student : studentList) {
			System.out.println("ѧ����" + student.id + ":" + student.name);
		}		
		Collections.sort(studentList, new StudentComparator());
		System.out.println("------�������������--------");
		for (Student student : studentList) {
			System.out.println("ѧ����" + student.id + ":" + student.name);
		}		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CollectionsTest ct = new CollectionsTest();
//		ct.testSort1();    //��Integer���͵�List��������
//		ct.testSort2();	   //��String���͵�List��������
//		ct.testSort2_2();  //�������ָ�������ڵ��ַ�������String���͵�List��������
		ct.testSort3();    //���������ͷ��͵�List����������StudentΪ���� 
	}

}
