package com.arthurtran.Arch2D.textures;

import java.awt.image.BufferedImage;

public class SpriteSheet {

	private BufferedImage spriteSheet;
	private int resolution;
	
	/**
	 * Spritesheet class that loads in an image that can grab a sub image out of.
	 * @param spriteSheet - A buffered image.
	 * @param resolution - The resolution of each image (eg. 32, 64, 128).
	 */
	public SpriteSheet(BufferedImage spriteSheet, int resolution) {
		this.spriteSheet = spriteSheet;
		this.resolution = resolution;
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
		return spriteSheet.getSubimage((col * resolution) - resolution, (row * resolution) - resolution, width, height);
	}
}
