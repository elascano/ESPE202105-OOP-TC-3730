/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.constructors.model;

/**
 *
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class House {
    private int size;
    private String color;
    private String accesories;
    
    public House(int size, String color, String accesories){
        this.size=size;
        this.color=color;
        this.accesories=accesories;
    }

    @Override
    public String toString() {
        return "House{" + "size=" + size + ", color=" + color + ", accesories=" + accesories + '}';
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
     * @return the accesories
     */
    public String getAccesories() {
        return accesories;
    }

    /**
     * @param accesories the accesories to set
     */
    public void setAccesories(String accesories) {
        this.accesories = accesories;
    }

  }  