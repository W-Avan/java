package com.shiyanlou.course;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MySwingWindow extends JFrame {
	//�˴�ͨ���̳�JFrame����ʹ�����Լ���MySwingWindow���д����һЩ���Ժͷ���
	
	
	private static final long serialVersionUID = 8978037719568897634L;
	private JLabel myLabel;
	private JTextField myTextField;
	private JButton myButton;
	
	public MySwingWindow() {
		super();
		
		this.setSize(400, 300);
		//���ô����С
		
		this.getContentPane().setLayout(null);
		//���ش˴���� contentPane ���������䲼��
        //��һ�䲻̫���Ļ�Ҳ���õ��ģ���д��
		
		this.setTitle("My First Swing Window");
		
		this.add(getJLabel(), null);
		this.add(getJTextField(), null);
		this.add(getJButton(), null);
		//���Զ����JFrame���췽����ʹ��add()��������ӿؼ�
        //add()�������Խ�ָ�������ӵ��������ĸ���λ����
        //��һ������Ϊ����ӵ���������������������ǵķ���ֵ
        //�ڶ�������Ϊ��������Ĳ������ƵĶ������ǲ������ƣ�������null
	}
	
	
	
	
	private JLabel getJLabel() {
		
		if(myLabel == null) {
			myLabel = new JLabel();
			
			myLabel.setBounds(5, 10, 250, 30);
			 //ʹ��setBounds()�������óߴ�
	        //�ĸ������ķֱ���x,y,width,height
	        //�����˺��������λ�ã��Լ���ǩ����Ŀ�͸�
			
			myLabel.setText("Hello! Welcome to shiyanlou.com");
			//ʹ��setText()��������Ҫ��ʾ���ı�
		}
		
		return myLabel;
	}
	
	
	
	private JTextField getJTextField() {
		if(myTextField == null) {
			myTextField = new JTextField();
			
			myTextField.setBounds(5, 45, 200, 30);
			
			myTextField.setText("Shi Yan Lou");
		}
		return myTextField;
	}
	
	
	
	private JButton getJButton() {
		if(myButton == null) {
			myButton = new JButton();
			//ʵ����myTextField����
			
			myButton.setBounds(5,  80, 100, 40);
			
			myButton.setText("Click me!");
			
			myButton.addActionListener(new ActionListener() {
				//Ϊ�����һ���¼��������Ӷ�ʹ�����ť������Ӧ�û��ĵ������
	            //ActionListener�����ڽ��ղ����¼����������ӿڡ�
	            //�Դ�������¼�����Ȥ�������ʵ�ִ˽ӿڣ���ʹ�ø��ഴ���Ķ�
	            //��ʹ������� addActionListener ����������ע�ᡣ
	            //�ڷ��������¼�ʱ�����øö���� actionPerformed ����
				
				public void actionPerformed(ActionEvent e) {
					//�÷������ڷ�������ʱ�����ã�����Ҫ��������Ϳ���д��������
	                //������������Ҫ����������Ǹı�֮ǰ�����ؼ������������ɫ�ͱ���ɫ
					
					myLabel.setForeground(Color.RED);
					//���ô������ǰ��ɫ
					
					myTextField.setBackground(Color.BLUE);
					//���ô�����ı���ɫ
				}
			});
			
		}
		
		return myButton;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MySwingWindow window = new MySwingWindow();
		//����һ��������� window
		
		window.setVisible(true);
	}

}
