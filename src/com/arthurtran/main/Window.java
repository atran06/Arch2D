package com.arthurtran.main;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Window {

	private double width, height;
	private double fullWidth, fullHeight;
	private String title;
	private Boolean resizable = false;
	private Dimension screenSize;
	private Canvas canvas;
	
	public Window() {
		
	}
	
	public Window(Canvas canvas) {
		this.canvas = canvas;
	}
	
	public Window(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public Window(double width, double height, Canvas canvas) {
		this.width = width;
		this.height = height;
		
		this.canvas = canvas;
	}
	
	public Window(double width, double height, Canvas canvas, String title) {
		this.width = width;
		this.height = height;
		
		this.canvas = canvas;
		
		this.title = title;
	}
	
	public Window(double width, double height, Canvas canvas, String title, Boolean resizable) {
		this.width = width;
		this.height = height;
		
		this.canvas = canvas;
		
		this.title = title;
		
		this.resizable = resizable;
	}
	
	public void createWindowFullscreen() {
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		fullWidth = screenSize.getWidth();
		fullHeight = screenSize.getHeight();
		
		JFrame frame = new JFrame();
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setTitle(title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize((int) fullWidth, (int) fullHeight); 
		frame.setVisible(true);
		
		frame.add(canvas);
	}
	
	public void createWindowWindowed() {
		screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		fullWidth = screenSize.getWidth();
		fullHeight = screenSize.getHeight();
		
		JFrame frame = new JFrame();
		
		frame.getContentPane().setPreferredSize(new Dimension((int) width, (int) height));
		
		frame.setExtendedState(JFrame.NORMAL);
		frame.setUndecorated(false);
		frame.setTitle(title);
		frame.setLocation((int) ((fullWidth / 2) - width), (int) ((fullHeight / 2) - height));
		frame.setResizable(resizable);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize((int) fullWidth, (int) fullHeight); 
		frame.setVisible(true);
		
		frame.pack();
		frame.add(canvas);
	}
}
