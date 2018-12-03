/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * �������еĶ��󶼿������л� java.io.NotSerializableException
 * �������е����Զ���Ҫ���л� transient
 *
 *
 */
public class ObjectDemo01 {

	public static void main(String[] args) {
		try {
			seri("e:/IO/test/ser.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			read("e:/IO/test/ser.txt");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//�����л�
	public static void read(String scrPath) throws IOException, ClassNotFoundException {
		//����Դ
		File src = new File(scrPath);
		//ѡ����
		ObjectInputStream ois = new ObjectInputStream(
				new BufferedInputStream(
						new FileInputStream(src))
				);
		//���� ��ȡ��˳���д��һ��  ������ڲ��ܶ�ȡ
		//��һ�£� ���ݴ�������
		Object obj = ois.readObject();
		if(obj instanceof Employee) {
			Employee emp = (Employee)obj;
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			
		}
		
		obj = ois.readObject();
		int[] arr = (int[]) obj;
		System.out.println(Arrays.toString(arr));
		
		ois.close();
	}
	

	//���л�
	public static void seri(String destPath) throws IOException {
		Employee emp = new Employee("wyf", 1000000);
		int[] arr = {1, 2, 3, 45};
		
		//����Դ
		File dest = new File(destPath);
		//ѡ����
		ObjectOutputStream dos = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream(dest))
				);
		
		//���� д��˳�� Ϊ��ȡ��׼��
		dos.writeObject(emp);
		dos.writeObject(arr);
		dos.flush();
		//�ͷ���Դ
		dos.close();
		
		
	}
}
