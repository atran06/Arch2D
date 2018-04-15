package com.arthurtran.Arch2D.main;

import java.util.LinkedList;
import java.util.List;

public class Handler {

    private List<GameObject> list = new LinkedList<>();

    public Handler() {

    }

    public void paintComponent() {
        for(GameObject tempObject : list) {
            tempObject.render();
        }
    }

    public void tick() {
        for (GameObject tempObject : list) {
            tempObject.tick();
        }
    }

    public void addObject(GameObject tempObject) {
        list.add(tempObject);
    }

    public void removeObject(GameObject tempObject) {
        list.remove(tempObject);
    }

    public void clearLevel() {
        list.clear();
    }
}
