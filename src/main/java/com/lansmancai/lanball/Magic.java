package com.lansmancai.lanball;

import java.io.IOException;

public abstract class Magic extends BallComponent {
	/**
	 * �ṩ��������õĹ�����
	 * 
	 * @param path
	 *            String �ļ�·��
	 * @param x
	 *            int x����
	 * @param y
	 *            int y����
	 */
	public Magic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}

	/**
	 * ���ߵĹ���
	 * 
	 * @param stitck
	 *            Stick
	 * @return void
	 */
	public abstract void magicDo(Stick stick);
}