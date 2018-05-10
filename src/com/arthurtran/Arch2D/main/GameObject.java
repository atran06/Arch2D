package com.arthurtran.Arch2D.main;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public abstract class GameObject {

    protected double x, y;
    protected double velX, velY;
    protected Enum id;

    public GameObject(double x, double y, Enum id) {
        this.x = x;
        this.y = y;
        this.id = id;
    }

    public abstract void paintComponent(Graphics g);
    public abstract void tick();
    public abstract Rectangle2D getBounds();
    public abstract Rectangle2D getBoundsRight();
    public abstract Rectangle2D getBoundsLeft();
    public abstract Rectangle2D getBoundsTop();
    public abstract Rectangle2D getBoundsBottom();

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getVelX() {
        return velX;
    }

    public void setVelX(double velX) {
        this.velX = velX;
    }

    public double getVelY() {
        return velY;
    }

    public void setVelY(double velY) {
        this.velY = velY;
    }

    public Enum getId() {
        return id;
    }

    public void setId(Enum id) {
        this.id = id;
    }
}
