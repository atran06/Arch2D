package com.arthurtran.Arch2D.main;

import java.awt.*;
import java.util.LinkedList;
import java.util.List;

public class Handler {

    private List<GameObject> list = new LinkedList<>();

    private static long fps;

    /**
     * The <em>handler</em> class handles all of the <em>gameObjects</em> in the game. <br><br>
     * It puts them all into a list and ticks and renders each gameObject in this list.
     */
    public Handler() {

    }

    /**
     * Renders each gameObjects in list.
     * @param Graphics
     */
    public void paintComponent(Graphics g) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).paintComponent(g);
        }
    }

    /**
     * Ticks through each gameObject in list.
     */
    public void tick() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).tick();
        }
    }

    /**
     * Adds a gameObject to the list.
     * @param A gameObject
     */
    public void addObject(GameObject tempObject) {
        list.add(tempObject);
    }

    /**
     * Removes a gameObject from the list.
     * @param A gameObject
     */
    public void removeObject(GameObject tempObject) {
        list.remove(tempObject);
    }

    /**
     * Clears the list/level.
     */
    public void clearLevel() {
        list.clear();
    }

    /**
     * @return Returns the list of <em>GameObjects</em>
     */
    public List<GameObject> getList() {
        return list;
    }

    public static void transferFPS(long num) {
        fps = num;
    }

    public long getFPS() {
        return fps;
    }
}
