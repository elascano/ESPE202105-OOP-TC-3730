/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.parking.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class Driver {
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String email;
    private String descrition;
    private String gener;
    private ArrayList <Type> type;
    private LocalDateTime birthDate;
    private int monthIknewThisContact;

    public Driver(String firstName, String lastName, String password, String phoneNumber, String email, String descrition, String gener, ArrayList<Type> type, LocalDateTime birthDate, int monthIknewThisContact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.descrition = descrition;
        this.gener = gener;
        this.type = type;
        this.birthDate = birthDate;
        this.monthIknewThisContact = monthIknewThisContact;
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
     * @return the descrition
     */
    public String getDescrition() {
        return descrition;
    }

    /**
     * @param descrition the descrition to set
     */
    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    /**
     * @return the gener
     */
    public String getGener() {
        return gener;
    }

    /**
     * @param gener the gener to set
     */
    public void setGener(String gener) {
        this.gener = gener;
    }

    /**
     * @return the type
     */
    public ArrayList <Type> getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(ArrayList <Type> type) {
        this.type = type;
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
