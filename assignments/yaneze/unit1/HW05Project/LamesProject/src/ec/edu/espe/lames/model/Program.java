/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lames.model;

import java.util.ArrayList;

/**
 *
 * @author Erick Yánez LAMESTech ESPE-DCC0
 */
public class Program {
    private String name;
    private int numberOfMaterials;
    private ArrayList<ElectronicMaterial> em = new ArrayList<>();

    @Override
    public String toString() {
        return "Program{" + "name=" + name + ", numberOfMaterials=" + numberOfMaterials + ", em=" + em + '}';
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
     * @return the numberOfMaterials
     */
    public int getNumberOfMaterials() {
        return numberOfMaterials;
    }

    /**
     * @param numberOfMaterials the numberOfMaterials to set
     */
    public void setNumberOfMaterials(int numberOfMaterials) {
        this.numberOfMaterials = numberOfMaterials;
    }

    /**
     * @return the em
     */
    public ArrayList<ElectronicMaterial> getEm() {
        return em;
    }

    /**
     * @param em the em to set
     */
    public void setEm(ArrayList<ElectronicMaterial> em) {
        this.em = em;
    }
    
    
    
}
