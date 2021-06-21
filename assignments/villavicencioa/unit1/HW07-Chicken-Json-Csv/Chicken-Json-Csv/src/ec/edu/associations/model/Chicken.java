/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.model;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Chicken {
    private int id;
  private String name;
  private String color;
  private LocalDate age;
  private LocalDate bornOn;
  private boolean molting;
  private int eggCounter;
  private Period period;

    public Chicken(int id, String name, String color, LocalDate age, LocalDate bornOn, boolean molting, int eggCounter, Period period) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.bornOn = bornOn;
        this.molting = molting;
        this.eggCounter = eggCounter;
        this.period = period;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", bornOn=" + getBornOn() + ", molting=" + isMolting() + ", eggCounter=" + getEggCounter() + ", period=" + getPeriod() + '}';
    }

    
  
  public void doStuff(int forTime){
      
  }
  private void cluck(){
      System.out.println("cluck cluck cluck");
  }
  private void wander(){
     System.out.println("wandering from one chicken coop to another"); 
  }
  private void eat(){
      System.out.println("eating");
  }
  private void drink (){
      System.out.println("drinking water");
  }
  private Poop poop(){
      return new Poop();
  }
  private Egg layAnEgg(){
        setEggCounter(getEggCounter() + 1);
      return new Egg(0);
      
  }

  

    public String [] getArray(){
        String [] information = {String.valueOf(getId()), getName(), getColor(), String.valueOf(getBornOn()), String.valueOf(getAge()),String.valueOf(isMolting()), String.valueOf(getEggCounter()), String.valueOf(getPeriod())};
        return information;
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
     * @return the age
     */
    public LocalDate getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(LocalDate age) {
        this.age = age;
    }

    /**
     * @return the bornOn
     */
    public LocalDate getBornOn() {
        return bornOn;
    }

    /**
     * @param bornOn the bornOn to set
     */
    public void setBornOn(LocalDate bornOn) {
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

    /**
     * @return the period
     */
    public Period getPeriod() {
        return period;
    }

    /**
     * @param period the period to set
     */
    public void setPeriod(Period period) {
        this.period = period;
    }
    
}
