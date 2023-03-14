package com.lansmancai.lanball;

import java.io.IOException;


public class ShortMagic extends Magic {
	/**
	 * ������
	 * 
	 * @param path
	 *            String �ļ�·��
	 * @param x
	 *            int x����
	 * @param y
	 *            int y����
	 */
	public ShortMagic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}

	/**
	 * ���ߵĹ��� : ������
	 * 
	 * @param stitck
	 *            Stick
	 * @return void
	 */
	public void magicDo(Stick stick) {
		double imageWidth = stick.getImage().getWidth(null);
		// �������û�б�̹�
		if (stick.getPreWidth() >= imageWidth) {
			// ������Ŀ�ȸ�Ϊһ��
			stick.setPreWidth((int) (stick.getPreWidth() * 0.5));
		}
	}
}