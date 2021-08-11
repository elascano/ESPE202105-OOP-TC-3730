/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.edu.electronic.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Solange Tupiza search for electrical and electronic materials
 * OOP-ESPE
 */
public class Material {
    private String FirstName;
    private String MaterialName;
    private String Type;
    private String code;
    private ArrayList<Brand> brand;
    private LocalDateTime date;
    private int monthIknewThisMaterial;

    public Material(String FirstName, String MaterialName, String Type, String code, ArrayList<Brand> brand, LocalDateTime date, int monthIknewThisMaterial) {
        this.FirstName = FirstName;
        this.MaterialName = MaterialName;
        this.Type = Type;
        this.code = code;
        this.brand = brand;
        this.date = date;
        this.monthIknewThisMaterial = monthIknewThisMaterial;
    }
    
    
    
    

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the MaterialName
     */
    public String getMaterialName() {
        return MaterialName;
    }

    /**
     * @param MaterialName the MaterialName to set
     */
    public void setMaterialName(String MaterialName) {
        this.MaterialName = MaterialName;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the brand
     */
    public ArrayList<Brand> getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(ArrayList<Brand> brand) {
        this.brand = brand;
    }

    /**
     * @return the date
     */
    public LocalDateTime getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    /**
     * @return the monthIknewThisMaterial
     */
    public int getMonthIknewThisMaterial() {
        return monthIknewThisMaterial;
    }

    /**
     * @param monthIknewThisMaterial the monthIknewThisMaterial to set
     */
    public void setMonthIknewThisMaterial(int monthIknewThisMaterial) {
        this.monthIknewThisMaterial = monthIknewThisMaterial;
    }

    

    
    
}
