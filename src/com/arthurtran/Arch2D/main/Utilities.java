package com.arthurtran.Arch2D.main;

import java.awt.*;

public class Utilities {

    /**
     * Gets a random number between the minimum and the maximum.
     * @param min - The minimum value of the range.
     * @param max - The maximum value of the range.
     * @return Returns a random number between the min and max.
     */
    public double random(double min, double max) {
        return (max + (-min)) * Math.random() + min;
    }

    /**
     * Sets the alpha value of a graphics object.
     * @param alpha - The alpha value.
     * @param g2 - Graphics2D.
     */
    public void setAlpha(float alpha, Graphics2D g2) {
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, alpha));
    }

    /**
     * Gets the mouse position relative to the screen.
     * @return Returns a point of the mouse position.
     */
    public Point getMousePosition() {
        return MouseInfo.getPointerInfo().getLocation();
    }
}
