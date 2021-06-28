/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private boolean molthing;
    private int eggCounter;

    public Chicken(int id, String name, String color, boolean molthing, int eggCounter) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.molthing = molthing;
        this.eggCounter = eggCounter;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", molthing=" + molthing + ", eggCounter=" + eggCounter + '}';
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
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
     * @return the molthing
     */
    public boolean isMolthing() {
        return molthing;
    }

    /**
     * @param molthing the molthing to set
     */
    public void setMolthing(boolean molthing) {
        this.molthing = molthing;
    }

    /**
     * @return the eggCounter
     */
    public int getEggCounter() {
        return eggCounter;
    }

    /**
     * @param eggCounter the eggCounter to set
     */
    public void setEggCounter(int eggCounter) {
        this.eggCounter = eggCounter;
    }

   
    
}