package com.shiyanlou.course;
 
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*@16130110047 ��һ�� 528378795@qq.com*/
public class IOfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String path = "E:\\Java\\FileOp\\bfFile.txt";
			String context = "My First Buffered File.";
			
			FileOutputStream file = new FileOutputStream(path);
			file.write(context.getBytes());
		 
			file.close();
			System.out.println("The file is created successfully.");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			//����������ʱ���������򲶻���쳣
			e.printStackTrace();
		}
		 
		 
		 
	}

}
