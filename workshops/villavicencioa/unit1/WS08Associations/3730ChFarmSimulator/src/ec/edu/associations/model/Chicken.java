/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.model;

import java.util.Date;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Chicken {
  private int id;
  private String name;
  private String color;
  private Date age;
  private Date bornOn;
  private boolean Molting;
  private int eggCounter=0;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", bornOn=" + bornOn + ", Molting=" + Molting + ", eggCounter=" + eggCounter + '}';
    } 
  
    public Chicken(int id, String name, String color, Date age, Date bornOn, boolean Molting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.bornOn = bornOn;
        this.Molting = Molting;
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
     * @return the Molting
     */
    public boolean isMolting() {
        return Molting;
    }

    /**
     * @param Molting the Molting to set
     */
    public void setMolting(boolean Molting) {
        this.Molting = Molting;
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
