/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.association.model;

/**
 *
 * @author Karen Quilumbaquin Program Builder ESPE-DCC0
 */
public class Cat {
    private String name;
    private String color;
    private int age;
    private String race;
    private float weight;
    private float size;

    @Override
    public String toString() {
        return "Cat{" + "name=" + name + ", color=" + color + ", age=" + age + ", race=" + race + ", weight=" + weight + ", size=" + size + '}';
    }

    public Cat(String name, String color, int age, String race, float weight, float size) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.race = race;
        this.weight = weight;
        this.size = size;
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
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the size
     */
    public float getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(float size) {
        this.size = size;
    }

    
    
    
    
}
