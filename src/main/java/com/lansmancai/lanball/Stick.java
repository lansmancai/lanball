package com.lansmancai.lanball;

import java.io.IOException;

public class Stick extends BallComponent {
	// 定义档板移动的速度
	public static final int SPEED = 20;
	// 定义档板初始的长度
	private int preWidth = 0;

	/**
	 * 有参数构造器
	 * 
	 * @param panelWidth
	 *            int 画板宽度
	 * @param panelHeight
	 *            int 画板高度
	 * @param path
	 *            String 图片路径
	 */
	public Stick(int panelWidth, int panelHeight, String path)
			throws IOException {
		// 调用父构造器
		super(panelWidth, panelHeight, path);
		// 设置y坐标
		this.setY(panelHeight - super.getImage().getHeight(null));
		// 设置原本的长度
		this.preWidth = super.getImage().getWidth(null);
	}

	/**
	 * 获取初始长度
	 * 
	 * @return int 初始长度
	 */
	public int getPreWidth() {
		return this.preWidth;
	}

	/**
	 * 设置初始长度
	 * 
	 * @return void
	 */
	public void setPreWidth(int preWidth) {
		this.preWidth = preWidth;
	}

}