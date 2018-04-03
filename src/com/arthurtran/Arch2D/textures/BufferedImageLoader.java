package com.arthurtran.Arch2D.textures;

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
			image = ImageIO.read((getClass().getClassLoader()s.getResource(path)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return image;
	}
}
