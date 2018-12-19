/* @16130110047 ��һ�� 528378795@qq.com */
package com.net.tcp.chat.demo02;

import java.io.Closeable;
import java.io.IOException;

/**
 * �ر����ķ���
 *
 */
public class CloseUtil {
	public static void closeAll(Closeable... io) {
		for (Closeable temp : io) {
			if (temp != null) {
				try {
					temp.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
