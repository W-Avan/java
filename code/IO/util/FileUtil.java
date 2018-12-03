/* @16130110047 ��һ�� 528378795@qq.com */
package com.IO.util;

import java.io.Closeable;
import java.io.IOException;

public class FileUtil {
	
	/**
	 * ������ر���
	 * �ɱ������ ...  ֻ�ܷ����β����һ��λ�ã�����ʽ������һ��
	 */
	public static void close(Closeable ... io) {
		for (Closeable temp : io) {
			if(null != temp) {
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	/**
	 * ʹ�÷��ͷ���
	 */
	public static <T extends Closeable> void closeAll(T ... io) {
		for (Closeable temp : io) {
			if(null != temp) {
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
