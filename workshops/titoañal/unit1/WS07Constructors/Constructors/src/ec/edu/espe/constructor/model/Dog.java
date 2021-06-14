/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.constructor.model;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class Dog {
    private String name;
    private int age;
    private String color;
    
    public Dog(String name, String color, int age){
        this.name = name;
        this.color = color;
        this.age = age;
    }
    

    @Override
    public String toString() {
        return "Dog{" + "name=" + getName() + ", age=" + getAge() + ", color=" 
                + getColor() + '}';
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

    
}
