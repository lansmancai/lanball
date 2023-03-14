package com.lansmancai.lanball;

import java.io.IOException;

public class LongMagic extends Magic {
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
	public LongMagic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}

	/**
	 * ���ߵĹ��� : ����䳤
	 * 
	 * @param stitck
	 *            Stick
	 * @return void
	 */
	public void magicDo(Stick stick) {
		double imageWidth = stick.getImage().getWidth(null);
		// �������û�б䳤��
		if (stick.getPreWidth() <= imageWidth) {
			// ������ĳ��ȸ�Ϊ˫��
			stick.setPreWidth((int) (stick.getPreWidth() * 2));
		}
	}
}