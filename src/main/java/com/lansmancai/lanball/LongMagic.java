package com.lansmancai.lanball;

import java.io.IOException;

public class LongMagic extends Magic {
	/**
	 * 构造器
	 * 
	 * @param path
	 *            String 文件路径
	 * @param x
	 *            int x坐标
	 * @param y
	 *            int y坐标
	 */
	public LongMagic(String path, int x, int y) throws IOException {
		super(path, x, y);
	}

	/**
	 * 道具的功能 : 档板变长
	 * 
	 * @param stitck
	 *            Stick
	 * @return void
	 */
	public void magicDo(Stick stick) {
		double imageWidth = stick.getImage().getWidth(null);
		// 如果档板没有变长过
		if (stick.getPreWidth() <= imageWidth) {
			// 将档板的长度改为双倍
			stick.setPreWidth((int) (stick.getPreWidth() * 2));
		}
	}
}