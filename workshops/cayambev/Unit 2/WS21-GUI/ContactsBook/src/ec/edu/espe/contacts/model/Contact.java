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
 * @author Vanessa Cayambe Team of machine ESPE-DCCO
 */
public class Contact {
    private String Firstname;
    private String LastName;
    private String password;
    private String phoneNumber;
    private String email;
    private String description;
    private ArrayList<Sport> sports;
    private LocalDateTime birthDate;
    private int monthIKnewThisContact; 

    public Contact(String Firstname, String LastName, String password, String phoneNumber, String email, String description, ArrayList<Sport> sports, LocalDateTime birthDate, int monthIKnewThisContact) {
        this.Firstname = Firstname;
        this.LastName = LastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.description = description;
        this.sports = sports;
        this.birthDate = birthDate;
        this.monthIKnewThisContact = monthIKnewThisContact;
    }
    
    
    
    /**
     * @return the Firstname
     */
    public String getFirstname() {
        return Firstname;
    }

    /**
     * @param Firstname the Firstname to set
     */
    public void setFirstname(String Firstname) {
        this.Firstname = Firstname;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
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
     * @return the sports
     */
    public ArrayList<Sport> getSports() {
        return sports;
    }

    /**
     * @param sports the sports to set
     */
    public void setSports(ArrayList<Sport> sports) {
        this.sports = sports;
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
     * @return the monthIKnewThisContact
     */
    public int getMonthIKnewThisContact() {
        return monthIKnewThisContact;
    }

    /**
     * @param monthIKnewThisContact the monthIKnewThisContact to set
     */
    public void setMonthIKnewThisContact(int monthIKnewThisContact) {
        this.monthIKnewThisContact = monthIKnewThisContact;
    }
    
    
}
