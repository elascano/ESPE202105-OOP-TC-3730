/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.associations.model;

/**
 *
 * @author Leslie Titoaña LAMES Tech ESPE-DCC0
 */
public class Information {
    private String name;
    private String size;
    private String descriptionOfMaterials;
    public void available(){
        
    }

    @Override
    public String toString() {
        return "Information{" + "name=" + getName() + ", size=" + getSize() + ", descriptionOfMaterials=" + getDescriptionOfMaterials() + '}';
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
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * @return the descriptionOfMaterials
     */
    public String getDescriptionOfMaterials() {
        return descriptionOfMaterials;
    }

    /**
     * @param descriptionOfMaterials the descriptionOfMaterials to set
     */
    public void setDescriptionOfMaterials(String descriptionOfMaterials) {
        this.descriptionOfMaterials = descriptionOfMaterials;
    }

    
}
