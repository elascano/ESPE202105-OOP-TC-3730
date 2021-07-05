/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Hourse.model;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class Horse {
   private String name;
   private String color;
   private String race;
   private int age;
   private String jsonHorse = "";
  

    public Horse(String name, String color, String race, int age, String horse) {
        this.name = name;
        this.color = color;
        this.race = race;
        this.age = age;
       
    }

    public Horse(String name, String color, String race, int age) {
        this.name = name;
        this.color = color;
        this.race = race;
        this.age = age;
        
        
        
    
    }

    
    
    @Override
    public String toString() {
        return "Horse{" + "name=" + name + ", color=" + color + ", race=" + race + ", age=" + age + ", jsonHorse=" + jsonHorse + '}';
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
     * @return the race
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race the race to set
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the jsonHorse
     */
    public String getJsonHorse() {
        return jsonHorse;
    }

    /**
     * @param jsonHorse the jsonHorse to set
     */
    public void setJsonHorse(String jsonHorse) {
        this.jsonHorse = jsonHorse;
    }

    
   
   
        
    
}
