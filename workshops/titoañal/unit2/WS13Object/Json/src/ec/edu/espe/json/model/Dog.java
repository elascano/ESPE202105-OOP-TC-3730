/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.json.model;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class Dog {

    private String name;
    private int age;
    private String color;
    private int height;
    private String race;

    public Dog(String name, int age, String color, int height, String race) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.height = height;
        this.race = race;
    }

    @Override
    public String toString() {
        return "Dog{" + "name=" + getName() + ", age=" + getAge() + ", color=" + getColor() + ", height=" + getHeight() + ", race=" + getRace() + '}';
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

    /**
     * @return the height
     */
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
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

   
}
