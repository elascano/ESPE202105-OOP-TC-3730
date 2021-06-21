/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Luis Haro LAMESTech ESPE-DCD
 */
public class Chicken {
    private int id;
    private String mame;
    private String color;
    private Date age;
    private Date bornOn;
    private boolean molting;
    private int eggCounter=0;

    public Chicken() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", mame=" + mame + ", color=" + color + ", age=" + age + ", bornOn=" + bornOn + ", molting=" + molting + ", eggCounter=" + eggCounter + '}';
    }
    
    public Chicken(int id, String mame, String color, Date age, Date bornOn, boolean molting) {
        this.id = id;
        this.mame = mame;
        this.color = color;
        this.age = age;
        this.bornOn = bornOn;
        this.molting = molting;
    }
    
    
    
    public void doStuff(int forTime){
        
    }
    
    private void cluck(){
        System.out.println(" cluck cluck cluck ");
    }
    
    private void wander(){
        System.out.println(" wandering from one chicken coop to another ");
    }
    
    private void eat(){
        System.out.println(" eating ");
    }
    
    private void drink(){
        System.out.println(" drinking water ");
    }
    
    private Poop poop(){
        return new Poop();
    }
    
    private Egg layAnEgg(){
        setEggCounter(getEggCounter() + 1);
        return new Egg(0);
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
     * @return the mame
     */
    public String getMame() {
        return mame;
    }

    /**
     * @param mame the mame to set
     */
    public void setMame(String mame) {
        this.mame = mame;
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
     * @return the age
     */
    public Date getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Date age) {
        this.age = age;
    }

    /**
     * @return the bornOn
     */
    public Date getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(Date bornOn) {
        this.bornOn = bornOn;
    }

    /**
     * @return the molting
     */
    public boolean isMolting() {
        return molting;
    }

    /**
     * @param molting the molting to set
     */
    public void setMolting(boolean molting) {
        this.molting = molting;
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
  



