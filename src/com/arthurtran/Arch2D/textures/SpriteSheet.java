package com.arthurtran.Arch2D.textures;

import java.awt.image.BufferedImage;

public class SpriteSheet {

	private BufferedImage spriteSheet;
	private int resolution;
	
	public SpriteSheet(BufferedImage spriteSheet, int resolution) {
		this.spriteSheet = spriteSheet;
		this.resolution = resolution;
	}
	
	public BufferedImage getImg(int col, int row, int width, int height) {
		return spriteSheet.getSubimage((col * resolution) - resolution, (row * resolution) - resolution, width, height);
	}
}
