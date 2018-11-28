/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * �ļ��еĿ���
 * 1���ļ� ���� copyFile
 * 2���ļ��� ���� mkdirs()
 * 3���ݹ�������Ｖ
 *
 *
 */
public class CopyDir {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		//ԴĿ¼
		String srcPath = "E:/IO/test/1.jpg";
		//Ŀ��Ŀ¼  
		String destPath = "E:/IO/test/dir";
		copyDir(srcPath, destPath);
	}

	/**
	 * �����ļ���
	 * @param srcPath Դ·��
	 * @param destPath	Ŀ��·��
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void copyDir(String srcPath, String destPath) throws FileNotFoundException, IOException {
		File src = new File(srcPath); 
		File dest = new File(destPath);
		copyDir(src, dest);
	}

	/**
	 * �����ļ���
	 * @param src ԴFile����
	 * @param dest Ŀ��File����
	 * @throws IOException 
	 * @throws FileNotFoundException 
	 */
	public static void copyDir(File src, File dest) throws FileNotFoundException, IOException {
		if(src.isDirectory()) {  //�ļ���
			dest = new File(dest, src.getName());
		}
		copyDirDetail(src, dest);
	}
	/**
	 * �����ļ���ϸ��
	 * @param src
	 * @param dest
	 */
	public static void copyDirDetail(File src, File dest) throws FileNotFoundException,IOException{
		if(src.isFile()) {  //�ļ�
			try {
				FileUtil.copyFile(src, dest);
			} catch (FileNotFoundException e) {
				//e.printStackTrace();
				throw e;
			} catch (IOException e) {
				//e.printStackTrace();
				throw e;
			}
		}else if(src.isDirectory()) {  //�ļ���
				//ȷ��Ŀ���ļ��д���
			dest.mkdirs();
			//��ȡ��һ��Ŀ¼|�ļ�
			for(File sub : src.listFiles()) {
				copyDirDetail(sub, new File(dest, sub.getName()));
			}
		}
	}

}
