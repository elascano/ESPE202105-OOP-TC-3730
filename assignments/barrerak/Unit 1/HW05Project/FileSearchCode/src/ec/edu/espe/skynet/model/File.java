/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.skynet.model;

import java.util.ArrayList;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class File {
    private String name;
    private float weight;
    private ArrayList<Tipe> creationdate=new ArrayList<>();
    private ArrayList<Tipe> format = new ArrayList<>();

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
     * @return the creationdate
     */
    public ArrayList<Tipe> getCreationdate() {
        return creationdate;
    }

    @Override
    public String toString() {
        return "File{" + "name=" + name + ", weight=" + weight + ", creationdate=" + creationdate + ", format=" + format + '}';
    }

    /**
     * @param creationdate the creationdate to set
     */
    public void setCreationdate(ArrayList<Tipe> creationdate) {
        this.creationdate = creationdate;
    }

    /**
     * @return the format
     */
    public ArrayList<Tipe> getFormat() {
        return format;
    }

    /**
     * @param format the format to set
     */
    public void setFormat(ArrayList<Tipe> format) {
        this.format = format;
    }
    
}
