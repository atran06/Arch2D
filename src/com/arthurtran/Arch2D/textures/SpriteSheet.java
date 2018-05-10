package com.arthurtran.Arch2D.textures;

/*
 * Arch2D | A 2D Java game library based in Java Swing.
 *
 * Copyright (c) 2018 Arthur Tran
 * https://arthurtran.com/
 */

import java.awt.image.BufferedImage;

public class SpriteSheet {

	private BufferedImage spriteSheet;
	private int resolutionX;
	private int resolutionY;

	/**
	 * Spritesheet class that loads in an image that can grab a sub image out of.
	 * @param spriteSheet - A buffered image.
	 * @param resolutionX - The resolutionWidth of each image (eg. 32, 64, 128).
	 * @param resolutionY - The resolutionHeight of each image (eg. 32, 64, 128).
	 */
	public SpriteSheet(BufferedImage spriteSheet, int resolutionX, int resolutionY) {
		this.spriteSheet = spriteSheet;
		this.resolutionX = resolutionX;
		this.resolutionY = resolutionY;
	}
	
	/**
	 * getImg() gets a sub image out of specified spritesheet.
	 * @param col - Column of sub image.
	 * @param row - Row of sub image.
	 * @param width - Width of the image.
	 * @param height - Height of the image.
	 * @return Returns the sub image.
	 */
	public BufferedImage getImg(int col, int row, int width, int height) {
		return spriteSheet.getSubimage((col * resolutionX) - resolutionX, (row * resolutionY) - resolutionY, width, height);
	}
}
