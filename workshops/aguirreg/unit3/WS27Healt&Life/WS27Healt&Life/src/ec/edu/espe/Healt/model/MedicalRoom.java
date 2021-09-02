/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.Healt.model;

import java.util.ArrayList;

/**
 *
 * @author Bryan Chiliquinga Beta_Software ESPE-DCCO
 */
public class MedicalRoom {

    private int number;
    private int capacity;
    private ArrayList<Patient> patient;
    private int departamentType;

    public MedicalRoom(int number, int capacity, ArrayList<Patient> patient, int departamentType) {
        this.number = number;
        this.capacity = capacity;
        this.patient = patient;
        this.departamentType = departamentType;
    }

    /**
     * @return the number
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * @return the patient
     */
    public ArrayList<Patient> getPatient() {
        return patient;
    }

    /**
     * @param patient the patient to set
     */
    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }

    /**
     * @return the departamentType
     */
    public int getDepartamentType() {
        return departamentType;
    }

    /**
     * @param departamentType the departamentType to set
     */
    public void setDepartamentType(int departamentType) {
        this.departamentType = departamentType;
    }

}
