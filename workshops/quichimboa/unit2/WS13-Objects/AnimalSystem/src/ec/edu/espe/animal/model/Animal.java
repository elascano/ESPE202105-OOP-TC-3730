/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.animal.model;

/**
 *
 * @author Estefania
 */
public class Animal {
    private int age;
    private String color;
    private String name;
    private String size;
    private String type;

   

    @Override
    public String toString() {
        return "Animal{" + "age=" + age + ", color=" + color + ", name=" + name + ", size=" + size + ", type=" + type + '}';
    }

    public Animal(int age, String color, String name, String size, String type) {
        this.age = age;
        this.color = color;
        this.name = name;
        this.size = size;
        this.type = type;
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    
}
