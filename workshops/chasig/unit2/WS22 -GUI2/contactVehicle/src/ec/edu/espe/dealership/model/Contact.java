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
  * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Contact {
     private String firstName;
    private String lasName; 
    private String password;
    private String description; 
    private String gender; 
    
    private ArrayList<Vehicle> vehicle;
    
    private LocalDateTime bitthDate; 
    
    private int monthIknewThisContact; 

    public Contact(String firstName, String lasName, String password, String email, String description, String gender, ArrayList<Vehicle> sport, LocalDateTime bitthDate, int monthIknewThisContact) {
        this.firstName = firstName;
        this.lasName = lasName;
        this.password = password;
        this.description = description;
        this.gender = gender;
        this.vehicle = vehicle;
        this.bitthDate = bitthDate;
        this.monthIknewThisContact = monthIknewThisContact;
    }

    public Contact(String Geraldi, String Chasi, String password, String description, String femenine, ArrayList<Vehicle> arrayList, LocalDateTime MIN, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lasName
     */
    public String getLasName() {
        return lasName;
    }

    /**
     * @param lasName the lasName to set
     */
    public void setLasName(String lasName) {
        this.lasName = lasName;
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
     * @return the vehicle
     */
    public ArrayList<Vehicle> getVehicle() {
        return vehicle;
    }

    /**
     * @param vehicle the vehicle to set
     */
    public void setVehicle(ArrayList<Vehicle> vehicle) {
        this.vehicle = vehicle;
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
