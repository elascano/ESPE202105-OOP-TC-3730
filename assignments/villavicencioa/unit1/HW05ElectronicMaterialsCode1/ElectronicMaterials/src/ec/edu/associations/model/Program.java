/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.associations.model;

import java.util.ArrayList;
import javafx.scene.paint.Material;

/**
 *
 * @author Alina Villavicencio LAMESTech ESPE-DCCO
 */
public class Program {
    private String name;
    private int numberOfMaterials;
    private String information;
    private ArrayList<ElectronicMaterial> electronicMaterials = new ArrayList <>();

    @Override
    public String toString() {
        return "Program{" + "name=" + getName() + ", numberOfMaterials=" + getNumberOfMaterials() + ", information=" + getInformation() + ", electronicMaterials=" + getElectronicMaterials() + '}';
    }
    
    public void toDownload(){
 }
    public void showInformation(){
 }
     public void view(Material material){
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
     * @return the information
     */
    public String getInformation() {
        return information;
    }

    /**
     * @param information the information to set
     */
    public void setInformation(String information) {
        this.information = information;
    }

    /**
     * @return the electronicMaterials
     */
    public ArrayList<ElectronicMaterial> getElectronicMaterials() {
        return electronicMaterials;
    }

    /**
     * @param electronicMaterials the electronicMaterials to set
     */
    public void setElectronicMaterials(ArrayList<ElectronicMaterial> electronicMaterials) {
        this.electronicMaterials = electronicMaterials;
    }
}
