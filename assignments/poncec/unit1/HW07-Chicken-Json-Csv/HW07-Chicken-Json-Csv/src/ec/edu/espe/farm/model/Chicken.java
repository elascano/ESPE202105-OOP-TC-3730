/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Camilo Ponce Program Builder ESPE-DCCO
 */
public class Chicken 
{
   private int id;
   private String name;
   private String color;
   private Date age ;
   private boolean Ismolting;
   private Date born; 
   private int eggcounter;

    public Chicken(int id, String name, String color, Date age, boolean Ismolting, Date born) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.Ismolting = Ismolting;
        this.born = born;
    }
    @Override
    public String toString() {
        return "Chicken{" + "id=" + getId() + ", name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", Ismolting=" + isIsmolting() + ", born=" + getBorn() + ", eggcounter=" + getEggcounter() + '}';
    }

   
   
   public void doStuff(int forTime)
   { 
   }
   public void cluck()
   {
   }  
   public void wander ()
   {
   }
   public void eat ()
   {
   }   
   public void drink ()
   {
   }
   public Poop poop ()
   {
      return new Poop();
   }
   public Egg layanegg()
   {
        setEggcounter(getEggcounter() + 1);    
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
     * @return the Ismolting
     */
    public boolean isIsmolting() {
        return Ismolting;
    }

    /**
     * @param Ismolting the Ismolting to set
     */
    public void setIsmolting(boolean Ismolting) {
        this.Ismolting = Ismolting;
    }

    /**
     * @return the born
     */
    public Date getBorn() {
        return born;
    }

    /**
     * @param born the born to set
     */
    public void setBorn(Date born) {
        this.born = born;
    }

    /**
     * @return the eggcounter
     */
    public int getEggcounter() {
        return eggcounter;
    }

    /**
     * @param eggcounter the eggcounter to set
     */
    public void setEggcounter(int eggcounter) {
        this.eggcounter = eggcounter;
    }
}