/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import com.IO.util.FileUtil;


public class SplitFile {
	//�ļ���·��
	private String filePath;
	//�ļ���
	private String fileName;
	//�ļ���С
	private long length;
	//����
	private int size;
	//ÿ��Ĵ�С
	private long blockSize;
	//�ָ��Ĵ��Ŀ¼
	private String destBlockPath;
	//ÿ�������
	List<String> blockPath;
	
	public SplitFile() {
		blockPath = new ArrayList<String>();
	}
	
	public SplitFile(String filePath, String destBlockPath) {
		this(filePath, 1024, destBlockPath);
	}
	
	public SplitFile(String filePath, long blockSize, String destBlockPath) {
		this();
		this.blockSize = blockSize;
		this.filePath = filePath;
		this.destBlockPath = destBlockPath;
		init();
	}
	
	/**
	 * ��ʼ������ ���� ������ ȷ���ļ���
	 * @param args
	 */
	public void init() {
		File src = null;
		//��׳��
		if(null == filePath || !((src = new File(filePath)).exists())) {
			return;
		}
		if(src.isDirectory()) {
			return;
		}
		//�ļ���
		this.fileName = src.getName();
		
		//������� ʵ�ʴ�С ��ÿ���С
		this.length = src.length();
		//���� ÿ���С
		if(this.blockSize > length) {
			this.blockSize = length;
		}
		
		//ȷ������
		size = (int)(Math.ceil(length * 1.0 / this.blockSize));
		//ȷ���ļ�·��
		initPathName();
	}
	
	private void initPathName() {
		for(int i = 0; i < size; i++) {
			this.blockPath.add(destBlockPath + "/" + this.fileName + ".part" + i);
		}
	}
	
	/**
	 * �ļ��ָ�
	 * 0�����ڼ���
	 * 1������ʼλ��
	 * 2����ʵ�ʴ�С
	 * @param destPath �ָ��ļ����Ŀ¼
	 * @throws IOException 
	 */
	public void split() throws IOException {

		long beginPos = 0; //��ʼλ��
		long actualBlockSize = this.blockSize;  //ʵ�ʴ�С
		
		//�������п�Ĵ�С�� λ�á�����
		for(int i = 0; i < size; i++) {
			if(i == size - 1) {  //���һ��
				actualBlockSize = this.length - beginPos;
			}
			splitDetail(i, beginPos, actualBlockSize);
			beginPos += actualBlockSize;  //���ε��յ㣬 ��һ�ε����
		}
		
	}
	/**
	 * �ļ��ķָ�  ���� ���
	 * �ļ�����
	 * @param idx
	 * @param beginPos
	 * @param actualBlockSize
	 * @throws IOException 
	 */
	private void splitDetail(int idx, long beginPos, long actualBlockSize) throws IOException {
		//����Դ
		File src = new File(this.filePath);  //Դ�ļ�
		File dest = new File(this.blockPath.get(idx));  //Ŀ���ļ�
		
		//ѡ����
		RandomAccessFile raf = null;
		BufferedOutputStream bos = null;
		try {
			raf = new RandomAccessFile(src, "r");
			bos = new BufferedOutputStream(new FileOutputStream(dest));
			
			//��ȡ�ļ�
			raf.seek(beginPos);
			//������
			byte[] flush = new byte[1024];
			int len = 0;
			while(-1 != (len = raf.read(flush))) {
				if(actualBlockSize - len >= 0) {  //�鿴�Ƿ��㹻
					//д��
					bos.write(flush, 0, len);
					actualBlockSize -= len;  //ʣ����
					
				}else {  //д�����һ�ε�ʣ����
					bos.write(flush, 0, (int) actualBlockSize);
					break;
				}
		
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			FileUtil.close(bos, raf);
		}
		

	}
	
	public void mergeFile(String destPath) throws IOException {
		//����Դ
		File dest = new File(destPath);
		//ѡ����
		BufferedOutputStream bos = null;  //�����
		SequenceInputStream sis = null;   //������
		//����һ������
		Vector<InputStream> vi = new Vector<InputStream>();
		for(int i = 0; i < this.blockPath.size(); i++) {
			vi.add(new BufferedInputStream(
					new FileInputStream(
							new File(this.blockPath.get(i)))));
		}
		
		
		try {
			bos = new BufferedOutputStream(new FileOutputStream(dest, true));   //׷��
			sis = new SequenceInputStream(vi.elements());  //��������ϲ�Ϊһ����
			BufferedInputStream bis = null;
			for(int i = 0; i < this.blockPath.size(); i++) {
					bis = new BufferedInputStream(
					new FileInputStream(
							new File(this.blockPath.get(i)))
					);
					
					//������
					byte[] flush = new byte[1024];
					//���ճ���
					int len = 0;
					while(-1 != (len = sis.read(flush))) {
						bos.write(flush, 0, len);
					}
					bos.flush();
					FileUtil.close(sis);
					
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			FileUtil.close(bos);
		}
		
	}
	
	
	
	

	public static void main(String[] args) throws IOException {
		SplitFile split  =new SplitFile("E:/IO/test/demo02.java", 200, "e:/IO");  //ָ�����ֽ���

//		System.out.println(split.size);
		
//		split.split("e:/IO");
		
		split.mergeFile("e:/IO/test1.java");
	}

}
