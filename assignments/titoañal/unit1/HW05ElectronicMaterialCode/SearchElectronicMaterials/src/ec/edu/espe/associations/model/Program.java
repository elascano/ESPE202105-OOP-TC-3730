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
public class Program {
    private String name;
    private int numberOfMaterials;
    private String codeOfMaterial;
    private ArrayList <Files> Files = new ArrayList<>();
    public void searchMaterial(){
        
    }
    public int totalCost (ElectronicMaterial electronicMaterials){
        
        return 0;
    }

    @Override
    public String toString() {
        return "Program{" + "name=" + getName() + ", numberOfMaterials=" 
                + getNumberOfMaterials() + ", codeOfMaterial=" 
                + getCodeOfMaterial() + ", Files=" + getFiles() + '}';
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
     * @return the codeOfMaterial
     */
    public String getCodeOfMaterial() {
        return codeOfMaterial;
    }

    /**
     * @param codeOfMaterial the codeOfMaterial to set
     */
    public void setCodeOfMaterial(String codeOfMaterial) {
        this.codeOfMaterial = codeOfMaterial;
    }

    /**
     * @return the Files
     */
    public ArrayList <Files> getFiles() {
        return Files;
    }

    /**
     * @param Files the Files to set
     */
    public void setFiles(ArrayList <Files> Files) {
        this.Files = Files;
    }
    
           
    
}
