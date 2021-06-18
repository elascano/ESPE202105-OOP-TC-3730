/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.util.Date;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Chicken {

    private int id;
    private String name;
    private String color;
    private Date age;
    private boolean molting;
    int eggCounter=0;

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", molting=" + molting + ", eggCounter=" + eggCounter + '}';
    }

    
    public Chicken(int id, String name, String color, Date age, boolean molting) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.molting = molting;
    }
    
    
    public void doStuff(int forTime) {

    }

    private void cluck() {
        System.out.println(" cluck cluck cluck ");
    }

    private void wander() {
        System.out.println(" wandering from one chiken coop to another ");
    }

    private void eat() {
        System.out.println(" eating ");
    }

    private void drink() {
        System.out.println(" drinking water ");
    }

    private Poop poop() {
        return new Poop();
    }

    private Egg LayAnEgg() {
        eggCounter++;
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
}