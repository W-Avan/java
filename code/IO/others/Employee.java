/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.others;
/**
 * �սӿ�ֻ�Ǳ�ʶ
 * @author 52837
 *
 */

public class Employee implements java.io.Serializable{
	//����Ҫ���л�
	private transient String name;  //û�д�
	private double salary;	
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
