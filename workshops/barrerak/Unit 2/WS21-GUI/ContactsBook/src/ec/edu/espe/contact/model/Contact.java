/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.contact.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Kevin Barrera Skynet.hub tech ESPE-DCCO
 */
public class Contact {
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String email;
    private String description;
    private String gender;
    private ArrayList<Sport>sports;
    private LocalDateTime birthDate;
    private int monthIKnewThisContact;

    public Contact(String firstName, String lastName, String password, String phoneNumber, String email, String description, String gender, ArrayList<Sport> sports, LocalDateTime birthDate, int monthIKnewThisContact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.description = description;
        this.gender = gender;
        this.sports = sports;
        this.birthDate = birthDate;
        this.monthIKnewThisContact = monthIKnewThisContact;
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
