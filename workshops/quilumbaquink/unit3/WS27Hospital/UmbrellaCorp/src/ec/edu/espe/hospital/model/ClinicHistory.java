/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.hospital.model;

import java.util.ArrayList;

/**
 *
 * @author AnitaQ
 */
public class ClinicHistory {
    private float temperature;
    private float weight;
    private float height;
    private float pressure;
    private ArrayList<Patient> patients;
    
    

    /**
     * @return the temperature
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the weight
     */
    public float getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(float weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public float getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(float height) {
        this.height = height;
    }

    /**
     * @return the pressure
     */
    public float getPressure() {
        return pressure;
    }

    /**
     * @param pressure the pressure to set
     */
    public void setPressure(float pressure) {
        this.pressure = pressure;
    }

    /**
     * @return the patients
     */
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    /**
     * @param patients the patients to set
     */
    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    
    
}
