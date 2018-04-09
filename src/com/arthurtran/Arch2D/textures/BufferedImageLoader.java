package com.arthurtran.Arch2D.textures;

/*
 * Arch2D | A 2D Java game library based in Java Swing.
 *
 * Copyright (c) 2018 Arthur Tran
 * https://arthurtran.com/
 */

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class BufferedImageLoader {

	private BufferedImage image;
	
	/**
	 * Loads a buffered image.
	 * @param path - Path to the image.
	 * @return Returns a buffered image.
	 */
	public BufferedImage imageLoader(String path) {
		try {
			image = ImageIO.read((getClass().getClassLoader().getResource(path)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
}
