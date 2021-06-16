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
public class ElectronicMaterial {
    private String name;
    private ArrayList<Information> information = new ArrayList <>();

    @Override
    public String toString() {
        return "ElectronicMaterial{" + "name=" + getName() + ", information=" + getInformation() + '}';
    }
    
    public void selectInstrument(){
 }
    public Information give(){
        Information information= new Information();
      return information;
      
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
     * @return the information
     */
    public ArrayList<Information> getInformation() {
        return information;
    }

    /**
     * @param information the information to set
     */
    public void setInformation(ArrayList<Information> information) {
        this.information = information;
    }
}
