package com.arthurtran.Arch2D.main;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Animation {

    private int speed;
    private int frames;
    private int index = 0;
    private int imgIndex = 0;

    private BufferedImage[] images;
    private BufferedImage currentImage;

    public Animation(int speed, BufferedImage... images) {
        this.speed = speed;
        this.images = new BufferedImage[images.length];

        for(int i = 0; i < images.length; i++) {
            this.images[i] = images[i];
        }

        this.frames = images.length;
    }

    public void runAnimation() {
        index++;

        if(index > speed) {
            index = 0;
            nextFrame();
        }
    }

    public void nextFrame() {
        currentImage = images[imgIndex];

        imgIndex++;

        if(imgIndex + 1 > frames) {
            imgIndex = 0;
        }
    }

    public void drawAnimation(Graphics g, int x, int y, int scaleX, int scaleY) {
        Graphics2D g2 = (Graphics2D) g;

        g2.scale(scaleX, scaleY);
        g.drawImage(currentImage, x, y, null);
    }

    public BufferedImage getCurrentImage() {
        return currentImage;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}
