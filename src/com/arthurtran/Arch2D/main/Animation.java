package com.arthurtran.Arch2D.main;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Animation {

    private int speed;
    private int frames;
    private int counts = 0;
    private int index = 0;

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
        for(int i = 0; i < this.images.length; i++) {
            if(counts == i) {
                currentImage = images[i];
            }
        }
        counts++;

        if(counts > frames) {
            counts = 0;
        }
    }

    public void drawAnimation(Graphics g, int x, int y, int scaleX, int scaleY) {
        g.drawImage(currentImage, x, y, null);
    }

    public BufferedImage getCurrentImage() {
        return currentImage;
    }
}
