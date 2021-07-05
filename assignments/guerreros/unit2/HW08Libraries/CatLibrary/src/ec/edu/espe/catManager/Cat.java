/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.catManager;

/**
 *
 * @author Stefany Guerrero AccentOnTheFuture ESPE-DCC0
 */
public class Cat {
    
     private String name;
     private String color;
     private int age;
     private Float stature;
     private String breed;

    Cat() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Cat{" + "name=" + getName() + ", color=" + getColor() + ", age=" + getAge() + ", stature=" + getStature() + ", breed=" + getBreed() + '}';
    }

    public Cat(String name, String color, int age, Float stature, String breed) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.stature = stature;
        this.breed = breed;
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
     * @return the stature
     */
    public Float getStature() {
        return stature;
    }

    /**
     * @param stature the stature to set
     */
    public void setStature(Float stature) {
        this.stature = stature;
    }

    /**
     * @return the breed
     */
    public String getBreed() {
        return breed;
    }

    /**
     * @param breed the breed to set
     */
    public void setBreed(String breed) {
        this.breed = breed;
    }
     

        
    
}
