/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.model;

import java.util.ArrayList;

/**
 *
 * @author Geraldi Chasi Team of Machine ESPE-DCCD
 */
public class Contact {
    private String firstName;
    private String lastname;
    private String password;
    private String phoneNumber;
    private String dateOfBirth;
    private ArrayList<Car> cars;
    private int monthIknewThisContact;

    public Contact(String firstName, String lastname, String password, String phoneNumber, String description, String gender, ArrayList<Car> cars, int monthIknewThisContact) {
        this.firstName = firstName;
        this.lastname = lastname;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;
        this.cars = cars;
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
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
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
     * @return the dateOfBirth
     */
    public String getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the cars
     */
    public ArrayList<Car> getCars() {
        return cars;
    }

    /**
     * @param cars the cars to set
     */
    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
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
