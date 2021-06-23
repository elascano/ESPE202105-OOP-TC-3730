/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Luis Heredia Accent on the Future ESPE-DCC0
 */
public class Chicken {
    
   private int id;
   private String name;
   private String color;
   private Date age;
   private Date bornOn;
   private boolean moltying; 
   private int eggCounter=0;
<<<<<<< HEAD

    @Override
=======
   

     @Override
>>>>>>> c4357b06b8495ba58d302d26c552b444f149850b
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", bornOn=" + getBornOn() + ", moltying=" + isMoltying() + ", eggCounter=" + getEggCounter() + '}';
    }

    public Chicken(int id, String name, String color, Date age, Date bornOn, boolean moltying) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.bornOn = bornOn;
        this.moltying = moltying;
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

private void drink(){
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
     * @return the moltying
     */
    public boolean isMoltying() {
        return moltying;
    }

    /**
     * @param moltying the moltying to set
     */
    public void setMoltying(boolean moltying) {
        this.moltying = moltying;
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