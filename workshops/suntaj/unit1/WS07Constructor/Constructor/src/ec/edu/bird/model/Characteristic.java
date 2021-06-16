/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.bird.model;

/**
 * 
 *
 * @author Gabriela Sunta Future'sProgrammersTech ESPE- DCCO
 */
public class Characteristic {
    private String beak;
    private String wing;
    private String leg;
    private String plume;
    
    public Characteristic(String beak, String wing, String leg, String plume){
        this.beak = beak;
        this.wing = wing;
        this.leg = leg;
        this.leg =  leg;
        this.plume = plume;
      
    }

    @Override
    public String toString() {
        return "Characteristic{" + "beak=" + beak + ", wing=" + wing + ", leg=" + leg + ", plume=" + plume + '}';
    }

    /**
     * @return the beak
     */
    public String getBeak() {
        return beak;
    }

    /**
     * @param beak the beak to set
     */
    public void setBeak(String beak) {
        this.beak = beak;
    }

    /**
     * @return the wing
     */
    public String getWing() {
        return wing;
    }

    /**
     * @param wing the wing to set
     */
    public void setWing(String wing) {
        this.wing = wing;
    }

    /**
     * @return the leg
     */
    public String getLeg() {
        return leg;
    }

    /**
     * @param leg the leg to set
     */
    public void setLeg(String leg) {
        this.leg = leg;
    }

    /**
     * @return the plume
     */
    public String getPlume() {
        return plume;
    }

    /**
     * @param plume the plume to set
     */
    public void setPlume(String plume) {
        this.plume = plume;
    }
    
}
