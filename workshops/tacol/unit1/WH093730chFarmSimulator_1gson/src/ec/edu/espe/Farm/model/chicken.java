/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Farm.model;

import java.util.Date;

/**
 *
 * @author user
 */
public class chicken {
    private int id;
    private String name;
    private String color;
    private Date age;
    private Date bornon;
    private boolean molting;
    private int eggCounter=0;

    @Override
    public String toString() {
        return "chicken{" + "id=" + id + ", name=" + name + ", color=" + color + ", age=" + age + ", bornon=" + bornon + ", molting=" + molting + ", eggCounter=" + eggCounter + '}';
    }

    public chicken(int id, String name, String color, Date age, Date bornon, boolean molting, <any> ) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.age = age;
        this.bornon = bornon;
        this.molting = molting;
        this.<error> = <error>;
    }
    
    
    
    
    
    void doStuff(int forTime){
       } 
    
        private voit cluck(){
        System.out.println(" cluck " " cluck " " cluck ");
        
            
        }
        private voit wander(){
            System.out.println(" wandering from chicken coop to another " );
        }
        private void eat(){
            System.out.println(" eating ");
        }
        private voit drink(){
            System.out.println(" drinkink water ");
        }
                private Poop poop(){
                    return new Poop();
                }
                private Egg LayAnEgg(){
                    Egg Counter 0
                }
                    return new Egg(0){
                }
    
    
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
