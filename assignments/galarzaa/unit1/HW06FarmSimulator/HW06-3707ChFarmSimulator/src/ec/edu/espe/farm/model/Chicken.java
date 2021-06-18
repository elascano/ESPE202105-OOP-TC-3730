/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.farm.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

/**
 *
 * @author Andres Galarza AccentOnTheFuture ESPE-DCCO
 */
public class Chicken {

     private int id;
     private String name;
     private String color;
    private LocalDate date;
     private LocalDate born0n;
     private Period age;
    private boolean molting;
    private int eggCounter;

    public Chicken(int id, String name, String color, LocalDate date, LocalDate born0n, Period age, boolean molting, int eggCounter) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.date = date;
        this.born0n = born0n;
        this.age = age;
        this.molting = molting;
        this.eggCounter = eggCounter;
    }

    @Override
    public String toString() {
        return "Chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", date=" + date + ", born0n=" + born0n + ", age=" + age + ", molting=" + molting + ", eggCounter=" + eggCounter + '}';
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
     * @return the date
     */
    public LocalDate getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
     * @return the born0n
     */
    public LocalDate getBorn0n() {
        return born0n;
    }

    /**
     * @param born0n the born0n to set
     */
    public void setBorn0n(LocalDate born0n) {
        this.born0n = born0n;
    }

    /**
     * @return the age
     */
    public Period getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(Period age) {
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
