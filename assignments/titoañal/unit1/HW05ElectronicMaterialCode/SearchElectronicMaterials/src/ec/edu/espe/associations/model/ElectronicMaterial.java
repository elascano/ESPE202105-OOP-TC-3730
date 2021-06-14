/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

import java.util.ArrayList;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class ElectronicMaterial {
    private String name;
    private float cost;
    private String material;
    private String characteristics;
    private ArrayList<Information> Information = new ArrayList<>();  
    public void view(){
       
    
            
        }

    @Override
    public String toString() {
        return "ElectronicMaterial{" + "name=" + name + ", cost=" + cost 
                + ", material=" + material + ", characteristics=" 
                + characteristics + ", Information=" + Information + '}';
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
     * @return the cost
     */
    public float getCost() {
        return cost;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(float cost) {
        this.cost = cost;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material the material to set
     */
    public void setMaterial(String material) {
        this.material = material;
    }

    /**
     * @return the characteristics
     */
    public String getCharacteristics() {
        return characteristics;
    }

    /**
     * @param characteristics the characteristics to set
     */
    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }

    /**
     * @return the Information
     */
    public ArrayList<Information> getInformation() {
        return Information;
    }

    /**
     * @param Information the Information to set
     */
    public void setInformation(ArrayList<Information> Information) {
        this.Information = Information;
    }

    }