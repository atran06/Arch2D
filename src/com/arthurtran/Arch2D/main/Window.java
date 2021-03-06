package com.arthurtran.Arch2D.main;

/*
 * Arch2D | A 2D Java game library based in Java Swing.
 *
 * Copyright (c) 2018 Arthur Tran
 * https://arthurtran.com/
 */

import java.awt.*;
import java.util.HashMap;

import javax.swing.JFrame;

public class Window {

	private double width, height;
	private double fullWidth, fullHeight;
	
	private String title;
	private Boolean resizable = false;
	private Dimension screenSize;
	private Canvas canvas;
	private JFrame frame;

	/**
	 * @param A paintable canvas
	 */
	public Window(Canvas canvas) {
		this.canvas = canvas;
	}
	
	/**
	 * @param width - The width that is used to make a windowed screen and calculate the scale number.
	 * @param height - The height that is used to make a windowed screen and calculate the scale number.
	 */ 
	public Window(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	/**
	 * @param width - The width that is used to make a windowed screen and calculate the scale number.
	 * @param height - The height that is used to make a windowed screen and calculate the scale number.
	 * @param canvas - A paintable canvas
	 */
	public Window(double width, double height, Canvas canvas) {
		this.width = width;
		this.height = height;
		
		this.canvas = canvas;
	}
	
	/**
	 * @param width - The width that is used to make a windowed screen and calculate the scale number.
	 * @param height - The height that is used to make a windowed screen and calculate the scale number.
	 * @param canvas - A paintable canvas
	 * @param title - Sets the title of windowed title bar.
	 */
	public Window(double width, double height, Canvas canvas, String title) {
		this.width = width;
		this.height = height;
		
		this.canvas = canvas;
		
		this.title = title;
	}
	
	/**
	 * @param width - The width that is used to make a windowed screen and calculate the scale number.
	 * @param height - The height that is used to make a windowed screen and calculate the scale number.
	 * @param canvas - A paintable canvas
	 * @param title - Sets the title of windowed title bar.
	 * @param resizable - Sets the ability to resize the windowed display.
	 */
	public Window(double width, double height, Canvas canvas, String title, Boolean resizable) {
		this.width = width;
		this.height = height;
		
		this.canvas = canvas;
		
		this.title = title;
		
		this.resizable = resizable;
	}
	
	/**
	 * Creates a new full screen window.
	 * <br><br>
	 * Utilizes JFrame to create the window. Sets the size of the frame to be the size of the screen automatically.
	 * The width and height specified in the constructor is for windowed size and setting the scale width.
	 * <br><br>
	 * For example, if width is set at 500, and height at 500, anything bigger with scale up and anything smaller
	 * will scale down.
	 */
	public void createWindowFullscreen() {
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		fullWidth = screenSize.getWidth();
		fullHeight = screenSize.getHeight();
		
		frame = new JFrame();
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setTitle(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize((int) fullWidth, (int) fullHeight); 
		frame.setVisible(true);
		
		frame.add(canvas);
	}
	
	/**
	 * Creates a new visible window using the specified width and height.
	 * <br><br>
	 * Note that if resizable isn't stated, it is defaulted to false. If a canvas isn't stated, drawing isn't
	 * able to happen and an error will show in console. Location is also set to be centered in screen. This
	 * can be changed by using JFrame method <em>setLocation<em>.
	 */
	public void createWindowWindowed() {
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		fullWidth = screenSize.getWidth();
		fullHeight = screenSize.getHeight();
		
		frame = new JFrame();
		
		frame.getContentPane().setPreferredSize(new Dimension((int) width, (int) height));
		
		frame.setExtendedState(JFrame.NORMAL);
		frame.setUndecorated(false);
		frame.setTitle(title);
		frame.setLocation((int) ((fullWidth / 2) - (width / 2)), (int) ((fullHeight / 2) - (height / 2)));
		frame.setResizable(resizable);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.pack();
		frame.add(canvas);
	}
	
	/**
	 * Switches the window from windowed to fullscreen.
	 */
	public void windowedToFullscreen() {
		frame.dispose();
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize((int) fullWidth, (int) fullHeight);
		frame.setVisible(true);
	}
	
	/**
	 * Switches the window from fullscreen to windowed.
	 */
	public void fullscreenToWindowed() {
		frame.dispose();
		
		frame.getContentPane().setPreferredSize(new Dimension((int) width, (int) height));
		
		frame.setExtendedState(JFrame.NORMAL);
		frame.setUndecorated(false);
		frame.setLocation((int) ((fullWidth / 2) - (width / 2)), (int) ((fullHeight / 2) - (height / 2)));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.pack();
	}
	
	/**
	 * @return Returns the JFrame created upon calling <em>createWindowWindowed()<em> or 
	 * <em>createWindowFullscreen()<em>.
	 */
	public JFrame getFrame() {
		return frame;
	}
	
	/**
	 * @return Returns whether or not the window is fullscreen or not.
	 */
	public boolean isFullscreen() {
		if(frame.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
			return true;
		} else if(frame.getExtendedState() == JFrame.NORMAL) {
			return false;
		}
		
		 return false;
	}
	
	/**
	 * @return Returns the Dimensions of the user's screen size.
	 */
	public Dimension getScreenSize() {
		return screenSize;
	}
	
	/**
	 * Gets the width of the window.
	 * @return Returns the width of window.
	 */
	public double getFrameWidth() {
		return width;
	}
	
	/**
	 * Gets the height of the window
	 * @return Returns the height of the window.
	 */
	public double getFrameHeight() {
		return height;
	}
	
	/**
	 * Gets the fullscreen width.
	 * @return Returns the fullscreen width.
	 */
	public double getFullWidth() {
		return screenSize.getWidth();
	}
	
	/**
	 * Gets the fullscreen height.
	 * @return Returns the fullscreen height.
	 */
	public double getFullHeight() {
		return screenSize.getHeight();
	}

	/**
	 * Gets the scale width and height.
	 * @return Returns a map containing the scaleWidth and scaleHeight.
	 */
	public HashMap<String, Double> getScale() {
		HashMap<String, Double> map = new HashMap<>();
		map.put("scaleWidth", (frame.getContentPane().getWidth()) / width);
		map.put("scaleHeight", (frame.getContentPane().getHeight()) / height);

		return map;
	}
}
