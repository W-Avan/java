/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * �ļ�����
 * 	1���ļ�����
 *  2���ļ��п���
 * @author 52837
 *
 */
public class FileUtil {
	
	
	/**
	 * �����ļ���
	 * @param srcPath Դ·��
	 * @param destPath	Ŀ��·��
	 */
	public static void copyDir(String srcPath, String destPath) {
		File src = new File(srcPath); 
		File dest = new File(destPath);
		copyDir(src, dest);
	}

	/**
	 * �����ļ���
	 * @param src ԴFile����
	 * @param dest Ŀ��File����
	 */
	public static void copyDir(File src, File dest) {
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
	public static void copyDirDetail(File src, File dest) {
		if(src.isFile()) {  //�ļ�
			try {
				FileUtil.copyFile(src, dest);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				System.out.println("�ļ�������");
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("����ʧ��");
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
	
	/**
	 * �ļ��Ŀ���
	 * 	@param ԭ�ļ�·��
	 * 	@param Ŀ���ļ�·��
	 *  @throws FileNotFoundException�� IOException
	 *  @return
	 */
	public static void copyFile(String srcPath, String destPath) throws FileNotFoundException, IOException {
		//1.������ϵԴ (������Ϊ�ļ�) + Ŀ�ĵ�(�ļ����Բ�����)
		File src = new File(srcPath);
		File dest = new File(destPath);
		copyFile(src, dest);
	}

	/**
	 * �ļ��Ŀ���
	 * 	@param ԭ�ļ�File����
	 * 	@param Ŀ���ļ�File����
	 *  @throws FileNotFoundException�� IOException
	 *  @return
	 */
	public static void copyFile(File src, File dest) throws FileNotFoundException, IOException {
		if(!src.isFile()) {  //Ϊ�ļ��л�Ϊnull
			throw new IOException("ֻ�ܿ����ļ�");
		}
		//destΪ�Ѿ����ڵ��ļ��У����ܽ������ļ���ͬ�����ļ�
		if(dest.isDirectory()) {
			System.out.println(dest.getAbsolutePath() + "���ܽ������ļ���ͬ�����ļ�");
			throw new IOException(dest.getAbsolutePath() + "���ܽ������ļ���ͬ�����ļ�");
		}
		//2.ѡ����
		InputStream is = new FileInputStream(src);
		OutputStream os = new FileOutputStream(dest);
		//3.�ļ����� ѭ�� + ��ȡ + д��
		byte[] flush = new byte[1024];
		int len = 0;
		//��ȡ
		while(-1 != (len = is.read(flush))) {
			//д��
			os.write(flush, 0, len);
		}
		os.flush();  //ǿ��ˢ��
		
		//�ر���  (�ȴ򿪵ĺ�ر�)
		os.close();
		is.close();

	}
}
