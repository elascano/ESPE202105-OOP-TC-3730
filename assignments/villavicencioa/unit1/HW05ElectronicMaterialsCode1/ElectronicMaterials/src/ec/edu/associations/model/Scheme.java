/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.model;

import java.util.ArrayList;


/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Scheme {
    private boolean goodSpeed;
    private String design;
    private String name;
    private ArrayList<Program> programs = new ArrayList <>();

    @Override
    public String toString() {
        return "System{" + "goodSpeed=" + goodSpeed + ", design=" + design + ", name=" + name + ", programs=" + programs + '}';
    }
    
public void toStock(){
 }

    /**
     * @return the goodSpeed
     */
    public boolean isGoodSpeed() {
        return goodSpeed;
    }

    /**
     * @param goodSpeed the goodSpeed to set
     */
    public void setGoodSpeed(boolean goodSpeed) {
        this.goodSpeed = goodSpeed;
    }

    /**
     * @return the design
     */
    public String getDesign() {
        return design;
    }

    /**
     * @param design the design to set
     */
    public void setDesign(String design) {
        this.design = design;
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
     * @return the programs
     */
    public ArrayList<Program> getPrograms() {
        return programs;
    }

    /**
     * @param programs the programs to set
     */
    public void setPrograms(ArrayList<Program> programs) {
        this.programs = programs;
    }
    
}
