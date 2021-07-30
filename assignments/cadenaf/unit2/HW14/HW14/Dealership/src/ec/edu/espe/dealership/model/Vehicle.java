/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.dealership.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Fernanda Cadena Team of Machine ESPE-DCCD
 */
public class Vehicle {
    private String fullName;
    private String address; 
    private String password; 
    private String email;
    private String description; 
    private String gender; 
    
    private ArrayList<CarsType> carsType;
    
    private LocalDateTime bitthDate; 
    
    private int monthIknewThisContact; 

    public Vehicle(String fullName, String address, String password, String email, String description, String gender, ArrayList<CarsType> carsType, LocalDateTime bitthDate, int monthIknewThisContact) {
        this.fullName = fullName;
        this.address = address;
        this.password = password;
        this.email = email;
        this.description = description;
        this.gender = gender;
        this.carsType = carsType;
        this.bitthDate = bitthDate;
        this.monthIknewThisContact = monthIknewThisContact;
    }

    
    
    /**
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the carsType
     */
    public ArrayList<CarsType> getCarsType() {
        return carsType;
    }

    /**
     * @param carsType the carsType to set
     */
    public void setCarsType(ArrayList<CarsType> carsType) {
        this.carsType = carsType;
    }

    /**
     * @return the bitthDate
     */
    public LocalDateTime getBitthDate() {
        return bitthDate;
    }

    /**
     * @param bitthDate the bitthDate to set
     */
    public void setBitthDate(LocalDateTime bitthDate) {
        this.bitthDate = bitthDate;
    }

    /**
     * @return the monthIknewThisContact
     */
    public int getMonthIknewThisContact() {
        return monthIknewThisContact;
    }

    /**
     * @param monthIknewThisContact the monthIknewThisContact to set
     */
    public void setMonthIknewThisContact(int monthIknewThisContact) {
        this.monthIknewThisContact = monthIknewThisContact;
    }


}
