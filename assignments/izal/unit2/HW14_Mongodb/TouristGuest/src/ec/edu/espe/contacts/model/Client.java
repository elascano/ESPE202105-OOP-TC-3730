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
 * @author LILIAN IZA TOURIST GUEST OPP-ESPE
 */
public class Client {
    private String firstName;
    private String lastName;
    private String password;
    private String phoneNumber;
    private String gender;
    private ArrayList<Activity> activity ;
    private LocalDateTime birthday;
    private int monthIknewThisClient;

    public Client(String firstName, String lastName, String password, String phoneNumber, String gender, ArrayList<Activity> activity, LocalDateTime birthday, int monthIknewThisClient) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.activity = activity;
        this.birthday = birthday;
        this.monthIknewThisClient = monthIknewThisClient;
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
     * @return the activity
     */
    public ArrayList<Activity> getActivity() {
        return activity;
    }

    /**
     * @param activity the activity to set
     */
    public void setActivity(ArrayList<Activity> activity) {
        this.activity = activity;
    }

    /**
     * @return the birthday
     */
    public LocalDateTime getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(LocalDateTime birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the monthIknewThisClient
     */
    public int getMonthIknewThisClient() {
        return monthIknewThisClient;
    }

    /**
     * @param monthIknewThisClient the monthIknewThisClient to set
     */
    public void setMonthIknewThisClient(int monthIknewThisClient) {
        this.monthIknewThisClient = monthIknewThisClient;
    }
    
    
}
