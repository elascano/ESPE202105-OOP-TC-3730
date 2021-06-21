/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farmSimulatorCsv.model;

/**
 *
 * @author Gabriel Aguirre SkyNet.hub ESPE-DCCO
 */
public class Chicken {
    private int id;
    private String name;
    private String color;
    private String born;
    private boolean nolting;
    private int eggCounter;

    public Chicken(int id, String name, String color, String born, boolean nolting, int eggCounter) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.born = born;
        this.nolting = nolting;
        this.eggCounter = eggCounter;
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
     * @return the born
     */
    public String getBorn() {
        return born;
    }

    /**
     * @param born the born to set
     */
    public void setBorn(String born) {
        this.born = born;
    }

    /**
     * @return the nolting
     */
    public boolean isNolting() {
        return nolting;
    }

    /**
     * @param nolting the nolting to set
     */
    public void setNolting(boolean nolting) {
        this.nolting = nolting;
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
   public String[] getArray(){
       
           String [] note ={String.valueOf(id),name,color,born,String.valueOf(nolting),String.valueOf(eggCounter)};
           return note;

    
   }

}
