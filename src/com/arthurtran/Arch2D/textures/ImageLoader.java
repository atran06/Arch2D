package com.arthurtran.Arch2D.textures;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

import javax.swing.ImageIcon;

public class ImageLoader {
		
	public Image loadImage(String path) {
		return new ImageIcon(getClass().getResource(path)).getImage();
	}
}
