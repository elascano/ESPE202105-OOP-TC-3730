/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contacts.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Erick Oña PROGRAM BUILDER ESPE-DCCO
 */
public class Contact {

    public static void add(Contact contact) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String firtName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String email;
    private String description;
    private String gender;
    private ArrayList<Sport> sport;
    private LocalDateTime birthDate;
    private int monthIknewThisContact;

    public Contact(String firtName, String lastName, String password, String phoneNumber, String email, String description, String gender, ArrayList<Sport> sport, LocalDateTime birthDate, int monthIknewThisContact) {
        this.firtName = firtName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.description = description;
        this.gender = gender;
        this.sport = sport;
        this.birthDate = birthDate;
        this.monthIknewThisContact = monthIknewThisContact;
    }

    public Contact(String ed, String lascano, String password_, String _0961194040, String efona1espeeduec) {
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
     * @return the sport
     */
    public ArrayList<Sport> getSport() {
        return sport;
    }

    /**
     * @param sport the sport to set
     */
    public void setSport(ArrayList<Sport> sport) {
        this.sport = sport;
    }

    /**
     * @return the birthDate
     */
    public LocalDateTime getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(LocalDateTime birthDate) {
        this.birthDate = birthDate;
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
