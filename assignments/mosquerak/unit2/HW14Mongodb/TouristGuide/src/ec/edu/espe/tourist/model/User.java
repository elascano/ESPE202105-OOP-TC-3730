/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.tourist.model;


import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kerly Mosquera CODE ESPE-DCCO
 */
public class User {
   
    private String firtName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String email;
    private String description;
    private ArrayList<City> city;
    private LocalDateTime returndate;
    private int monthIknewThisUser;

    public User(String firtName, String lastName, String password, String phoneNumber, String email, String description, ArrayList<City> city, LocalDateTime returndate, int monthIknewThisUser) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.description = description;
        this.city = city;
        this.returndate = returndate;
        this.monthIknewThisUser = monthIknewThisUser;
    }

   

    public User(String firstName, String lastName, String password, String phoneNumber, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * @return the firtName
     */
    public String getFirtName() {
        return firtName;
    }

    /**
     * @param firtName the firtName to set
     */
    public void setFirtName(String firtName) {
        this.firtName = firtName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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
     * @return the city
     */
    public ArrayList<City> getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(ArrayList<City> city) {
        this.city = city;
    }

    /**
     * @return the returndate
     */
    public LocalDateTime getReturndate() {
        return returndate;
    }

    /**
     * @param returndate the returndate to set
     */
    public void setReturndate(LocalDateTime returndate) {
        this.returndate = returndate;
    }

    /**
     * @return the monthIknewThisUser
     */
    public int getMonthIknewThisUser() {
        return monthIknewThisUser;
    }

    /**
     * @param monthIknewThisUser the monthIknewThisUser to set
     */
    public void setMonthIknewThisUser(int monthIknewThisUser) {
        this.monthIknewThisUser = monthIknewThisUser;
    }

}
