/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KevinCriollo.constructor.model;

/**
 *
 * @author Kevin Criollo BetaSoftwareTech ESPE-DCCO
 */
public class Ball {
    private int size;
    private String color;
    private String mark;

    public Ball(int size, String color, String mark) {
        this.size = size;
        this.color = color;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Ball{" + "size=" + size + ", color=" + color + ", mark=" + mark + '}';
    }
    
    
    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }
    
    
    
}
