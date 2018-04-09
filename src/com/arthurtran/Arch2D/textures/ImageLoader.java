package com.arthurtran.Arch2D.textures;

/*
 * Arch2D | A 2D Java game library based in Java Swing.
 *
 * Copyright (c) 2018 Arthur Tran
 * https://arthurtran.com/
 */

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

import javax.swing.ImageIcon;

public class ImageLoader {
	
	/**
	 * Loads an image.
	 * @param path - The path to the image.
	 * @return Returns the image.
	 * <br><br>
	 * Note that if failed to find specified path, an error will show up in console.
	 */
	public Image loadImage(String path) {
		return new ImageIcon(getClass().getClassLoader().getResource(path)).getImage();
	}
}
