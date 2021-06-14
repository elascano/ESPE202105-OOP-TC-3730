/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.association.model;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Car {
    private String color;
    private float licenseaPlateNumber;
    private String model;
    
    public void mobilize() {
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
     * @return the licenseaPlateNumber
     */
    public float getLicenseaPlateNumber() {
        return licenseaPlateNumber;
    }

    /**
     * @param licenseaPlateNumber the licenseaPlateNumber to set
     */
    public void setLicenseaPlateNumber(float licenseaPlateNumber) {
        this.licenseaPlateNumber = licenseaPlateNumber;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }
    
}
