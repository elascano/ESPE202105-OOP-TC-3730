/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.savePrinters.model;

/**
 *
 * @author Camilo Ponce PROGRAM BUILDER ESPE-DCCO
 */
public class Printer {
 
    private String brand;
    private String model;
    private String business;
    private int yearRelease;

    public Printer(String brand, String model, String business, int yearRelease) {
        this.brand = brand;
        this.model = model;
        this.business = business;
        this.yearRelease = yearRelease;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
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

    /**
     * @return the business
     */
    public String getBusiness() {
        return business;
    }

    /**
     * @param business the business to set
     */
    public void setBusiness(String business) {
        this.business = business;
    }

    /**
     * @return the yearRelease
     */
    public int getYearRelease() {
        return yearRelease;
    }

    /**
     * @param yearRelease the yearRelease to set
     */
    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    @Override
    public String toString() {
        return  brand + "," + model + "," + business + "," + yearRelease + "\n";
    }
    
    
    
}
