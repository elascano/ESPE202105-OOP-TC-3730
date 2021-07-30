/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.client.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

/**
 *
 * @author Eliana Cuaspa Beta-SoftwareTech ESPE-DCCO
 */
public class Client {
    private String firsName;
    private String lastName;
    private String gender;
    private String phoneNumeber;
    private ArrayList <Observation> observation ;
    private LocalDateTime dateStar;
    private LocalDateTime datestop;
    
    
     public Client(String firsName, String lastName, String gender, String phoneNumeber, ArrayList<Observation> observation, LocalDateTime dateStar, LocalDateTime datestop) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.gender = gender;
        this.phoneNumeber = phoneNumeber;
        this.observation = observation;
        this.dateStar = dateStar;
        this.datestop = datestop;
    }


    /**
     * @return the firsName
     */
    public String getFirsName() {
        return firsName;
    }

    /**
     * @param firsName the firsName to set
     */
    public void setFirsName(String firsName) {
        this.firsName = firsName;
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
     * @return the phoneNumeber
     */
    public String getPhoneNumeber() {
        return phoneNumeber;
    }

    /**
     * @param phoneNumeber the phoneNumeber to set
     */
    public void setPhoneNumeber(String phoneNumeber) {
        this.phoneNumeber = phoneNumeber;
    }

    /**
     * @return the observation
     */
    public ArrayList <Observation> getObservation() {
        return observation;
    }

    /**
     * @param observation the observation to set
     */
    public void setObservation(ArrayList <Observation> observation) {
        this.observation = observation;
    }

    /**
     * @return the dateStar
     */
    public LocalDateTime getDateStar() {
        return dateStar;
    }

    /**
     * @param dateStar the dateStar to set
     */
    public void setDateStar(LocalDateTime dateStar) {
        this.dateStar = dateStar;
    }

    /**
     * @return the datestop
     */
    public LocalDateTime getDatestop() {
        return datestop;
    }

    /**
     * @param datestop the datestop to set
     */
    public void setDatestop(LocalDateTime datestop) {
        this.datestop = datestop;
    }
 
}
